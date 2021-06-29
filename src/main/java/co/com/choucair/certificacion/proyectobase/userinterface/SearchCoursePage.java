package co.com.choucair.certificacion.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target BUTTON_UC =
            Target.the("Selecciona la universidad choucair")
                    .located(By.xpath("//div[@id='certificaciones']//strong"));
    public static final Target INPUT_COURSE =
            Target.the("Buscar el curso").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO =
            Target.the("Da click en buscar el curso")
                    .located(By.xpath("//button[contains(@class,'btn btn-secondary')]"));
    public static final Target SELECT_COURSE =
            Target.the("Da click en buscar el curso")
                    .located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div/div/div[1]/h4/a"));
    public static final Target NAME_COURSE =
            Target.the("Extrae el nombre del curso")
                    .located(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/section/div/div[1]/div/div[1]/h3/a"));
}
