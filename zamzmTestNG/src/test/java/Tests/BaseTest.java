package Tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

public class BaseTest {
    protected static ExtentReports report;
    protected static ExtentTest reportTest;
    protected WebDriver driver;
    protected String url="https://zamzam.com/";
    Faker fake =new Faker();
    ArrayList<String> tabs ;
    SoftAssert softAssert=new SoftAssert();
    String faceURL;
    String xURL;
    String linkedinURL;
    String youtubeURL;
    String instagramURL;
    String DES="makkah";
    String ROOMS="2 Rooms";
    @BeforeSuite
    public void setUP(){
        report=new ExtentReports();
        ExtentSparkReporter spikeReport=new ExtentSparkReporter(new File("Reports/report.html"));
        report.attachReporter(spikeReport);
    }
    @BeforeMethod
    public void setUp(){
        ChromeOptions options =new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addExtensions(new File("src/main/resources/GIGHMMPIOBKLFEPJOCNAMGKKBIGLIDOM_6_9_0_0.crx"));
        driver=new ChromeDriver(options);
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        tabs=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.close();
        driver.switchTo().window(tabs.getFirst());

    }
    public void customSoftAssert(SoftAssert softAssert, boolean condition, String passMessage, String failMessage) {
        softAssert.assertTrue(condition, failMessage);
        if (condition) {
            reportTest.pass(passMessage);
        } else {
            reportTest.fail(failMessage);
        }
    }
    @AfterMethod
    public void afterTest() throws InterruptedException {
        Thread.sleep(2000);
        softAssert.assertAll();
        //    driver.quit();
    }
    @AfterSuite
    public void tearDown() throws IOException {
        report.flush();
        Desktop.getDesktop().open(new File("Reports/report.html"));
    }
}
