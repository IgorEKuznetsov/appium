package app.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import test.appium.data.StartPageHeaderData;
import test.appium.factory.SelenideWebDriver;
import test.appium.screens.StartScreen;


public class GetInfoTest {

  @BeforeEach
  public void setUp() {
    Configuration.browserSize = null;
    Configuration.browser = SelenideWebDriver.class.getName();
  }

  @Test
  public void openStartScreenTest() {
    new StartScreen()
        .open()
        .startScreenIsOpen()
        .clickNextButton()
        .startScreenTextShouldBeSameAs(StartPageHeaderData.SECOND_PAGE_HEADER)
        .clickNextButton()
        .clickSkipButton()
        .startScreenTextShouldBeSameAs(StartPageHeaderData.ALERT_MESSAGE)
        .clickOKButton()
        .startScreenTextShouldBeSameAs(StartPageHeaderData.ENTER_MESSAGE);

  }

  @Test
  public void checkComponentHeaders() {
    new StartScreen()
        .openMenu()
        .clickComponent(StartPageHeaderData.CHAT)
        .componentTextShouldBeSameAs(StartPageHeaderData.CHAT)
        .clickComponent(StartPageHeaderData.EXERCISE)
        .componentTextShouldBeSameAs(StartPageHeaderData.EXERCISE)
        .clickComponent(StartPageHeaderData.GRAMMAR)
        .componentTextShouldBeSameAs(StartPageHeaderData.GRAMMAR)
        .clickComponent(StartPageHeaderData.STATS)
        .componentTextShouldBeSameAs(StartPageHeaderData.STATS);
  }
}
