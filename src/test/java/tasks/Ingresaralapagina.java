package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.DuckSauceUI.*;

public class Ingresaralapagina implements Task {

    public static Ingresaralapagina ingresando() {
        return Tasks.instrumented(Ingresaralapagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("standard_user").into(USERNAME),
                Enter.theValue("secret_sauce").into(PASSWORD),
                Click.on(LOGIN_BUTTON),
                WaitUntil.the(BACKPACK_ADD_CART_BUTTON, isVisible()).forNoMoreThan(2).seconds(),
                Click.on(BACKPACK_ADD_CART_BUTTON),
                Click.on(SHOPPING_CART)
        );
    }
}
