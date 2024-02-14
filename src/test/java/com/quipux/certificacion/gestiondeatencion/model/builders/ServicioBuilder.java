package com.quipux.certificacion.gestiondeatencion.model.builders;

import com.quipux.certificacion.gestiondeatencion.model.Servicio;
import com.quipux.certificacion.gestiondeatencion.utils.Builder;

public class ServicioBuilder implements Builder<Servicio> {
    private String entidadPrestadora;
    private String nombreDeServicio;

    public ServicioBuilder() {
        this.entidadPrestadora = "";
        this.nombreDeServicio = "";
    }

    public static ServicioBuilder con() {
        return new ServicioBuilder();
    }

    public ServicioBuilder laEntidadPrestadora(String entidadPrestadora) {
        this.entidadPrestadora = entidadPrestadora;
        return this;
    }

    public ServicioBuilder yElServicio(String nombreDeServicio) {
        this.nombreDeServicio = nombreDeServicio;
        return this;
    }

    public String getEntidadPrestadora() {
        return entidadPrestadora;
    }

    public String getNombreDeServicio() {
        return nombreDeServicio;
    }

    @Override
    public Servicio build() {
        return new Servicio(this);
    }
}
