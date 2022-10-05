import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");

        //creating a chrome driver instance
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");

        //to maximize the window
        driver.manage().window().maximize();

        //gets the title of the current page
        String title=driver.getTitle();

        //verifying the title
        if (title.equals("Google")){
            System.out.println("Titlle Is Correct!");
        }
        else {
            System.out.println("Title Is Incorrect!");
        }
        String logo="//*[@id=\"logo_homepage_link\"]";
        driver.quit();
    }
}
