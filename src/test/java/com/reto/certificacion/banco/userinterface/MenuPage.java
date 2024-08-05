package com.reto.certificacion.banco.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuPage {
    public static final Target SELECCIONAR_OPCION_NEGOCIO = Target.the("seleccionar opcion de negocio ")
            .located(By.id("header-pymes"));

    public static final Target ARROW_BANNER_HERRAMIENTAS = Target.the("mueve el menu a la derecha")
            .locatedBy("//div[@class='swiper-button-next button-next-tools']//button[@class='bc-fab-button bc-fab-button-mini']");

    public static final Target SELECCIONAR_OPCION_GESTIONAR_FINANZAS = Target.the("Selecciona la opcion de gestionar finanzas")
            .locatedBy("//a[text()='Gestionar las finanzas de mi negocio']");

    public static final Target SELECCIONAR_OPCION_CONVERTIDOR_TASAS = Target.the("Opcion convertidor de tasas")
            .locatedBy("//a[@href='/negocios/herramientas/convertidor-de-tasas']//p");

    public static final Target SELECCIONAR_OPCION_CALCULAR= Target.the("Selecciona la opcion de calcular")
            .locatedBy("//div[@id='btntoolUno']//a[text()='Calcular']");

    public static final Target INGRESAR_VALOR_INTERES= Target.the("Ingresa el valor")
            .locatedBy("//input[@id='{0}']");

    public static final Target LST_PERIODICIDAD_CAPITALIZACION= Target.the("Ingresa el valor")
            .locatedBy("//select[@id='{0}']");

    public static final Target SELECCIONAR_PERIODICIDAD_CAPITALIZACION= Target.the("Ingresa el valor")
            .locatedBy("option[text()='{0}']");

    public static final Target SELECCIONAR_CAPITALIZACION= Target.the("Ingresa el valor")
            .located(By.id("interes"));

}
