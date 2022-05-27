package co.proyectobase.myextra.stepdefinitions;

import co.proyectobase.myextra.tasks.Abrir;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class MyStraStepDefinition {


    @Managed(driver="chrome")
    private WebDriver chrome;
    private Actor john= Actor.named("John");

    @Before public void setup(){
        john.can(BrowseTheWeb.with(chrome));
    }

    @Dado("^que John desea realizar una consulta en AS400, John abre my extra$")
    public void queJohnDeseaRealizarUnaConsultaEnASJohnAbreMyExtra() {
        john.attemptsTo(Abrir.myExtra());
    }


    @Cuando("^el realiza la autenticación con el usuario$")
    public void elRealizaLaAutenticaciónConElUsuario(List arg1) {
    }

    @Cuando("^el navega al menú$")
    public void elNavegaAlMenú() throws Exception {
    }

    @Entonces("^el verifica que inicio sesión correctamente$")
    public void elVerificaQueInicioSesiónCorrectamente(){
    }



}
