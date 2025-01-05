package ru.iteco.fmhandroid.screenElements;

import androidx.test.espresso.ViewInteraction;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.*;

import ru.iteco.fmhandroid.R;

public class NewsScreen {

    // Меню и раздел новостей
    public static final ViewInteraction menuButton = onView(withId(R.id.main_menu_image_button));
    public static final ViewInteraction newsSection = onView(withText("News"));

    // Элементы редактирования
    public static final ViewInteraction editNewsButton = onView(withId(R.id.edit_news_material_button));
    public static final ViewInteraction editNewsItemButton = onView(withId(R.id.edit_news_item_image_view));
    public static final ViewInteraction newsTitleField = onView(withId(R.id.news_item_title_text_input_edit_text));
    public static final ViewInteraction saveButton = onView(withId(R.id.save_button));

    // Проверка изменения
    public static final ViewInteraction updatedNewsTitle = onView(withId(R.id.news_item_title_text_view));
}
