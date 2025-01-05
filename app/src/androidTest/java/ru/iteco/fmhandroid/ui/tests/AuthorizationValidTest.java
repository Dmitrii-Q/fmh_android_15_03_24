package ru.iteco.fmhandroid.ui.tests;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.android.runners.AllureAndroidJUnit4;
import ru.iteco.fmhandroid.data.DataHelper;
import ru.iteco.fmhandroid.steps.AuthorizationSteps;
import ru.iteco.fmhandroid.ui.AppActivity;

@LargeTest
//@RunWith(AndroidJUnit4.class)
@RunWith(AllureAndroidJUnit4.class)
@Feature("Авторизация")
public class AuthorizationValidTest {

    @Rule
    public ActivityScenarioRule<AppActivity> activityRule =
            new ActivityScenarioRule<>(AppActivity.class);

    @Test
    @Story("Успешная авторизация с валидными данными")
    @Description("Проверка успешного входа с корректным логином и паролем")
    public void authorizationValidTest() {
        AuthorizationSteps.enterCredentials(
                DataHelper.Credentials.VALID_LOGIN,
                DataHelper.Credentials.VALID_PASSWORD
        );
        AuthorizationSteps.clickSignIn();
        AuthorizationSteps.checkSuccessfulLogin();
    }
}
