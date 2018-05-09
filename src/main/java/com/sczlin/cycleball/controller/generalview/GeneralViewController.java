package com.sczlin.cycleball.controller.generalview;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sczlin.cycleball.domain.Player;
import com.sczlin.cycleball.repository.LicenceRepository;
import com.sczlin.cycleball.repository.PlayerRepository;
import com.sczlin.cycleball.service.MockService;

@Controller
public class GeneralViewController {

    private static final Logger LOGGER = LoggerFactory.getLogger(GeneralViewController.class);

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private LicenceRepository licenceRepository;

    @GetMapping("/view")
    public String index(Model model) {
        model.addAttribute("leagues", MockService.leagues);
        
    
        model.addAttribute("players", playerRepository.findAll());
        model.addAttribute("licences", licenceRepository.findAll());
        
        List<Player> p = playerRepository.findAll();
        //TODO - TNES - REMOVE
        LOGGER.info("XXX " + p);

        return "generalViewPage";
    }

}
