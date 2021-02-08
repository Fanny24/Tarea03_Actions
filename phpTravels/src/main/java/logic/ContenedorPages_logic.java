package logic;

import driver.driver;
import pages.ContenedorPages;

public class ContenedorPages_logic {

    driver Driver = null;
    ContenedorPages contPages = null;

    public ContenedorPages_logic(driver driver) {
        this.Driver = driver;
        contPages = new ContenedorPages(Driver);
    }

    public void Travels_Go()
    {
        contPages.travelsGo();
    }

}
