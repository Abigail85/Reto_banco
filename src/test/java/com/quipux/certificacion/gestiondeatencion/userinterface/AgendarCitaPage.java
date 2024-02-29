package com.quipux.certificacion.gestiondeatencion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AgendarCitaPage {
    public static final Target BTN_AGENDAR_CITA = Target.the("Bot\u00F3n para agendar cita")
            .locatedBy("//button[contains(text(),'Agendar')]");
    public static final Target DDL_SUB_SEDE = Target.the("Lista de sub-sedes")
            .locatedBy("//span[@id='select2-subsede-container']");
    public static final Target TXT_INGRESAR_SUB_SEDE = Target.the("Ingresa la sub-sede para agendar la cita")
            .locatedBy("//input[@class='select2-search__field']");
    public static final Target LST_SUB_SEDE = Target.the("Selecciona la sub sede requerida")
            .locatedBy("//li[contains(text(),'sh subsede 1')]");
    public static final Target DDL_TIPO_DE_DOCUMENTO = Target.the("Lista de tipos de documentos")
            .located(By.id("select2-tipoDocumento-container"));
    public static final Target TXT_TIPO_DE_DOCUMENTO = Target.the("Campo para ingresar el tipo de documento del solicitante")
            .locatedBy("//input[@class='select2-search__field']");
    public static final Target LST_DOCUMENTO = Target.the("Tipo de documento")
            .locatedBy("//li[contains(text(),'{0}')]");
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
    public static final Target BTN_CALENDARIO = Target.the("Calendario")
            .located(By.id("agendarCitaDatePicker"));
    public static final Target BTN_AGENDAR_MES = Target.the("Seleccionar fecha")
            .locatedBy("(//th[@class='datepicker-switch'])[1]");
    public static final Target BTN_MES_REQUERIDO = Target.the("Selecciona el mes requerido")
            .locatedBy("//span[text()='Feb']");
    public static final Target BTN_DIA_REQURIDO = Target.the("Selecciona el d\u00EDa requerido")
            .locatedBy("//td[@class='day' and text()='8']");
    public static final Target TXT_FECHA_REQUERIDA = Target.the("Ingresa la fecha requerida para la cita")
            .located(By.id("agendarCitaDatePicker"));
    public static final Target LST_HORARIO_DISPONIBLE = Target.the("Selecciona el horario disponible")
            .locatedBy("//span[@id='select2-idHorasCitasDisponibles-container' or @id='select2-horaCita-container']/following-sibling::span");
    public static final Target LST_HORA_SELECCIONADA = Target.the("Selecciona la hora para la cita")
            .locatedBy("//ul[@id='select2-idHorasCitasDisponibles-results' or @id='select2-horaCita-results']/child::li[3]");
    public static final Target BTN_GUARDAR = Target.the("Selecciona el bot\u00F3n guardar")
            .locatedBy("//button[contains(text(),'Guardar')]");
    public static final Target LBL_CONFIRMACION_DE_CITA = Target.the("El mensaje de confirmaci\u00F3n de la cita")
            .locatedBy("//div[contains(text(),'La cita')]");
    public static final Target TXT_RAZON_SOCIAL = Target.the("Ingresa la raz\u00F3n social del solicitante")
            .located(By.id("nombres"));
    public static final Target LBL_FOCO_TIPO_DOCUMENTO = Target.the("")
            .locatedBy("(//label[contains(text(),'Tipo de documento')])[1]");
    public static final Target TXT_SIGLA = Target.the("Ingresa la sigla del solicitante")
            .located(By.id("juridica"));
    public static final Target LBL_AGENDAR_CITA = Target.the("Label que contiene el texto de agentdar cita")
            .locatedBy("//div[@roles='ROLE_ADMON_CITAS_AGENDADA_M']/descendant::h3");
}
