package com.quipux.certificacion.gestiondeatencion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AsignarTurnoPage {
    public static final Target DDL_TAQUILLA = Target.the("Seleccionar el listado de taquillas")
            .located(By.id("select2-slt_taqilla-container"));
    public static final Target TXT_TAQUILLA = Target.the("Campo para ingresa la taquilla")
            .locatedBy("//input[@class='select2-search__field']");
    public static final Target LST_TAQUILLA = Target.the("Selecciona la taquilla requerida")
            .locatedBy("//li[contains(text(),'Oturnos 2')]");
    public static final Target BTN_ABRIR = Target.the("Selecciona el bot\u00F3n abrir")
            .locatedBy("//button[@ng-click='asignarTurnoController.abrirTaquilla()']");
    public static final Target BTN_CERRAR = Target.the("Selecciona el bot\u00F3n cerrar")
            .locatedBy("//button[@class='btn btn-outline-primary btn-block ng-binding'][contains(.,'Cerrar')]");
    public static final Target BTN_REGISTRAR_ATENCION = Target.the("Selecciona el bot\u00F3n registrar atenci\u00F3n")
            .locatedBy("//button[@ng-click='asignarTurnoController.validarFormulario()']");
}
