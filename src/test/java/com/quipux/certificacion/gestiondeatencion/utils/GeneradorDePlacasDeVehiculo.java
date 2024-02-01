package com.quipux.certificacion.gestiondeatencion.utils;

import java.security.SecureRandom;

public class GeneradorDePlacasDeVehiculo {

    public static String obtenerPlacaDelVehiculo() {
        return generarLetrasAleatorias() + generarNumerosAleatorios();
    }

    private static String generarLetrasAleatorias() {
        char[] caracteres = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ".toCharArray();
        String nuevaCadena = "";
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < 3; i++)
            nuevaCadena = nuevaCadena + caracteres[random.nextInt(caracteres.length)];

        return nuevaCadena;
    }

    private static String generarNumerosAleatorios() {
        char[] numeros = "1234567890".toCharArray();
        String nuevoNumero = "";
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < 3; i++)
            nuevoNumero = nuevoNumero + numeros[random.nextInt(numeros.length)];

        return nuevoNumero;
    }
}
