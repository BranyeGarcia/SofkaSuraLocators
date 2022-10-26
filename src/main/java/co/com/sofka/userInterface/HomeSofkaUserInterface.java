package co.com.sofka.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeSofkaUserInterface {

    public static final Target BTN_PRUEBA_NAME = Target.the("prueba elemento name").located(By.name("user-name"));
    public static final Target BTN_PRUEBA_XPATH = Target.the("prueba elemento xpath").located(By.xpath("//div[@class='form_group']/input"));
    public static final Target BTN_PRUEBA_CSS = Target.the("prueba elemento xpath").located(By.cssSelector("input[class='input_error form_input']"));
    public static final Target BTN_PRUEBA_ID = Target.the("prueba elemento id").located(By.id("user-name"));

}
