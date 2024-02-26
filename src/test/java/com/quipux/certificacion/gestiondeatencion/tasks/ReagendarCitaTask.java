package com.quipux.certificacion.gestiondeatencion.tasks;

import com.quipux.certificacion.gestiondeatencion.model.ReagendarCita;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.io.IOException;

import static com.quipux.certificacion.gestiondeatencion.userinterface.AgendarCitaPage.LST_HORA_SELECCIONADA;
import static com.quipux.certificacion.gestiondeatencion.userinterface.AgendarCitaPage.TXT_INGRESAR_HORA_DESEADA;
import static com.quipux.certificacion.gestiondeatencion.utils.ExtraerFecha.extraerFecha;
import static com.quipux.certificacion.gestiondeatencion.utils.FechaDinamica.*;
import static com.quipux.certificacion.gestiondeatencion.userinterface.ReagendarCitaPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ReagendarCitaTask {

    public static Performable paraReagendarUnServicio(ReagendarCita reagendarCita) {

        return Task.where("{0} completa el formulario para reagendar cita",
                actor -> {
                    String texto = actor.recall("confirmacionCita");
                    System.out.println(texto);
                    String fecha = extraerFecha(texto);

                    actor.attemptsTo(
                            ConsultarCita.consultarCita(reagendarCita),
                            WaitUntil.the(BTN_REASIGNAR_CITA, isVisible()).forNoMoreThan(7).seconds(),
                            DoubleClick.on(BTN_REASIGNAR_CITA),
                            WaitUntil.the(TXT_REASIGNAR_FECHA, isVisible()).forNoMoreThan(9).seconds(),
                            Enter.theValue(nuevaFecha(fecha)).into(TXT_REASIGNAR_FECHA),
                            Hit.the(Keys.TAB).into(TXT_REASIGNAR_FECHA),
                            WaitUntil.the(LST_REASIGNAR_HORA, isVisible()).forNoMoreThan(7).seconds(),
                            //SeleccionarHorario.disponible(LST_REASIGNAR_HORA)
                            Click.on(LST_REASIGNAR_HORA),
                            Enter.theValue("10").into(TXT_INGRESAR_HORA_DESEADA),
                            Click.on(LST_HORA_SELECCIONADA.of("10:00")),
                            Click.on(LST_MOTIVO),
                            Enter.theValue(reagendarCita.getMotivo()).into(TXT_MOTIVO),
                            Click.on(LST_MOTIVO_SELECT.of(reagendarCita.getMotivo())),
                            Click.on(BTN_SI)
                    );
                }
        );
    }
}