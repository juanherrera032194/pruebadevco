package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterface.DuckSauceUI.REMOVE;

public class Mensaje implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        return Text.of(REMOVE).toString().toLowerCase();
    }

    public static Mensaje remover() {
        return new Mensaje();
    }

}
