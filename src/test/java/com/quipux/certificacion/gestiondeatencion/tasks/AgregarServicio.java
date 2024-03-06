package com.quipux.certificacion.gestiondeatencion.tasks;

import net.serenitybdd.model.time.InternalSystemClock;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Checkbox;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static com.quipux.certificacion.gestiondeatencion.userinterface.AgendarCitaPage.*;
import static com.quipux.certificacion.gestiondeatencion.userinterface.AgregarServicioPage.*;
import static com.quipux.certificacion.gestiondeatencion.userinterface.AgregarServicioPage.DDL_TIPO_DE_DOCUMENTO;
import static com.quipux.certificacion.gestiondeatencion.userinterface.ComunesPage.IMG_CARGANDO;
import static com.quipux.certificacion.gestiondeatencion.utils.GeneradorDePlacasDeVehiculo.generarNumeroDocumento;
import static com.quipux.certificacion.gestiondeatencion.utils.GeneradorDePlacasDeVehiculo.obtenerPlacaDelVehiculo;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class AgregarServicio {
    private static final int TIEMPO = 1000;
    private static final int TIEMPO_ESPERA = 3000;

    public static Performable requerido(String entidadPrestadoraDeServicio, String servicio) {
        return Task.where("{0} agrega el servicio  para la cita",
                actor -> {
                    new InternalSystemClock().pauseFor(TIEMPO);
                    actor.attemptsTo(
                            Click.on(BTN_AGREGAR_SERVICIO),
                            WaitUntil.the(IMG_CARGANDO, isNotPresent()).forNoMoreThan(Duration.ofMillis(TIEMPO_ESPERA)),
                            Click.on(DDL_ENTIDAD_PRESTADORA_DE_SERVICIO).afterWaitingUntilEnabled(),
                            Enter.theValue(entidadPrestadoraDeServicio).into(TXT_ENTIDAD_PRESTADORA_DE_SERVICIO),
                            Click.on(LST_ENTIDAD.of(entidadPrestadoraDeServicio)),
                            Click.on(DDL_TIPO_DE_SERVICIO).afterWaitingUntilEnabled(),
                            Enter.theValue(servicio).into(TXT_SERVICO_REQURIDO),
                            Click.on(LST_SERVICIO.of(servicio)),
                            Click.on(TXT_PLACA_DEL_VEHICULO),
                            Enter.theValue(obtenerPlacaDelVehiculo()).into(TXT_PLACA_DEL_VEHICULO),
                            Click.on(BTN_AGREGAR_SERVICIO_REQUERIDO),
                            WaitUntil.the(IMG_CARGANDO, isNotPresent()).forNoMoreThan(Duration.ofMillis(TIEMPO_ESPERA))
                    );
                }
        );
    }

    public static Performable queNoRequierePlacaDelVehiculo(String entidadPrestadoraDeServicio, String servicio) {
        return Task.where("{0} agrega el servicio  para la cita",
                actor -> {
                    actor.attemptsTo(
                            WaitUntil.the(BTN_AGREGAR_SERVICIO, isPresent()).forNoMoreThan(TIEMPO_ESPERA).milliseconds(),
                            Click.on(BTN_AGREGAR_SERVICIO),
                            WaitUntil.the(IMG_CARGANDO, isNotPresent()).forNoMoreThan(Duration.ofMillis(TIEMPO_ESPERA)),
                            Click.on(DDL_ENTIDAD_PRESTADORA_DE_SERVICIO).afterWaitingUntilEnabled(),
                            Enter.theValue(entidadPrestadoraDeServicio).into(TXT_ENTIDAD_PRESTADORA_DE_SERVICIO),
                            Click.on(LST_ENTIDAD.of(entidadPrestadoraDeServicio)),
                            Click.on(DDL_TIPO_DE_SERVICIO).afterWaitingUntilEnabled(),
                            Enter.theValue(servicio).into(TXT_SERVICO_REQURIDO),
                            Click.on(LST_SERVICIO.of(servicio)),
                            Click.on(BTN_AGREGAR_SERVICIO_REQUERIDO),
                            WaitUntil.the(IMG_CARGANDO, isNotPresent()).forNoMoreThan(Duration.ofMillis(TIEMPO_ESPERA))
                    );
                }
        );
    }

    public static Performable cambiandoLaInformacionDeUsuario(String entidadPrestadoraDeServicio, String servicio) {
        return Task.where("{0} agrega el servicio para la cita",
                actor -> {
                    String documento = generarNumeroDocumento();
                    actor.attemptsTo(
                            WaitUntil.the(BTN_AGREGAR_SERVICIO, isPresent()).forNoMoreThan(TIEMPO_ESPERA).milliseconds(),
                            Click.on(BTN_AGREGAR_SERVICIO),
                            WaitUntil.the(IMG_CARGANDO, isNotPresent()).forNoMoreThan(Duration.ofMillis(TIEMPO_ESPERA)),
                            Click.on(DDL_ENTIDAD_PRESTADORA_DE_SERVICIO).afterWaitingUntilEnabled(),
                            Enter.theValue(entidadPrestadoraDeServicio).into(TXT_ENTIDAD_PRESTADORA_DE_SERVICIO),
                            Click.on(LST_ENTIDAD.of(entidadPrestadoraDeServicio)),
                            Click.on(DDL_TIPO_DE_SERVICIO).afterWaitingUntilEnabled(),
                            Enter.theValue(servicio).into(TXT_SERVICO_REQURIDO),
                            Click.on(LST_SERVICIO.of(servicio)),
                            Click.on(CHK_TIPO_Y_DOCUMENTO_DIFERENTES),
                            Click.on(DDL_TIPO_DE_DOCUMENTO),
                            Enter.theValue("CEDULA CIUDADANIA").into(TXT_TIPO_DE_DOCUMENTO),
                            Click.on(LST_DOCUMENTO.of("CEDULA CIUDADANIA")),
                            Enter.theValue(documento).into(TXT_NUMERO_DE_DOCUMENTO),
                            Click.on(BTN_AGREGAR_SERVICIO_REQUERIDO),
                            WaitUntil.the(IMG_CARGANDO, isNotPresent()).forNoMoreThan(Duration.ofMillis(TIEMPO_ESPERA))
                    );
                }
        );
    }
}
