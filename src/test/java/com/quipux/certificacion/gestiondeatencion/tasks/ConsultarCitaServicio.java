package com.quipux.certificacion.gestiondeatencion.tasks;


import com.quipux.certificacion.gestiondeatencion.interactions.SeleccionarSubSede;
import com.quipux.certificacion.gestiondeatencion.model.AgendarCita;
import com.quipux.certificacion.gestiondeatencion.model.ReagendarCita;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.quipux.certificacion.gestiondeatencion.userinterface.AgendarCitaPage.*;

import static com.quipux.certificacion.gestiondeatencion.userinterface.ConsultarCitaPage.*;
import static com.quipux.certificacion.gestiondeatencion.userinterface.ConsultarCitaPage.DDL_SUB_SEDE_CONSULTAR;
import static com.quipux.certificacion.gestiondeatencion.userinterface.ReagendarCitaPage.TABLE_FECHA_INI;
import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class ConsultarCitaServicio {

    public static Performable paraConsultarCitaServicio(ReagendarCita reagendarCita) {
        return Task.where("{0} completa el formulario para consultar cita",
                actor -> {
                    String numeroDocumento = actor.recall("numeroDocumento");

                    actor.attemptsTo(
                            SeleccionarSubSede.paraSeleccionarSubSedeAgendarCita(reagendarCita.getSubSede()),
                            Click.on(DDL_CRITERIO_BUSQUEDA),
                            Enter.theValue(reagendarCita.getCriterioBusqueda()).into(TXT_CRITERIO_BUSQUEDA),
                            Click.on(LST_CRITERIO_BUSQUEDA.of(reagendarCita.getCriterioBusqueda())),
                            Click.on(DDL_TIPO_DE_DOCUMENTO),
                            Enter.theValue(reagendarCita.getTipoDocumento()).into(TXT_TIPO_DE_DOCUMENTO),
                            Click.on(LST_DOCUMENTO.of(reagendarCita.getTipoDocumento())),
                            Enter.theValue(numeroDocumento).into(TXT_NRODOCUMENTO_CON),
                            Click.on(BTN_BUSCAR),
                            WaitUntil.the(TABLE_FECHA_INI, isVisible()).forNoMoreThan(3).seconds()
                    );
                }
        );
    }
}