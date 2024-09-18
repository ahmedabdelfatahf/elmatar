package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class careerInterestsPage extends BasePage{
    public careerInterestsPage(WebDriver driver) {
        super(driver);
    }
    By careerLevelLocator=By.xpath("//div[@class=\"css-1b3ykmn emyle0o0\"]/div[2]/form/div[1]/div/div[3]");
By jobTypeLocator=By.xpath("//div[@class=\"css-1b3ykmn emyle0o0\"]/div[2]/form/div[2]/div/button[1]");
By workPlaceLocator=By.xpath("//div[@class=\"css-1b3ykmn emyle0o0\"]/div[2]/form/div[3]/div/button[2]");
By jobCategoryLocator=By.xpath("//form/div[4]/div[1]/div[1]/div[2]");
By jobCategoryOptionLocator=By.xpath("//div[@class=\" css-11r7ebr-menu\"]/div/div[18]");
By salaryLocator=By.xpath("//div[@class=\"css-1b3ykmn emyle0o0\"]/div[2]/form/div[5]/div[1]/div[1]/div/input");
By saveAndContinueLocator=By.xpath("//div[@class=\"css-1b3ykmn emyle0o0\"]/div[2]/form/div[7]//button[@class=\"css-1wj05oe ezfki8j0\"]");
By dayLocator=By.xpath("//form/div[1]/div[3]/div/div[1]/div/div/div[2]");
By dayOptionLocator=By.xpath("//form/div[1]/div[3]/div/div[1]/div/div[2]/div/div[6]");
By monthLocator=By.xpath("//form/div[1]/div[3]/div/div[2]/div/div/div[2]");
By monthOptionLocator=By.xpath("//form/div[1]/div[3]/div/div[2]/div/div[2]/div/div[4]");
By yearLocator=By.xpath("//form/div[1]/div[3]/div/div[3]/div/div/div[2]");
By yearOptionLocator=By.xpath("//form/div[1]/div[3]/div/div[3]/div/div[2]/div/div[16]");
By menLocator=By.xpath("//form/div[1]/div[4]/div[2]/label[1]/div");
By nationalityLocator=By.xpath("//form/div[1]/div[5]/div/div[2]/div/div[2]");
By nationalityOptionLocator=By.xpath("//form/div[1]/div[5]/div/div[2]/div[2]/div/div[42]");
By countryLocator=By.xpath("//form/div[2]/div[1]/div/div[2]/div[1]/div[2]/i");
By countryOptionLocator=By.xpath("//form/div[2]/div[1]/div/div[2]/div[2]/div/div[42]");
By cityLocator=By.xpath("//form/div[2]/div[2]/div/div[2]/div/div[2]/i");
By cityOptionLocator=By.xpath("//form/div[2]/div[2]/div/div[2]/div[2]/div/div[6]");
By mobileNumberLocator=By.xpath("//form/div[3]/div/div/div[2]/input");
By saveBtnLocator=By.xpath("//form/div[4]/button");
By areaLocator=By.xpath("//form/div[2]/div[3]/div/div[2]/div/div[2]");
By areaOptionLocator=By.xpath("//form/div[2]/div[3]/div/div[2]/div[2]/div/div[33]");
By indicatorMsgLocator=By.xpath("//div[@class=\"css-12119hv exkztdf0\"]/div/h1[2]");
By yearsExperienceLocator=By.xpath("//form/div[1]/div/div/div/div/div[1]/div[2]/div/input");
By yearsExperienceOptionLocator=By.xpath("//form/div[1]/div/div/div/div[2]/div/div[1]");
By degreeLocator=By.xpath("//form/div[2]/div[1]/div[1]/strong");
By fieldOfStudyLocator=By.xpath("//form/div[2]/div[2]/div[1]/div[1]/div/div[2]/div/input");
By universityLocator=By.xpath("//form/div[2]/div[2]/div[2]/div[1]/div/div[2]/div/div[1]/div[2]/div/input");
By universityOptionLocator=By.xpath("//form/div[2]/div[2]/div[2]/div[1]/div/div[2]/div[2]/div/div[2]");
By graduateLocator=By.xpath("//form/div[2]/div[2]/div[2]/div[3]/div/div/div/div/div[2]/i");
By graduateOptionLocator=By.xpath("//form/div[2]/div[2]/div[2]/div[3]/div/div/div/div[2]/div/div[10]");
By gpaLocator=By.xpath("//form/div[2]/div[2]/div[2]/div[5]/div/div/div/div[2]/i");
By gpaOptionLocator=By.xpath("//form/div[2]/div[2]/div[2]/div[5]/div/div/div[2]/div/div[4]");
By languageLocator=By.xpath("//form/div[3]/div[2]/div/div[1]/div/div[2]/div/div[2]/i");
By languageOption1Locator =By.xpath("//form/div[3]/div[2]/div/div[1]/div/div[2]/div[2]/div/div[1]");

By proficiencyLocator=By.xpath("//form/div[3]/div[2]/div/div[2]/div/div[2]/div/div[2]/i ");
By proficiencyOption1Locator=By.xpath("//form/div[3]/div[2]/div/div[2]/div/div[2]/DIV[2]/DIV/DIV[4]");

By addButtonLocator=By.xpath("//form/div[3]/div[2]/div/button");
By skills1Locator=By.xpath("//form/div[4]/div/div/div/div[1]/div[1]/div[2]/div/input");
By skills2Locator=By.xpath("//form/div[4]/div/div/div/div[1]/div[1]/div/div/input");

By cvUploadLocator=By.xpath("//form/div[5]/div/INPUT");
By getStartedBtnLocator=By.xpath("//form/div[6]/button");
By expectedSalaryLocator=By.xpath("//div[@class=\"css-18m31da\"]/div/div/div[3]/textarea");
By savingMSgLocator=By.xpath("//div[@class=\"css-18m31da\"]/div/div/div[4]/span/i");
By submitApplicationLocator=By.xpath("//div[@class=\"css-1v4zzr\"]/form/div[2]/div//button[@class=\"css-9n63zc ezfki8j0\"]");
By INDLocator=By.xpath("//div[@class=\"css-1v4zzr\"]/form/h2");
By hireYouMsg=By.xpath("//div[@class=\"css-18m31da\"]/div/div[2]/div[3]/textarea");
By submitApplication=By.xpath("//div[@class=\"ReactModal__Content ReactModal__Content--after-open css-jyixk9 e77fxam1\"]/div/button[1]");
public void step1(String salary){
click(careerLevelLocator);
click(jobTypeLocator);
click(workPlaceLocator);
click(jobCategoryLocator);
click(jobCategoryOptionLocator);
write(salaryLocator,salary);
click(saveAndContinueLocator);
}
public void step2(String mobileNumber){
    click(dayLocator);
    click(dayOptionLocator);
    click(monthLocator);
    click(monthOptionLocator);
    click(yearLocator);
    click(yearOptionLocator);
    click(menLocator);
    click(nationalityLocator);
    click(nationalityOptionLocator);
    click(countryLocator);
    click(countryOptionLocator);
    click(cityLocator);
    click(cityOptionLocator);
    click(areaLocator);
    click(areaOptionLocator);
write(mobileNumberLocator,mobileNumber);
    click(saveBtnLocator);
}
public void step3(String data,String value,String skill1,String cv,String skill2){
    visibleWait(indicatorMsgLocator);
click(yearsExperienceLocator);
click(yearsExperienceOptionLocator);
click(degreeLocator);
write(fieldOfStudyLocator,data);
write(universityLocator,value);
click(universityOptionLocator);
click(graduateLocator);
click(graduateOptionLocator);
click(gpaLocator);
click(gpaOptionLocator);
click(languageLocator);
click(languageOption1Locator);
click(proficiencyLocator);
click(proficiencyOption1Locator);
click(addButtonLocator);
driver.findElement(skills1Locator).sendKeys(skill1+Keys.ENTER);
driver.findElement(skills2Locator).sendKeys(skill2+Keys.ENTER);
driver.findElement(cvUploadLocator).sendKeys(cv);
click(getStartedBtnLocator);
click(getStartedBtnLocator);
}
public void apply(){
//    write(expectedSalaryLocator,salary);
//    click(INDLocator);
// visibleWait(savingMSgLocator);
// write(hireYouMsg,msg);
//    click(INDLocator);
//    visibleWait(savingMSgLocator);
    visibleWait(submitApplicationLocator);
    click(submitApplicationLocator);
    visibleWait(submitApplication);
    click(submitApplication);
}




}
