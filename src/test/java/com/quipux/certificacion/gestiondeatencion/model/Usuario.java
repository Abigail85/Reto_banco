package com.quipux.certificacion.gestiondeatencion.model;

import com.quipux.certificacion.gestiondeatencion.model.builders.UsuarioBuilder;

public class Usuario {
    private final String primerNombre;
    private final String segundoNombre;
    private final String primerApellido;
    private final String segundoApellido;
    private final String tipoDocumento;
    private final String numeroDocumento;
    private final Servicio servicio;
    private final String correoElectronico;
    private final String numeroDeTelefono;
    private final String direccionResidencia;
    private final String fechaCita;
    private final String usuario;
    private final String contrasena;
    private final String criterioBusqueda;
    private final String subSede;
    private final String motivo;

    public Usuario(UsuarioBuilder usuarioBuilder) {
        this.primerNombre = usuarioBuilder.getUsuarios().get(0).getPrimerNombre();
        this.segundoNombre = usuarioBuilder.getUsuarios().get(0).getSegundoNombre();
        this.primerApellido = usuarioBuilder.getUsuarios().get(0).getPrimerApellido();
        this.segundoApellido = usuarioBuilder.getUsuarios().get(0).getSegundoApellido();
        this.tipoDocumento = usuarioBuilder.getUsuarios().get(0).getTipoDocumento();
        this.numeroDocumento = usuarioBuilder.getUsuarios().get(0).getNumeroDocumento();
        this.correoElectronico = usuarioBuilder.getUsuarios().get(0).getCorreoElectronico();
        this.numeroDeTelefono = usuarioBuilder.getUsuarios().get(0).getNumeroDeTelefono();
        this.direccionResidencia = usuarioBuilder.getUsuarios().get(0).getDireccionResidencia();
        this.fechaCita = usuarioBuilder.getUsuarios().get(0).getFechaCita();
        this.usuario = usuarioBuilder.getUsuarios().get(0).getUsuario();
        this.contrasena = usuarioBuilder.getUsuarios().get(0).getContrasena();
        this.servicio = usuarioBuilder.getUsuarios().get(0).getServicio();
        this.criterioBusqueda = usuarioBuilder.getUsuarios().get(0).getCriterioBusqueda();
        this.subSede = usuarioBuilder.getUsuarios().get(0).getSubSede();
        this.motivo = usuarioBuilder.getUsuarios().get(0).getMotivo();
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

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public Servicio getServicio() {
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

    public String getCriterioBusqueda() {
        return criterioBusqueda;
    }

    public String getSubSede() {
        return subSede;
    }

    public String getMotivo() {
        return motivo;
    }
}
