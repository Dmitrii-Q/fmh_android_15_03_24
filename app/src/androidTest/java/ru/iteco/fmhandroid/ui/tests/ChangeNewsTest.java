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
import ru.iteco.fmhandroid.steps.NewsSteps;
import ru.iteco.fmhandroid.ui.AppActivity;

@LargeTest
//@RunWith(AndroidJUnit4.class)
@RunWith(AllureAndroidJUnit4.class)
@Feature("Новости")
public class ChangeNewsTest {

    @Rule
    public ActivityScenarioRule<AppActivity> activityRule =
            new ActivityScenarioRule<>(AppActivity.class);

    @Test
    @Story("Изменение новости")
    @Description("Проверка изменения заголовка новости и сохранения результата")
    public void changeNewsTest() {
        NewsSteps.openNewsSection();
        NewsSteps.editNewsItem();
        NewsSteps.changeNewsTitle(DataHelper.News.UPDATED_TITLE);
        NewsSteps.saveNewsChanges();
        NewsSteps.verifyNewsTitle(DataHelper.News.UPDATED_TITLE);
    }
}
