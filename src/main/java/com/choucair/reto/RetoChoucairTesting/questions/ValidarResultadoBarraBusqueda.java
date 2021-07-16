package com.choucair.reto.RetoChoucairTesting.questions;

import com.choucair.reto.RetoChoucairTesting.userinterface.ResultadoBarraBusqueda;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarResultadoBarraBusqueda implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        if (Text.of(ResultadoBarraBusqueda.RESULTADO_BARRA).viewedBy(actor).asString().contains("Mobile testing")){
            return true;
        }else {
            return false;
        }
    }

    public static ValidarResultadoBarraBusqueda deNavegacion(){
        return new ValidarResultadoBarraBusqueda();

    }
}
