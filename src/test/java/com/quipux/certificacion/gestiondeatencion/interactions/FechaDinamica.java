package com.quipux.certificacion.gestiondeatencion.interactions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class FechaDinamica {

    public static void main(String[] args) {

        String fecha = "22/02/2024";
        nuevaFecha(fecha);

    }

    public static String nuevaFecha(String fecha) {

        String[] fec = fecha.split("/");
        int dia = Integer.parseInt(fec[0]);
        int mes = Integer.parseInt(fec[1]);
        int anio = Integer.parseInt(fec[2]);

        System.out.println("El día es: " + dia + " el mes es: " + mes + " el anio es: " + anio);
        dia++;

        Random rand = new Random();
        int nuevoNumero = rand.nextInt(31 - dia + 1) + dia;
        System.out.println("El nuevo día es: " + nuevoNumero);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha2 = new Date(anio - 1900, mes - 1, nuevoNumero);
        String fechaFormateada = sdf.format(fecha2);

        System.out.println(fechaFormateada);

        return fechaFormateada;

    }

}