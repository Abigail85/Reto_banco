package com.quipux.certificacion.gestiondeatencion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AgendarCitaPage {
    public static final Target BTN_AGENDAR_CITA = Target.the("Bot\u00F3n para agendar cita")
            .locatedBy("//button[text()='Agendar cita']");
    public static final Target DDL_SUB_SEDE = Target.the("Lista de sub-sedes")
            .located(By.id("select2-subsede-container"));
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
    public static final Target TXT_SEGUNDO_NOMBRE = Target.the("Campo para ingresar el segundo nombre")
            .located(By.id("segundoNombre"));
    public static final Target TXT_PRIMER_APELLIDO = Target.the("Campo para ingresar el primer apellido")
            .located(By.id("apellidos"));
    public static final Target TXT_SEGUNDO_APELLIDO = Target.the("Campo para ingresar el segundo apellido")
            .located(By.id("segundoApellido"));
    public static final Target TXT_CORREO_ELECTRONICO = Target.the("Campo para ingresar el correo electronico")
            .located(By.id("correo"));
    public static final Target TXT_NUMERO_TELEFONICO = Target.the("Campo para ingresar el n\u00FAmero telefonico")
            .located(By.id("telefono"));
    public static final Target TXT_DIRECCION_DE_RESIDENCIA = Target.the("Campo para ingresar la direcci\u00F3n de residencia")
            .located(By.id("direccion"));
}
