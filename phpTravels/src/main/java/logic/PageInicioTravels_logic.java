package logic;

import driver.driver;
import pages.PageInicioTravels;

public class PageInicioTravels_logic {
    driver Driver = null;
    PageInicioTravels pagInicio = null;

    public PageInicioTravels_logic(driver driver) {
        this.Driver = driver;
        pagInicio = new PageInicioTravels(Driver);
    }

    public void BusquedaDestino(String dest)
    {
        pagInicio.addHotel(dest);
        Driver.implicitwait();
    }
    public void BusquedaInicio(String fecIni)
    {

        pagInicio.addCheckIn(fecIni);
        Driver.implicitwait();

    }
    public void BusquedaFin(String fecFin)
    {

        pagInicio.addCheckOut(fecFin);
        Driver.implicitwait();
        //pagInicio.LimpiarCantAdult();
        Driver.implicitwait();
        pagInicio.addAdults();
        Driver.implicitwait();
        Driver.implicitwait();
        //pagInicio.LimpiarCantNinos();
        Driver.implicitwait();
        pagInicio.Busqueda();
    }
}
