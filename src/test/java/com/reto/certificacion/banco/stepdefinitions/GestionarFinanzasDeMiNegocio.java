package com.reto.certificacion.banco.stepdefinitions;


import com.reto.certificacion.banco.interactions.IniciarElNavegador;
import com.reto.certificacion.banco.questions.MensajeEnPantalla;
import com.reto.certificacion.banco.tasks.GestionarFinanzas;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;



public class GestionarFinanzasDeMiNegocio {


    @Dado("^que el usuario se encuentra en la pagina web de bancolombia$")
    public void queElUsuarioSeEncuentraEnLaPaginaWebDeBancolombia() {
        theActorInTheSpotlight().wasAbleTo(
                IniciarElNavegador.yNavegarALaPaginaEspecificada());

    }

    @Cuando("^convierte la tasa de interes$")
    public void convierteLaTasasDeInteres() {
        theActorInTheSpotlight().attemptsTo(

                GestionarFinanzas.convertirTasaDeInteres()
        );

    }
    @Entonces("^debe ver el valor del resultado (.*)$")
    public void debeVerElValorDelResultado(String resultado) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(MensajeEnPantalla.isEqualsToTheMessage(resultado)).isEqualTo(true)
        );

    }

}

