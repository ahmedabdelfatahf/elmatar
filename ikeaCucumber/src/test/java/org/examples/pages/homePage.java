package org.examples.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.examples.stepDefs.Hooks.driver;

public class homePage {
    public homePage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//ul[@class=\"hnf-header__icons \"]/li[3]/a[1]")
    public WebElement signUP;
    @FindBy(xpath = "//div[@class=\"menuModalBodyContainer\"]/div/form/button[2]")
    public WebElement createAccount;
    @FindBy(xpath = "//div[@data-testid=\"sign-up-content-right\"]/form/fieldset/div[1]/div/div[1]/div/input")
    public WebElement firstName;
    @FindBy(xpath = "//div[@data-testid=\"sign-up-content-right\"]/form/fieldset/div[2]/div/div[1]/div/input")
    public WebElement lastName;
    @FindBy(xpath = "//div[@data-testid=\"sign-up-content-right\"]/form/fieldset/div[3]/div/div[1]/div/input")
    public WebElement email;
    @FindBy(xpath = "//div[@data-testid=\"sign-up-content-right\"]/form/fieldset/div[4]/div[1]/div/div[1]/div/input")
    public WebElement password;
    @FindBy(xpath = "//div[@data-testid=\"sign-up-content-right\"]/form/button")
    public WebElement submitCreateAccount;
    @FindBy(xpath = "//div[@data-testid=\"sign-up-content-right\"]/form/div[1]/span/input")
    public WebElement checkBox;
    @FindBy(xpath = "//div[@class=\"hnf-header__logo\"]/a")
    public WebElement homepage;
    @FindBy(xpath = "//div[@class=\"cl6pfke\"]/main/div/div/div/div[2]/article/section[3]/div/div/section/div/div/div/div")
    public WebElement trendCategories;
    @FindBy(xpath = "//div[@class=\"ot-sdk-container\"]/div/div[2]/div/button[2]")
    public WebElement acceptCookies;
    @FindBy(xpath = "//div[@class=\"cl6pfke\"]/main/div/div/div/div[2]/article/section[3]/div/div/section/div/div/div/div/DIV/DIV[1]/DIV/DIV/DIV/DIV[1]/DIV/DIV/A")
    public WebElement SOFA;
    @FindBy(xpath = "//div[@class=\"plp-filter-bar__options\"]/button[1]")
    public WebElement sort;
    @FindBy(xpath = "//div[@class=\"plp-drop-down\"]/fieldset/label[3]/span[2]/input")
    public WebElement highToLowFilter;
    @FindBy(xpath = "//button[@class=\"plp-btn plp-btn--small plp-btn--icon-emphasised\"]")
    public List<WebElement> addToCartButton;
    @FindBy(xpath = "//span[@class=\"plp-price-module__description\"]")
    public List<WebElement> nameOFProductBeforeCart;
    @FindBy(xpath = "//div[@class=\"plp-price-module__primary-currency-price\"]//span[@class=\"plp-price__integer\"]")
    public List<WebElement> priceOfProductBeforeCart;
    @FindBy(xpath = "//span[@class=\"skapa-wrapper-prefix-price-module__description\"]/div[1]")
    public List<WebElement> nameOFProductAfterCart;
    @FindBy(xpath = "//div[@class=\"skapa-wrapper-prefix-price-module__price\"]//span[@class=\"skapa-wrapper-prefix-price__nowrap\"]/span[2]")
    public List<WebElement> priceOfProductAfterCart;
@FindBy(css = "path[d=\"M10.5773 13.5047 16.55 7.5l1.418 1.4104-7.3907 7.4303L6 11.7389l1.418-1.4105 3.1593 3.1763z\"]")
    public WebElement INDICATOR;

@FindBy(css = "path[d=\"M11.9997 4C10.2948 4 9.019 5.122 8.5418 6.7127 8.2172 7.7946 7.97 8.9013 7.7083 10H1.5566l3.7501 10h9.6931v-2h-8.307l-2.2501-6h3.3251c.6634 2.1065 1.7665 4 4.2319 4 2.4653 0 3.5685-1.8935 4.2318-4h3.3252l-.375 1h2.136l1.125-3H16.291c-.2617-1.0987-.5089-2.2054-.8335-3.2873C14.9803 5.122 13.7045 4 11.9997 4zm2.2348 6c-.2293-.9532-.5299-2.1701-.6927-2.7127C13.3155 6.533 12.8255 6 11.9997 6s-1.3159.533-1.5422 1.2873C10.2947 7.83 9.9941 9.0468 9.7648 10h4.4697zm-4.361 2h4.2523c-.3635 1.0612-.8841 2-2.1261 2-1.2421 0-1.7627-.9388-2.1262-2z\"]")
    public WebElement INDICATOR2;
@FindBy(xpath = "//button[@class=\"skapa-mvagent-wrapper-prefix-btn skapa-mvagent-wrapper-prefix-btn--small skapa-mvagent-wrapper-prefix-btn--plain skapa-mvagent-wrapper-prefix-toast__action-message\"]")
    public WebElement cartIcon;
@FindBy (xpath = "//button[@class=\"skapa-mvagent-wrapper-prefix-btn skapa-mvagent-wrapper-prefix-btn--small skapa-mvagent-wrapper-prefix-btn--icon-tertiary-inverse\"]")
public WebElement cancelCart;
@FindBy(xpath = "//DIV[@class=\"Summary_row__eKf5V\"]//SPAN[@data-ft=\"text-total-price\"]//SPAN[@class=\"skapa-wrapper-prefix-price__integer\"]")
public WebElement totalPrice;
@FindBy(xpath = "//div[@class=\"CartPage_cartListWrapper__z3xQC\"]/div/div[2]/div/div/div/div[2]/button[2]")
public WebElement moveToFavouritesButton;
@FindBy(xpath = "//div[@class=\"CartPage_cartListWrapper__z3xQC\"]/div/div[3]/div/div/div/div[2]/button[1]")
public WebElement removeButton;
@FindBy(xpath = "//button[@class=\"skapa-wrapper-prefix-btn skapa-wrapper-prefix-btn--emphasised skapa-wrapper-prefix-btn--fluid  skapa-wrapper-prefix-noOutline\"]")
    public WebElement goToCheckout;
@FindBy(xpath = "//div[@class=\"col-md-offset-3 col-md-6 col-xs-12\"]/div[1]/input[1]")
    public WebElement fullName;
@FindBy(xpath = "//div[@class=\"col-md-offset-3 col-md-6 col-xs-12\"]/div[5]/select")
    public WebElement government;
    @FindBy(xpath = "//div[@class=\"col-md-offset-3 col-md-6 col-xs-12\"]/div[6]/select")
    public WebElement area;
    @FindBy(xpath = "//div[@class=\"col-md-offset-3 col-md-6 col-xs-12\"]/div[7]/input[1]")
    public WebElement emailAddress;
    @FindBy(xpath = "//div[@class=\"col-md-offset-3 col-md-6 col-xs-12\"]/div[9]/div/input")
    public WebElement mobilePhone;
    @FindBy(xpath = "//div[@class=\"col-md-offset-3 col-md-6 col-xs-12\"]/div[10]/input[1]")
    public WebElement address;
    @FindBy(xpath = "//div[@class=\"col-md-offset-3 col-md-6 col-xs-12\"]/div[11]/input[1]")
    public WebElement buildingNumber;
    @FindBy(xpath = "//div[@id=\"billing-buttons-container\"]/div[2]/div/button")
    public WebElement continueBUTTON;
    @FindBy(xpath = "//DIV[@id=\"deliveryandassembly-buttons-container\"]/DIV[3]/DIV/BUTTON")
    public WebElement continue1BUTTON;




}
