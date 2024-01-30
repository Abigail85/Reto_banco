package com.quipux.certificacion.gestiondeatencion.tasks;

import com.quipux.certificacion.gestiondeatencion.interactions.SeleccionarSubSede;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotPresent;

public class AgendaLaCita {

    public static Performable paraUnServicio() {
        return Task.where("{0} completa el formulario para agendar cita",
                actor -> {
                    actor.attemptsTo(
                            SeleccionarOpcionDeMenu.paraTramites(),
                            SeleccionarSubSede.paraAgendarLaCita());
                    actor.attemptsTo(
                            // Diligenciar formulario solicitante
                            Click.on("#select2-tipoDocumento-container"),
                            Enter.theValue("CEDULA CIUDADANIA").into("//input[@class='select2-search__field']"),
                            Click.on("//li[contains(text(),'CEDULA CIUDADANIA')]"),
                            Enter.theValue("1017204547").into("#numeroDocumento"),
                            Click.on("#nombres"),
                            Enter.theValue("Esteban").into("#nombres"),
                            Enter.theValue("Andres").into("#segundoNombre"),
                            Enter.theValue("Villa").into("#apellidos"),
                            Enter.theValue("Villada").into("#segundoApellido"),
                            Enter.theValue("julian@gmail.com").into("#correo"),
                            Enter.theValue("3146834990").into("#telefono"),
                            Enter.theValue("calle medellin").into("#direccion"),
                            Click.on("//button[contains(text(),'Continuar')]")
                    );
                    actor.attemptsTo(
                            //Agregar servicio
                            Click.on("//button[contains(text(),'Agregar servicio')]"),
                            Click.on("(//span[@id='select2-entidadPrestadora-container'])[1]").afterWaitingUntilEnabled(),
                            Enter.theValue("Alcaldía de Medellín").into("//input[@class='select2-search__field']"),
                            Click.on("//li[contains(text(),'Alcaldía de Medellín')]"),
                            Click.on("#select2-tipoServicio-container"),
                            Enter.theValue("Cambio de matricula").into("//input[@class='select2-search__field']"),
                            Click.on("//li[contains(text(),'Cambio de matricula')]"),
                            Enter.theValue("AAA123").into("#placa"),
                            Click.on("//div[@class='modal-footer']/child::button[contains(text(),'Agregar')]"),
                            WaitUntil.the("(//img[@class='img-fluid'])[1]", isNotPresent()).forNoMoreThan(Duration.ofMillis(2000))
                    );
                    actor.attemptsTo(
                            Click.on("#agendarCitaDatePicker"),

                            //manejar calendario
                            Click.on("(//th[@class='datepicker-switch'])[1]"),
                            Click.on("//span[text()='Ene']"),
                            Click.on("//td[@class='day' and text()='31']"),
                            WaitUntil.the("(//img[@class='img-fluid'])[1]", isNotPresent()).forNoMoreThan(Duration.ofMillis(3000)),
                            Click.on("(//span[@class='select2-selection select2-selection--single'])[3]")
                    );
                }
        );
    }
}
