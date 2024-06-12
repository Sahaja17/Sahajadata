import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class framework
{
    static WebDriver driver;


public static void main(String[]args) throws InterruptedException {
    System.setProperty("webdriver.edge.driver","C:\\Users\\sahaj\\Downloads\\edgedriver\\msedgedriver.exe");
    driver= new EdgeDriver();
    driver.get("https://www.javatpoint.com/simple-program-of-java");
    driver.manage().window().maximize();;
    Thread.sleep(7000);


}
}
