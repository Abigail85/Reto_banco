package com.quipux.certificacion.gestiondeatencion.stepdefinitions;

import com.quipux.certificacion.gestiondeatencion.tasks.AgendaLaCita;
import com.quipux.certificacion.gestiondeatencion.tasks.Autenticarse;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import java.io.IOException;

import static com.quipux.certificacion.gestiondeatencion.model.builders.AgendarCitaBuilder.conLosDatosDelUsuario;
import static com.quipux.certificacion.gestiondeatencion.model.builders.AgendarCitaBuilder.deUsuario;
import static com.quipux.certificacion.gestiondeatencion.utils.UtileriaCsv.obtenerDatosDeCsv;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AgendarCitaBrasilStepDefinitions {

    @Dado("que o usuário está no site do Shopping GA")
    public void queOUsuárioEstáNoSiteDoShoppingGA() throws IOException {
        theActorInTheSpotlight().wasAbleTo(Autenticarse.conLasCredenciales(deUsuario(obtenerDatosDeCsv("autenticacion", "")).build()));
    }

    @Quando("agendar uma consulta para um usuário de identificação para o serviço {string}")
    public void agendarUmaConsultaParaUmUsuárioDeIdentificaçãoParaOServiçoTraspasoDeVehículoBlindado(String servicio) throws IOException {
        theActorInTheSpotlight().attemptsTo(
                AgendaLaCita
                        .paraUnServicioRequeridoDeBrasil(conLosDatosDelUsuario(obtenerDatosDeCsv("agendar_cita", servicio))
                                .build()));
    }

    @Entao("Você deverá ver que o compromisso foi agendado com sucesso")
    public void vocêDeveráVerQueOCompromissoFoiAgendadoComSucesso() {
    }
}
