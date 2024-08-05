package com.reto.certificacion.banco.interactions;

import lombok.RequiredArgsConstructor;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;

import java.time.Duration;

@RequiredArgsConstructor
public class Esperar implements Interaction {

    private final Duration duraccion;

    @Override
    @Step("{0} espera #duracion.getSegundos() segundos")
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(duraccion.toMillis());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }


    }

    public static Performable porUnosSegundos(int segundos) {
        return Tasks.instrumented(Esperar.class, Duration.ofSeconds(segundos));
    }
}
