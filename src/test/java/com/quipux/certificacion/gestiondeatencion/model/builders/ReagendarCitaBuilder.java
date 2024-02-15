package com.quipux.certificacion.gestiondeatencion.model.builders;

import com.quipux.certificacion.gestiondeatencion.model.ReagendarCita;
import com.quipux.certificacion.gestiondeatencion.model.Usuario;
import com.quipux.certificacion.gestiondeatencion.utils.Builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ReagendarCitaBuilder implements Builder<ReagendarCita> {

    private String criterioBusqueda;
    private String entidadPrestadora;
    private Usuario usuario;

    private List<ReagendarCitaBuilder> reagendarCita = new ArrayList<>();

    public ReagendarCitaBuilder(Map<String, String> datosReagendarCita) {

        this.criterioBusqueda = datosReagendarCita.get("primerNombre");
        this.entidadPrestadora = datosReagendarCita.get("segundoNombre");
    }

    public ReagendarCitaBuilder(List<Map<String, String>> datosReagendarCita) {
        crearConstructorReagendarCita(datosReagendarCita);
    }

    public static ReagendarCitaBuilder deRegistro(List<Map<String, String>> datosReagendarCita) {
        return new ReagendarCitaBuilder(datosReagendarCita);
    }

    public static ReagendarCitaBuilder conLosDatosDelRegistro(List<Map<String, String>> datosReagendarCita) {
        return new ReagendarCitaBuilder(datosReagendarCita);
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

    public List<ReagendarCitaBuilder> getReagendarCita() {
        return reagendarCita;
    }

    private void crearConstructorReagendarCita(List<Map<String, String>> datosReagendarCita) {
        for (Map<String, String> datoDeRegistro : datosReagendarCita)
            reagendarCita.add(new ReagendarCitaBuilder(datoDeRegistro));
    }

    @Override
    public ReagendarCita build() {
        return new ReagendarCita(this);
    }

}
