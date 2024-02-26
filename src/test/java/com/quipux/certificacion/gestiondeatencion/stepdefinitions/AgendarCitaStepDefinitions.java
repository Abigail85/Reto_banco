package com.quipux.certificacion.gestiondeatencion.stepdefinitions;

import com.quipux.certificacion.gestiondeatencion.tasks.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static com.quipux.certificacion.gestiondeatencion.model.builders.AgendarCitaBuilder.conLosDatosDelUsuario;
import static com.quipux.certificacion.gestiondeatencion.model.builders.AgendarCitaBuilder.deUsuario;
import static com.quipux.certificacion.gestiondeatencion.model.builders.ReagendarCitaBuilder.conLosDatosDeReagendarCita;
import static com.quipux.certificacion.gestiondeatencion.userinterface.AgendarCitaPage.LBL_CONFIRMACION_DE_CITA;
import static com.quipux.certificacion.gestiondeatencion.utils.UtileriaCsv.obtenerDatosDeCsv;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AgendarCitaStepDefinitions {

    @Dado("que el usuario se encuentra en la pagina web de Shopping GA")
    public void queElUsuarioSeEncuentraEnLaPaginaWeb() throws IOException {
        theActorInTheSpotlight().wasAbleTo(Autenticarse.conLasCredenciales(deUsuario(obtenerDatosDeCsv("autenticacion", "")).build()));
    }

    @Cuando("^agenda una cita para el servicio (.*)$")
    public void quiereAgendarUnaCita(String servicio) throws IOException {
        theActorInTheSpotlight().attemptsTo(
                AgendaLaCita
                        .paraUnServicioRequerido(conLosDatosDelUsuario(obtenerDatosDeCsv("agendar_cita", servicio))
                                .build()));
    }

    @Cuando("^agenda una cita para un usuario identificación para el servicio (.*)$")
    public void agendarCitaParaUsuarioConNit(String servicio) throws IOException {
        theActorInTheSpotlight()
                .attemptsTo(
                        AgendaLaCita
                                .paraUnUsuarioConIdentificacionTipoNit(conLosDatosDelUsuario(obtenerDatosDeCsv("agendar_cita", servicio))
                                        .build()));
    }

    @Cuando("agenda una cita para tramitar diferentes (.*)")
    public void agendaUnaCitaParaRealizarVariosTramites(String servicio, List<Map<String, String>> servicios) throws IOException {
        theActorInTheSpotlight()
                .attemptsTo(
                        AgregarMultiplesServicios
                                .requeridos(servicios, conLosDatosDelUsuario(obtenerDatosDeCsv("agendar_cita_multi_tramite", servicio))
                                        .build()));
    }

    @Cuando("^reagenda la cita para el servicio (.*)$")
    public void reagendaLaCitaParaElServicio(String tipoDeServicio) throws IOException {
        theActorInTheSpotlight()
                .attemptsTo(
                        AgendaLaCita.paraUnServicioRequerido(conLosDatosDelUsuario(obtenerDatosDeCsv("agendar_cita", tipoDeServicio)).build()),
                        ReagendarCitaTask.paraReagendarUnServicio(conLosDatosDeReagendarCita(obtenerDatosDeCsv("reagendar_cita", tipoDeServicio)).build())
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
