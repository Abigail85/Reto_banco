package com.quipux.certificacion.gestiondeatencion.tasks;

import com.quipux.certificacion.gestiondeatencion.interactions.SeleccionarHorario;
import com.quipux.certificacion.gestiondeatencion.interactions.SeleccionarSubSede;
import com.quipux.certificacion.gestiondeatencion.model.AgendarCita;
import net.serenitybdd.model.time.InternalSystemClock;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.quipux.certificacion.gestiondeatencion.userinterface.AgendarCitaPage.*;
import static com.quipux.certificacion.gestiondeatencion.userinterface.ComunesPage.BTN_CONTINUAR;
import static com.quipux.certificacion.gestiondeatencion.userinterface.ComunesPage.IMG_CARGANDO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotPresent;

public class AgendaLaCita {
    private static final int TIEMPO = 1000;
    private static final int TIEMPO_ESPERA = 3000;

    public static Performable paraUnServicioRequerido(AgendarCita usuario) {
        return Task.where("{0} completa el formulario para agendar cita",
                actor -> {
                    actor.attemptsTo(
                            SeleccionarAgendarCita.paraElServicio(),
                            Click.on(BTN_AGENDAR_CITA),
                            SeleccionarSubSede.paraSeleccionarSubSedeAgendarCita(usuario.getSubSede()),
                            DiligenciarFormulario.delSolicitante(usuario),
                            Click.on(BTN_CONTINUAR),
                            AgregarServicio.requerido(usuario.getEntidadPrestadora(), usuario.getServicio()),
                            Click.on(TXT_FECHA_REQUERIDA).afterWaitingUntilEnabled(),
                            Enter.theValue(usuario.getFechaCita()).into(TXT_FECHA_REQUERIDA),
                            SeleccionarHorario.disponible(),
                            Scroll.to(BTN_GUARDAR),
                            Click.on(BTN_GUARDAR),
                            WaitUntil.the(IMG_CARGANDO, isNotPresent()).forNoMoreThan(Duration.ofMillis(TIEMPO_ESPERA))
                    );
                    actor.remember("confirmacionCita", LBL_CONFIRMACION_DE_CITA.resolveFor(actor).getText());
                }
        );
    }

    public static Performable paraUnUsuarioConIdentificacionTipoNit(AgendarCita usuario) {
        return Task.where("{0} completa el formulario para agendar cita",
                actor -> {
                    actor.attemptsTo(
                            SeleccionarAgendarCita.paraElServicio(),
                            Click.on(BTN_AGENDAR_CITA),
                            SeleccionarSubSede.paraSeleccionarSubSedeAgendarCita(usuario.getSubSede()),
                            DiligenciarFormulario.paraUnUsuarioConIdentificacionTipoNit(usuario),
                            Click.on(BTN_CONTINUAR),
                            AgregarServicio.requerido(usuario.getEntidadPrestadora(), usuario.getServicio()),
                            Click.on(TXT_FECHA_REQUERIDA).afterWaitingUntilEnabled(),
                            Enter.theValue(usuario.getFechaCita()).into(TXT_FECHA_REQUERIDA),
                            SeleccionarHorario.disponible(),
                            Scroll.to(BTN_GUARDAR),
                            Click.on(BTN_GUARDAR),
                            WaitUntil.the(IMG_CARGANDO, isNotPresent()).forNoMoreThan(Duration.ofMillis(TIEMPO_ESPERA))
                    );
                }
        );
    }

    public static Performable incluyendoUnComentarioParaElServicio(AgendarCita agendarCita) {
        return Task.where("{0} completa el formulario para agendar cita",
                actor -> {
                    actor.attemptsTo(
                            SeleccionarAgendarCita.paraElServicio(),
                            Click.on(BTN_AGENDAR_CITA),
                            SeleccionarSubSede.paraSeleccionarSubSedeAgendarCita(agendarCita.getSubSede()),
                            DiligenciarFormulario.delSolicitante(agendarCita),
                            Click.on(BTN_CONTINUAR),
                            AgregarServicio.requerido(agendarCita.getEntidadPrestadora(), agendarCita.getServicio()),
                            Click.on(TXT_FECHA_REQUERIDA).afterWaitingUntilEnabled(),
                            Enter.theValue(agendarCita.getFechaCita()).into(TXT_FECHA_REQUERIDA),
                            SeleccionarHorario.disponible(),
                            Enter.theValue(agendarCita.getComentario()).into(By.id("comentarios")),
                            Scroll.to(BTN_GUARDAR),
                            Click.on(BTN_GUARDAR),
                            WaitUntil.the(IMG_CARGANDO, isNotPresent()).forNoMoreThan(Duration.ofMillis(TIEMPO_ESPERA))
                    );
                }
        );
    }

    public static Performable paraUnServicioSinPlacaDeVehiculo(AgendarCita agendarCita) {
        return Task.where("{0} completa el formulario para agendar cita",
                actor -> {
                    actor.attemptsTo(
                            SeleccionarAgendarCita.paraElServicio(),
                            Click.on(BTN_AGENDAR_CITA),
                            SeleccionarSubSede.paraSeleccionarSubSedeAgendarCita(agendarCita.getSubSede()),
                            DiligenciarFormulario.delSolicitante(agendarCita),
                            Click.on(BTN_CONTINUAR),
                            AgregarServicio.queNoRequierePlacaDelVehiculo(agendarCita.getEntidadPrestadora(), agendarCita.getServicio()),
                            Click.on(TXT_FECHA_REQUERIDA).afterWaitingUntilEnabled(),
                            Enter.theValue(agendarCita.getFechaCita()).into(TXT_FECHA_REQUERIDA),
                            SeleccionarHorario.disponible(),
                            Scroll.to(BTN_GUARDAR),
                            Click.on(BTN_GUARDAR),
                            WaitUntil.the(IMG_CARGANDO, isNotPresent()).forNoMoreThan(Duration.ofMillis(TIEMPO_ESPERA))
                    );
                }
        );
    }

    public static Performable paraOtroNumeroDeDocumento(AgendarCita agendarCita) {
        return Task.where("{0} completa el formulario para agendar la cita",
                actor -> {
                    actor.attemptsTo(
                            SeleccionarAgendarCita.paraElServicio(),
                            Click.on(BTN_AGENDAR_CITA));
                    new InternalSystemClock().pauseFor(TIEMPO);
                    actor.attemptsTo(
                            SeleccionarSubSede.paraSeleccionarSubSedeAgendarCita(agendarCita.getSubSede()),
                            DiligenciarFormulario.delSolicitante(agendarCita),
                            Click.on(BTN_CONTINUAR),
                            AgregarServicio.cambiandoLaInformacionDeUsuario(agendarCita.getEntidadPrestadora(), agendarCita.getServicio()),
                            Click.on(TXT_FECHA_REQUERIDA).afterWaitingUntilEnabled(),
                            Enter.theValue(agendarCita.getFechaCita()).into(TXT_FECHA_REQUERIDA),
                            SeleccionarHorario.disponible(),
                            Scroll.to(BTN_GUARDAR),
                            Click.on(BTN_GUARDAR),
                            WaitUntil.the(IMG_CARGANDO, isNotPresent()).forNoMoreThan(Duration.ofMillis(TIEMPO_ESPERA))
                    );
                }
        );
    }

    public static Performable paraUnServicioRequeridoDeBrasil(AgendarCita agendarCita) {
        return Task.where("{0} completa el formulario para agendar la cita",
                actor -> {
                    actor.attemptsTo(
                            SeleccionarAgendarCita.paraElServicio(),
                            Click.on(BTN_AGENDAR_CITA));
                    new InternalSystemClock().pauseFor(TIEMPO);
                    actor.attemptsTo(
                            SeleccionarSubSede.paraSeleccionarSubSedeAgendarCita(agendarCita.getSubSede()),
                            DiligenciarFormulario.brasileno(agendarCita),
                            Click.on(BTN_CONTINUAR),
                            AgregarServicio.requerido(agendarCita.getEntidadPrestadora(), agendarCita.getServicio()),
                            Click.on(TXT_FECHA_REQUERIDA).afterWaitingUntilEnabled(),
                            Enter.theValue(agendarCita.getFechaCita()).into(TXT_FECHA_REQUERIDA),
                            SeleccionarHorario.disponible(),
                            Scroll.to(BTN_GUARDAR),
                            Click.on(BTN_GUARDAR),
                            WaitUntil.the(IMG_CARGANDO, isNotPresent()).forNoMoreThan(Duration.ofMillis(TIEMPO_ESPERA))
                    );
                }
        );
    }
}
