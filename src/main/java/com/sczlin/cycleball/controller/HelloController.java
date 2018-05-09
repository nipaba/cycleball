package com.sczlin.cycleball.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sczlin.cycleball.entity.LicenceEntity;
import com.sczlin.cycleball.entity.PlayerEntity;
import com.sczlin.cycleball.repository.jpa.LicenceJpaRepository;
import com.sczlin.cycleball.repository.jpa.PlayerJpaRepository;
import com.sczlin.cycleball.service.MockService;

@Controller
public class HelloController {

    private static final Logger LOGGER = Logger.getLogger(HelloController.class);

    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("leagues", MockService.leagues);
        model.addAttribute("teams", MockService.teams);
        model.addAttribute("matches", MockService.matches);

        return "index";
    }

}
