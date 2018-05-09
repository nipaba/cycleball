package com.sczlin.cycleball.controller.newplayer;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sczlin.cycleball.controller.AbstractController;
import com.sczlin.cycleball.domain.Player;
import com.sczlin.cycleball.repository.PlayerRepository;
import com.sczlin.cycleball.service.MockService;

import lombok.Data;

@Controller
public class NewPlayerController extends AbstractController {

    private static final Logger LOGGER = LoggerFactory.getLogger(NewPlayerController.class);

    @Autowired
    private PlayerRepository playerRepository;

    @GetMapping("/newPlayer")
    public String greetingForm(Model model) {

        model.addAttribute("newPlayer", new NewPlayerModel());

        model.addAttribute("leagues", MockService.leagues);
        model.addAttribute("teams", MockService.teams);

        return "newPlayerPage";
    }

    @PostMapping("/newPlayer")
    public String greetingSubmit(@Valid NewPlayerModel newPlayerModel, Model model) {

        // TODO - TNES - REMOVE
        model.addAttribute("newPlayer", new NewPlayerModel());

        Player p = mapper.map(newPlayerModel, Player.class);
        playerRepository.save(p);

        model.addAttribute("leagues", MockService.leagues);
        model.addAttribute("teams", MockService.teams);
        return "newPlayerPage";
    }

}
