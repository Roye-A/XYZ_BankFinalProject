import org.junit.Assert;
import org.junit.Test;

public class MainBankTests {

    @Test
    public void remove_customerTest() throws InterruptedException {
        // declare selenium test
        MainBank openWindow = new MainBank();
        // defines strings
        String url = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/";
        String manager_access = "body > div > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(3) > button";
        String customer_button = "body > div > div > div.ng-scope > div > div.center > button:nth-child(3)";
        String delete_Ron_button = "body > div > div > div.ng-scope > div > div.ng-scope > div > div > table > tbody > tr:nth-child(3) > td:nth-child(5) > button";
        String table_xpath = "/html/body/div/div/div[2]/div/div[2]/div/div";
        // commends
        openWindow.driver.get(url);
        Thread.sleep(1500);
        openWindow.getElementCss(manager_access).click();
        Thread.sleep(1500);
        openWindow.getElementCss(customer_button).click();
        Thread.sleep(1000);
        String customer_table = openWindow.getElementXPath(table_xpath).getText();
        Thread.sleep(3000);
        openWindow.getElementCss(delete_Ron_button).click();
        Thread.sleep(1000);
        String delete_test = openWindow.getElementXPath(table_xpath).getText();
        Assert.assertNotEquals(customer_table,delete_test);
        System.out.println(delete_test);
        openWindow.driver.quit();

    }

    @Test
    public void add_customerTest() throws InterruptedException {
        // declare selenium test
        MainBank openWindow = new MainBank();
        // defines strings
        String url = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/";
        String expected_url = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/addCust";
        String manager_access = "body > div > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(3) > button";
        String get_add_customer = "body > div > div > div.ng-scope > div > div.center > button:nth-child(1)";
        String first_nameSelector = "body > div > div > div.ng-scope > div > div.ng-scope > div > div > form > div:nth-child(1) > input";
        String last_nameSelector = "body > div > div > div.ng-scope > div > div.ng-scope > div > div > form > div:nth-child(2) > input";
        String post_codeSelector = "body > div > div > div.ng-scope > div > div.ng-scope > div > div > form > div:nth-child(3) > input";
        String add_customer_button = "/html/body/div/div/div[2]/div/div[2]/div/div/form/button";
        // commends
        openWindow.driver.get(url);
        Thread.sleep(1500);
        openWindow.getElementCss(manager_access).click();
        Thread.sleep(1500);
        openWindow.getElementCss(get_add_customer).click();
        Thread.sleep(1000);
        openWindow.getElementCss(first_nameSelector).sendKeys("Roye");
        Thread.sleep(1000);
        openWindow.getElementCss(last_nameSelector).sendKeys("king%$");
        Thread.sleep(1000);
        openWindow.getElementCss(post_codeSelector).sendKeys("R20402");
        Thread.sleep(1000);
        openWindow.getElementXPath(add_customer_button).click();
        openWindow.driver.switchTo().alert().accept();
        Assert.assertEquals(expected_url,openWindow.driver.getCurrentUrl());
        openWindow.driver.quit();

    }



}
