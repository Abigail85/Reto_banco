package com.quipux.certificacion.gestiondeatencion.interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarHorario implements Performable {

    @Override
    @Step("{0} selecciona el horario disponible para agendar la cita")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on("(//span[@class='select2-selection select2-selection--single'])[3]"),
                Enter.theValue("13").into("//input[@class='select2-search__field']"),
                Click.on("//li[contains(text(),'13:00')]")
        );
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static SeleccionarHorario disponible() {
        return instrumented(SeleccionarHorario.class);
    }
}
