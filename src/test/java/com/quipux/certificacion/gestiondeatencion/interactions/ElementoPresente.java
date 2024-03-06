package com.quipux.certificacion.gestiondeatencion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;

public class ElementoPresente implements Question<Boolean> {

    private final Target target;

    public ElementoPresente(Target target) {
        this.target = target;
    }

    public static ElementoPresente isVisible(Target target) {
        return new ElementoPresente(target);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(target).answeredBy(actor).booleanValue();
    }
}

