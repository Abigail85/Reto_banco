package com.quipux.certificacion.gestiondeatencion.tasks;

import com.quipux.certificacion.gestiondeatencion.interactions.SeleccionarHorario;
import com.quipux.certificacion.gestiondeatencion.interactions.SeleccionarSubSede;
import com.quipux.certificacion.gestiondeatencion.model.Usuario;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.quipux.certificacion.gestiondeatencion.userinterface.AgendarCitaPage.*;
import static com.quipux.certificacion.gestiondeatencion.userinterface.ComunesPage.BTN_CONTINUAR;
import static com.quipux.certificacion.gestiondeatencion.userinterface.ComunesPage.IMG_CARGANDO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotPresent;

public class AgendaLaCita {

    public static Performable paraUnServicioRequerido(Usuario usuario) {
        return Task.where("{0} completa el formulario para agendar cita",
                actor -> {
                    actor.attemptsTo(
                            SeleccionarAgendarCita.paraElServicio(),
                            Click.on(BTN_AGENDAR_CITA),
                            SeleccionarSubSede.paraAgendarLaCita(),
                            DiligenciarFormulario.delSolicitante(usuario),
                            Click.on(BTN_CONTINUAR),
                            AgregarServicio.requerido(usuario.getServicio()),
                            Click.on(TXT_FECHA_REQUERIDA).afterWaitingUntilEnabled(),
                            Enter.theValue(usuario.getFechaCita()).into(TXT_FECHA_REQUERIDA),
                            Hit.the(Keys.TAB).keyIn(TXT_FECHA_REQUERIDA),
                            SeleccionarHorario.disponible(),
                            Scroll.to(BTN_GUARDAR),
                            Click.on(BTN_GUARDAR),
                            WaitUntil.the(IMG_CARGANDO, isNotPresent()).forNoMoreThan(Duration.ofMillis(3000))
                    );

                }
        );
    }
}
