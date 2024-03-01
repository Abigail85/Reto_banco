package com.quipux.certificacion.gestiondeatencion.stepdefinitions;

import com.quipux.certificacion.gestiondeatencion.tasks.AgendaLaCita;
import com.quipux.certificacion.gestiondeatencion.tasks.AgregarMultiplesServicios;
import com.quipux.certificacion.gestiondeatencion.tasks.Autenticarse;
import com.quipux.certificacion.gestiondeatencion.tasks.ReagendarCitaServicio;
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
import static com.quipux.certificacion.gestiondeatencion.userinterface.ReagendarCitaPage.LBL_REAGENDAR_CITA;
import static com.quipux.certificacion.gestiondeatencion.utils.UtileriaCsv.obtenerDatosDeCsv;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AgendarCitaStepDefinitions {

    @Dado("que el usuario se encuentra en la pagina web de Shopping GA")
    public void queElUsuarioSeEncuentraEnLaPaginaWeb() throws IOException {
        theActorInTheSpotlight().wasAbleTo(Autenticarse.conLasCredenciales(deUsuario(obtenerDatosDeCsv("autenticacion", "")).build()));
    }

    @Cuando("agenda una cita para el servicio {string}")
    public void quiereAgendarUnaCita(String servicio) throws IOException {
        theActorInTheSpotlight().attemptsTo(
                AgendaLaCita
                        .paraUnServicioRequerido(conLosDatosDelUsuario(obtenerDatosDeCsv("agendar_cita", servicio))
                                .build()));
    }

    @Cuando("agenda una cita para un usuario que posee nit para el servicio {string}")
    public void agendaUnaCitaParaUnUsuarioQuePoseeNitParaElServicio(String servicio) throws IOException {
        theActorInTheSpotlight()
                .attemptsTo(
                        AgendaLaCita
                                .paraUnUsuarioConIdentificacionTipoNit(conLosDatosDelUsuario(obtenerDatosDeCsv("agendar_cita_tipo_nit", servicio))
                                        .build()));
    }

    @Cuando("agenda una cita para un usuario que posee rut para el servicio {string}")
    public void agendaUnaCitaParaUnUsuarioQuePoseeRutParaElServicio(String servicio) throws IOException {
        theActorInTheSpotlight()
                .attemptsTo(
                        AgendaLaCita
                                .paraUnUsuarioConIdentificacionTipoNit(conLosDatosDelUsuario(obtenerDatosDeCsv("agendar_cita_tipo_rut", servicio))
                                        .build()));
    }

    @Cuando("agenda una cita para un usuario que posee cnpj para el servicio {string}")
    public void agendaUnaCitaParaUnUsuarioQuePoseeCnpjParaElServicio(String servicio) throws IOException {
        theActorInTheSpotlight()
                .attemptsTo(
                        AgendaLaCita
                                .paraUnUsuarioConIdentificacionTipoNit(conLosDatosDelUsuario(obtenerDatosDeCsv("agendar_cita_tipo_cnpj", servicio))
                                        .build()));
    }

    @Cuando("agenda una cita para un usuario identificación para el servicio {string}")
    public void agendarCitaParaUsuarioConNit(String servicio) throws IOException {
        theActorInTheSpotlight()
                .attemptsTo(
                        AgendaLaCita
                                .paraUnUsuarioConIdentificacionTipoNit(conLosDatosDelUsuario(obtenerDatosDeCsv("agendar_cita", servicio))
                                        .build()));
    }

    @Cuando("agenda una cita para tramitar diferentes servicios")
    public void agendaUnaCitaParaRealizarVariosTramites(List<Map<String, String>> servicios) throws IOException {
        theActorInTheSpotlight()
                .attemptsTo(
                        AgregarMultiplesServicios
                                .requeridos(servicios, conLosDatosDelUsuario(obtenerDatosDeCsv("agendar_cita_multi_tramite", servicios.get(0).get("ServicioRequerido")))
                                        .build()));
    }

    @Cuando("agenda una cita sin incluir la placa del vehiculo para el servicio {string}")
    public void agendaUnaCitaSinIncluirLaPlacaDelVehiculoParaElServicio(String servicio) throws IOException {
        theActorInTheSpotlight().attemptsTo(
                AgendaLaCita
                        .paraUnServicioSinPlacaDeVehiculo(conLosDatosDelUsuario(obtenerDatosDeCsv("agendar_cita_sin_placa_de_vehiculo", servicio))
                                .build())
        );
    }

    @Cuando("^agenda una cita diligenciando los campos requeridos para el servicio (.*)$")
    public void agendaUnaCitaDiligenciandoLosCamposRequeridos(String servicio) throws IOException {
        theActorInTheSpotlight().attemptsTo(
                AgendaLaCita
                        .paraUnServicioRequerido(conLosDatosDelUsuario(obtenerDatosDeCsv("agendar_cita", servicio))
                                .build())
        );
    }

    @Cuando("^agenda una cita incluyendo un comentario para el servicio (.*)$")
    public void agendaUnaCitaIncluyendoUnComentarioParaElServicioLavadoDeCarro(String servicio) throws IOException {
        theActorInTheSpotlight().attemptsTo(
                AgendaLaCita
                        .incluyendoUnComentarioParaElServicio(conLosDatosDelUsuario(obtenerDatosDeCsv("agendar_cita_con_comentario", servicio))
                                .build())
        );
    }

    @Cuando("reagenda la cita para el servicio {string}")
    public void reagendaLaCitaParaElServicio(String tipoDeServicio) throws IOException {
        theActorInTheSpotlight()
                .attemptsTo(
                        AgendaLaCita.paraUnServicioRequerido(conLosDatosDelUsuario(obtenerDatosDeCsv("agendar_cita", tipoDeServicio)).build()),
                        ReagendarCitaServicio.paraReagendarUnServicio(conLosDatosDeReagendarCita(obtenerDatosDeCsv("reagendar_cita", tipoDeServicio)).build())
                );
    }

    @Cuando("^cancela una cita para el servicio (.*)$")
    public void cancelaUnaCitaParaElServicio() {
    }

    @Entonces("debe ver que la cita fue agendada de forma exitosa")
    public void debeVerQueLaCitaFueAgendadaDeFormaExitosa() {
        theActorInTheSpotlight().attemptsTo(Ensure.that(LBL_CONFIRMACION_DE_CITA).text().isNotEmpty());
    }

    @Entonces("debe ver que la cita fue reagendada de forma exitosa")
    public void debeVerQueLaCitaFueReagendadaDeFormaExitosa() {
        theActorInTheSpotlight().attemptsTo(Ensure.that(LBL_REAGENDAR_CITA).text().isNotEmpty());
    }

    @Entonces("debe ver que la cita fue cancelada exitosamente")
    public void debeVerQueLaCitaFueCanceladaExitosamente() {
    }
}
