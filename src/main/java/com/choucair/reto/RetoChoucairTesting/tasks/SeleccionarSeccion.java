package com.choucair.reto.RetoChoucairTesting.tasks;

import com.choucair.reto.RetoChoucairTesting.userinterface.MenuPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarSeccion implements Task {

    public static SeleccionarSeccion deEmpleos(){
        return Tasks.instrumented(SeleccionarSeccion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenuPrincipal.SECCION)
        );
    }
}
