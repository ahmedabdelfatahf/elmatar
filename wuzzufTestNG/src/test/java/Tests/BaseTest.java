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
import java.util.Date;
public class BaseTest {
    protected static ExtentReports report;
    protected static ExtentTest reportTest;
    protected WebDriver driver;
    protected String url="https://wuzzuf.net/jobs/egypt";
    protected String urlAFTERFilter="https://wuzzuf.net/search/jobs/?a=hpb&filters%5Bpost_date%5D%5B0%5D=within_1_week&q=Software%20testing";
    protected String urlBeforeFilter="https://wuzzuf.net/search/jobs/?q=Software%20testing&a=hpb";
    ArrayList<String> tabs ;
    Faker fake =new Faker();
    String firstName=fake.name().firstName();
    String lastName=fake.name().lastName();
     String email=fake.internet().safeEmailAddress();
        String  password=fake.internet().password();
        String JOB=fake.job().field();
        String salary=String.valueOf(fake.number().numberBetween(10000,15000));
        String mobileNumber="01"+fake.number().digits(9);
        String fieldOFStudy=fake.job().field();
        String SKILLS1=fake.job().keySkills();
    String SKILLS2=fake.job().keySkills();
    String msg=" highly skilled automation tester";
    SoftAssert softAssert =new SoftAssert();
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
    //    driver.quit();
    }
    @AfterSuite
    public void tearDown() throws IOException {
        report.flush();
        Desktop.getDesktop().open(new File("Reports/report.html"));
    }
}
