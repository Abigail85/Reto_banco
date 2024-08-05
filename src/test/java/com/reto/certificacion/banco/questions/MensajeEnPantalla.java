package com.reto.certificacion.banco.questions;

import lombok.RequiredArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RequiredArgsConstructor
public class MensajeEnPantalla implements Question<Boolean>  {

    private static final Logger log = LoggerFactory.getLogger(MensajeEnPantalla.class);
    public final String message;

    @Override
    public Boolean answeredBy(Actor actor) {

        String mensajeEnPantalla = actor.recall("Texto leido");
        log.info(mensajeEnPantalla);


        return message.equals(mensajeEnPantalla);
    }

    public static MensajeEnPantalla isEqualsToTheMessage (String message){

        return new MensajeEnPantalla(message);
    }


}
