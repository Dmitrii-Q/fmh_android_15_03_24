package ru.iteco.fmhandroid.screenElements;

import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.matcher.ViewMatchers;
import ru.iteco.fmhandroid.R;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class AuthorizationScreen {

    // Элементы экрана авторизации
    public static final ViewInteraction loginField = onView(withId(R.id.login_text_input_layout));
    public static final ViewInteraction passwordField = onView(withId(R.id.password_text_input_layout));
    public static final ViewInteraction signInButton = onView(withId(R.id.enter_button));
    public static final ViewInteraction mainLogo = onView(withId(R.id.trademark_image_view));
}
