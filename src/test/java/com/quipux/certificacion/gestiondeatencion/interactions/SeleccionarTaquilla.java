package com.quipux.certificacion.gestiondeatencion.interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.quipux.certificacion.gestiondeatencion.userinterface.AsignarTurnoPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarTaquilla implements Performable {

    @Override
    @Step("{0} Selecciona la taquilla para asignar turno")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DDL_TAQUILLA),
                Enter.theValue("Oturnos 2").into(TXT_TAQUILLA),
                Click.on(LST_TAQUILLA),
                Click.on(BTN_ABRIR)
        );
    }

    public static SeleccionarTaquilla paraAsignarTurno() { return instrumented(SeleccionarTaquilla.class); }
}
