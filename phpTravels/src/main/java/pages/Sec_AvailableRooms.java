package pages;

import driver.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;
import java.math.BigDecimal;


public class Sec_AvailableRooms {

    public driver Driver = null;
    public WebDriver driver = null;

    @FindBy(xpath="//*[@id='600']")
    WebElement checkSelect01;
    @FindBy(xpath="//*[@id='280']")
    WebElement checkSelect02;
    @FindBy(xpath="//*[@id='400']")
    WebElement checkSelect03;

    @FindBy(xpath = "//*[@id='detail-content-sticky-nav-02']/form/div/button")
    WebElement btnReservar;

    @FindBy (xpath = "//*[@id='detail-content-sticky-nav-02']/form/div/div[2]/div/div[2]/div/div[1]/p/span")
    WebElement result01;

    @FindBy (xpath = "//*[@id='detail-content-sticky-nav-02']/form/div/div[5]/div/div[2]/div/div[1]/p/span")
    WebElement result02;

    @FindBy (xpath = "//*[@id='detail-content-sticky-nav-02']/form/div/div[8]/div/div[2]/div/div[1]/p/span")
    WebElement result03;

    @FindBy (id = "signintab")
    WebElement loguin;

    @FindBy (name = "username")
    WebElement usuario01;

    @FindBy (name = "password")
    WebElement pass01;

    @FindBy (xpath = "/html/body/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/div/div[6]/button")
    WebElement btnConfirmar;

    public Sec_AvailableRooms(driver driver) {
        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);
    }

    String op01=null;
    String op02=null;
    String op03=null;

    public void selectHotel(){
        op01 = result01.getText();
        String obt01 = op01.substring(1,4);
        System.out.println("Opcion 01: "+(obt01));

        op02 = result02.getText();
        String obt02 = op02.substring(1,4);
        System.out.println("Opcion 02: "+(obt02));

        op03 = result03.getText();
        String obt03 = op03.substring(1,4);
        System.out.println("Opcion 03: "+(obt03));

        int i1 = Integer.parseInt(obt01);
        int i2 = Integer.parseInt(obt02);
        int i3 = Integer.parseInt(obt03);

        if (i1 < i2 & i1 < i3) {
            Actions builder = new Actions(Driver.returnDriver());
            builder.moveToElement(checkSelect01).click().build().perform();
            System.out.println("\u001B[43;30m Hotel con precio mas económico: \u001B[0m"+ (i1));
        }
            if (i2 < i1 & i2 < i3) {
                Actions builder = new Actions(Driver.returnDriver());
                builder.moveToElement(checkSelect02).click().build().perform();
                System.out.println("\u001B[43;30m Hotel con precio mas económico: \u001B[0m" + (i2));
            }
                if(i3 < i1 & i3 < i2) {
                Actions builder = new Actions(Driver.returnDriver());
                builder.moveToElement(checkSelect03).click().build().perform();
                System.out.println("\u001B[43;30m Hotel con precio mas económico: \u001B[0m" + (i3));
                }
    }

  /*  public void addReservar() {
        Driver.customWait_clickable(btnReservar);
        btnReservar.click();
    }

    public void ConfirmaReserva01(String usuario, String pass) {
        Driver.customWait_clickable(usuario01);
        Driver.customWait_clickable(pass01);
        usuario01.sendKeys(usuario);
        pass01.sendKeys(pass);
    }

    public void ConfirmaReserva02() {
        Driver.customWait_clickable(btnConfirmar);
        btnConfirmar.click();
    }*/
}


