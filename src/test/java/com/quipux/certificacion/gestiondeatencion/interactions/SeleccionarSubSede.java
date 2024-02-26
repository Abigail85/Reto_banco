package com.quipux.certificacion.gestiondeatencion.interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static com.quipux.certificacion.gestiondeatencion.userinterface.AgendarCitaPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarSubSede implements Performable {
    private String subSede;
    private Target elemento;

    public SeleccionarSubSede(String subSede, Target elemento) {
        this.subSede = subSede;
        this.elemento = elemento;
    }

    @Override
    @Step("{0} selecciona la sub-sede para agendar la cita")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(elemento),
                Enter.theValue(subSede).into(TXT_INGRESAR_SUB_SEDE),
                Click.on(LST_SUB_SEDE.of(subSede))
        );
    }

    public static SeleccionarSubSede paraAgendarLaCita(String subSede, Target elemento) {
        return instrumented(SeleccionarSubSede.class, subSede, elemento);
    }
}
