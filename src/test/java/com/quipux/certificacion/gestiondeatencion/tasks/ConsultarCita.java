package com.quipux.certificacion.gestiondeatencion.tasks;


import com.quipux.certificacion.gestiondeatencion.interactions.SeleccionarSubSede;
import com.quipux.certificacion.gestiondeatencion.model.AgendarCita;
import com.quipux.certificacion.gestiondeatencion.model.ReagendarCita;
import com.quipux.certificacion.gestiondeatencion.userinterface.ConsultarCitaPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.IOException;

import static com.quipux.certificacion.gestiondeatencion.model.builders.AgendarCitaBuilder.conLosDatosDelUsuario;
import static com.quipux.certificacion.gestiondeatencion.model.builders.ReagendarCitaBuilder.conLosDatosDeReagendarCita;
import static com.quipux.certificacion.gestiondeatencion.userinterface.AgendarCitaPage.*;

import static com.quipux.certificacion.gestiondeatencion.userinterface.ConsultarCitaPage.*;
import static com.quipux.certificacion.gestiondeatencion.userinterface.ConsultarCitaPage.DDL_SUB_SEDE_CONSULTAR;
import static com.quipux.certificacion.gestiondeatencion.utils.UtileriaCsv.obtenerDatosDeCsv;
import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class ConsultarCita {

    public static Performable consultarCita(ReagendarCita reagendarCita) {
        return Task.where("{0} completa el formulario para consultar cita",

        actor -> {
            getDriver().navigate().refresh();
                String numeroDocumento = actor.recall("numeroDocumento");
                    System.out.println("El numero de documento: " + numeroDocumento);
                    actor.attemptsTo(
                            SeleccionarAgendarCita.paraElServicio(),
                            Click.on(DDL_TIPO_DE_DOCUMENTO),
                            Enter.theValue(reagendarCita.getTipoDocumento()).into(TXT_TIPO_DE_DOCUMENTO),
                            Click.on(LST_DOCUMENTO.of(reagendarCita.getTipoDocumento())),
                            Enter.theValue(numeroDocumento).into(TXT_NRODOCUMENTO_CON),
                            Click.on(DDL_CRITERIO_BUSQUEDA),
                            Enter.theValue(reagendarCita.getCriterioBusqueda()).into(TXT_CRITERIO_BUSQUEDA),
                            Click.on(LST_CRITERIO_BUSQUEDA.of(reagendarCita.getCriterioBusqueda())),
                            SeleccionarSubSede.paraAgendarLaCita(reagendarCita.getSubSede(),DDL_SUB_SEDE_CONSULTAR),
                            Click.on(BTN_BUSCAR)
                    );
                }
        );
    }
}