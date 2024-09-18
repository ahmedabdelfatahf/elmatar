package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.text.html.CSS;
import java.time.Duration;

public class homePage extends BasePage {
    String jobs;
    public homePage(WebDriver driver) {
        super(driver);
    }
By searchLocator=By.xpath("//input[@enterkeyhint=\"search\"]");
By searchBtnLocator=By.cssSelector("button[class=\"css-11qi1o ezfki8j0\"]");
By datePostedLocator=By.cssSelector("div[class=\"css-18uqayh\"] h3");
By pastWeekFilterLocator=By.xpath("//aside[@class=\"css-1r78b37\"]/div[1]/div[10]/div/div[3]");
By loadingLocator=By.cssSelector("div[class=\"entry-loader js-entry-loader\"]");
By jobsFoundLocator=By.xpath("//div[@class=\"css-9i2afk\"]/div[1]/div[3]/span[2]/strong");
By firstJobLOCATOR= By.cssSelector("h2[class=\"css-m604qf\"] a[href=\"https://wuzzuf.net/jobs/p/gsAhq2vI4FGP-Performance-Test-Engineer-qTech-Dakahlia-Egypt\"]");
By applyBtnLocator=By.cssSelector("button[class=\"css-1m0yk35 ezfki8j0\"]");
By firstNameLocator=By.xpath("//div[@class=\"css-ql17ak\"]/div/div[2]/div[1]/form/div[1]/div[1]/div[2]/input");
By lastNameLocator=By.xpath("//div[@class=\"css-ql17ak\"]/div/div[2]/div[1]/form/div[1]/div[2]/div[2]/input");
By emailLocator=By.xpath("//div[@class=\"css-ql17ak\"]/div/div[2]/div[1]/form/div[2]/div[2]/input");
By passwordLocator=By.xpath("//div[@class=\"css-ql17ak\"]/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/input");
By signupLocator=By.xpath("//div[@class=\"css-ql17ak\"]/div/div[2]/div[1]/form//button[@class=\"css-6lejne ezfki8j0\"]");
public void enterSearchData(){
    write(searchLocator,"Software testing");
    click(searchBtnLocator);
}
public void filter(){
invisibleWait(loadingLocator);
    hover(datePostedLocator);
    click(datePostedLocator);
    click(pastWeekFilterLocator);
}
public String jobsFound(){
   invisibleWait(loadingLocator);
 return returnText(jobsFoundLocator);
}
public void firstJob(){
    click(firstJobLOCATOR);

}
public void apply(){
    click(applyBtnLocator);
}
public void signUp(String firstname,String lastname,String email,String password){
    write(firstNameLocator,firstname);
    write(lastNameLocator,lastname);
    write(emailLocator,email);
    write(passwordLocator,password);
  //  hover(signupLocator);
    click(signupLocator);
    click(signupLocator);
}
}
