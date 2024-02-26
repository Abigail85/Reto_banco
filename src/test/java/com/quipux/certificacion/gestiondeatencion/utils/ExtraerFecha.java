package com.quipux.certificacion.gestiondeatencion.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtraerFecha {

    public static void main(String[] args) {

        String texto = "×\n" +
                "Close\n" +
                "La cita CII8 se asignó satisfactoriamente para el 26/02/2024 a las 14:30 horas.";
        String fecha = extraerFecha(texto);
        System.out.println("Fecha extraída: " + fecha);

    }

    public static String extraerFecha(String texto) {
        String fechaExtraida = null;
        // Patrón de fecha: dos dígitos para día, dos para mes y cuatro para año
        Pattern patronFecha = Pattern.compile("\\b\\d{2}/\\d{2}/\\d{4}\\b");
        Matcher matcher = patronFecha.matcher(texto);

        if (matcher.find()) {
            fechaExtraida = matcher.group();
        }

        return fechaExtraida;
    }
}
