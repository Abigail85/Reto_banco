package com.quipux.certificacion.gestiondeatencion.tasks;

import com.quipux.certificacion.gestiondeatencion.interactions.SeleccionarFecha;
import com.quipux.certificacion.gestiondeatencion.interactions.SeleccionarHorario;
import com.quipux.certificacion.gestiondeatencion.interactions.SeleccionarSubSede;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class AgendaLaCita {

    public static Performable paraUnServicioRequerido() {
        return Task.where("{0} completa el formulario para agendar cita",
                actor -> {
                    actor.attemptsTo(
                            SeleccionarOpcionDeMenu.paraTramites(),
                            SeleccionarSubSede.paraAgendarLaCita(),
                            DiligenciarFormulario.delSolicitante(),
                            AgregarServicio.requerido(),
                            SeleccionarFecha.disponible(),
                            SeleccionarHorario.disponible());
                }
        );
    }
}
