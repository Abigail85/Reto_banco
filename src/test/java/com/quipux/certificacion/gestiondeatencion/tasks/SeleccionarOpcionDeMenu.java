package com.quipux.certificacion.gestiondeatencion.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.quipux.certificacion.gestiondeatencion.userinterface.MenuPage.LST_AGENDAR_CITAS;
import static com.quipux.certificacion.gestiondeatencion.userinterface.MenuPage.LST_GESTION_DE_LA_ATENCION;

public class SeleccionarOpcionDeMenu {

    public static Performable paraTramites() {
        return Task.where("{0} selecciona la opción del menu",
                Click.on(LST_GESTION_DE_LA_ATENCION),
                Click.on(LST_AGENDAR_CITAS)
        );
    }
}
