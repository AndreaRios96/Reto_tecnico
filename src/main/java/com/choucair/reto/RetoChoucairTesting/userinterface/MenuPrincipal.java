package com.choucair.reto.RetoChoucairTesting.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.choucairtesting.com/")

public class MenuPrincipal extends PageObject {
        public static final Target SECCION = Target.the("Seccion Empleos").locatedBy("//a[contains(text(),'Empleos')]");
}
