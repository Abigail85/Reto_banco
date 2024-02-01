package com.quipux.certificacion.gestiondeatencion.tasks;

import com.quipux.certificacion.gestiondeatencion.interactions.SeleccionarFecha;
import com.quipux.certificacion.gestiondeatencion.interactions.SeleccionarHorario;
import com.quipux.certificacion.gestiondeatencion.interactions.SeleccionarSubSede;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static com.quipux.certificacion.gestiondeatencion.userinterface.AgendarCitaPage.BTN_GUARDAR;
import static com.quipux.certificacion.gestiondeatencion.userinterface.ComunesPage.IMG_CARGANDO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotPresent;

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
                            Click.on(BTN_GUARDAR),
                            WaitUntil.the(IMG_CARGANDO, isNotPresent()).forNoMoreThan(Duration.ofMillis(3000)));
                }
        );
    }
}
