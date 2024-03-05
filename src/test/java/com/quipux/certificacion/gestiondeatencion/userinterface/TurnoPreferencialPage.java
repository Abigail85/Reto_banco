package com.quipux.certificacion.gestiondeatencion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TurnoPreferencialPage {
    public static final Target DDL_ATENCION_PREFERENCIAL = Target.the("Lista opciones de atenci\u00F3n preferencial")
            .locatedBy("//span[contains(@id,'select2-tipoPreferencial-container')]");
    public static final Target TXT_ATENCION_PREFERENCIAL = Target.the("Ingresa atenci\u00F3n preferencial")
            .located(By.id("select2-search__field"));
    public static final Target LST_ATENCION_PREFERENCIAL = Target.the("Selecciona el servicio preferencial")
            .located(By.id("select2-tipoPreferencial-result-cijn-object:1775"));
}
