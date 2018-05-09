package com.sczlin.cycleball.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import ma.glasnost.orika.MapperFacade;

@Controller
public class AbstractController {

    @Autowired
    protected MapperFacade mapper;
}
