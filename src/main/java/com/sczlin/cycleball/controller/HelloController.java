package com.sczlin.cycleball.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sczlin.cycleball.domain.League;
import com.sczlin.cycleball.service.DataService;

@Controller
public class HelloController {

    @Autowired
    private DataService dataService;

    @GetMapping("/")
    public String index(Model model) {

        List<League> leagues = new ArrayList<>();
        League l = new League();
        l.setName("1. Liga");
        
        League l2 = new League();
        l2.setName("2. Liga");

        leagues.add(l);
        leagues.add(l2);
        
        model.addAttribute("leagues", leagues);

        return "index";
    }

    @GetMapping("/mock")
    public String hello(Model model) {

        model.addAttribute("tournament", dataService.getTournament());

        return "mock";
    }
}
