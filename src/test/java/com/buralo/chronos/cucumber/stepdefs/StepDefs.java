package com.buralo.chronos.cucumber.stepdefs;

import com.buralo.chronos.ChronosApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ChronosApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
