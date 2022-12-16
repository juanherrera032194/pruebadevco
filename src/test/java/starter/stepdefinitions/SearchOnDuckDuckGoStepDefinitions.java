package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Mensaje;
import starter.navigation.NavigateTo;
import starter.search.SearchFor;
import starter.search.SearchResult;
import tasks.Ingresaralapagina;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.*;
import static starter.matchers.StringContainsIgnoringCase.containsIgnoringCase;

public class SearchOnDuckDuckGoStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) is on the DuckDuckGo home page")
    public void on_the_DuckDuckGo_home_page(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.theDuckDuckGoHomePage());
    }


    @When("busco e ingreso un producto al carrito de compra")
    public void busco_e_ingreso_un_producto_al_carrito_de_compra() {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight().attemptsTo(Ingresaralapagina.ingresando());
    }

    @Then("observo en pantalla el mensaje {string}")
    public void observo_en_pantalla_el_mensaje(String text) {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight().should(seeThat(Mensaje.remover(), equalTo(text)));
    }
}
