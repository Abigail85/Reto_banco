package com.quipux.certificacion.gestiondeatencion.tasks;

import com.quipux.certificacion.gestiondeatencion.interactions.SeleccionarTaquilla;
import com.quipux.certificacion.gestiondeatencion.model.AgendarCita;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static com.quipux.certificacion.gestiondeatencion.userinterface.AsignarTurnoPage.BTN_REGISTRAR_ATENCION;
import static com.quipux.certificacion.gestiondeatencion.userinterface.ComunesPage.BTN_CONTINUAR;
import static com.quipux.certificacion.gestiondeatencion.userinterface.ComunesPage.IMG_CARGANDO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotPresent;

public class AsignarElTurno {
    public static Performable paraUnServicioRequerido(AgendarCita usuario) {
        return Task.where("{0} completa el formulario para asignar turno",
                actor -> {
                    actor.attemptsTo(
                            SeleccionarAsignarTurno.paraTramites(),
                            SeleccionarTaquilla.paraAsignarTurno(),
                            DiligenciarFormulario.delSolicitante(usuario),
                            Click.on(BTN_CONTINUAR),
                            AgregarServicio.requerido(usuario.getEntidadPrestadora(), usuario.getServicio()),
                            Scroll.to(BTN_REGISTRAR_ATENCION),
                            Click.on(BTN_REGISTRAR_ATENCION),
                            WaitUntil.the(IMG_CARGANDO, isNotPresent()).forNoMoreThan(Duration.ofMillis(3000))
                    );
                }
        );
    }
}