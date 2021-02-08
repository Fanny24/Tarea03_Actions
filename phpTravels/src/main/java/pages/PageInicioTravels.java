package pages;

import driver.driver;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.cert.X509Certificate;


public class PageInicioTravels {

    public driver Driver = null;
    public WebDriver driver = null;

    @FindBy(xpath="//*[@id='search']/div/div/div/div/div")
    WebElement VerifMenu;

    //@FindBy(id="s2id_autogen16")
    @FindBy(xpath = "//*[@id='s2id_autogen16']")
    WebElement txtDestino;

    @FindBy (xpath = "//*[@id='select2-drop']/div/input")
    WebElement txtDestino2;

    @FindBy (xpath = "//*[@id='select2-drop']/ul/li/ul/li/div")
    WebElement listResult;

    @FindBy(id="checkin")
    WebElement txtCheckIn;

    @FindBy(id="checkout")
    WebElement txtCheckOut;

    @FindBy(name = "adults")
    WebElement cantAdults;

    @FindBy(xpath = "//*[@id='hotels']/div/div/form/div/div/div[3]/div/div/div/div/div/div/div[1]/div/div[2]/div/span/button[1]")
    WebElement btnIncrementAdult;

    @FindBy(xpath = "//*[@id='hotels']/div/div/form/div/div/div[3]/div/div/div/div/div/div/div[1]/div/div[2]/div/span/button[2]")
    WebElement btnDecrementAdult;

    @FindBy (name = "children")
    WebElement cantNinos;

    @FindBy (xpath = "//*[@id='hotels']/div/div/form/div/div/div[4]/button")
    WebElement btnBuscar;

    public PageInicioTravels(driver driver) {

        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);
    }


    public void addHotel( String destino) {

       /* Driver.implicitwait();
        txtDestino.click();
        Actions builder = new Actions(Driver.returnDriver());
        builder.moveToElement(txtDestino2).click().sendKeys(destino);//.perform();
 //     Driver.implicitwait();
//      listResult.click();*/

        Driver.implicitwait();
        txtDestino.click();
        txtDestino2.click();
        //txtDestino.clear();
        Driver.implicitwait();
        txtDestino2.sendKeys(destino);
        Driver.implicitwait();
        Driver.implicitwait();
        //txtDestino2.sendKeys(Keys.TAB);
        listResult.click();
    }

    public void addCheckIn( String inicio) {
       // Driver.customWait_clickable(txtCheckIn);
        txtCheckIn.clear();
        txtCheckIn.sendKeys(inicio);
        txtCheckIn.sendKeys(Keys.TAB);
       // txtCheckIn.sendKeys(Keys.ENTER);
    }

    public void addCheckOut( String fin) {
        Driver.customWait_clickable(txtCheckOut);
        txtCheckOut.clear();
        txtCheckOut.sendKeys(fin);
        Driver.implicitwait();
        txtCheckOut.sendKeys(Keys.TAB);
        Driver.implicitwait();
    }

    public void LimpiarCantAdult() {
        cantAdults.isDisplayed();
        cantAdults.sendKeys(Keys.CLEAR);
        Driver.implicitwait();
        Driver.implicitwait();
        Driver.implicitwait();
    }

    public void addAdults() {
        Driver.customWait_clickable(btnIncrementAdult);
        Driver.customWait_clickable(btnDecrementAdult);
        btnDecrementAdult.click();
        btnDecrementAdult.click();
        Driver.implicitwait();
        btnIncrementAdult.click();
        btnIncrementAdult.click();
    }

    public void LimpiarCantNinos() {
        cantNinos.isDisplayed();
        cantNinos.clear();
    }

    public void Busqueda() {
        Driver.customWait_clickable(btnBuscar);
        btnBuscar.click();
        Driver.implicitwait();
        Driver.implicitwait();
        Driver.implicitwait();
    }

}
