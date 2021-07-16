package com.choucair.reto.RetoChoucairTesting.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/realizar_pruebas_seccion_empleos.feature",
        snippets = SnippetType.CAMELCASE,
        glue="com.choucair.reto.RetoChoucairTesting.stepdefinitions")

public class RealizarPruebasSeccionEmpleos {
}
