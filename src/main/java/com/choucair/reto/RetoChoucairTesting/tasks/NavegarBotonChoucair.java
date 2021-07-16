package com.choucair.reto.RetoChoucairTesting.tasks;

import com.choucair.reto.RetoChoucairTesting.userinterface.SeccionEmpleos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.concurrent.TimeUnit;

import static com.choucair.reto.RetoChoucairTesting.userinterface.ResultadoBarraBusqueda.RESULTADO_BARRA;
import static com.choucair.reto.RetoChoucairTesting.userinterface.SeccionEmpleos.RESULTADO_SER_CHOUCAIR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class NavegarBotonChoucair implements Task {

    public static NavegarBotonChoucair delSitio(){
        return Tasks.instrumented(NavegarBotonChoucair.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SeccionEmpleos.SER_CHOUCAIR)
        );
    }
}
