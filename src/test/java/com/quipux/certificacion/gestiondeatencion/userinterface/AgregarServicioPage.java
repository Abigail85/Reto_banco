package com.quipux.certificacion.gestiondeatencion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AgregarServicioPage {
    public static final Target BTN_AGREGAR_SERVICIO = Target.the("Bot\u00F3n para agregar servicio")
            .locatedBy("//button[contains(text(),'Agregar servicio')]");
    public static final Target DDL_ENTIDAD_PRESTADORA_DE_SERVICIO = Target.the("Lista de entidades prestadoras de servicio")
            .locatedBy("(//span[@id='select2-entidadPrestadora-container'])[1]");
    public static final Target TXT_ENTIDAD_PRESTADORA_DE_SERVICIO = Target.the("Campo para ingresar la entidad prestadora del servicio")
            .locatedBy("//input[@class='select2-search__field']");
    public static final Target LST_ENTIDAD = Target.the("Entidad prestadora de servicio")
            .locatedBy("//li[contains(text(),'Alcaldía de Medellín')]");
    public static final Target DDL_TIPO_DE_SERVICIO = Target.the("Lista para seleccionar el tipo de servicio requerido")
            .located(By.id("select2-tipoServicio-container"));
    public static final Target TXT_SERVICO_REQURIDO = Target.the("Campo para ingresar el servicio requerido")
            .locatedBy("//input[@class='select2-search__field']");
    public static final Target LST_SERVICIO = Target.the("Servicio solicitado")
            .locatedBy("//li[contains(text(),'{0}')]");
    public static final Target TXT_PLACA_DEL_VEHICULO = Target.the("Campo para ingresa la placa del vehículo")
            .locatedBy("(//input[@id='placa'])[2]");
    public static final Target BTN_AGREGAR_SERVICIO_REQUERIDO = Target.the("")
            .locatedBy("//div[@class='modal-footer']/child::button[contains(text(),'Agregar')]");
}
