package web.service;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalTests {
    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshar Antala\\Desktop\\Jar\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

//    @Test
//    public void testLoginSuccess() {
//        driver.get("http://127.0.0.1:8080/login");
//        WebElement usernameInput = driver.findElement(By.name("username"));
//        WebElement passwordInput = driver.findElement(By.name("passwd"));
//        WebElement dobInput = driver.findElement(By.name("dob"));
//        WebElement login = driver.findElement(By.id("submit"));							
//
//        usernameInput.sendKeys("akshar");
//        passwordInput.sendKeys("akshar_pass");
//        dobInput.sendKeys("2024-05-19");
//        login.click();
//
//        Assert.assertTrue(driver.getCurrentUrl().contains("/q1"));
//    }
//
//    @Test
//    public void testQ1InvalidInput() {
//        driver.get("http://127.0.0.1:8080/q1");
//        WebElement number1Input = driver.findElement(By.name("number1"));
//        WebElement number2Input = driver.findElement(By.name("number2"));
//        WebElement resultInput = driver.findElement(By.name("result"));
//        WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));
//
//        number1Input.sendKeys("a");
//        number2Input.sendKeys("2");
//        resultInput.sendKeys("3");
//        submitButton.click();
//
//        WebElement errorMessage = driver.findElement(By.id("error-message"));
//        Assert.assertEquals("Invalid input. Please enter valid numbers.", errorMessage.getText());
//    }
//    @Test
//    public void testQ1ValidInput() {
//        driver.get("http://127.0.0.1:8080/q1");
//        WebElement number1Input = driver.findElement(By.name("number1"));
//        WebElement number2Input = driver.findElement(By.name("number2"));
//        WebElement resultInput = driver.findElement(By.name("result"));
//        WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));
//
//        number1Input.sendKeys("2");
//        number2Input.sendKeys("3");
//        resultInput.sendKeys("5");
//        submitButton.click();
//
//        Assert.assertTrue(driver.getCurrentUrl().contains("/q2"));
//    }
//
//    @Test
//    public void testQ1WrongAnswer() {
//        driver.get("http://127.0.0.1:8080/q1");
//        WebElement number1Input = driver.findElement(By.name("number1"));
//        WebElement number2Input = driver.findElement(By.name("number2"));
//        WebElement resultInput = driver.findElement(By.name("result"));
//        WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));
//
//        number1Input.sendKeys("2");
//        number2Input.sendKeys("3");
//        resultInput.sendKeys("4");
//        submitButton.click();
//
//        WebElement errorMessage = driver.findElement(By.id("error-message"));
//        Assert.assertEquals("Wrong answer, try again.", errorMessage.getText());
//    }
//
//    @Test
//    public void testQ2ValidInput() {
//        driver.get("http://127.0.0.1:8080/q2");
//        WebElement number1Input = driver.findElement(By.name("number1"));
//        WebElement number2Input = driver.findElement(By.name("number2"));
//        WebElement resultInput = driver.findElement(By.name("result"));
//        WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));
//
//        number1Input.sendKeys("5");
//        number2Input.sendKeys("3");
//        resultInput.sendKeys("2");
//        submitButton.click();
//
//        Assert.assertTrue(driver.getCurrentUrl().contains("/q3"));
//    }
//
//    @Test
//    public void testQ2WrongAnswer() {
//        driver.get("http://127.0.0.1:8080/q2");
//        WebElement number1Input = driver.findElement(By.name("number1"));
//        WebElement number2Input = driver.findElement(By.name("number2"));
//        WebElement resultInput = driver.findElement(By.name("result"));
//        WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));
//
//        number1Input.sendKeys("5");
//        number2Input.sendKeys("3");
//        resultInput.sendKeys("3");
//        submitButton.click();
//
//        WebElement errorMessage = driver.findElement(By.id("error-message"));
//        Assert.assertEquals("Wrong answer, try again.", errorMessage.getText());
//    }
//
//    @Test
//    public void testQ3ValidInput() {
//        driver.get("http://127.0.0.1:8080/q3");
//        WebElement number1Input = driver.findElement(By.name("number1"));
//        WebElement number2Input = driver.findElement(By.name("number2"));
//        WebElement resultInput = driver.findElement(By.name("result"));
//        WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));
//
//        number1Input.sendKeys("2");
//        number2Input.sendKeys("4");
//        resultInput.sendKeys("8");
//        submitButton.click();
//
//        // Assuming the application redirects to a success page or displays a success message
//        WebElement successMessage = driver.findElement(By.id("success-message"));
//        Assert.assertEquals("Congratulations! You've completed the math game.", successMessage.getText());
//    }

    @Test
    public void testQ3WrongAnswer() {
        driver.get("http://127.0.0.1:8080/q3");
        WebElement number1Input = driver.findElement(By.name("number1"));
        WebElement number2Input = driver.findElement(By.name("number2"));
        WebElement resultInput = driver.findElement(By.name("result"));
        WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));

        number1Input.sendKeys("2");
        number2Input.sendKeys("4");
        resultInput.sendKeys("6");
        submitButton.click();

        WebElement errorMessage = driver.findElement(By.id("error-message"));
        Assert.assertEquals("Wrong answer, try again.", errorMessage.getText());
    }

    // Add more test cases for other scenarios
}