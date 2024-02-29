package com.quipux.certificacion.gestiondeatencion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReagendarCitaPage {
    public static final Target TABLE_FECHA_INI = Target.the("Fecha inicial en la tabla")
            .locatedBy("tr[role='row'] td:nth-child(2)");
    public static final Target BTN_REASIGNAR_CITA = Target.the("Bot\u00F3n para reasignar cita")
            .locatedBy("//button[@title='Reasignar']");
    public static final Target LST_REASIGNAR_HORA = Target.the("Selecciona el horario disponible")
            .located(By.xpath("//span[contains(@class, 'select2-selection') and contains(@id, 'select2-horaCita')]"));
    public static final Target LST_MOTIVO = Target.the("Abre la lista de opciones de motivo")
            .locatedBy("#select2-motivoReasignar-container");
    public static final Target TXT_MOTIVO = Target.the("Campo para buscar el motivo")
            .locatedBy("(//input[@role='textbox'])[1]");
    public static final Target LST_MOTIVO_SELECT = Target.the("Selecciona el motivo")
            .locatedBy("//li[contains(text(),'{0}')]");
    public static final Target BTN_SI = Target.the("Bot\u00F3n para continuar")
            .locatedBy("//button[contains(@class, 'btn-primary') and contains(@ng-click, 'reasignarCita')]");
    public static final Target LBL_REAGENDAR_CITA = Target.the("mensaje de validac\u00F3n reagendar cita")
            .locatedBy("//div[contains(text(),'se reasign\u00F3 satisfactoriamente para')]");
}
