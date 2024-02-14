package com.quipux.certificacion.gestiondeatencion.stepdefinitions;

import com.quipux.certificacion.gestiondeatencion.tasks.AgendaLaCita;
import com.quipux.certificacion.gestiondeatencion.tasks.Autenticarse;
import com.quipux.certificacion.gestiondeatencion.tasks.ConsultarCita;
import com.quipux.certificacion.gestiondeatencion.tasks.ReagendarCita;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.quipux.certificacion.gestiondeatencion.userinterface.AgendarCitaPage.LBL_CONFIRMACION_DE_CITA;
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

    @Cuando("reagenda la cita para el servicio (.*)$")
    public void reagendaLaCitaParaElServicioCambioDeMatricula(String tipoDeServicio) {
        theActorInTheSpotlight()
                .attemptsTo(
                        ReagendarCita.reagendarCita()
                );
    }

    @Entonces("debe ver que la cita fue agendada de forma exitosa")
    public void debeVerQueLaCitaFueAgendadaDeFormaExitosa() {
        theActorInTheSpotlight().attemptsTo(Ensure.that(LBL_CONFIRMACION_DE_CITA).text().isNotEmpty());
    }

    @Entonces("debe ver que la cita fue reagendada de forma exitosamente")
    public void debeVerQueLaCitaFueReagendadaDeFormaExitosamente() {
        theActorInTheSpotlight().attemptsTo(Ensure.that(LBL_CONFIRMACION_DE_CITA).text().isNotEmpty());
    }


}
