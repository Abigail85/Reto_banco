package com.quipux.certificacion.gestiondeatencion.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.quipux.certificacion.gestiondeatencion.userinterface.AutenticacionPage.*;

public class Autenticarse {

    public static Performable conLasCredenciales() {
        System.out.println();
        return Task.where("{0} se autentica con las credenciales",
                actor -> {
                    actor.attemptsTo(
                            Click.on(TXT_USUARIO),
                            Enter.theValue(System.getenv("USUARIO_GA")).into(TXT_USUARIO),
                            Click.on(TXT_CONTRASENA),
                            Enter.theValue(System.getenv("CONTRASENA_GA")).into(TXT_CONTRASENA),
                            Click.on(BTN_INGRESAR));
                }
        );
    }
}
