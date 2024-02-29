package com.quipux.certificacion.gestiondeatencion.interactions;

import groovy.lang.DelegatesTo;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.model.time.InternalSystemClock;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.quipux.certificacion.gestiondeatencion.userinterface.AgendarCitaPage.LST_HORARIO_DISPONIBLE;
import static com.quipux.certificacion.gestiondeatencion.userinterface.AgendarCitaPage.LST_HORA_SELECCIONADA;
import static com.quipux.certificacion.gestiondeatencion.userinterface.ReagendarCitaPage.LST_REASIGNAR_HORA;

public class SeleccionarHorario {

    public static Performable disponible() {
        return Task.where("{0} selecciona el horario disponible para agendar la cita",
                actor -> {
                    new InternalSystemClock().pauseFor(3000);
                    actor.attemptsTo(
                            Click.on(LST_HORARIO_DISPONIBLE),
                            Click.on(LST_HORA_SELECCIONADA));
                });
    }

}
