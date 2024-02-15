package com.quipux.certificacion.gestiondeatencion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConsultarCitaPage {


    public static final Target DDL_SUB_SEDE_CONSULTAR = Target.the("Lista de sub-sedes")
            .located(By.xpath("(//span[@id='select2-subsede-container'])[1]"));
    public static final Target TXT_NRODOCUMENTO_CON = Target.the("Txt numero docuemento")
            .located(By.xpath("//input[@id='nroDocumento']"));
    public static final Target DDL_CRITERIO_BUSQUEDA = Target.the("Lista de busquedad")
            .located(By.cssSelector("#select2-criterioBusqueda-container"));

    public static final Target TXT_CRITERIO_BUSQUEDA = Target.the("Txt de busquedad")
            .located(By.cssSelector("input[role='textbox']"));

    public static final Target LST_CRITERIO_BUSQUEDA = Target.the("Tipo de consulta")
            .locatedBy("//li[contains(text(),'{0}')]");

    public static final Target BTN_BUSCAR = Target.the("Bot\u00F3n de consulta")
            .locatedBy(".btn.btn-primary.btn-block.ng-binding");


}
