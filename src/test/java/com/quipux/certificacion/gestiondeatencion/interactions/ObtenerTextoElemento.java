package com.quipux.certificacion.gestiondeatencion.interactions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ObtenerTextoElemento implements Question<String> {

    private final Target elemento;

    private ObtenerTextoElemento(Target elemento) {
        this.elemento = elemento;
    }

    public static ObtenerTextoElemento delElemento(Target elemento) {
        return new ObtenerTextoElemento(elemento);
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(elemento).answeredBy(actor).toString();
    }
}
