package testsuite;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends LoginTest {

    String baseUrl = " https://demo.nopcommerce.com/";

//    @Before
//    public void setBaseUrl(){
//        setUp();
//    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
       // userShouldNavigateToLoginPageSuccessfully();
       // userShouldLoginSuccessfullyWithValidCredentials();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/computers']")).click();//finding the computer element
        String expectedMessage = "Computers";//Storing the expected message
        WebElement actualMessage= driver.findElement(By.xpath("//h1[text()='Computers']"));//finding the Actual message
        String actualMessage1 = actualMessage.getText();//Storing the ActualMessage
        Assert.assertEquals("User is not navigated to Computer page",actualMessage1,expectedMessage);//comparing the both element actual message and expected message

    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully()
    {
        String expectedMessage = "Electronics";//Storing the expected message
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/electronics']")).click();//finding the electronics element
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text()='Electronics']"));//finding the Actual message
        String actualMessageText = actualMessage.getText();//Storing the ActualMessage
        Assert.assertEquals("User is not navigated to Electronics page",expectedMessage,actualMessageText);//comparing the both element actual message and expected message
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessful()
    {
        String expectedMessage = "Apparel";//Storing the expected message
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/apparel']")).click();//finding the electronics element
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text()='Apparel']"));//finding the Actual message
        String actualMessageText = actualMessage.getText();//Storing the ActualMessage
        Assert.assertEquals("User is not navigated to Apparel page",expectedMessage,actualMessageText);//comparing the both element actual message and expected message
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessful()
    {
        String expectedMessage = "Digital downloads";//Storing the expected message
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/digital-downloads']")).click();//finding the Digital Downloads element
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text()='Digital downloads']"));//finding the Actual message
        String actualMessageText = actualMessage.getText();//Storing the ActualMessage
        Assert.assertEquals("User is not navigated to Digital downloads page",expectedMessage,actualMessageText);//comparing the both element actual message and expected message
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully()
    {
        String expectedMessage = "Books";//Storing the expected message
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/books']")).click();//finding the books element
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text()='Books']"));//Finding the Actual message
        String actualMessageText = actualMessage.getText();//Storing the ActualMessage
        Assert.assertEquals("User is not navigated to Books page",expectedMessage,actualMessageText);//comparing the both element actual message and expected message
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully()
    {
        String expectedMessage = "Jewelry";//Storing the expected message
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/jewelry']")).click();//finding the jewelry element
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text()='Jewelry']"));//Finding the Actual message
        String actualMessageText = actualMessage.getText();//Storing the ActualMessage
        Assert.assertEquals("User is not navigated to Jewelry page",expectedMessage,actualMessageText);//comparing the both element actual message and expected message
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessful()
    {
        String expectedMessage = "Gift Cards";//Storing the expected message
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/gift-cards']")).click();//finding the Gift cards element
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text()='Gift Cards']"));//Finding the Actual message
        String actualMessageText = actualMessage.getText();//Storing the ActualMessage
        Assert.assertEquals("User is not navigated to Gift Cards page",expectedMessage,actualMessageText);//comparing the both element actual message and expected message
    }

}
