package com.quipux.certificacion.gestiondeatencion.tasks;

import com.quipux.certificacion.gestiondeatencion.interactions.SeleccionarHorario;
import com.quipux.certificacion.gestiondeatencion.model.ReagendarCita;
import net.serenitybdd.model.time.InternalSystemClock;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.quipux.certificacion.gestiondeatencion.userinterface.AgendarCitaPage.TXT_FECHA_REQUERIDA;
import static com.quipux.certificacion.gestiondeatencion.userinterface.CancelarCitaPage.*;
import static com.quipux.certificacion.gestiondeatencion.userinterface.ReagendarCitaPage.*;
import static com.quipux.certificacion.gestiondeatencion.utils.ExtraerFecha.extraerFecha;
import static com.quipux.certificacion.gestiondeatencion.utils.FechaDinamica.nuevaFecha;

public class CancelarCitaServicio {
    public static Performable paraCancelarUnServicio(ReagendarCita reagendarCita) {
        return Task.where("{0} completa el formulario para cancelar cita",
                actor -> {
                    actor.attemptsTo(
                            ConsultarCitaServicio.paraConsultarCitaServicio(reagendarCita),
                            Click.on(BTN_CANCELAR_CITA));
                    new InternalSystemClock().pauseFor(3000);

                    actor.attemptsTo(
                            Click.on(LST_CANCELAR_MOTIVO),
                            Enter.theValue(reagendarCita.getMotivo()).into(TXT_MOTIVO),
                            Click.on(LST_MOTIVO_SELECT.of(reagendarCita.getMotivo())),
                            Click.on(BTN_SI_CONTINUAR_CANCELAR)
                    );
                    new InternalSystemClock().pauseFor(3000);
                }
        );
    }
}
