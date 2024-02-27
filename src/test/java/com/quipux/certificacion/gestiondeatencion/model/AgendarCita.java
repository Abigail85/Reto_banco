package com.quipux.certificacion.gestiondeatencion.model;

import com.quipux.certificacion.gestiondeatencion.model.builders.AgendarCitaBuilder;

public class AgendarCita {
    private final String subSede;
    private final String tipoDocumento;
    private final String primerNombre;
    private final String segundoNombre;
    private final String primerApellido;
    private final String segundoApellido;
    private final String entidadPrestadora;
    private final String servicio;
    private final String correoElectronico;
    private final String numeroDeTelefono;
    private final String direccionResidencia;
    private final String fechaCita;
    private final String usuario;
    private final String contrasena;

    public AgendarCita(AgendarCitaBuilder agendarCitaBuilder) {
        this.subSede = agendarCitaBuilder.getUsuarios().get(0).getSubSede();
        this.tipoDocumento = agendarCitaBuilder.getUsuarios().get(0).getTipoDocumento();
        this.primerNombre = agendarCitaBuilder.getUsuarios().get(0).getPrimerNombre();
        this.segundoNombre = agendarCitaBuilder.getUsuarios().get(0).getSegundoNombre();
        this.primerApellido = agendarCitaBuilder.getUsuarios().get(0).getPrimerApellido();
        this.segundoApellido = agendarCitaBuilder.getUsuarios().get(0).getSegundoApellido();
        this.correoElectronico = agendarCitaBuilder.getUsuarios().get(0).getCorreoElectronico();
        this.numeroDeTelefono = agendarCitaBuilder.getUsuarios().get(0).getNumeroDeTelefono();
        this.direccionResidencia = agendarCitaBuilder.getUsuarios().get(0).getDireccionResidencia();
        this.fechaCita = agendarCitaBuilder.getUsuarios().get(0).getFechaCita();
        this.usuario = agendarCitaBuilder.getUsuarios().get(0).getUsuario();
        this.contrasena = agendarCitaBuilder.getUsuarios().get(0).getContrasena();
        this.entidadPrestadora = agendarCitaBuilder.getUsuarios().get(0).getEntidadPrestadora();
        this.servicio = agendarCitaBuilder.getUsuarios().get(0).getServicio();
    }

    public String getSubSede() {
        return subSede;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getEntidadPrestadora() {
        return entidadPrestadora;
    }

    public String getServicio() {
        return servicio;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public String getFechaCita() {
        return fechaCita;
    }
}
