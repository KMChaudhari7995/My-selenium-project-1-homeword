package testsuite;

import Browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = " https://demo.nopcommerce.com/";//pasaing url

    @Before
    public void setUp() {
        openBrowser(baseUrl); //openning the browser
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        driver.findElement(By.linkText("Log in")).click(); //finding login button and click
        String expectedMessage = "Welcome, Please Sign In!"; //Storing expected message
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']"));//finding the Actual message
        String actualMessage1 = actualMessage.getText();//Store the actual message
        Assert.assertEquals("Error Message is not Displayed", actualMessage1, expectedMessage);// comparing the both expected and Actual message
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        driver.findElement(By.linkText("Log in")).click(); //finding Log in
        driver.findElement(By.id("Email")).sendKeys("kmc123@gmail.com");//finding the email id  and send Email id value
        driver.findElement(By.id("Password")).sendKeys("123456");//finding the UserName and sending value for Password
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();//finding the login button and click
        String expectedMessage = "Log out";//Storing the expected message
        WebElement actualMessage = driver.findElement(By.linkText("Log out"));//finding the Actual message value
        String actualMessage1 = actualMessage.getText();//Storing the Actual message
        Assert.assertEquals("User is not Successfully login", actualMessage1, expectedMessage);//comparing the both Expected message and Actual message
    }
    @Test
    public void verifyTheErrorMessage() {
        driver.findElement(By.linkText("Log in")).click();//finding log in  click element
        driver.findElement(By.id("Email")).sendKeys("prime123333@gmail.com");//Finding the email id and sending the value
        driver.findElement(By.id("Password")).sendKeys("Prime123333");//Finding the password and sending the value for password
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();//finding the button and click
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";  //Storing the expected Message
        WebElement actualMessage = driver.findElement(By.xpath("//div[contains(@class,'message-error validation-summary-errors')]"));//finding the actual message
        String actualMessage1 = actualMessage.getText();//Storing the actual message value
        Assert.assertEquals("Login not Successful, Login invalid Credential",expectedMessage,actualMessage1);//comparing the both value
    }


    @After
    public void tearDown() {
        //closing the browser
        closeBrowser();
    }

}
