package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    /*Cucumber da hook class ne demektir
    hooks Before ve After annotationlara sahiptir
    hooks her ber scenario dan önce veya sonra calışır

    @After da nelerin var
    Cucumber da @After hooks ta report ve screenShot alırım
    Hooks u ben dizayn ederim ve test scenario basarısız olduğunda screenshot alırım
     */
    @Before
    public void setUp(){

//        System.out.println("Bu bir hook @Before methodudur");
    }
    @After
    public void tearDown(Scenario scenario){
//        System.out.println("Bu bir hook @After methodudur");

        //screen almak için: getScreenshotAs () screenShot alacaktır
//        final byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        // screenShot i scnario raporuna ekle
//        if (scenario.isFailed()){
//            scenario.attach(screenShot,"image/png","screenShot");
//        }
//        Driver.closeDriver();
    }
}
