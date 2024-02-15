package com.quipux.certificacion.gestiondeatencion.tasks;


import com.quipux.certificacion.gestiondeatencion.interactions.SeleccionarSubSede;
import com.quipux.certificacion.gestiondeatencion.model.ReagendarCita;
import com.quipux.certificacion.gestiondeatencion.model.Usuario;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.quipux.certificacion.gestiondeatencion.userinterface.AgendarCitaPage.*;
import static com.quipux.certificacion.gestiondeatencion.userinterface.ConsultarCitaPage.*;


public class ConsultarCita {

    public static Performable consultarCita(ReagendarCita reagendarCita) {
        return Task.where("{0} completa el formulario para consultar cita",
                actor -> {
                    actor.attemptsTo(
                            SeleccionarAgendarCita.paraElServicio(),
                            //TIPO DOCUMENTO
                            Click.on(DDL_TIPO_DE_DOCUMENTO),
                            Enter.theValue(reagendarCita.getTipoDocumento()).into(TXT_TIPO_DE_DOCUMENTO),
                            Click.on(LST_DOCUMENTO.of(usuario.getTipoDocumento())),

                            //NUMERO DOCUMENTO
                            Enter.theValue(usuario.getNumeroDocumento()).into(TXT_NRODOCUMENTO_CON),

                            //CRITERIO DE BUSQUEDA
                            Click.on(DDL_CRITERIO_BUSQUEDA),
                            Enter.theValue(usuario.getCriterioBusqueda()).into(TXT_CRITERIO_BUSQUEDA),
                            Click.on(LST_CRITERIO_BUSQUEDA.of(usuario.getCriterioBusqueda())),

                            //SUB SEDE
//                            Click.on(DDL_SUB_SEDE_CONSULTAR),
//                            Enter.theValue(usuario.getSubSede()).into(TXT_INGRESAR_SUB_SEDE),
//                            Click.on(LST_SUB_SEDE.of(usuario.getSubSede())),

                            SeleccionarSubSede.paraAgendarLaCita(usuario.getSubSede()),

                            //BUSCAR
                            Click.on(BTN_BUSCAR)

                    );
                }
        );
    }
}