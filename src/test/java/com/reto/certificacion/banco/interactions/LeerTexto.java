package com.reto.certificacion.banco.interactions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class LeerTexto {

    public static Performable delElemento(String textoEsperado) {
        return Task.where("{0} lee el texto que aparece en pantalla",
                actor -> {
                    String texto;

                    By elementoXPath = By.xpath("//h3[@id='respuesta3']");

                    try {
                        WebElement elemento = BrowseTheWeb.as(actor).getDriver().findElement(elementoXPath);
                        texto = elemento.getText();

                    } catch (NoSuchElementException e) {
                        texto = "";
                    }

                    actor.remember("Texto leido", texto);
                }
        );
    }

}
