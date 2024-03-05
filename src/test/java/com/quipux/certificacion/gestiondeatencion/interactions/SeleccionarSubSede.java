package com.quipux.certificacion.gestiondeatencion.interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.quipux.certificacion.gestiondeatencion.userinterface.AgendarCitaPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class    SeleccionarSubSede implements Performable {
    private String subSede;

    public SeleccionarSubSede(String subSede) {
        this.subSede = subSede;
    }

    @Override
    @Step("{0} selecciona la sub-sede para agendar la cita")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DDL_SUB_SEDE),
                Enter.theValue().into(TXT_INGRESAR_SUB_SEDE),
                Click.on(LST_SUB_SEDE)
        );
    }

    public static SeleccionarSubSede paraAgendarLaCita(String subSede) {
        return instrumented(SeleccionarSubSede.class, subSede);
    }
}
