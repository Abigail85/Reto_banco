package com.quipux.certificacion.gestiondeatencion.interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.quipux.certificacion.gestiondeatencion.userinterface.AgendarCitaPage.*;

public class SeleccionarSubSede {

    public static Performable paraSeleccionarSubSedeAgendarCita(String subSede) {
        return Task.where("{0} selecciona la sub-sede para agendar la cita",
                actor -> {
                    actor.attemptsTo(
                            Click.on(DDL_SUB_SEDE).afterWaitingUntilPresent(),
                            Enter.theValue(subSede).into(TXT_INGRESAR_SUB_SEDE),
                            Click.on(LST_SUB_SEDE.of(subSede)));
                });
    }
}
