package com.quipux.certificacion.gestiondeatencion.model.builders;

import com.quipux.certificacion.gestiondeatencion.model.Servicio;
import com.quipux.certificacion.gestiondeatencion.model.Usuario;
import com.quipux.certificacion.gestiondeatencion.utils.Builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.quipux.certificacion.gestiondeatencion.model.builders.ServicioBuilder.con;

public class UsuarioBuilder implements Builder<Usuario> {
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String tipoDocumento;
    private String numeroDocumento;
    private Servicio servicio;
    private String correoElectronico;
    private String numeroDeTelefono;
    private String direccionResidencia;
    private String fechaCita;
    private String usuario;
    private String contrasena;
    private List<UsuarioBuilder> usuarios = new ArrayList<>();

    public UsuarioBuilder(Map<String, String> datosDeUsuario) {
        this.primerNombre = datosDeUsuario.get("primerNombre");
        this.segundoNombre = datosDeUsuario.get("segundoNombre");
        this.primerApellido = datosDeUsuario.get("primerApellido");
        this.segundoApellido = datosDeUsuario.get("segundoApellido");
        this.tipoDocumento = datosDeUsuario.get("tipoDocumento");
        this.numeroDocumento = datosDeUsuario.get("numeroDocumento");
        this.correoElectronico = datosDeUsuario.get("correoElectronico");
        this.numeroDeTelefono = datosDeUsuario.get("numeroDeTelefono");
        this.direccionResidencia = datosDeUsuario.get("direccionResidencia");
        this.fechaCita = datosDeUsuario.get("fechaCita");
        this.usuario = datosDeUsuario.get("usuario");
        this.contrasena = datosDeUsuario.get("contrasena");
        this.servicio = con()
                .laEntidadPrestadora(datosDeUsuario.get("entidadPrestadora"))
                .yElServicio(datosDeUsuario.get("filtro")).build();
    }

    public UsuarioBuilder(List<Map<String, String>> datosDeUsuario) {
        crearConstructor(datosDeUsuario);
    }

    public static UsuarioBuilder deUsuario(List<Map<String, String>> datosDeUsuario) {
        return new UsuarioBuilder(datosDeUsuario);
    }

    public static UsuarioBuilder conLosDatosDelUsuario(List<Map<String, String>> datosDeUsuario) {
        return new UsuarioBuilder(datosDeUsuario);
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

    public String getUsuario() {
        return usuario;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public String getContrasena() {
        return contrasena;
    }

    public List<UsuarioBuilder> getUsuarios() {
        return usuarios;
    }

    private void crearConstructor(List<Map<String, String>> datosDeUsuario) {
        for (Map<String, String> datoDeUsuario : datosDeUsuario)
            usuarios.add(new UsuarioBuilder(datoDeUsuario));
    }

    @Override
    public Usuario build() {
        return new Usuario(this);
    }

}
