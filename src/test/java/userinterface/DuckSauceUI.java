package userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DuckSauceUI {

    public static final Target USERNAME = Target.the("campo username")
            .located(By.id("user-name"));

    public static final Target PASSWORD = Target.the("campo password")
            .located(By.id("password"));

    public static final Target LOGIN_BUTTON = Target.the("boton login")
            .located(By.id("login-button"));

    public static final Target BACKPACK_ADD_CART_BUTTON = Target.the("Backpack button")
            .located(By.id("add-to-cart-sauce-labs-backpack"));

    public static final Target SHOPPING_CART = Target.the("shopping cart button")
            .located(By.id("shopping_cart_container"));

    public static final Target REMOVE = Target.the("Remove button")
            .located(By.id("checkout"));

}
