package com.choucair.reto.RetoChoucairTesting.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SeccionEmpleos extends PageObject {
    public static final Target BUSQUEDA = Target.the("Lupa de Busqueda").locatedBy("//*[@class='search-icon']");
    public static final Target BARRA_NAVEGACION = Target.the("Seccion Empleos").locatedBy("//input[@id='is-search-input-0']");
    public static final Target SER_CHOUCAIR = Target.the("Link boton que es ser choucair").locatedBy("//*[@title='serchazuleMesa de trabajo 1']");
    public static final Target PREPARACION = Target.the("Link boton prepararse para aplicar").locatedBy("//*[@title='empleosazulMesa de trabajo 1']");
    public static final Target RESULTADO_SER_CHOUCAIR = Target.the("Validar texto de tranformacion digital").locatedBy("//*[contains(text(),'digital de las industrias')]");
    public static final Target RESULTADO_PREPARACION = Target.the("Validar texto de cursos generales").locatedBy("//*[contains(text(),'CURSOS GENERALES')]");
}
