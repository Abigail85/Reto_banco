package com.quipux.certificacion.gestiondeatencion.tasks;

import com.quipux.certificacion.gestiondeatencion.interactions.SeleccionarHorario;
import com.quipux.certificacion.gestiondeatencion.model.ReagendarCita;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.quipux.certificacion.gestiondeatencion.utils.ExtraerFecha.extraerFecha;
import static com.quipux.certificacion.gestiondeatencion.utils.FechaDinamica.*;
import static com.quipux.certificacion.gestiondeatencion.userinterface.ReagendarCitaPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ReagendarCitaTask {

    public static Performable paraReagendarUnServicio(ReagendarCita reagendarCita) {

        return Task.where("{0} completa el formulario para reagendar cita",
                actor -> {

                    String texto = actor.recall("confirmacionCita");
                    String fecha = extraerFecha(texto);

                    actor.attemptsTo(
                            ConsultarCitaServicio.paraConsultarCitaServicio(reagendarCita),
                            WaitUntil.the(BTN_REASIGNAR_CITA, isVisible()).forNoMoreThan(4).seconds(),
                            DoubleClick.on(BTN_REASIGNAR_CITA),
                            WaitUntil.the(TXT_REASIGNAR_FECHA, isVisible()).forNoMoreThan(4).seconds(),
                            Enter.theValue(nuevaFecha(fecha)).into(TXT_REASIGNAR_FECHA),
                            Hit.the(Keys.TAB).into(TXT_REASIGNAR_FECHA),
                            SeleccionarHorario.disponible(LST_REASIGNAR_HORA),
                            Click.on(LST_MOTIVO),
                            Enter.theValue(reagendarCita.getMotivo()).into(TXT_MOTIVO),
                            Click.on(LST_MOTIVO_SELECT.of(reagendarCita.getMotivo())),
                            Click.on(BTN_SI)
                    );
                }
        );
    }
}