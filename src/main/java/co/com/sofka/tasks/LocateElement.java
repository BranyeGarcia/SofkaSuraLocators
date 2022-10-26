package co.com.sofka.tasks;

import co.com.sofka.enums.LocatorsMapped;
import co.com.sofka.userInterface.HomeSofkaUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.WebElement;

public class LocateElement implements Task {

    private String locatorType;
    private WebElement element;

    public LocateElement(String locatorType){
        this.locatorType = locatorType;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        long start=0;
        long end =0;

        switch (locatorType){
            case "id":
                start = System.currentTimeMillis();
                element = HomeSofkaUserInterface.BTN_PRUEBA_ID.resolveFor(actor).getElement();
                end = System.currentTimeMillis();
                System.out.println("Tiempo transcurrido en localizar por "+LocatorsMapped.TARGET_LOCATOR_BY_ID.name()+" : " + (end - start));
                break;

            case "name":
                start = System.currentTimeMillis();
                element = HomeSofkaUserInterface.BTN_PRUEBA_NAME.resolveFor(actor).getElement();
                //actor.attemptsTo(Enter.theValue(locatorType).into(HomeSofkaUserInterface.BTN_PRUEBA_NAME));
                end = System.currentTimeMillis();
                System.out.println("Tiempo transcurrido en localizar por "+LocatorsMapped.TARGET_LOCATOR_BY_NAME.name()+" : " + (end - start));
                break;

            case "xpath":
                start = System.currentTimeMillis();
                element = HomeSofkaUserInterface.BTN_PRUEBA_XPATH.resolveFor(actor).getElement();
                //actor.attemptsTo(Enter.theValue(locatorType).into(HomeSofkaUserInterface.BTN_PRUEBA_XPATH));
                end = System.currentTimeMillis();
                System.out.println("Tiempo transcurrido en localizar por "+LocatorsMapped.TARGET_LOCATOR_BY_XPATH.name()+" : " + (end - start));
                break;
            case "cssSelector":
                start = System.currentTimeMillis();
                element = HomeSofkaUserInterface.BTN_PRUEBA_CSS.resolveFor(actor).getElement();
                //actor.attemptsTo(Enter.theValue(locatorType).into(HomeSofkaUserInterface.BTN_PRUEBA_CSS));
                end = System.currentTimeMillis();
                System.out.println("Tiempo transcurrido en localizar por "+LocatorsMapped.TARGET_LOCATOR_BY_CSS.name()+" : " + (end - start));
                break;

            default:
                break;
        }

    }

    public static LocateElement withLocatorType(String locatorType){
        return Tasks.instrumented(LocateElement.class, locatorType);
    }
}
