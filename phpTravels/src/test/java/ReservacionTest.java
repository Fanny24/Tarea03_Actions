import driver.driver;
import driver.manageWindowsdriver;
import logic.ContenedorPages_logic;
import logic.PageInicioTravels_logic;
import logic.Sec_AvailableRooms_logic;
import logic.Sec_Reviews_logic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import pages2.windowsSesion3_page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class ReservacionTest {

    driver Driver = null;
    ContenedorPages_logic contLg = null;
    PageInicioTravels_logic iniLg = null;
    Sec_AvailableRooms_logic roomLg = null;
    Sec_Reviews_logic reviLg = null;

    @BeforeClass
    public void setupEnv() {
        Driver = new driver();
        contLg = new ContenedorPages_logic(Driver);
        iniLg = new PageInicioTravels_logic(Driver);
        roomLg = new Sec_AvailableRooms_logic(Driver);
        reviLg = new Sec_Reviews_logic(Driver);
    }

    /*@Test(priority = 1, testName = "Actions")
    public void acciones() throws InterruptedException
    {
        //driver.manage().window().maximize();
       //Driver.goto_url("https://phptravels.com/demo/");
        //Driver.ma .manage().windows().fullsreen();
        Driver.goto_url("https://www.phptravels.net/es");

      // Driver.implicitwait();
        iniLg.BusquedaDestino("Tria Hotel Istanbul");
        Driver.implicitwait();
        iniLg.BusquedaInicio("01/02/2021");
        Driver.implicitwait();
        iniLg.BusquedaFin("15/02/2021");
        Driver.implicitwait();
       // roomLg.SeleccionarHabit();
        Driver.implicitwait();
       // reviLg.IngresarReview("Diane","test13@gmail.com","prueba prueba comentario desc - 005");
        Driver.implicitwait();

        System.out.println("finalizado");
    }*/


   @Test(priority = 1, testName = "Windows")
    public void ventanas() throws InterruptedException {
        Driver.goto_url("https://phptravels.com/demo/");

        Driver.implicitwait2();
        Driver.scroll(100);
        WebElement link = Driver.returnDriver().findElement(By.xpath("//*[@id='Main']/section[1]/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/a"));
        link.click();
        Driver.switchWindows(); // mantiene foco

        Driver.implicitwait2();
        Driver.implicitwait2();
        iniLg.BusquedaDestino("Tria Hotel Istanbul");
        Driver.implicitwait();
        iniLg.BusquedaInicio("07/02/2021");
        Driver.implicitwait();
        iniLg.BusquedaFin("15/02/2021");
        iniLg.cAdultos(2);
        iniLg.cNinos(0);
        iniLg.FinBusq();

        Driver.scroll(1800);
        Driver.implicitwait2();
        roomLg.SeleccionarHabit();

        /*roomLg.Confirmacion01("user@phptravels.com","demouser");
        Driver.scroll(1800);
        roomLg.Confirmacion02();*/

       Driver.scroll(5000);
       Driver.implicitwait2();
       reviLg.IngresarReview();
       //reviLg.IngresarReview();
       //Driver.implicitwait2();
       reviLg.PublicarReview("Diane","test13@gmail.com","prueba prueba comentario desc - 005");
       Driver.implicitwait2();
       Driver.scroll(5500);
       Driver.implicitwait();
       reviLg.EnviarReview();
       reviLg.EnviarReview();
       Driver.implicitwait();

       System.out.println(" *** TC Finalizado *** ");
    }
    @AfterClass
    public void teardown() {
        Driver.teardown();
    }
}


