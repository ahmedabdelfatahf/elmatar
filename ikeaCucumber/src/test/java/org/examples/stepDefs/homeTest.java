package org.examples.stepDefs;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.examples.pages.homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import java.time.Duration;
import java.util.List;
import static org.examples.stepDefs.Hooks.driver;
public class homeTest {
   public WebDriverWait wait;
    Actions action = new Actions(Hooks.driver);
    Faker fake = new Faker();
    homePage hp=new homePage();
    SoftAssert softAssert=new SoftAssert();
    String[] namesAfterCart = new String[3];
    String[] pricesAfterCart = new String[3];
    String[] namesBeforeCart = new String[3];
    String[] pricesBeforeCart = new String[3];
    String totalPrice;
    int totalPRICE;
    int sumOfProductsPrices=0;
    String fullName=fake.name().fullName();
    String[] NAME=fullName.split(" ");
    String firstName =NAME[0];
    String lastName = NAME[1];
    String email = fake.internet().safeEmailAddress();
    String mobileNumber="01"+fake.number().digits(9);
    String address=fake.address().fullAddress();
    String buildingNumber=fake.address().buildingNumber();
    @Given("OPEN THE WEBSITE")
    public void openTHEWEBSITE() {
        System.out.println("the website is opened ");
        wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(hp.acceptCookies));
        hp.acceptCookies.click();
    }
    @When("click on signup button")
    public void clickOnSignupButton() {
        hp.signUP.click();
    }
    @And("click on create account button")
    public void clickOnCreateAccountButton() {
        hp.createAccount.click();
    }
    @And("enter valid First name")
    public void enterValidFirstName() {

        hp.firstName.sendKeys(firstName);
    }
    @And("enter valid Last name")
    public void enterValidLastName() {
        hp.lastName.sendKeys(lastName);
    }
    @And("enter valid Email address")
    public void enterValidEmailAddress() {

        hp.email.sendKeys(email);
    }
    @And("enter valid Password")
    public void enterValidPassword() {
        String password = fake.internet().password(8, 20, true, false, true);
        hp.password.sendKeys(password);
    }
    @And("click on checkbox button")
    public void clickOnCheckboxButton() {
        hp.checkBox.click();
    }
    @And("click on create Account")
    public void clickOnCreateAccount() {
        hp.submitCreateAccount.click();
    }
    @And("click on homepage icon")
    public void clickOnHomepageIcon() {
        hp.homepage.click();
    }
    @And("Scroll down to “Trending categories at New lower price“.")
    public void scrollDownToTrendingCategoriesAtNewLowerPrice() {
        wait =new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(hp.trendCategories));
        action.moveToElement(hp.trendCategories).perform();
  //      Hooks.clearCookie();

    }
    @And("Click on “Sofas”.")
    public void clickOnSofas() {
hp.SOFA.click();
    }
    @And("CLICK ON SORT BUTTON")
    public void clickONSORTBUTTON() {
        hp.sort.click();
    }
    @And("Sort products from “high to low”.")
    public void sortProductsFromHighToLow() {
hp.highToLowFilter.click();
        hp.sort.click();
    }


    @And("Added 3 random products to “cart”.")
    public void addedRandomProductsToCart() {
        List<WebElement> PRODUCTS=hp.addToCartButton;
        List<WebElement> namePRODUCTS=hp.nameOFProductBeforeCart;
        List<WebElement> pricePRODUCTS =hp.priceOfProductBeforeCart;

        for (int counter=0;counter<3;counter++){
            PRODUCTS.get(counter).click();
            namesBeforeCart[counter]=namePRODUCTS.get(counter).getText();
            pricesBeforeCart[counter]=pricePRODUCTS.get(counter).getText();
            wait.until(ExpectedConditions.visibilityOf(hp.INDICATOR));
            wait.until(ExpectedConditions.visibilityOf(hp.INDICATOR2));
        }
    }

    @And("scroll up in home page")
    public void scrollUpInHomePage() {
   action.sendKeys(Keys.HOME).perform();
    }

    @And("CLICK ON CART ICON")
    public void clickONCARTICON() {
        wait.until(ExpectedConditions.visibilityOf(hp.cartIcon));
        hp.cartIcon.click();
        List<WebElement> namePRODUCTSAfterCart=hp.nameOFProductAfterCart;
        List<WebElement> pricePRODUCTSAfterCart =hp.priceOfProductAfterCart;
        for(int i=0;i<3;i++){
            namesAfterCart[i]=namePRODUCTSAfterCart.get(i).getText();
            pricesAfterCart[i]=pricePRODUCTSAfterCart.get(i).getText();
        }

    }
    @And("Compare every product in the cart with product details Price and Name.")
    public void compareEveryProductInTheCartWithProductDetailsPriceAndName() {
        for (int counter =0;counter<namesAfterCart.length;counter++){
            softAssert.assertTrue(namesAfterCart[counter].contains(namesBeforeCart[counter]));
            softAssert.assertEquals(pricesAfterCart[counter],pricesBeforeCart[counter]);
            softAssert.assertAll();
        }
    }
    @And("Check that the total price in the cart is calculated correctly.")
    public void checkThatTheTotalPriceInTheCartIsCalculatedCorrectly() {
        for (int counter=0;counter<pricesAfterCart.length;counter++){
            String cleanPrice = pricesAfterCart[counter].replace(",", "");
            sumOfProductsPrices+=Integer.parseInt(cleanPrice);
        }
        totalPrice =  hp.totalPrice.getText().replace(",", "");
        totalPRICE=Integer.parseInt(totalPrice);
        softAssert.assertEquals(totalPRICE,sumOfProductsPrices);
        softAssert.assertAll();
    }

    @And("Move second product in the cart to favourites")
    public void moveSecondProductInTheCartToFavourites() {
        hp.moveToFavouritesButton.click();
    }
    @And("Remove third product from the cart.")
    public void removeThirdProductFromTheCart() {
        hp.removeButton.click();
    }

    @And("click on goto checkout button")
    public void clickOnGotoCheckoutButton() {
        hp.goToCheckout.click();
    }

    @And("enter fake data in Billing and Shipping Address")
    public void enterFakeDataInBillingAndShippingAddress() {
        hp.fullName.sendKeys(fullName);
        Select select =new Select(hp.government);
        select.selectByVisibleText("Cairo");
        select=new Select(hp.area);
        select.selectByVisibleText("Shubra");
        hp.emailAddress.sendKeys(email);
        hp.mobilePhone.sendKeys(mobileNumber);
        hp.address.sendKeys(address);
        hp.buildingNumber.sendKeys(buildingNumber);
    }

    @And("click on continue button")
    public void clickOnContinueButton() {
        hp.continueBUTTON.click();
        wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf( hp.continue1BUTTON));
        wait.until(ExpectedConditions.attributeToBe(By.xpath("//div[@class=\"loadingPanelBody\"]"), "style", "display: none;"));
     hp.continue1BUTTON.click();
    }
}

