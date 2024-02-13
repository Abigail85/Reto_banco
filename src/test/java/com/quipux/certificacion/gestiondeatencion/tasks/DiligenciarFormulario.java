package com.quipux.certificacion.gestiondeatencion.tasks;

import com.quipux.certificacion.gestiondeatencion.model.Usuario;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.quipux.certificacion.gestiondeatencion.userinterface.AgendarCitaPage.*;

public class DiligenciarFormulario {

    public static Performable delSolicitante(Usuario usuario) {
        return Task.where("{0} diligencia el formulario del solicitante",
                actor -> {
                    actor.attemptsTo(
                            Click.on(DDL_TIPO_DE_DOCUMENTO),
                            Enter.theValue(usuario.getTipoDocumento()).into(TXT_TIPO_DE_DOCUMENTO),
                            Click.on(LST_DOCUMENTO.of(usuario.getTipoDocumento())),
                            Enter.theValue(usuario.getNumeroDocumento()).into(TXT_NUMERO_DOCUMENTO),
                            Click.on(TXT_PRIMER_NOMBRE),
                            Enter.theValue(usuario.getPrimerNombre()).into(TXT_PRIMER_NOMBRE),
                            Enter.theValue(usuario.getSegundoNombre()).into(TXT_SEGUNDO_NOMBRE),
                            Enter.theValue(usuario.getPrimerApellido()).into(TXT_PRIMER_APELLIDO),
                            Enter.theValue(usuario.getSegundoApellido()).into(TXT_SEGUNDO_APELLIDO),
                            Enter.theValue(usuario.getCorreoElectronico()).into(TXT_CORREO_ELECTRONICO),
                            Enter.theValue(usuario.getNumeroDeTelefono()).into(TXT_NUMERO_TELEFONICO),
                            Enter.theValue(usuario.getDireccionResidencia()).into(TXT_DIRECCION_DE_RESIDENCIA)
                    );
                }
        );
    }
}
