package com.quipux.certificacion.gestiondeatencion.tasks;

import com.quipux.certificacion.gestiondeatencion.interactions.SeleccionarHorario;
import com.quipux.certificacion.gestiondeatencion.interactions.SeleccionarSubSede;
import com.quipux.certificacion.gestiondeatencion.model.AgendarCita;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import static com.quipux.certificacion.gestiondeatencion.userinterface.AgendarCitaPage.*;
import static com.quipux.certificacion.gestiondeatencion.userinterface.AgendarCitaPage.BTN_GUARDAR;
import static com.quipux.certificacion.gestiondeatencion.userinterface.ComunesPage.BTN_CONTINUAR;
import static com.quipux.certificacion.gestiondeatencion.userinterface.ComunesPage.IMG_CARGANDO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotPresent;

public class AgregarMultiplesServicios {

    public static Performable requeridos(List<Map<String, String>> servicios, AgendarCita usuario) {
        return Task.where("{0} selecciona los servicios requeridos",
                actor -> {
                    actor.attemptsTo(
                            SeleccionarAgendarCita.paraElServicio(),
                            Click.on(BTN_AGENDAR_CITA),
                            SeleccionarSubSede.paraAgendarLaCita(usuario.getSubSede()),
                            DiligenciarFormulario.delSolicitante(usuario),
                            Click.on(BTN_CONTINUAR)
                    );
                    for (int i = 0; i < servicios.size(); i++) {
                        actor.attemptsTo(
                                AgregarServicio
                                        .requerido(servicios.get(i).get("EntidadPrestadoraDeServicio"), servicios.get(i).get("ServicioRequerido")));
                    }
                    actor.attemptsTo(
                            Click.on(TXT_FECHA_REQUERIDA).afterWaitingUntilEnabled(),
                            Enter.theValue(usuario.getFechaCita()).into(TXT_FECHA_REQUERIDA),
                            SeleccionarHorario.disponible(),
                            Scroll.to(BTN_GUARDAR),
                            Click.on(BTN_GUARDAR),
                            WaitUntil.the(IMG_CARGANDO, isNotPresent()).forNoMoreThan(Duration.ofMillis(3000))
                    );
                }
        );
    }
}
