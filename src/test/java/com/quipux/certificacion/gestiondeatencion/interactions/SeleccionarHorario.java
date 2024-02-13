package com.quipux.certificacion.gestiondeatencion.interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.quipux.certificacion.gestiondeatencion.userinterface.AgendarCitaPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class SeleccionarHorario implements Performable {

    @Override
    @Step("{0} selecciona el horario disponible para agendar la cita")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LST_HORARIO_DISPONIBLE),
                Enter.theValue("16").into(TXT_INGRESAR_HORA_DESEADA),
                Click.on(LST_HORA_SELECCIONADA));
    }

    public static SeleccionarHorario disponible() {
        return instrumented(SeleccionarHorario.class);
    }
}
