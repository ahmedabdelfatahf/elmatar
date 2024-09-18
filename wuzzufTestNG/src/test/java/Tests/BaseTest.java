package Tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;

public class BaseTest {
    protected WebDriver driver;
    protected String url="https://wuzzuf.net/jobs/egypt";
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
    @BeforeMethod
    public void setUp(){
        ChromeOptions options =new ChromeOptions();
        options.addArguments("--start-maximized");
        driver=new ChromeDriver(options);
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));

    }
    @AfterMethod
    public void afterTest() throws InterruptedException {
        Thread.sleep(2000);
    //    driver.quit();
    }
}
