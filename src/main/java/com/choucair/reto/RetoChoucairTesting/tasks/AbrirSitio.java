package com.choucair.reto.RetoChoucairTesting.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirSitio implements Task {

    PageObject sitio;

    public AbrirSitio(PageObject sitio){
        this.sitio = sitio;
    }

    public static AbrirSitio deChoucair(PageObject sitio) {
        return Tasks.instrumented(AbrirSitio.class,sitio);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.wasAbleTo(Open.browserOn(sitio));
    }
}
