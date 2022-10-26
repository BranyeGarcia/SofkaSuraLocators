package co.com.sofka.enums;

import co.com.sofka.userInterface.HomeSofkaUserInterface;
import net.serenitybdd.screenplay.targets.Target;

public enum LocatorsMapped {

    TARGET_LOCATOR_BY_XPATH (HomeSofkaUserInterface.BTN_PRUEBA_XPATH),
    TARGET_LOCATOR_BY_CSS (HomeSofkaUserInterface.BTN_PRUEBA_CSS),
    TARGET_LOCATOR_BY_NAME (HomeSofkaUserInterface.BTN_PRUEBA_NAME),
    TARGET_LOCATOR_BY_ID (HomeSofkaUserInterface.BTN_PRUEBA_ID);
    Target locator;
    LocatorsMapped(Target locator) {
        this.locator = locator;
    }

    public Target getTarget() {
        return locator;
    }
}
