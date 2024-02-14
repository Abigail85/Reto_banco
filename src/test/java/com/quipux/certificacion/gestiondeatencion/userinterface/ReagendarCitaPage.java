package com.quipux.certificacion.gestiondeatencion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReagendarCitaPage {

    public static final Target BTN_REASIGNAR_CITA = Target.the("Bot\u00F3n para reasignar cita")
            .locatedBy("//button[@title='Reasignar']");

    public static final Target TXT_REASIGNAR_FECHA = Target.the("Campo para reasignar fecha")
            .located(By.cssSelector("#agendarCitaDatePicker"));

    public static final Target LST_REASIGNAR_HORA = Target.the("Selecciona el horario disponible")
            .located(By.cssSelector("form[id='formReasignacion'] div span[class='select2 select2-container select2-container--default'] span[role='presentation']"));

    public static final Target LST_MOTIVO = Target.the("Abre la lista de opciones de motivo")
            .locatedBy("#select2-motivoReasignar-container");

    public static final Target TXT_MOTIVO = Target.the("Campo para buscar el motivo")
            .locatedBy("(//input[@role='textbox'])[1]");

    public static final Target LST_MOTIVO_SELECT = Target.the("Selecciona el motivo")
            .locatedBy("//li[contains(text(),'Adelantar')]");

    public static final Target BTN_SI = Target.the("Bot\u00F3n para continuar")
            .locatedBy("(//button[@ng-click='consultarAgendaController.reasignarCita()'])[1]");

    public static final Target TABLE_FECHA = Target.the("Fecha de la cita")
            .locatedBy("//td[normalize-space()='19/02/2024 16:00']");


}
