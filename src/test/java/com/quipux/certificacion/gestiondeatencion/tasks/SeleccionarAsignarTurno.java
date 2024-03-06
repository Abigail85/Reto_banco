package com.quipux.certificacion.gestiondeatencion.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.quipux.certificacion.gestiondeatencion.userinterface.AsignarTurnoPage.BTN_CERRAR;
import static com.quipux.certificacion.gestiondeatencion.userinterface.MenuPage.LST_ASIGNAR_TURNOS;
import static com.quipux.certificacion.gestiondeatencion.userinterface.MenuPage.LST_GESTION_DE_LA_ATENCION;

public class SeleccionarAsignarTurno {

    public static Performable paraTramites() {
        return Task.where("{0} selecciona la opción del menu",
                actor -> {
                    actor.attemptsTo(
                            Click.on(LST_GESTION_DE_LA_ATENCION),
                            Click.on(LST_ASIGNAR_TURNOS),
                            Click.on(BTN_CERRAR)
                    );
                }
        );
    }
}
