package com.quipux.certificacion.gestiondeatencion.tasks;

import com.quipux.certificacion.gestiondeatencion.interactions.ElementoPresente;
import com.quipux.certificacion.gestiondeatencion.interactions.ObtenerTextoElemento;
import com.quipux.certificacion.gestiondeatencion.interactions.SeleccionarHorario;
import com.quipux.certificacion.gestiondeatencion.model.AgendarCita;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.quipux.certificacion.gestiondeatencion.utils.FechaDinamica.*;
import static com.quipux.certificacion.gestiondeatencion.userinterface.ReagendarCitaPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ReagendarCitaTask {

    public static Performable reagendarCita(AgendarCita usuario) {

        return Task.where("{0} completa el formulario para reagendar cita",
                actor -> {
                    actor.attemptsTo(
                            ConsultarCita.consultarCita(usuario)
                    );

                    //VALIDACIÓN SI NO HAY CITAS
                    boolean menNoInfor =  actor.asksFor(ElementoPresente.isVisible(LBL_VALIDACION_DE_CONSULTAR_CITA));

                    if (menNoInfor == true){
                        actor.attemptsTo(
                                AgendaLaCita.paraUnServicioRequerido(usuario),
                                ConsultarCita.consultarCita(usuario)
                        );
                    }

                    String fecha = actor.asksFor(ObtenerTextoElemento.delElemento(TABLE_FECHA_INI));
                    ///String fecha = Text.of(TABLE_FECHA_INI).answeredBy(actor).toString();
                    fecha = fecha.substring(0, 10);

                    actor.attemptsTo(
                            Click.on(BTN_REASIGNAR_CITA),
                            WaitUntil.the(TXT_REASIGNAR_FECHA, isVisible()).forNoMoreThan(2).seconds(),
                            Enter.theValue(nuevaFecha(fecha)).into(TXT_REASIGNAR_FECHA),
                            Hit.the(Keys.TAB).into(TXT_REASIGNAR_FECHA),
                            SeleccionarHorario.disponible(),
                            Click.on(LST_MOTIVO),
                            Enter.theValue(usuario.getMotivo()).into(TXT_MOTIVO),
                            Click.on(LST_MOTIVO_SELECT.of(usuario.getMotivo())),
                            Click.on(BTN_SI)
                    );
                }
        );
    }
}