package com.quipux.certificacion.gestiondeatencion.tasks;


import com.quipux.certificacion.gestiondeatencion.interactions.SeleccionarSubSede;
import com.quipux.certificacion.gestiondeatencion.model.AgendarCita;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.quipux.certificacion.gestiondeatencion.userinterface.AgendarCitaPage.*;
import static com.quipux.certificacion.gestiondeatencion.userinterface.ConsultarCitaPage.*;


public class ConsultarCita {

    public static Performable consultarCita(AgendarCita usuario) {
        return Task.where("{0} completa el formulario para consultar cita",
                actor -> {
                    actor.attemptsTo(
                            SeleccionarAgendarCita.paraElServicio(),
                            Click.on(DDL_TIPO_DE_DOCUMENTO),
                            Enter.theValue(usuario.getTipoDocumento()).into(TXT_TIPO_DE_DOCUMENTO),
                            Click.on(LST_DOCUMENTO.of(usuario.getTipoDocumento())),
                            ///Enter.theValue(usuario.getNumeroDocumento()).into(TXT_NRODOCUMENTO_CON),
                            Click.on(DDL_CRITERIO_BUSQUEDA),
                            Enter.theValue(usuario.getCriterioBusqueda()).into(TXT_CRITERIO_BUSQUEDA),
                            Click.on(LST_CRITERIO_BUSQUEDA.of(usuario.getCriterioBusqueda())),
                            SeleccionarSubSede.paraAgendarLaCita(usuario.getSubSede()),
                            Click.on(BTN_BUSCAR)
                    );
                }
        );
    }
}