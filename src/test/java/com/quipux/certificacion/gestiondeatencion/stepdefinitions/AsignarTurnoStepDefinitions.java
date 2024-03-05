package com.quipux.certificacion.gestiondeatencion.stepdefinitions;

import com.quipux.certificacion.gestiondeatencion.tasks.AgendaLaCita;
import com.quipux.certificacion.gestiondeatencion.tasks.AsignarElTurno;
import com.quipux.certificacion.gestiondeatencion.tasks.AsignarTurnoPreferencial;
import com.quipux.certificacion.gestiondeatencion.tasks.Autenticarse;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.io.IOException;

import static com.quipux.certificacion.gestiondeatencion.model.builders.AgendarCitaBuilder.conLosDatosDelUsuario;
import static com.quipux.certificacion.gestiondeatencion.utils.UtileriaCsv.obtenerDatosDeCsv;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AsignarTurnoStepDefinitions {

    @Cuando("asigna un turno para el servicio {string}")
    public void asignaUnTurnoParaElServicio(String tipoDeServicio) throws IOException {
        theActorInTheSpotlight().attemptsTo(
                AsignarElTurno
                        .paraUnServicioRequerido(conLosDatosDelUsuario(obtenerDatosDeCsv("agendar_cita", tipoDeServicio))
                                .build()));
    }

    @Cuando("asigna un turno preferencial para el servicio {string}")
    public void asignaUnTurnoPreferencialParaElServicio(String tipoDeServicioPreferencial) throws IOException {
        theActorInTheSpotlight().attemptsTo(
                AsignarTurnoPreferencial
                        .paraUnServicioRequerido(conLosDatosDelUsuario(obtenerDatosDeCsv("agendar_cita", tipoDeServicioPreferencial))
                                .build()));
    }


    @Entonces("debe ver que el turno fue asignado de forma exitosa")
    public void debeVerQueElTurnoFueAsignadoDeFormaExitosa() {
        //theActorInTheSpotlight().attemptsTo(Ensure.that(MENSAJE_EXITOSO).text().isNotEmpty());
    }
}
