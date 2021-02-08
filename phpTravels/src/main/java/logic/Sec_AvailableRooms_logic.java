package logic;

import driver.driver;
import pages.Sec_AvailableRooms;

public class Sec_AvailableRooms_logic {
    driver Driver = null;
    Sec_AvailableRooms rooms = null;

    public Sec_AvailableRooms_logic(driver driver) {
        this.Driver = driver;
        rooms = new Sec_AvailableRooms(Driver);
    }

    public void SeleccionarHabit()
    {
        rooms.selectHotel();
        //rooms.addReservar();
    }
   /* public void Confirmacion01(String a, String b)
    {
        rooms.ConfirmaReserva01(a,b);
    }
    public void Confirmacion02()
    {
        rooms.ConfirmaReserva02();
    }*/
}
