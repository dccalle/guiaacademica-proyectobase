package co.com.choucair.certificacion.proyectobase.tasks;

import co.com.choucair.certificacion.proyectobase.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    public static Login OnThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON));
        actor.attemptsTo(Enter.theValue("21562732").into(ChoucairLoginPage.INPUT_USER));
        actor.attemptsTo(Enter.theValue("Choucair2021*").into(ChoucairLoginPage.INPUT_PASSWORD));
        actor.attemptsTo(Click.on(ChoucairLoginPage.ENTER_BUTTON));
    }
}
