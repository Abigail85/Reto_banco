package com.quipux.certificacion.gestiondeatencion.model.builders;

import com.quipux.certificacion.gestiondeatencion.model.ReagendarCita;
import com.quipux.certificacion.gestiondeatencion.utils.Builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ReagendarCitaBuilder  implements Builder<ReagendarCita> {
    private String tipoDocumento;
    private String subSede;
    private String criterioBusqueda;
    private String motivo;
    private String nroDocumento;
    private List<ReagendarCitaBuilder> reagendarCitaBuilders = new ArrayList<>();

    public ReagendarCitaBuilder(Map<String, String> datosReagendarCita) {
        this.subSede = datosReagendarCita.get("subSede");
        this.tipoDocumento = datosReagendarCita.get("tipoDocumento");
        this.criterioBusqueda = datosReagendarCita.get("criterioBusqueda");
        this.motivo = datosReagendarCita.get("motivo");
        this.nroDocumento = datosReagendarCita.get("nroDocumento");
    }

    public ReagendarCitaBuilder(List<Map<String, String>> datosReagendarCita) {
        crearConstructorReagendarCita(datosReagendarCita);
    }

    public static ReagendarCitaBuilder conLosDatosDeReagendarCita(List<Map<String, String>> datosReagendarCita) {
        return new ReagendarCitaBuilder(datosReagendarCita);
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getSubSede() {
        return subSede;
    }

    public String getCriterioBusqueda() {
        return criterioBusqueda;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public List<ReagendarCitaBuilder> getReagendarCitaBuilders() {
        return reagendarCitaBuilders;
    }

    private void crearConstructorReagendarCita(List<Map<String, String>> datosReagendarCita) {
        for (Map<String, String> datoReagendarCita : datosReagendarCita)
            reagendarCitaBuilders.add(new ReagendarCitaBuilder(datoReagendarCita));
    }

    @Override
    public ReagendarCita build() {
        return new ReagendarCita(this);
    }

}
