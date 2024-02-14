package com.quipux.certificacion.gestiondeatencion.interactions;

import java.util.Random;

public class Main {
    public static int max = 0;
    public static int min = 0;

    public static void main(String[] args) {

        // Encontrar la posición del primer '/' en la cadena
        ///int indiceSeparador = fecha.indexOf('/');

        // ACA VA LA VARIABLE DEL METODO RESOLVEFOR(ACTOR)
        String fecha = "01/09/2024";
        int dia = obtenerDia(fecha);

        //System.out.println("La fecha actual es: " + fecha);
        //System.out.println("La nueva fecha es: " + nuevaFecha(fecha));


        prueba(fecha);


    }

    // Método para obtener el día de una fecha en formato "dd/MM/yyyy HH:mm"
    public static int obtenerDia(String fecha) {
        String diaString = fecha.substring(0, 2);
        return Integer.parseInt(diaString);
    }

    // Método para obtener el mes de una fecha en formato "dd/MM/yyyy HH:mm"
    public static String obtenerMes(String fecha) {
        String mesString = fecha.substring(3, 5);
        return mesString;
    }

    // Método para generar un número aleatorio en un rango dado
    public static int generarNumeroAleatorioEnRango() {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static String nuevoMes() {


        return "";
    }

    //Método para generar una nueva fecha
    public static String nuevaFecha(String fecha) {
        int dia = obtenerDia(fecha);
        String nuevaFecha;

        min = dia + 1;
        String mes = obtenerMes(fecha);

        //Validación para el mes de febrero
        if (mes.equals("02")) {
            max = 28;
            min = 1;
            fecha = modificarMes(mes, fecha);
        } else {
            max = 30;
        }

        // Validación para cuando el día sea 31
        if (min >= 31) {
            min = 1;
            fecha = modificarMes(mes, fecha);
        }

        int diaRandom = generarNumeroAleatorioEnRango();
        nuevaFecha = String.valueOf(diaRandom);
        nuevaFecha += fecha.substring(2, 10);

        return nuevaFecha;
    }

    public static String modificarMes(String mes, String fecha) {

        String textMes = "0";
        int autMes = Integer.parseInt(mes);
        autMes++;

        //VALIDACIONES MESES ENERO A SEPTIEMBRE
        if (autMes <= 9) {
            textMes += String.valueOf(autMes);
            fecha = fecha.replace(mes, textMes);
            System.out.println("El aumento del mes es: " + fecha);

            // VALIDACION DE DICIEMBRE
        } else if (autMes == 13) {

            autMes = 1;
            textMes += String.valueOf(autMes);
            fecha = fecha.replace(mes, textMes);
            // SI SON MESES DEL 10 - 11
        } else {
            fecha = fecha.replace(mes, String.valueOf(autMes));
        }
        return fecha;

    }

    //Método de prueba
    public static void prueba(String fecha){
        String[] fec = fecha.split("/");

        for(int i = 0; i< fec.length; i++){
            System.out.println(fec[i]);
        }
    }

}