package com.choucair.reto.RetoChoucairTesting.questions;

import com.choucair.reto.RetoChoucairTesting.userinterface.SeccionEmpleos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarTextoPreparacion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        if (Text.of(SeccionEmpleos.RESULTADO_PREPARACION).viewedBy(actor).asString().contains("CURSOS GENERALES")){
            return true;
        }else {
            return false;
        }
    }

    public static ValidarTextoPreparacion paraAplicar(){
        return new ValidarTextoPreparacion();

    }
}
