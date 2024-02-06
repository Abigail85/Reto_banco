package com.quipux.certificacion.gestiondeatencion.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.quipux.certificacion.gestiondeatencion.userinterface.AgendarCitaPage.*;
import static com.quipux.certificacion.gestiondeatencion.userinterface.ComunesPage.BTN_CONTINUAR;

public class DiligenciarFormulario {

    public static Performable delSolicitante(String tipoDeDocumento, String numeroDeDocumento) {
        return Task.where("{0} diligencia el formulario del solicitante",
                actor -> {
                    actor.attemptsTo(
                            Click.on(DDL_TIPO_DE_DOCUMENTO),
                            Enter.theValue(tipoDeDocumento).into(TXT_TIPO_DE_DOCUMENTO),
                            Click.on(LST_DOCUMENTO),
                            Enter.theValue(numeroDeDocumento).into(TXT_NUMERO_DOCUMENTO),
                            Click.on(TXT_PRIMER_NOMBRE),
                            Enter.theValue("Sara").into(TXT_PRIMER_NOMBRE),
                            Enter.theValue("Carolina").into(TXT_SEGUNDO_NOMBRE),
                            Enter.theValue("Estrada").into(TXT_PRIMER_APELLIDO),
                            Enter.theValue("Estrada").into(TXT_SEGUNDO_APELLIDO),
                            Enter.theValue("sara@gmail.com").into(TXT_CORREO_ELECTRONICO),
                            Enter.theValue("3107830091").into(TXT_NUMERO_TELEFONICO),
                            Enter.theValue("calle medellin").into(TXT_DIRECCION_DE_RESIDENCIA),
                            Click.on(BTN_CONTINUAR)
                    );
                }
        );
    }
}
