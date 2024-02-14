package com.quipux.certificacion.gestiondeatencion.stepdefinitions;

import com.quipux.certificacion.gestiondeatencion.tasks.AgendaLaCita;
import com.quipux.certificacion.gestiondeatencion.tasks.AgregarMultiplesServicios;
import com.quipux.certificacion.gestiondeatencion.tasks.Autenticarse;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static com.quipux.certificacion.gestiondeatencion.model.builders.UsuarioBuilder.conLosDatosDelUsuario;
import static com.quipux.certificacion.gestiondeatencion.model.builders.UsuarioBuilder.deUsuario;
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

    @Cuando("agenda una cita para tramitar diferentes servicios")
    public void agendaUnaCitaParaRealizarVariosTramites(List<Map<String, String>> servicios) {
        theActorInTheSpotlight().attemptsTo(AgregarMultiplesServicios.requeridos(servicios));
    }

    @Entonces("debe ver que la cita fue agendada de forma exitosa")
    public void debeVerQueLaCitaFueAgendadaDeFormaExitosa() {
        theActorInTheSpotlight().attemptsTo(Ensure.that(LBL_CONFIRMACION_DE_CITA).text().isNotEmpty());
    }
}
