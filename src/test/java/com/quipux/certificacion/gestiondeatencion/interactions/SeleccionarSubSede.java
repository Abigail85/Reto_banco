package com.quipux.certificacion.gestiondeatencion.interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.model.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.quipux.certificacion.gestiondeatencion.userinterface.AgendarCitaPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class SeleccionarSubSede {

    public static Performable paraSeleccionarSubSedeAgendarCita(String subSede) {
        return Task.where("{0} selecciona la sub-sede para agendar la cita",
                actor -> {
                    actor.attemptsTo(
                            WaitUntil.the(LBL_AGENDAR_CITA, isPresent()).forNoMoreThan(2000).milliseconds(),
                            Click.on(DDL_SUB_SEDE).afterWaitingUntilPresent(),
                            Enter.theValue(subSede).into(TXT_INGRESAR_SUB_SEDE),
                            Click.on(LST_SUB_SEDE));
                });
    }

    public static Performable paraSeleccionarSubSedeReagendarCita(String subSede) {
        return Task.where("{0} selecciona la sub-sede para rea-agendar la cita",
                actor -> {
                    actor.attemptsTo(
                            Click.on(DDL_SUB_SEDE).afterWaitingUntilPresent(),
                            Enter.theValue(subSede).into(TXT_INGRESAR_SUB_SEDE),
                            Click.on(LST_SUB_SEDE_DINAMICA.of(subSede)));
                });
    }

}
