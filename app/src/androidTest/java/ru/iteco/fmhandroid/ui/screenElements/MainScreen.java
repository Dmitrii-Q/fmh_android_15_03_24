package ru.iteco.fmhandroid.ui.screenElements;

import androidx.test.espresso.ViewInteraction;
import ru.iteco.fmhandroid.R;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class MainScreen {
    public static ViewInteraction mainMenuButton = onView(withId(R.id.main_menu_image_button));
    public static ViewInteraction aboutMenuItem = onView(withText("About"));
}
