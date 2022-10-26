package features;

import co.com.sofka.enums.LocatorsMapped;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

@RunWith(SerenityRunner.class)
public class Locators {

    long start2;
    long end2;


    @CastMember(name = "sofka")
    Actor sofka;

    @Test
    @DisplayName("validar elementos")
    public void locateElement() {
        sofka.attemptsTo(
                Open.url("https://www.saucedemo.com/")
        );
        WebDriver driver = SerenityWebdriverManager.inThisTestThread().getCurrentDriver();
        WaitUntil.the(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("//html"))));


        for (LocatorsMapped mapps : LocatorsMapped.values()) {
            start2 = System.currentTimeMillis();
            mapps.getTarget().resolveFor(sofka).getElement();
            end2 = System.currentTimeMillis();
            System.out.println("Tiempo transcurrido en localizar por " + mapps.name() + " : " + (end2 - start2));
        }

        start2 = System.currentTimeMillis();
        driver.findElement(By.xpath("//div[@class='form_group']/input[@placeholder='Username']"));
        end2 = System.currentTimeMillis();
        System.out.println("Tiempo transcurrido en localizar por xpath" + " : " + (end2 - start2));

        start2 = System.currentTimeMillis();
        driver.findElement(By.name("user-name"));
        end2 = System.currentTimeMillis();
        System.out.println("Tiempo transcurrido en localizar por name" + " : " + (end2 - start2));

        start2 = System.currentTimeMillis();
        driver.findElement(By.id("user-name"));
        end2 = System.currentTimeMillis();
        System.out.println("Tiempo transcurrido en localizar por id" + " : " + (end2 - start2));


    }
}
