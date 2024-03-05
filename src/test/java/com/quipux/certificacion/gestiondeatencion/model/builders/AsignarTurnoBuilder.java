package com.quipux.certificacion.gestiondeatencion.model.builders;

import com.quipux.certificacion.gestiondeatencion.model.AsignarTurno;
import com.quipux.certificacion.gestiondeatencion.utils.Builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AsignarTurnoBuilder implements Builder<AsignarTurno> {
    private String prueba;
    private List<AsignarTurnoBuilder> asignarTurnoCitaBuilders = new ArrayList<>();

    public AsignarTurnoBuilder(Map<String, String> datosReagendarCita) {
        this.prueba = datosReagendarCita.get("subSede");
    }

    public AsignarTurnoBuilder(List<Map<String, String>> datosReagendarCita) {
        crearConstructorReagendarCita(datosReagendarCita);
    }

    public String getPrueba() {
        return prueba;
    }

    public List<AsignarTurnoBuilder> getAsignarTurnoCitaBuilders() {
        return asignarTurnoCitaBuilders;
    }

    private void crearConstructorReagendarCita(List<Map<String, String>> datosAsignarTurno) {
        for (Map<String, String> datoAsignarTurno : datosAsignarTurno) {
            asignarTurnoCitaBuilders.add(new AsignarTurnoBuilder(datoAsignarTurno));
        }
    }

    @Override
    public AsignarTurno build() {
        return new AsignarTurno(this);
    }
}
