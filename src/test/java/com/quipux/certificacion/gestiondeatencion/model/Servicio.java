package com.quipux.certificacion.gestiondeatencion.model;

import com.quipux.certificacion.gestiondeatencion.model.builders.ServicioBuilder;

public class Servicio {
    private String entidadPrestadoraDeServicio;
    private String nombreDeServicio;

    public Servicio(ServicioBuilder servicioBuilder) {
        this.entidadPrestadoraDeServicio = servicioBuilder.getEntidadPrestadora();
        this.nombreDeServicio = servicioBuilder.getNombreDeServicio();
    }

    public String getEntidadPrestadoraDeServicio() {
        return entidadPrestadoraDeServicio;
    }

    public String getNombreDeServicio() {
        return nombreDeServicio;
    }
}
