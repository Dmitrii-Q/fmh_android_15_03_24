package ru.iteco.fmhandroid.ui.steps;

import io.qameta.allure.Step;
import ru.iteco.fmhandroid.ui.screenElements.AboutScreen;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class AboutSteps {

    @Step("Проверка отображения версии приложения")
    public void checkAppVersion(String expectedVersion) {
        AboutScreen.versionTitle.check(matches(withText("Version:")));
        AboutScreen.versionValue.check(matches(withText(expectedVersion)));
    }
}
