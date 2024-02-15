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
    public static final Target DDL_TIPO_DE_DOCUMENTO = Target.the("Lista de tipos de documentos")
            .located(By.id("select2-tipoDocumento-container"));
    public static final Target TXT_TIPO_DE_DOCUMENTO = Target.the("Campo para ingresar el tipo de documento del solicitante")
            .locatedBy("//input[@class='select2-search__field']");
    public static final Target LST_DOCUMENTO = Target.the("Tipo de documento")
            .locatedBy("//li[contains(text(),'CEDULA CIUDADANIA')]");
    public static final Target TXT_NUMERO_DOCUMENTO = Target.the("Campo para ingresar el n\u00FAmero de documento")
            .located(By.id("numeroDocumento"));
    public static final Target TXT_PRIMER_NOMBRE = Target.the("Campo para ingresar el primer nombre")
            .located(By.id("nombres"));
    public static final Target TXT_PRIMER_APELLIDO = Target.the("Campo para ingresar el primer apellido")
            .located(By.id("apellidos"));
    public static final Target TXT_CORREO_ELECTRONICO = Target.the("Campo para ingresar el correo electronico")
            .located(By.id("correo"));
    public static final Target TXT_NUMERO_TELEFONICO = Target.the("Campo para ingresar el n\u00FAmero telefonico")
            .located(By.id("telefono"));
    public static final Target BTN_CONTINUAR = Target.the("Selecciona el bot\u00F3n continuar")
            .locatedBy("//button[@class='btn btn-primary btn-block ng-binding']");
    public static final Target BTN_AGREGAR_SERVICIO = Target.the("Selecciona el bot\u00F3n agregar servicio")
            .locatedBy("//button[@class='btn btn-outline-primary btn-block ng-binding']");
    public static final Target DDL_ENTIDAD_PRESTADORA_DE_SERVICIO = Target.the("Lista de entidades prestadoras")
            .located(By.id("select2-tipoEntidad-container"));
    public static final Target TXT_ENTIDAD_PRESTADORA_DE_SERVICIO = Target.the("Campo para ingresar la entidad prestadora de servicio")
            .locatedBy("//input[@class='select2-search__field']");
    public static final Target LST_ENTIDAD_PRESTADORA_DE_SERVICIO = Target.the("Seleccionar la entidad prestadora de servicio")
            .locatedBy("//li[contains(text(),'Ministerio de Salud')]");
    public static final Target DDL_NOMBRE_DEL_SERVICIO = Target.the("Listado de tipo de servicios")
            .located(By.id("select2-tipoServicio-container"));
    public static final Target TXT_NOMBRE_DEL_SERVICIO = Target.the("Campo para ingresar el tipo de servicio")
            .locatedBy("//input[@type='search']");
    public static final Target LTS_NOMBRE_DEL_SERVICIO = Target.the("Seleccionar el tipo de servicio")
            .locatedBy("//li[contains(text(),'Entrega cédula de extranjería')]");
    public static final Target BTN_AGREGAR = Target.the("Selecciona el bot\u00F3n agregar")
            .locatedBy("//button[@type='button'][contains(.,'Agregar')]");
    public static final Target BTN_REGISTRAR_ATENCION = Target.the("Selecciona el bot\u00F3n registrar atenci\u00F3n")
            .locatedBy("//button[@ng-click='asignarTurnoController.validarFormulario()']");

}
