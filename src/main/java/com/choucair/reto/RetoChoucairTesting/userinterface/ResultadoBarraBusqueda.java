package com.choucair.reto.RetoChoucairTesting.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ResultadoBarraBusqueda extends PageObject {
    public static final Target RESULTADO_BARRA = Target.the("Resultado busqueda de barra").locatedBy("//a[contains(text(),'Mobile testing')]");
}
