import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class SampleSauceTest {

  public static final String USERNAME = "YOUR_USERNAME";
  public static final String ACCESS_KEY = "YOUR_ACCESS_KEY";
  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

  public static void main(String[] args) throws Exception {

    DesiredCapabilities caps = DesiredCapabilities.chrome();
    caps.setCapability("platform", "Windows XP");
    caps.setCapability("version", "43.0");

    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

    /**
     * Goes to Sauce Lab's guinea-pig page and prints title
     */

    driver.get("https://saucelabs.com/test/guinea-pig");
    System.out.println("title of page is: " + driver.getTitle());

    driver.quit();
  }
}
