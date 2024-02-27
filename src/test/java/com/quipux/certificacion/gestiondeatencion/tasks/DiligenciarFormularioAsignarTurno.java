package com.quipux.certificacion.gestiondeatencion.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.quipux.certificacion.gestiondeatencion.userinterface.AsignarTurnoPage.*;
import static com.quipux.certificacion.gestiondeatencion.userinterface.ComunesPage.BTN_CONTINUAR;

public class DiligenciarFormularioAsignarTurno {

    public static Performable delSolicitante() {
        return Task.where("{0} diligencia el formulario del solicitante",
                actor -> {
                    actor.attemptsTo(
                            Click.on(DDL_TIPO_DE_DOCUMENTO),
                            Enter.theValue("CEDULA CIUDADANIA").into(TXT_TIPO_DE_DOCUMENTO),
                            Click.on(LST_DOCUMENTO),
                            Enter.theValue("1017204050").into(TXT_NUMERO_DOCUMENTO),
                            Click.on(TXT_PRIMER_NOMBRE),
                            Enter.theValue("Camilo").into(TXT_PRIMER_NOMBRE),
                            Enter.theValue("Andres").into(TXT_SEGUNDO_NOMBRE),
                            Enter.theValue("Carvajal").into(TXT_PRIMER_APELLIDO),
                            Enter.theValue("Trujillo").into(TXT_SEGUNDO_APELLIDO),
                            Enter.theValue("camilo@gmail.com").into(TXT_CORREO_ELECTRONICO),
                            Enter.theValue("3146834891").into(TXT_NUMERO_TELEFONICO),
                            Enter.theValue("calle medellin").into(TXT_DIRECCION_DE_RESIDENCIA),
                            Click.on(BTN_CONTINUAR)
                    );
                }
        );
    }
}
