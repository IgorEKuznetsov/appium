package test.appium.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import test.appium.data.StartPageHeaderData;
import test.appium.screens.StartScreen;

import static com.codeborne.selenide.Selenide.$;

public class BarComponent {

  //SelenideElement componentButton = $("[text='%s']");

  public BarComponent componentTextShouldBeSameAs(StartPageHeaderData expected) {
    $(String.format("[text='%s']", expected.getHeader())).shouldBe(Condition.visible);
    return this;
  }

  public BarComponent clickComponent(StartPageHeaderData expected) {
    $(String.format("[text='%s']", expected.getHeader())).click();
    return this;
  }
}
