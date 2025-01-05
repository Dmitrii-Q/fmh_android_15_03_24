package ru.iteco.fmhandroid.ui.screenElements;

import androidx.test.espresso.ViewInteraction;
import ru.iteco.fmhandroid.R;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class AboutScreen {
    public static ViewInteraction versionTitle = onView(withId(R.id.about_version_title_text_view));
    public static ViewInteraction versionValue = onView(withId(R.id.about_version_value_text_view));
}
