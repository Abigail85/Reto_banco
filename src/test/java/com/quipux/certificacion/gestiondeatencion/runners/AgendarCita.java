package com.quipux.certificacion.gestiondeatencion.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features",
        glue = {"com.quipux.certificacion.gestiondeatencion"},
        tags = "@Reagendar_cita",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class AgendarCita {
}
