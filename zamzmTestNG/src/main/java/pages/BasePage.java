package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void visibleWait(By locator){
        wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void invisibleWait(By locator){
        wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }
    public void clickWait(By locator){
        wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public void click(By locator){
        clickWait(locator);
        WebElement element=driver.findElement(locator);
        element.click();
    }
    public void write(By locator,String data){
        visibleWait(locator);
        WebElement element=driver.findElement(locator);
        element.clear();
        element.sendKeys(data);
    }
    public void scrollDown(){
        Actions action = new Actions(driver);
        action.sendKeys(Keys.END).perform();
    }
    public void scrollUP(){
        Actions action = new Actions(driver);
        action.sendKeys(Keys.HOME).perform();
    }
    public void hover(By locator){
        Actions action = new Actions(driver);
        WebElement  element =driver.findElement(locator);
        wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(element));
        action.moveToElement(element).perform();
    }
    public String returnText(By locator){
        visibleWait(locator);
        return driver.findElement(locator).getText();
    }
    public String[] returnTexts(By locator){
        visibleWait(locator);
        List<WebElement> elements=driver.findElements(locator);
        String[] texts = new String[elements.size()];
        for(int counter=0;counter<elements.size();counter++){
            texts[counter] = elements.get(counter).getText();
        }
        return texts;
    }
    public void attributeToBe(By locator){
        wait.until(ExpectedConditions.attributeToBe(locator, "style", "opacity: 0;"));
    }
    public void loadingWait(By locator) {
        wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }
    public void selectFromDropDown(By Locator, String data){
        WebElement jobCategory=driver.findElement(Locator);
        Select dropdown = new Select(jobCategory);
        dropdown.selectByVisibleText(data);
    }

}
