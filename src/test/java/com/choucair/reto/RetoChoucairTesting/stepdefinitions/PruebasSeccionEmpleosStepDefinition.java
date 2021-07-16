package com.choucair.reto.RetoChoucairTesting.stepdefinitions;


import com.choucair.reto.RetoChoucairTesting.questions.ValidarResultadoBarraBusqueda;
import com.choucair.reto.RetoChoucairTesting.questions.ValidarTextoPreparacion;
import com.choucair.reto.RetoChoucairTesting.questions.ValidarTextoSerChoucair;
import com.choucair.reto.RetoChoucairTesting.tasks.*;
import com.choucair.reto.RetoChoucairTesting.userinterface.MenuPrincipal;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class PruebasSeccionEmpleosStepDefinition {

    private MenuPrincipal sitio;
    private Actor actor = Actor.named("Usuario");
    @Managed(driver = "chrome") public WebDriver driver;

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Dado("^que ingreso al menu principal del sitio$")
    public void queIngresoAlMenuPrincipalDelSitio() {
        actor.wasAbleTo(
                AbrirSitio.deChoucair(sitio)
        );
    }

    @Cuando("^ingreso la palabra (.*)$")
    public void hagoClicEnLosBotonesDelSitio(String palabra) {
        actor.attemptsTo(
                SeleccionarSeccion.deEmpleos(),
                IngresarTexto.aLaBarra(palabra)
        );
    }

    @Cuando("^hago clic en el boton ser Choucair$")
    public void hagoClicEnElBotonSerChoucair() {
        actor.attemptsTo(
                SeleccionarSeccion.deEmpleos(),
                NavegarBotonChoucair.delSitio()
        );
    }

    @Cuando("^hago clic en el boton prepararse para aplicar$")
    public void hagoClicEnElBotonPrepararseParaAplicar() {
        actor.attemptsTo(
                SeleccionarSeccion.deEmpleos(),
                NavegarBotonPrepararse.paraAplicar()
        );
    }

    @Entonces("^Valido el texto Mobile testing$")
    public void validoElTextoMobileTesting() {
        actor.should(seeThat(ValidarResultadoBarraBusqueda.deNavegacion()));
    }

    @Entonces("^Valido el texto digital de las industrias$")
    public void validoElTextoDigitalDeLasIndustrias() {
        actor.should(seeThat(ValidarTextoSerChoucair.delSitio()));
    }

    @Entonces("^Valido el texto CURSOS GENERALES$")
    public void validoElTextoCursosGenerales() {
        actor.should(seeThat(ValidarTextoPreparacion.paraAplicar()));
    }
}