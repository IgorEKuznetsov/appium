package app.tests;

import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import test.appium.screens.MainScreen;

import java.net.MalformedURLException;
import java.net.URL;

public class GetInfoTest {
  private AndroidDriver driver;
  private MainScreen mainScreen;

  @BeforeEach
  public void setUp() throws MalformedURLException {
    driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), new DesiredCapabilities());
    mainScreen = new MainScreen(driver);
  }
}
