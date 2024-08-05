package com.reto.certificacion.banco.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/gestionar_finanzas.feature",
        glue = {"com.reto.certificacion.banco"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class GestionarFinanzasDeMiNegocio {

}
