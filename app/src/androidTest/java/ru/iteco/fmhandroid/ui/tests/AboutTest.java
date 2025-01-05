package ru.iteco.fmhandroid.ui.tests;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.qameta.allure.android.runners.AllureAndroidJUnit4;
import ru.iteco.fmhandroid.ui.steps.MainSteps;
import ru.iteco.fmhandroid.ui.steps.AboutSteps;
import ru.iteco.fmhandroid.ui.AppActivity;

@Epic("About Screen Tests")
@Feature("Verification of About Screen")
//@RunWith(AndroidJUnit4.class)
@RunWith(AllureAndroidJUnit4.class)
public class AboutTest {

    private final MainSteps mainSteps = new MainSteps();
    private final AboutSteps aboutSteps = new AboutSteps();

    @Rule
    public ActivityScenarioRule<AppActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(AppActivity.class);

    @Test
    @Story("Verify version information on About screen")
    @Description("Проверка отображения версии приложения на экране 'About'")
    public void aboutTest() {
        mainSteps.openMainMenu();
        mainSteps.goToAboutSection();
        aboutSteps.checkAppVersion("1.0.0"); // Укажите ожидаемую версию
    }
}
