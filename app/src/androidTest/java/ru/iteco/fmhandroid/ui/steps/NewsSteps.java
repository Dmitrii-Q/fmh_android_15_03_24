package ru.iteco.fmhandroid.steps;

import io.qameta.allure.Step;
import ru.iteco.fmhandroid.data.DataHelper;
import ru.iteco.fmhandroid.screenElements.NewsScreen;

import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.*;

public class NewsSteps {

    @Step("Открыть раздел новостей")
    public static void openNewsSection() {
        NewsScreen.menuButton.perform(click());
        NewsScreen.newsSection.perform(click());
    }

    @Step("Перейти в режим редактирования новости")
    public static void editNewsItem() {
        NewsScreen.editNewsButton.perform(click());
        NewsScreen.editNewsItemButton.perform(click());
    }

    @Step("Изменить заголовок новости")
    public static void changeNewsTitle(String newTitle) {
        NewsScreen.newsTitleField.perform(replaceText(newTitle), closeSoftKeyboard());
    }

    @Step("Сохранить изменения")
    public static void saveNewsChanges() {
        NewsScreen.saveButton.perform(scrollTo(), click());
    }

    @Step("Проверить заголовок новости")
    public static void verifyNewsTitle(String expectedTitle) {
        NewsScreen.updatedNewsTitle.check(matches(withText(expectedTitle)));
    }
}
