package com.quipux.certificacion.gestiondeatencion.utils;

import net.thucydides.core.steps.stepdata.CSVTestDataSource;
import net.thucydides.core.steps.stepdata.TestDataSource;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UtileriaCsv {

    public static List<Map<String, String>> obtenerDatosDeCsv(String nombreDeCsv, String filtro) throws IOException {
        TestDataSource dataDePrueba = new CSVTestDataSource("./src/test/resources/datosdeprueba/" + nombreDeCsv + ".csv", ';');
        return convertirDataCsvALista(dataDePrueba, filtro);
    }

    private static List<Map<String, String>> convertirDataCsvALista(TestDataSource dataPrueba, String filtro) {
        List<Map<String, String>> dataCargada = dataPrueba.getData();
        if ("".equals(filtro)) {
            return dataCargada;
        }
        String[] arrayDatosParaFiltrar = filtro.split(",");
        return filtrarDataCSV(arrayDatosParaFiltrar, dataCargada);
    }

    private static List<Map<String, String>> filtrarDataCSV(String[] array, List<Map<String, String>> dataCargada) {
        return dataCargada
                .stream()
                .filter(fila -> inArray(array, fila.get("filtro")))
                .collect(Collectors.toList());
    }

    private static boolean inArray(String[] arr, String item) {
        if (arr.length > 0) {
            for (String n : arr) {
                if (item.equals(n)) {
                    return true;
                }
            }
        }
        return false;
    }
}
