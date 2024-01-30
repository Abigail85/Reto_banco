package com.quipux.certificacion.gestiondeatencion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AgendarCitaPage {
    public static final Target BTN_AGENDAR_CITA = Target.the("Bot\u00F3n para agendar cita")
            .locatedBy("//button[text()='Agendar cita']");
    public static final Target DDL_SUB_SEDE = Target.the("Lista de sub-sedes")
            .located(By.id("select2-subsede-container"));
}
