package ru.iteco.fmhandroid.steps;

import io.qameta.allure.Step;
import ru.iteco.fmhandroid.data.DataHelper;
import ru.iteco.fmhandroid.screenElements.AuthorizationScreen;

import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;

public class AuthorizationSteps {

    @Step("Ввод логина и пароля")
    public static void enterCredentials(String login, String password) {
        AuthorizationScreen.loginField.perform(replaceText(login), closeSoftKeyboard());
        AuthorizationScreen.passwordField.perform(replaceText(password), closeSoftKeyboard());
    }

    @Step("Нажатие на кнопку входа")
    public static void clickSignIn() {
        AuthorizationScreen.signInButton.perform(click());
    }

    @Step("Проверка успешной авторизации")
    public static void checkSuccessfulLogin() {
        AuthorizationScreen.mainLogo.check(matches(isDisplayed()));
    }
}

