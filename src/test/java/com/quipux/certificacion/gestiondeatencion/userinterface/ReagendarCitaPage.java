package com.quipux.certificacion.gestiondeatencion.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ReagendarCita {

    public static final Target BTN_REASIGNAR_CITA = Target.the("Bot\u00F3n para reasignar cita")
            .locatedBy("tr[class='even'] button[title='Reasignar']");

    public static final Target TXT_REASIGNAR_FECHA = Target.the("Txt para reasignar fecha")
            .locatedBy("label[for='agendarCitaDatePicker']");

    public static final Target SELECT_REASIGNAR_HORA = Target.the("Select para reasignar hora")
            .locatedBy("#select2-horaCita-container");

    public static final Target SELECT_REASIGNAR_MOTIVO = Target.the("Select para reasignar motivo")
            .locatedBy("#select2-motivoReasignar-container");

    public static final Target BTN_SI = Target.the("Bot\u00F3n para continuar")
            .locatedBy("button[ng-click='consultarAgendaController.reasignarCita()']");



}
