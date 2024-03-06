package com.quipux.certificacion.gestiondeatencion.tasks;

import net.serenitybdd.model.time.InternalSystemClock;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.quipux.certificacion.gestiondeatencion.userinterface.MenuPage.LST_AGENDAR_CITAS;
import static com.quipux.certificacion.gestiondeatencion.userinterface.MenuPage.LST_GESTION_DE_LA_ATENCION;

public class SeleccionarAgendarCita {

    public static Performable paraElServicio() {
        return Task.where("{0} selecciona la opción del menú",
                actor -> {
                    actor.attemptsTo(
                            Click.on(LST_GESTION_DE_LA_ATENCION),
                            Click.on(LST_AGENDAR_CITAS)
                    );
                }
        );
    }
}
