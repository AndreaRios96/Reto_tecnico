package com.choucair.reto.RetoChoucairTesting.tasks;

import com.choucair.reto.RetoChoucairTesting.userinterface.SeccionEmpleos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.choucair.reto.RetoChoucairTesting.userinterface.SeccionEmpleos.RESULTADO_PREPARACION;
import static com.choucair.reto.RetoChoucairTesting.userinterface.SeccionEmpleos.RESULTADO_SER_CHOUCAIR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class NavegarBotonPrepararse implements Task {

    public static NavegarBotonPrepararse paraAplicar(){
        return Tasks.instrumented(NavegarBotonPrepararse.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SeccionEmpleos.PREPARACION)
        );
    }
}
