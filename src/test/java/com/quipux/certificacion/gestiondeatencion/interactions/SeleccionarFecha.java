package com.quipux.certificacion.gestiondeatencion.interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotPresent;

public class SeleccionarFecha implements Performable {

    @Override
    @Step("{0} selecciona la fecha disponible")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on("#agendarCitaDatePicker"),
                Click.on("(//th[@class='datepicker-switch'])[1]"),
                Click.on("//span[text()='Ene']"),
                Click.on("//td[@class='day' and text()='31']"),
                WaitUntil.the("(//img[@class='img-fluid'])[1]", isNotPresent()).forNoMoreThan(Duration.ofMillis(3000)),
                Click.on("(//span[@class='select2-selection select2-selection--single'])[3]")
        );
    }

    public static Performable disponible() {
        return instrumented(SeleccionarFecha.class);
    }
}
