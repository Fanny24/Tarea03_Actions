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

    @FindBy(xpath = "//*[@id='29']")
    //@FindBy(id = "29")
    WebElement btnSubmit;

    public Sec_Reviews(driver driver) {
        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);
    }

    public void addReview_01() {
    //Driver.implicitwait();
    //  Actions builder = new Actions(Driver.returnDriver());
    //  builder.moveToElement(btnAddReview).click().build().perform();   //build para boton.
    btnAddReview.click();
    }

    public void addNombre(String nombre) {
        //Driver.customWait_clickable(txtNombre);
        txtNombre.sendKeys(nombre);
    }

    public void addEmail(String email) {
        //Driver.customWait_clickable(txtEmail);
        txtEmail.sendKeys(email);
    }

    public void addDescripcion(String review) {
        //Driver.customWait_clickable(txtReview);
        txtReview.sendKeys(review);
        Driver.implicitwait();
       // txtReview.sendKeys(Keys.TAB);
    }

    public void addReview_02() {
        Actions builder = new Actions(Driver.returnDriver());
        builder.moveToElement(btnSubmit).click().build().perform();

        //Driver.customWait_clickable(btnSubmit);
        //btnSubmit.click();

    }
}
