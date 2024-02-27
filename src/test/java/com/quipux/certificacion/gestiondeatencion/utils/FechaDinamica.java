package com.quipux.certificacion.gestiondeatencion.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class FechaDinamica {

    public static void main(String[] args) {
        String fecha = "29/03/2024";
        nuevaFecha(fecha);
    }

    public static String nuevaFecha(String fecha) {

        String[] fec = fecha.split("/");
        int dia = Integer.parseInt(fec[0]);
        int mes = Integer.parseInt(fec[1]);
        int anio = Integer.parseInt(fec[2]);

        System.out.println("El día es: " + dia + " el mes es: " + mes + " el año es: " + anio);
        dia++;

        Random rand = new Random();
        int nuevoNumero = rand.nextInt(31 - dia + 1) + dia;
        System.out.println("El nuevo día es: " + nuevoNumero);


        // Crear un objeto Calendar para manipular la fecha
        Calendar calendar = Calendar.getInstance();
        calendar.set(anio, mes - 1, nuevoNumero); // Se resta 1 al mes ya que en Calendar enero es 0

        // Avanzar al siguiente día hábil
        while (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }

        // Obtener el nuevo día hábil
        int nuevoDia = calendar.get(Calendar.DAY_OF_MONTH);
        int nuevoMes = calendar.get(Calendar.MONTH) + 1; // Se suma 1 al mes ya que en Calendar enero es 0
        int nuevoAnio = calendar.get(Calendar.YEAR);


        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date nuevaFecha = new Date(nuevoAnio - 1900, nuevoMes - 1, nuevoDia); // Se resta 1900 al año ya que Date considera 1900 como año base
        String fechaFormateada = sdf.format(nuevaFecha);

        System.out.println(fechaFormateada);

        return fechaFormateada;
    }
}
