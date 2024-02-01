package com.quipux.certificacion.gestiondeatencion.tasks;

import com.quipux.certificacion.gestiondeatencion.interactions.SeleccionarFecha;
import com.quipux.certificacion.gestiondeatencion.interactions.SeleccionarHorario;
import com.quipux.certificacion.gestiondeatencion.interactions.SeleccionarSubSede;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.quipux.certificacion.gestiondeatencion.userinterface.AgendarCitaPage.BTN_GUARDAR;

public class AgendaLaCita {

    public static Performable paraUnServicioRequerido(String tipoDeServicio) {
        return Task.where("{0} completa el formulario para agendar cita",
                actor -> {
                    actor.attemptsTo(
                            SeleccionarOpcionDeMenu.paraTramites(),
                            SeleccionarSubSede.paraAgendarLaCita(),
                            DiligenciarFormulario.delSolicitante(),
                            AgregarServicio.requerido(tipoDeServicio),
                            SeleccionarFecha.disponible(),
                            SeleccionarHorario.disponible(),
                            Scroll.to(BTN_GUARDAR),
                            Click.on(BTN_GUARDAR));
                }
        );
    }
}
