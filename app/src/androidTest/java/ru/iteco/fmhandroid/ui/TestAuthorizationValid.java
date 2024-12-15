package ru.iteco.fmhandroid.ui;

import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import ru.iteco.fmhandroid.R;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.assertion.ViewAssertions.matches;

@RunWith(AndroidJUnit4.class)
public class TestAuthorizationValid {

    @Rule
    public ActivityScenarioRule<AppActivity> activityScenarioRule =
            new ActivityScenarioRule<>(AppActivity.class);

    @Test
    public void testAuthorizationValid() {
        // логин
        ViewInteraction loginField = onView(withId(R.id.login_text_input_layout));
        loginField.perform(replaceText("login2"), closeSoftKeyboard());

        // пароль
        ViewInteraction passwordField = onView(withId(R.id.password_text_input_layout));
        passwordField.perform(replaceText("password2"), closeSoftKeyboard());

        // вход
        ViewInteraction enterButton = onView(withId(R.id.enter_button));
        enterButton.perform(click());

        // отображение элемента
        ViewInteraction trademarkImage = onView(withId(R.id.trademark_image_view));
        trademarkImage.check(matches(isDisplayed()));
    }
}
