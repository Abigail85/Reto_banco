package com.quipux.certificacion.gestiondeatencion.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MenuPage {
    public static final Target LST_GESTION_DE_LA_ATENCION = Target.the("Opci\u00F3n Gesti\u00F3n de la atenci\u00F3n")
            .locatedBy("//ul[@id='_menu']/descendant::li[contains(@roles,'ROLE_GESTION_ATENCION')]");
    public static final Target LST_AGENDAR_CITAS = Target.the("Opci\u00F3n Agendar Citas")
            .locatedBy("(//li[@roles='ROLE_ADMON_CITAS_AGENDADA_C'])[1]/child::a");

}
