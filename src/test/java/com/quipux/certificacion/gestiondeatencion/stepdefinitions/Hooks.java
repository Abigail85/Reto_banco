package com.quipux.certificacion.gestiondeatencion.stepdefinitions;

import com.quipux.certificacion.gestiondeatencion.interactions.IniciarElNavegador;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Hooks {

    @Before
    public void inicializar() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Adri\u00E1n");
        theActorInTheSpotlight().wasAbleTo(IniciarElNavegador.yNavegarALaPaginaEspecificada());
    }

    @After
    public void finalizar() {
        Serenity.getDriver().close();
        Serenity.getDriver().quit();
    }
}
