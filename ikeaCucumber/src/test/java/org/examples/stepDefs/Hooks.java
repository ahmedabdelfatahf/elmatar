package org.examples.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Map;

public class Hooks {
    public static WebDriver driver;
    public static String URL="https://www.ikea.com/eg/en/";

    @Before
    public static void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-plugins");
        options.addArguments("--disable-popup-blocking");
        options.setExperimentalOption("prefs", Map.of(
                "autofill.profile_enabled", false,
                "autofill.address_enabled", false
        ));
        driver=new ChromeDriver(options);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));

        driver.get(URL);
    }
//    public static void clearCookie() {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("var element = document.querySelector('div[id=\"onetrust-banner-sdk\"]'); if (element) { element.remove(); }");
//    }
    public void jsclick(WebElement element){
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",element);
    }

    @After
    public static void tearDown() throws InterruptedException {
//driver.quit();
    }
}
