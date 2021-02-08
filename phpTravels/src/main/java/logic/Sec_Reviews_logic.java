package logic;

import driver.driver;
import pages.Sec_Reviews;

public class Sec_Reviews_logic {
    driver Driver = null;
    Sec_Reviews reviews = null;

    public Sec_Reviews_logic(driver driver) {
        this.Driver = driver;
        reviews = new Sec_Reviews(Driver);
    }

    public void IngresarReview()
    {
        reviews.addReview_01();
    }
    public void PublicarReview(String name, String mail, String descrip)
    {
        reviews.addReview_01();
        reviews.addNombre(name);
        reviews.addEmail(mail);
        reviews.addDescripcion(descrip);
        reviews.addReview_02();
    }
}
