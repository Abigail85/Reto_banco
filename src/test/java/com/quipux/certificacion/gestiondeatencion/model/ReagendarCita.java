package com.quipux.certificacion.gestiondeatencion.model;

import com.quipux.certificacion.gestiondeatencion.model.builders.ReagendarCitaBuilder;

public class ReagendarCita {
    private final String criterioBusqueda;
    private final String motivo;
    private final String tipoDocumento;
    private final String subSede;


    public ReagendarCita(ReagendarCitaBuilder reagendarCitaBuilder) {
        this.tipoDocumento = reagendarCitaBuilder.getReagendarCitaBuilders().get(0).getTipoDocumento();
        this.subSede = reagendarCitaBuilder.getReagendarCitaBuilders().get(0).getSubSede();
        this.criterioBusqueda = reagendarCitaBuilder.getReagendarCitaBuilders().get(0).getCriterioBusqueda();
        this.motivo = reagendarCitaBuilder.getReagendarCitaBuilders().get(0).getMotivo();
    }

    public String getCriterioBusqueda() {
        return criterioBusqueda;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getSubSede() {
        return subSede;
    }

}
