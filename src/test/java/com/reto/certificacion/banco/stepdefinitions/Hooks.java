package com.reto.certificacion.banco.stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class Hooks {

    @Before
    public void inicializar() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Yuliana");

    }

    @After
    public void finalizar() {
        Serenity.getDriver().close();
        Serenity.getDriver().quit();
    }
}
