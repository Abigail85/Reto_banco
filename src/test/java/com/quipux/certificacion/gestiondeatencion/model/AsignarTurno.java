package com.quipux.certificacion.gestiondeatencion.model;

import com.quipux.certificacion.gestiondeatencion.model.builders.AsignarTurnoBuilder;

public class AsignarTurno {
    private final String prueba;

    public AsignarTurno(AsignarTurnoBuilder asignarTurnoBuilder) {
        this.prueba = asignarTurnoBuilder.getAsignarTurnoCitaBuilders().get(0).getPrueba();
    }
}
