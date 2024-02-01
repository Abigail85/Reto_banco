package com.quipux.certificacion.gestiondeatencion.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/agendar_cita.feature",
        glue = {"com.quipux.certificacion.gestiondeatencion"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@agendarCita"
)
public class AgendarCita {
}
