package com.quipux.certificacion.gestiondeatencion.stepdefinitions;

import com.quipux.certificacion.gestiondeatencion.tasks.AgendaLaCita;
import com.quipux.certificacion.gestiondeatencion.tasks.Autenticarse;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.cucumber.suiteslicing.SerenityCSVHeader;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.runner.RunWith;

import static com.quipux.certificacion.gestiondeatencion.userinterface.AgendarCitaPage.LBL_CONFIRMACION_DE_CITA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AgendarCitaStepDefinitions {

    @Dado("que el usuario se encuentra en la pagina web")
    public void queElUsuarioSeEncuentraEnLaPaginaWeb() {
        theActorInTheSpotlight().wasAbleTo(Autenticarse.conLasCredenciales());
    }

    @Cuando("^agenda una cita con (.*) y (.*) para el (.*)$")
    public void quiereAgendarUnaCita(String tipoDeDocumento, String numeroDeDocumento, String tipoDeServicio) {
        theActorInTheSpotlight().attemptsTo(AgendaLaCita.paraUnServicioRequerido(tipoDeDocumento, numeroDeDocumento, tipoDeServicio));
    }

    @Cuando("agenda una cita para realizar varios tramites")
    public void agendaUnaCitaParaRealizarVariosTramites() {
    }

    @Entonces("debe ver que la cita fue agendada de forma exitosa")
    public void debeVerQueLaCitaFueAgendadaDeFormaExitosa() {
        theActorInTheSpotlight().attemptsTo(Ensure.that(LBL_CONFIRMACION_DE_CITA).text().isNotEmpty());
    }
}
