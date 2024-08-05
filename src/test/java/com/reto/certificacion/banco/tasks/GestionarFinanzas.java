package com.reto.certificacion.banco.tasks;

import com.reto.certificacion.banco.interactions.Esperar;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.reto.certificacion.banco.userinterface.MenuPage.*;


public class GestionarFinanzas {

    public static Performable convertirTasaDeInteres() {
        return Task.where("{0} se autentica con las credenciales",
                actor -> {
                    actor.attemptsTo(
                            Click.on(ARROW_BANNER_HERRAMIENTAS),
                            Click.on(ARROW_BANNER_HERRAMIENTAS),
                            Click.on(SELECCIONAR_OPCION_GESTIONAR_FINANZAS),
                            Scroll.to(SELECCIONAR_OPCION_CONVERTIDOR_TASAS),
                            Click.on(SELECCIONAR_OPCION_CONVERTIDOR_TASAS),
                            Esperar.porUnosSegundos(5),
                            Click.on(SELECCIONAR_OPCION_CALCULAR),
                            Click.on(INGRESAR_VALOR_INTERES.of("interes")),
                            Enter.theValue("0").into(INGRESAR_VALOR_INTERES.of("interes")),
                            Click.on(LST_PERIODICIDAD_CAPITALIZACION.of("periodicidad-deseada")));
                    actor.attemptsTo(
                            Click.on(SELECCIONAR_PERIODICIDAD_CAPITALIZACION.of("Selecciona")),
                            Click.on(LST_PERIODICIDAD_CAPITALIZACION.of("capitalizacion")),
                            Click.on(SELECCIONAR_PERIODICIDAD_CAPITALIZACION.of("capitalizacion","Selecciona")),
                            Click.on(INGRESAR_VALOR_INTERES.of("interes2")),
                            Enter.theValue("20").into(INGRESAR_VALOR_INTERES.of("interes2")),
                            Click.on(LST_PERIODICIDAD_CAPITALIZACION.of("periodicidad2")),
                            Click.on(SELECCIONAR_PERIODICIDAD_CAPITALIZACION.of("periodicidad2","Semestral")),
                            Click.on(LST_PERIODICIDAD_CAPITALIZACION.of("capitalizacion2")),
                            Click.on(SELECCIONAR_PERIODICIDAD_CAPITALIZACION.of("capitalizacion2","Anual"))

                    );

                }
        );
    }
}
