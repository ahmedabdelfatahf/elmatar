package Tests;

import Pages.careerInterestsPage;
import Pages.homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;

public class homeTEST extends BaseTest{
    homePage hp;
    careerInterestsPage cip;
    String search="software testing";
    @Test
    public void tc1() {
        reportTest=report.createTest("wuzzuf testcase");
customSoftAssert(softAssert,driver.getCurrentUrl().equals(url),"this is the right website and it is "+url,"this is wrong url and the right is "+url);
hp=new homePage(driver);
        cip=new careerInterestsPage(driver);
hp.enterSearchData(search);
customSoftAssert(softAssert,driver.getCurrentUrl().contains(search),"this is url before adding filter "+urlBeforeFilter,"this is the wrong url and the right is "+urlBeforeFilter);

String searchInput=hp.filter();
customSoftAssert(softAssert,searchInput.contains(search),"yes it contains software testing ","itt doesn't contain software testing ");
customSoftAssert(softAssert,driver.getCurrentUrl().contains("within_1_week"),"this is url after adding filter "+urlAFTERFilter,"this is the wrong url and the right is "+urlAFTERFilter);
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
cip.apply();




















    }
}
