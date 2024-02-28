package com.quipux.certificacion.gestiondeatencion.interactions;

import groovy.lang.DelegatesTo;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.model.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static com.quipux.certificacion.gestiondeatencion.userinterface.AgendarCitaPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarHorario {

    public static Performable disponible(Target elemento) {
        return Task.where("{0} selecciona el horario disponible para agendar la cita",
                actor -> {
                    new InternalSystemClock().pauseFor(3000);
                    actor.attemptsTo(
                            Click.on(elemento),
                            Enter.theValue("13").into(TXT_INGRESAR_HORA_DESEADA),
                            Click.on(LST_HORA_SELECCIONADA.of("13:00")));
                });
    }
}
