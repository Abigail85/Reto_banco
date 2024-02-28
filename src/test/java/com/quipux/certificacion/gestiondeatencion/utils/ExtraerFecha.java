package com.quipux.certificacion.gestiondeatencion.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtraerFecha {

    public static String extraerFecha(String texto) {
        String fechaExtraida = null;
        Pattern patronFecha = Pattern.compile("\\b\\d{2}/\\d{2}/\\d{4}\\b");
        Matcher matcher = patronFecha.matcher(texto);

        if (matcher.find()) {
            fechaExtraida = matcher.group();
        }

        return fechaExtraida;
    }
}
