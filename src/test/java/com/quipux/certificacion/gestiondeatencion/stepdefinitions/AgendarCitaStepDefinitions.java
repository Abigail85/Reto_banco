package com.quipux.certificacion.gestiondeatencion.stepdefinitions;

import com.quipux.certificacion.gestiondeatencion.tasks.AgendaLaCita;
import com.quipux.certificacion.gestiondeatencion.tasks.Autenticarse;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AgendarCitaStepDefinitions {

    @Dado("que el usuario se encuentra en la pagina web")
    public void queElUsuarioSeEncuentraEnLaPaginaWeb() {
        theActorInTheSpotlight().wasAbleTo(Autenticarse.conLasCredenciales());
    }

    @Cuando("^agenda una cita para el servicio (.*)$")
    public void quiereAgendarUnaCita(String tipoDeServicio) {
        theActorInTheSpotlight().attemptsTo(AgendaLaCita.paraUnServicioRequerido(tipoDeServicio));
    }

    @Entonces("debe ver que la cita fue agendada de forma exitosa")
    public void debeVerQueLaCitaFueAgendadaDeFormaExitosa() {

    }
}
