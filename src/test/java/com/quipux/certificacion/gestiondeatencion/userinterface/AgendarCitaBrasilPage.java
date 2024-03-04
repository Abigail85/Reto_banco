package com.quipux.certificacion.gestiondeatencion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AgendarCitaBrasilPage {
    public static final Target TXT_INDICATIVO_NUMERO_DE_TELEFONO = Target.the("Indicativo del n\u00FAmero telefonico")
            .located(By.id("indicativo"));
    public static final Target TXT_NUMERO_DE_CELULAR = Target.the("N\u00FAmero de celular del solicitante")
            .locatedBy("//input[@id='celular']");
}
