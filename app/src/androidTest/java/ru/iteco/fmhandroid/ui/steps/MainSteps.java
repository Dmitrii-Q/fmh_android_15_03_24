package ru.iteco.fmhandroid.ui.steps;

import io.qameta.allure.Step;
import ru.iteco.fmhandroid.ui.screenElements.MainScreen;

import static androidx.test.espresso.action.ViewActions.click;

public class MainSteps {

    @Step("Открыть главное меню")
    public void openMainMenu() {
        MainScreen.mainMenuButton.perform(click());
    }

    @Step("Перейти в раздел 'About'")
    public void goToAboutSection() {
        MainScreen.aboutMenuItem.perform(click());
    }
}
