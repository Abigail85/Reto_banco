package com.quipux.certificacion.gestiondeatencion.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class FechaDinamica {

    public static String nuevaFecha(String fecha) {
        String[] fec = fecha.split("/");
        int dia = Integer.parseInt(fec[0]);
        int mes = Integer.parseInt(fec[1]);
        int anio = Integer.parseInt(fec[2]);

        dia++;

        Random rand = new Random();
        int nuevoNumero = rand.nextInt(31 - dia + 1) + dia;

        Calendar calendar = Calendar.getInstance();
        calendar.set(anio, mes - 1, nuevoNumero);

        while (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }

        int nuevoDia = calendar.get(Calendar.DAY_OF_MONTH);
        int nuevoMes = calendar.get(Calendar.MONTH) + 1;
        int nuevoAnio = calendar.get(Calendar.YEAR);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date nuevaFecha = new Date(nuevoAnio - 1900, nuevoMes - 1, nuevoDia);
        String fechaFormateada = sdf.format(nuevaFecha);

        return fechaFormateada;
    }
}
