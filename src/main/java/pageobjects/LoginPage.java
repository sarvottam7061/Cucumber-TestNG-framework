package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(className = "bt-split-screen__header")
    private WebElement loginHeaderTitle;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "next")
    private WebElement selanjutnyaButton;

    @FindBy(xpath = "//div[@class='bt-social-group']//button[1]")
    private WebElement loginFacebookButton;

    @FindBy(id = "btnGoogle")
    private WebElement loginGoogleButton;

    @FindBy(className = "bt-question-register")
    private WebElement registerQuestionText;

    @FindBy(xpath = "//a[@href='/register']")
    private WebElement registerLink;

    @FindBy(id = "user-name")
    private WebElement userNameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(id = "item_4_title_link")
    private WebElement SauceLabsBackpack;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addbagtocart;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    private WebElement addbiketocart;
    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    private WebElement addtshirttocart;
    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    private WebElement addjackettocart;
    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    private WebElement addonesitocart;
    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    private WebElement addredtshirttocart;

    @FindBy(id = "shopping_cart_container")
    private WebElement carticon;

    @FindBy(xpath = "//*[@id='cart_contents_container']/div/div[1]/div[3]/div[1]")
    private WebElement oneitem;

    @FindBy(id = "checkout")
    private WebElement checkoutButton;

    @FindBy(id = "first-name")
    private WebElement FirstNameField;

    @FindBy(id = "last-name")
    private WebElement LastNameField;

    @FindBy(id = "postal-code")
    private WebElement PostalCodeField;

    @FindBy(id = "continue")
    private WebElement continueButton;

    @FindBy(xpath = "//*[@id='checkout_summary_container']/div/div[2]/div[5]")
    private WebElement PriceTotal;

    @FindBy(id = "finish")
    private WebElement finishButton;

    @FindBy(xpath = "//*[@id='checkout_complete_container']/h2")
    private WebElement Thankyouforyourorder;

    @FindBy(id = "back-to-products")
    private WebElement clickHomeButton;




    public boolean emailLoginPageIsDisplayed() {
        loginHeaderTitle.isDisplayed();
        emailField.isDisplayed();
        selanjutnyaButton.isDisplayed();
        loginFacebookButton.isDisplayed();
        loginGoogleButton.isDisplayed();
        registerQuestionText.isDisplayed();
        registerLink.isDisplayed();
        return true;
    }

    public String getLoginHeaderTitle() {
        loginHeaderTitle.isDisplayed();
        return loginHeaderTitle.getText();
    }

    @SuppressWarnings("unused")
    public String getQuestionRegisterText() {
        registerQuestionText.isDisplayed();
        return registerQuestionText.getText();
    }

    public void fillEmailData(String email) {
        emailField.isEnabled();
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void fillUserName(String username){
        userNameField.sendKeys(username);
    }

    public void fillPassword(String password){
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() throws InterruptedException {
        Thread.sleep(10000);
        loginButton.click();
    }
    public boolean defaultSauceLabsBackpackDisplayed(){
        SauceLabsBackpack.isDisplayed();
        return true;
    }
    public void clickOnBagAddToCart() throws InterruptedException {
        addbagtocart.click();
        Thread.sleep(10000);
    }
    public void clickOnBikeAddToCart() throws InterruptedException {
        addbiketocart.click();
        Thread.sleep(10000);
    }
    public void clickOnTshirtAddToCart() throws InterruptedException {
        addtshirttocart.click();
        Thread.sleep(10000);
    }
    public void clickOnJacketAddToCart() throws InterruptedException {
        addjackettocart.click();
        Thread.sleep(10000);
    }
    public void clickOnOnesiAddToCart() throws InterruptedException {
        addonesitocart.click();
        Thread.sleep(10000);
    }
    public void clickOnRedtshirtAddToCart() throws InterruptedException {
        addredtshirttocart.click();
        Thread.sleep(10000);
    }

    public void clickOnCart(){
        carticon.click();
    }

    public boolean OneSauceLabsBackpackDisplayed(){
        oneitem.isDisplayed();
        return true;
    }

    public void clickOnCheckout(){
        checkoutButton.click();
    }

    public void fillYourAddress(String firstname, String lastname, String postalcode){
        FirstNameField.sendKeys(firstname);
        LastNameField.sendKeys(lastname);
        PostalCodeField.sendKeys(postalcode);
    }

    public void clickContinue(){
        continueButton.click();
    }
    public boolean PriceTotalDisplayed(){
        PriceTotal.isDisplayed();
        return true;
    }

    public void clickFinish(){
        finishButton.click();
    }

    public boolean ThankyouforyourorderDisplayed(){
        Thankyouforyourorder.isDisplayed();

        return true;
    }

    public void returnHomePage(){
        clickHomeButton.click();
    }

    public void clickSelanjutnyaButton() {
        selanjutnyaButton.isEnabled();
        selanjutnyaButton.click();
    }
}
