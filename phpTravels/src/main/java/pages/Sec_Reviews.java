package pages;

import driver.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Sec_Reviews {

    public driver Driver = null;
    public WebDriver driver = null;

        @FindBy (xpath = "//*[@id='reviews-form-29']/div[4]/div[4]/div")
        WebElement contBoton1;
    //@FindBy/(xpath="//button[contains(text(),'Write Review')]')]")
    //@FindBy(className = "writeReview btn btn-primary btn-block mb-10")
    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div/div[3]/div/div[2]/div[5]/div[2]/button")
    WebElement btnAddReview;

    @FindBy(id="ADDREVIEW")
    WebElement aux;


    //@FindBy(name="fullname")
    @FindBy (xpath = "//*[@id='reviews-form-29']/div[4]/div[1]/div[1]/input")
    WebElement txtNombre;

    @FindBy(name="email")
    WebElement txtEmail;

    @FindBy(name="reviews_comments")
    WebElement txtReview;

    //@FindBy(xpath = "//*[@id='29']")
    @FindBy(xpath = "//*[@id='reviews-form-29']/div[4]/textarea")
    WebElement btnSubmit;

    public Sec_Reviews(driver driver) {
        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);
    }

    public void addReview_01() {

        Driver.implicitwait();
        Driver.implicitwait();
        Actions builder = new Actions(Driver.returnDriver());
        builder.moveToElement(btnAddReview).click().build().perform();   //build para boton.
        Driver.implicitwait();
       // builder.moveToElement(btnAddReview).click();
        //btnAddReview.click();
        Driver.implicitwait();
        Driver.implicitwait();

      //  builder.moveToElement(pass1).click().sendKeys(password).build().perform();
      //  aux.isDisplayed();
      //  Driver.implicitwait();
        //Driver.customWait_clickable_f2(btnAddReview);
      //          btnAddReview.click();
     //   btnAddReview.click();
    }

    public void addNombre(String nombre) {



        /* Driver.implicitwait();
        Actions builder = new Actions(Driver.returnDriver());
        builder.moveToElement(txtNombre).click().sendKeys(nombre).perform();*/

        Driver.customWait_clickable(txtNombre);
        //Driver.implicitwait();
        //txtNombre.isDisplayed();
        txtNombre.sendKeys(nombre);
    }

    public void addEmail(String email) {
        Driver.customWait_clickable(txtEmail);
        txtEmail.sendKeys(email);
    }

    public void addDescripcion(String review) {
        Driver.customWait_clickable(txtReview);
        txtReview.sendKeys(review);
        Driver.implicitwait();
       // txtReview.sendKeys(Keys.TAB);
    }

    public void addReview_02() {
       Driver.customWait_clickable(btnSubmit);
        btnSubmit.click();
       //btnSubmit.click();
       // btnSubmit.click();
        //*******
        /*Driver.implicitwait();
        Actions builder = new Actions(Driver.returnDriver());
        builder.moveToElement(btnSubmit).click().build().perform();   //build para boton.
        Driver.implicitwait();*/

        //*[@id="29"]
    }
}
