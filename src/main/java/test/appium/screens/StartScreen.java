package test.appium.screens;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import test.appium.components.BarComponent;
import test.appium.data.StartPageHeaderData;

import static com.codeborne.selenide.Selenide.$;

public class StartScreen {

  public StartScreen open() {
    Selenide.open();
    return this;
  }

  public StartScreen clickNextButton() {
    $("[text='Next']").click();
    return this;
  }

  public StartScreen startScreenIsOpen() {
    $(By.id("android:id/content")).shouldBe(Condition.visible);
    return this;
  }

  public StartScreen startScreenTextShouldBeSameAs(StartPageHeaderData expected) {
    $(String.format("[text='%s']", expected.getHeader())).shouldBe(Condition.visible);
    return this;
  }

  public StartScreen clickSkipButton() {
    $("[text='Skip >']").click();
    return this;
  }

  public StartScreen clickOKButton() {
    $(By.id("android:id/button1")).click();
    return this;
  }

  public BarComponent openMenu() {
    open();
    startScreenIsOpen();
    clickNextButton();
    startScreenTextShouldBeSameAs(StartPageHeaderData.SECOND_PAGE_HEADER);
    clickNextButton();
    clickSkipButton();
    clickOKButton();
    return new BarComponent();
  }
}
