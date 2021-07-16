package com.choucair.reto.RetoChoucairTesting.tasks;

import com.choucair.reto.RetoChoucairTesting.questions.ValidarResultadoBarraBusqueda;
import com.choucair.reto.RetoChoucairTesting.userinterface.SeccionEmpleos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.choucair.reto.RetoChoucairTesting.userinterface.ResultadoBarraBusqueda.RESULTADO_BARRA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class IngresarTexto implements Task {
    private String texto;

    public IngresarTexto(String texto) {
        this.texto = texto;
    }

    public static IngresarTexto aLaBarra(String texto){
        return Tasks.instrumented(IngresarTexto.class,texto);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SeccionEmpleos.BUSQUEDA),
                Enter.theValue(texto).into(SeccionEmpleos.BARRA_NAVEGACION).thenHit(Keys.ENTER),
                WaitUntil.the(RESULTADO_BARRA, isEnabled()).forNoMoreThan(5).seconds()
        );
    }
}
