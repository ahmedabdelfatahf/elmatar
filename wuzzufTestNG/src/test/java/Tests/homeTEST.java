package Tests;

import Pages.careerInterestsPage;
import Pages.homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;

public class homeTEST extends BaseTest{
    homePage hp;
    careerInterestsPage cip;
    @Test
    public void tc1() {
hp=new homePage(driver);
        cip=new careerInterestsPage(driver);
hp.enterSearchData();
hp.filter();
System.out.println("the number of jobs  after filter is   "+ hp.jobsFound());
hp.firstJob();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        tabs=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        hp.apply();
hp.signUp(firstName,lastName,email,password);
cip.step1(salary);
cip.step2(mobileNumber);
cip.step3(fieldOFStudy,"a",SKILLS1,"C:\\Users\\pc\\Desktop\\cvAhmedAbdelFatah1.pdf",SKILLS2);
cip.apply(salary);




















    }
}
