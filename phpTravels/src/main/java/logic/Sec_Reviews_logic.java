package logic;

import driver.driver;
import org.openqa.selenium.WebDriver;
import pages.Sec_Reviews;

public class Sec_Reviews_logic {
    driver Driver = null;
    Sec_Reviews reviews = null;

    public Sec_Reviews_logic(driver driver) {
        this.Driver = driver;
        reviews = new Sec_Reviews(Driver);
    }

    public void IngresarReview()throws InterruptedException
    {
        Driver.implicitwait();
        reviews.addReview_01();
        Driver.implicitwait();
    }
    public void PublicarReview(String name, String mail, String descrip)
    {
        //reviews.addReview_01();
        reviews.addNombre(name);
        reviews.addEmail(mail);
        reviews.addDescripcion(descrip);
        //Driver.implicitwait();
    }
    public void EnviarReview() throws InterruptedException
    {
        Driver.implicitwait();
        reviews.addReview_02();
    }
}
