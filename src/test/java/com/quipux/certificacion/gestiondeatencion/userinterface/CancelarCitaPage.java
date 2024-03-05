package com.quipux.certificacion.gestiondeatencion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CancelarCitaPage {
    public static final Target BTN_CANCELAR_CITA = Target.the("Bot\u00F3n para cancelar cita servicio")
            .locatedBy(".fa.fa-ban");
    public static final Target LST_CANCELAR_MOTIVO = Target.the("Abre la lista de opciones de motivo")
            .locatedBy("#select2-motivo-container");
    public static final Target BTN_SI_CONTINUAR_CANCELAR = Target.the("Bot\u00F3n para continuar")
            .locatedBy("//button[@ng-click='consultarAgendaController.cancelarCita()']");
    public static final Target LBL_CANCELAR_CITA = Target.the("Mensaje de validac\u00F3n reagendar cita")
            .locatedBy("//div[contains(text(),'cancelada exitosamente')]");

}
