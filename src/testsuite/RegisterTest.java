package testsuite;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest extends TopMenuTest {
    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully()
    {
        String expectedMessage = "Register";//Storing the Expected message
        driver.findElement(By.xpath("//a[@href='/register?returnUrl=%2F']")).click(); //finding the register button and click
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text()='Register']"));//finding the Actual message
        String actualMessageText = actualMessage.getText();//Storing the value of Actual message
        Assert.assertEquals("User is not navigated to registration page",expectedMessage,actualMessageText);//comparing the both Actual message and Expected message
    }

    @Test

    public void userShouldRegisterAccountSuccessfully()
    {
        driver.findElement(By.xpath("//a[@href='/register?returnUrl=%2F']")).click();//finding register element and click
        driver.findElement(By.xpath("//input[@id='gender-female']")).click();//finding radio button nd click
        driver.findElement(By.id("FirstName")).sendKeys("km");//finding firstName element and send value
        driver.findElement(By.id("LastName")).sendKeys("c");//finding Lastname element and send value

        Select day = new Select(driver.findElement(By.name("DateOfBirthDay")));//selecting date of birth
        day.selectByVisibleText("1");
        //day.selectByIndex(1);
        Select month = new Select(driver.findElement(By.name("DateOfBirthMonth")));//finding month and select
        month.selectByVisibleText("June");
        Select year = new Select(driver.findElement(By.name("DateOfBirthYear")));//finding year element
        year.selectByValue("1995");
        driver.findElement(By.id("Email")).sendKeys("kmc123@gmail.com");//finding email element and send value
        driver.findElement(By.id("Password")).sendKeys("123456");//finding firstName Password and send value
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");//finding confirm  element and send value
        driver.findElement(By.id("register-button")).click();//finding register element and click
        String expectedMessage = "Your registration completed";//Storing expected message
        WebElement actualMessage = driver.findElement(By.xpath("//div[text() = 'Your registration completed']"));//finding Actual message element
        String actualMessageText = actualMessage.getText();//Storing the value of actual message
        Assert.assertEquals("User is not registered successfully",expectedMessage,actualMessageText);//comparing the both value
    }


}
