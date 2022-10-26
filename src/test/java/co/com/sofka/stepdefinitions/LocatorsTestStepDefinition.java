package co.com.sofka.stepdefinitions;

import co.com.sofka.tasks.LocateElement;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.webdriver.SerenityWebdriverManager;

public class LocatorsTestStepDefinition {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("sofka");
    }

    @Dado("que el usuario se encuentra en la pagina del aplicativo")
    public void queElUsuarioSeEncuentraEnLaPaginaDelAplicativo() {
        OnStage.theActorInTheSpotlight().whoCan(
                BrowseTheWeb.with(SerenityWebdriverManager.inThisTestThread().getCurrentDriver()))
                .attemptsTo(Open.url("https://www.saucedemo.com/"));
    }

    @Cuando("Se busca un elemento por el tipo de localizador {string}")
    public void seBuscaUnElementoPorElTipoDeLocalizador(String locatorType) {
        OnStage.theActorInTheSpotlight().attemptsTo(LocateElement.withLocatorType(locatorType));
    }

    @Entonces("debo almacenar el tiempo que tarda en encontrar el elemento")
    public void deboAlmacenarElTiempoQueTardaEnEncontrarElElemento() {
    }
}
