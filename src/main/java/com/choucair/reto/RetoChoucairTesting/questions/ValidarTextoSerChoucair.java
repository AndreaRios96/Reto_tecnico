package com.choucair.reto.RetoChoucairTesting.questions;

import com.choucair.reto.RetoChoucairTesting.userinterface.SeccionEmpleos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarTextoSerChoucair implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        if (Text.of(SeccionEmpleos.RESULTADO_SER_CHOUCAIR).viewedBy(actor).asString().contains("digital de las industrias")){
            return true;
        }else {
            return false;
        }
    }

    public static ValidarTextoSerChoucair delSitio(){
        return new ValidarTextoSerChoucair();

    }
}
