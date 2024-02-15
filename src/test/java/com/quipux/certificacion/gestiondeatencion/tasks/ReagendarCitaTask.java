package com.quipux.certificacion.gestiondeatencion.tasks;

import com.quipux.certificacion.gestiondeatencion.interactions.SeleccionarHorario;
import com.quipux.certificacion.gestiondeatencion.model.Usuario;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.quipux.certificacion.gestiondeatencion.interactions.Main.*;
import static com.quipux.certificacion.gestiondeatencion.userinterface.ReagendarCitaPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ReagendarCitaTask {


    public static Performable reagendarCita(Usuario usuario) {
        // ACA VA LA VARIABLE DEL METODO RESOLVEFOR(ACTOR)
        String fecha = "15/02/2024 16:00";
        return Task.where("{0} completa el formulario para reagendar cita",
                actor -> {
                    actor.attemptsTo(

                            Click.on(BTN_REASIGNAR_CITA),
                            WaitUntil.the(TXT_REASIGNAR_FECHA, isVisible()).forNoMoreThan(2).seconds(),
                            Enter.theValue(nuevaFecha(fecha)).into(TXT_REASIGNAR_FECHA),
                           /// Hit.the(Keys.TAB).into(TXT_REASIGNAR_FECHA),

                             //HORA
                            SeleccionarHorario.disponible()
                             //Click.on(LST_REASIGNAR_HORA)
//                            nter.theValue("16").into(TXT_INGRESAR_HORA_DESEADA),
//                            Click.on(LST_HORA_SELECCIONADA),
//
//                            //MOTIVO
//                            Click.on(LST_MOTIVO),
//                            Enter.theValue("Adelantar cita").into(TXT_MOTIVO),
//                            Click.on(LST_MOTIVO_SELECT),
//                            Click.on(BTN_SI)

                    );
                }
        );
    }
}