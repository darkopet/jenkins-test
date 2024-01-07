package org.example;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.fluent.Target;
import com.applitools.eyes.visualgrid.model.*;
import com.applitools.eyes.selenium.*;
import com.applitools.eyes.visualgrid.services.VisualGridRunner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) {

        var runner = new VisualGridRunner(5);
        var eyes = new Eyes(runner);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        var configuration = eyes.getConfiguration();
        configuration.addMobileDevice(new IosDeviceInfo(IosDeviceName.iPhone_11_Pro, IosVersion.ONE_VERSION_BACK));
        configuration.addMobileDevice(new IosDeviceInfo(IosDeviceName.iPhone_14));
        configuration.addBrowser(new IosDeviceInfo(IosDeviceName.iPad_Air_2));
        eyes.setConfiguration(configuration);
        var driver = new ChromeDriver(options);
        driver.navigate().to("https://demo.applitools.com");
        eyes.open(driver, "test", "test", new RectangleSize(800, 600));
        eyes.check(Target.window());
        eyes.close();
    }
}
