package com.quipux.certificacion.gestiondeatencion.tasks;


import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.quipux.certificacion.gestiondeatencion.userinterface.AgendarCitaPage.*;
import static com.quipux.certificacion.gestiondeatencion.userinterface.ConsultarCitaPage.*;


public class ConsultarCita {

    public static Performable consultarCita() {
        return Task.where("{0} completa el formulario para consultar cita",
                actor -> {
                    actor.attemptsTo(
                            SeleccionarAgendarCita.paraElServicio(),
                            //TIPO DOCUMENTO
                            Click.on(DDL_TIPO_DE_DOCUMENTO),
                            Enter.theValue("CEDULA CIUDADANIA").into(TXT_TIPO_DE_DOCUMENTO),
                            Click.on(LST_DOCUMENTO),

                            //NUMERO DOCUMENTO
                            Enter.theValue("1017204050").into(TXT_NRODOCUMENTO_CON),

                            //CRITERIO DE BUSQUEDA
                            Click.on(DDL_CRITERIO_BUSQUEDA),
                            Enter.theValue("Documento").into(TXT_CRITERIO_BUSQUEDA),
                            Click.on(LST_CRITERIO_BUSQUEDA),

                            //SUB SEDE
                            Click.on(DDL_SUB_SEDE_CONSULTAR),
                            Enter.theValue("sh subsede 1").into(TXT_INGRESAR_SUB_SEDE),
                            Click.on(LST_SUB_SEDE),

                            //BUSCAR
                            Click.on(BTN_BUSCAR)

                    );
                }
        );
    }
}