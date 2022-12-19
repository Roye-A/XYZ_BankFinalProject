import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainBank {

    WebDriver driver;

    public MainBank(){
        System.setProperty("webdriver.chrome.driver"
                ,"C:\\Users\\roye1\\OneDrive\\Desktop\\chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    public WebElement getElementCss(String selector){
        WebElement elements = this.driver.findElement(By.cssSelector(selector));
        return elements;
    }
    public WebElement getElementXPath(String selector){
        WebElement xpath = this.driver.findElement(By.xpath(selector));
        return xpath;
    }
    public WebElement getElementClass(String selector){
        WebElement byClass = this.driver.findElement(By.className(selector));
        return byClass;
    }
    public WebElement getElementID(String selector) {
        WebElement byID = this.driver.findElement(By.id(selector));
        return byID;
    }


}
