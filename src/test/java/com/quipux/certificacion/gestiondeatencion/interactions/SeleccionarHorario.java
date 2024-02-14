package com.quipux.certificacion.gestiondeatencion.interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.quipux.certificacion.gestiondeatencion.userinterface.AgendarCitaPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class SeleccionarHorario implements Performable {

    @Override
    @Step("{0} selecciona el horario disponible para agendar la cita")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LST_HORARIO_DISPONIBLE),
                WaitUntil.the(By.xpath("//ul[@class='select2-results__options']"), WebElementStateMatchers.isCurrentlyVisible())
        );
        actor.attemptsTo(
                Enter.theValue("16").into(TXT_INGRESAR_HORA_DESEADA.waitingForNoMoreThan(Duration.ofMillis(3000))),
                Click.on(LST_HORA_SELECCIONADA));
    }

    public static SeleccionarHorario disponible() {
        return instrumented(SeleccionarHorario.class);
    }
}
