package pages;

import driver.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ContenedorPages {

    public driver Driver = null;
    public WebDriver driver = null;

    @FindBy(xpath="//*[@id='Main']/section[1]/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/a")
    WebElement btnTravels;

    @FindBy(xpath = "//*[@id='Main']/section[1]/div/div/div[2]/div")
    WebElement VerifCaja;

    @FindBy(xpath = "//*[@id='Main']/section[1]/div/div")
    WebElement VerifCont;


    public ContenedorPages(driver driver) {
        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);
    }

    public void travelsGo() {
        VerifCont.isDisplayed();
        Driver.implicitwait();
        VerifCaja.isDisplayed();
        Driver.customWait_clickable(btnTravels);
        btnTravels.click();
    }

}
