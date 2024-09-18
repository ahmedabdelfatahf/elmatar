package pages;

import org.apache.commons.compress.archivers.sevenz.CLI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class homePage extends BasePage {

    By cancelPopUpLocator=By.xpath("//body[@class=\"modal-open\"]/div[2]/div/div/div[1]/button");
By indicatorLocator=By.xpath("//div[@class=\"col-md-12 col-lg-3 col-12 py-3  py-lg-0 multi_right align-self-center\"]");
    By faceBookLocator=By.xpath("//a[@href=\"https://www.facebook.com/zamzamtrips\"]/i");
    By xLocator=By.xpath("//a[@href=\"https://twitter.com/zamzamtrips\"]/i");
    By linkedinLocator=By.xpath("//a[@href=\"https://www.linkedin.com/company/zamzamtrips\"]/i");
    By youtubeLocator=By.xpath("//a[@href=\"https://www.youtube.com/channel/UCc5uQ4hwnLgNsXhxv8pQtYQ\"]/i");
   By instagramLocator=By.xpath("//a[@href=\"https://www.instagram.com/zamzamtrips\"]/i");
   By cityLocator=By.xpath("//section[@class=\"sliderform\"]/div/div/div[1]/div/form/div/div/div/div[1]/div/input[1]");
   By cityOptionLocator=By.xpath("//ul[@id=\"ui-id-1\"]/li/div");
   By checkINCheckOUTLocator=By.xpath("//section[@class=\"sliderform\"]/div/div/div[1]/div/form/div/div/div/div[2]/div/div/div/input[3]");
By checkINLocator=By.xpath("//div[@class=\"flatpickr-days\"]/div[2]/span[3]");
By checkOutLocator=By.xpath("//div[@class=\"flatpickr-days\"]/div[2]/span[12]");
By roomsAndGuestsLocator=By.xpath("//section[@class=\"sliderform\"]/div/div/div[1]/div/form/div/div/div/div[3]/DIV/DIV[1]/INPUT");
By roomsLocator=By.xpath("//section[@class=\"sliderform\"]/div/div/div[1]/div/form/div/div/div/div[3]/DIV/DIV[2]/div[1]/div[2]/div/select");
By nationalityLocator=By.xpath("//section[@class=\"sliderform\"]/div/div/div[1]/div/form/div/div/div/div[4]/div/div[1]/div/select");
By submitBtnLocator=By.xpath("//section[@class=\"sliderform\"]/div/div/div[1]/div/form/div/div/div/div[4]/div/div[2]/button");
By firstHotelLocator=By.xpath("//div[@class=\"row mx-0\"]/div[1]/div[1]/div[1]/div/div/div[1]/div/div[2]/H2/SPAN");
By checkAvailabilityLocator=By.xpath("//div[@class=\"container-xl pb-3\"]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div/button");




    public homePage(WebDriver driver) {
        super(driver);
    }
    public void clickOnFaceBook(){
        hover(faceBookLocator);
        click(faceBookLocator);
    }
    public void popUpCancellation(){
        visibleWait(cancelPopUpLocator);
        click(cancelPopUpLocator);
    }
    public String  tabsHandles(  ArrayList<String> tabs){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        tabs=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
       String URL=driver.getCurrentUrl();
        driver.close();
        driver.switchTo().window(tabs.getFirst());
        return URL;
    }
    public void clickOnx(){
        hover(xLocator);
        click(xLocator);
    }public void clickOnLinkedin(){
        hover(linkedinLocator);
        click(linkedinLocator);
    }public void clickOnYoutube(){
        hover(youtubeLocator);
        click(youtubeLocator);
    }public void clickOnInstagram(){
        hover(instagramLocator);
        click(instagramLocator);
    }
    public void enterUmrahDestination(String data){
     write(cityLocator,data);
     visibleWait(cityOptionLocator);
     click(cityOptionLocator);
    }
    public void CheckINCheckOUT(){
        click(checkINCheckOUTLocator);
        visibleWait(checkINLocator);
        click(checkINLocator);
        click(checkOutLocator);
    }
public void roomsANDGuests(String data){
        click(roomsAndGuestsLocator);
        visibleWait(roomsLocator);
        selectFromDropDown(roomsLocator,data);
}
public void nationality(String data){
        click(nationalityLocator);
        visibleWait(nationalityLocator);
        selectFromDropDown(nationalityLocator,data);
        click(submitBtnLocator);
}
public void CheckAvailability(){
    click(firstHotelLocator);
    visibleWait(checkAvailabilityLocator);
    hover(checkAvailabilityLocator);
    click(checkAvailabilityLocator);
}
}
