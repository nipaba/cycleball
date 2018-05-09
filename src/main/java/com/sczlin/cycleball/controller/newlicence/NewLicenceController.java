package com.sczlin.cycleball.controller.newlicence;

import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.apache.commons.codec.binary.StringUtils;
import org.apache.poi.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sczlin.cycleball.controller.AbstractController;
import com.sczlin.cycleball.controller.newplayer.NewPlayerController;
import com.sczlin.cycleball.domain.Licence;
import com.sczlin.cycleball.domain.Player;
import com.sczlin.cycleball.repository.LicenceRepository;
import com.sczlin.cycleball.repository.PlayerRepository;
import com.sczlin.cycleball.service.MockService;

@Controller
public class NewLicenceController extends AbstractController {

    private static final Logger LOGGER = LoggerFactory.getLogger(NewPlayerController.class);
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd. MM. yyyy");

    @Autowired
    private LicenceRepository licenceRepository;

    @Autowired
    private PlayerRepository playerRepository;

    @GetMapping("/newLicence")
    public String getNewLicence(Model model) {

        model.addAttribute("newLicence", new NewLicenceModel());
        model.addAttribute("players", getPlayers());

        model.addAttribute("leagues", MockService.leagues);
        model.addAttribute("teams", MockService.teams);

        return "newLicencePage";
    }

    @PostMapping("/newLicence")
    public String postNewLicence(@Valid NewLicenceModel newLicenceModel, Model model) {

        model.addAttribute("newLicence", new NewLicenceModel());
        model.addAttribute("players", getPlayers());

        Licence l = mapper.map(newLicenceModel, Licence.class);
        l.setPlayer(findPlayer(newLicenceModel.getPlayerHashCode()));

        licenceRepository.save(l);

        model.addAttribute("leagues", MockService.leagues);
        model.addAttribute("teams", MockService.teams);
        return "newLicencePage";
    }

    private Map<String, String> getPlayers() {
        Map<String, String> map = new HashMap<>();
        for (Player p : playerRepository.findAll()) {

            String description = getDescription(p);
            map.put(String.valueOf(description.hashCode()), description);
        }
        return map;
    }

    private String getDescription(Player p) {
        return p.getFirstname() + " " + p.getSurname() + " (" + p.getBirthdate().format(formatter) + ")";
    }

    private Player findPlayer(int hashCode) {
        for (Player p : playerRepository.findAll()) {
            String description = getDescription(p);
            if (hashCode == description.hashCode()) {
                return p;
            }
        }
        return null;
    }
}
