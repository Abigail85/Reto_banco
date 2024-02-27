package com.quipux.certificacion.gestiondeatencion.stepdefinitions;

import com.quipux.certificacion.gestiondeatencion.tasks.AsignarElTurno;
import com.quipux.certificacion.gestiondeatencion.tasks.Autenticarse;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AsignarTurnoStepDefinitions {

    @Dado("que el usuario se encuentra en la pagina web de Shopping GA")
    public void queElUsuarioSeEncuentraEnLaPaginaWebDeShoppingGa() {
        theActorInTheSpotlight().wasAbleTo(Autenticarse.conLasCredenciales());
    }

    @Cuando("^asigna un turno (.*)$")
    public void asignaUnTurno(String tipoDeServicio) {
        theActorInTheSpotlight().attemptsTo(AsignarElTurno.paraUnServicioRequerido(tipoDeServicio));
    }

    @Entonces("debe ver que el turno fue asignado de forma exitosa")
    public void debeVerQueElTurnoFueAsignadoDeFormaExitosa() {
        //theActorInTheSpotlight().attemptsTo(Ensure.that(MENSAJE_EXITOSO).text().isNotEmpty());
    }
}
