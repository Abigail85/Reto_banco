package com.quipux.certificacion.gestiondeatencion.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ComunesPage {
    public static final Target BTN_CONTINUAR = Target.the("Bot\u00F3n continuar")
            .locatedBy("//button[contains(text(),'Continuar')]");
    public static final Target IMG_CARGANDO = Target.the("Imagen que indica que se esta procesando la informaci\u00F3n")
            .locatedBy("(//img[@class='img-fluid'])[1]");
}
