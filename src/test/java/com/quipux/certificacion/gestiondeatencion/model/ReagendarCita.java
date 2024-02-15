package com.quipux.certificacion.gestiondeatencion.model;

import com.quipux.certificacion.gestiondeatencion.model.builders.ReagendarCitaBuilder;

public class ReagendarCita {

    private final String criterioBusqueda;
    private final String entidadPrestadora;
    private final Usuario usuario;

    public ReagendarCita(ReagendarCitaBuilder reagendarCitaBuilder) {
        this.usuario = reagendarCitaBuilder.getReagendarCita().get(0).getUsuario();
        this.criterioBusqueda = reagendarCitaBuilder.getReagendarCita().get(0).getCriterioBusqueda();
        this.entidadPrestadora = reagendarCitaBuilder.getReagendarCita().get(0).getEntidadPrestadora();
    }

    public String getCriterioBusqueda() {
        return criterioBusqueda;
    }

    public String getEntidadPrestadora() {
        return entidadPrestadora;
    }

    public Usuario getUsuario() {
        return usuario;
    }

}
