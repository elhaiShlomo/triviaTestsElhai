package finalProjectElhai;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class IntegrationTest {

	@Test //1
	public void shareOnFacebookTest () throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://svcollegetest.000webhostapp.com/");
	
		Thread.sleep(1000);
		
	//SCREEN-1
		if(driver.getPageSource().contains("Start")==true) {
		WebElement startBtn = driver.findElement(By.id("startB"));
		startBtn.click();
		}
		else
		{
			System.out.println("FAILED - SCREEN 1");
		}
		Thread.sleep(1000);
		
	//SCREEN-2
		if(driver.getPageSource().contains("Please type here your question :")==true) {
		WebElement insertQ1 = driver.findElement(By.name("question"));
		insertQ1.sendKeys("a?");
		Thread.sleep(1000);
		WebElement nextBtn = driver.findElement(By.id("nextquest"));
		nextBtn.click();
		}
		else
		{
			System.out.println("FAILED - SCREEN 2");
		}
		Thread.sleep(1000);
		
	//SCREEN-3
		if(driver.getPageSource().contains("Please enter 4 possible answers and Mark the right one!")==true) {
		WebElement [] arrTypeAnswerQ1 = new WebElement[4];
		arrTypeAnswerQ1[0] = driver.findElement(By.name("answer1"));
		arrTypeAnswerQ1[0].sendKeys("a");
		Thread.sleep(1000);
		arrTypeAnswerQ1[1] = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
		arrTypeAnswerQ1[1].sendKeys("b");
		Thread.sleep(1000);
		arrTypeAnswerQ1[2] = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
		arrTypeAnswerQ1[2].sendKeys("c");
		Thread.sleep(1000);
		arrTypeAnswerQ1[3] = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
		arrTypeAnswerQ1[3].sendKeys("d");
		Thread.sleep(1000);
		
		WebElement setAnswer1 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input"));
		setAnswer1.click();
		Thread.sleep(1000);
		
		WebElement nextBtn = driver.findElement(By.id("nextquest"));
		nextBtn.click();
		}
		else
		{
			System.out.println("FAILED - SCREEN 3");
		}
		Thread.sleep(1000);
		
	//SCREEN-4
		if(driver.getPageSource().contains("Please type here your question :")==true) {
		WebElement insertQ2 = driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input"));
		insertQ2.sendKeys("b?");
		Thread.sleep(1000);
		WebElement nextBtn = driver.findElement(By.id("nextquest"));
		nextBtn.click();
		}
		else
		{
			System.out.println("FAILED - SCREEN 4");
		}
		Thread.sleep(1000);
		
	//SCREEN-5
		if(driver.getPageSource().contains("Please enter 4 possible answers and Mark the right one!")==true) {
		WebElement [] arrTypeAnswerQ2 = new WebElement[4];
		arrTypeAnswerQ2[0] = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input"));
		arrTypeAnswerQ2[0].sendKeys("a");
		Thread.sleep(1000);
		arrTypeAnswerQ2[1] = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
		arrTypeAnswerQ2[1].sendKeys("b");
		Thread.sleep(1000);
		arrTypeAnswerQ2[2] = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
		arrTypeAnswerQ2[2].sendKeys("c");
		Thread.sleep(1000);
		arrTypeAnswerQ2[3] = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
		arrTypeAnswerQ2[3].sendKeys("d");
		Thread.sleep(1000);
		
		WebElement setAnswer2 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[1]/input"));
		setAnswer2.click();
		Thread.sleep(1000);
		WebElement nextBtn = driver.findElement(By.id("nextquest"));
		nextBtn.click();
		}
		else
		{
			System.out.println("FAILED - SCREEN 5");
		}
		Thread.sleep(1000);
		
	//SCREEN-6
		if(driver.getPageSource().contains("Please type here your question :")==true) {
		WebElement insertQ3 = driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input"));
		insertQ3.sendKeys("c?");
		Thread.sleep(1000);
		WebElement nextBtn = driver.findElement(By.id("nextquest"));
		nextBtn.click();
		}
		else
		{
			System.out.println("FAILED - SCREEN 6");
		}
		Thread.sleep(1000);
		
	//SCREEN-7
		if(driver.getPageSource().contains("Please enter 4 possible answers and Mark the right one!")==true) {
		WebElement [] arrTypeAnswerQ3 = new WebElement[4];
		arrTypeAnswerQ3[0] = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input"));
		arrTypeAnswerQ3[0].sendKeys("a");
		Thread.sleep(1000);
		arrTypeAnswerQ3[1] = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
		arrTypeAnswerQ3[1].sendKeys("b");
		Thread.sleep(1000);
		arrTypeAnswerQ3[2] = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
		arrTypeAnswerQ3[2].sendKeys("c");
		Thread.sleep(1000);
		arrTypeAnswerQ3[3] = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
		arrTypeAnswerQ3[3].sendKeys("d");
		Thread.sleep(1000);
		
		WebElement setAnswer3 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[1]/input"));
		setAnswer3.click();
		Thread.sleep(1000);
		WebElement nextBtn = driver.findElement(By.id("nextquest"));
		nextBtn.click();
		}
		else
		{
			System.out.println("FAILED - SCREEN 7");
		}
		Thread.sleep(1000);
		
	//SCREEN-8
		if(driver.getPageSource().contains("Play")==true) {
		WebElement playBtn = driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]"));
		playBtn.click();
		}
		else
		{
			System.out.println("FAILED - SCREEN 8");
		}
		Thread.sleep(1000);
		
	//SCREEN-9
		if(driver.getPageSource().contains("Test")==true) {
			
			if (driver.findElement(By.xpath("//*[@id=\"0\"]")).isDisplayed()==true) {
				driver.findElement(By.xpath("//*[@id=\"0\"]/input[1]")).click();
			}
			else if (driver.findElement(By.xpath("//*[@id=\"1\"]")).isDisplayed()==true) {
				driver.findElement(By.xpath("//*[@id=\"1\"]/input[2]")).click();
			}
			else 
				driver.findElement(By.xpath("//*[@id=\"2\"]/input[3]")).click();
		}
		else
		{
			System.out.println("FAILED - SCREEN 9");
		}
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
		
		Thread.sleep(1000);
		
	//SCREEN-10
		if(driver.getPageSource().contains("Test")==true) {
			
			if (driver.findElement(By.xpath("//*[@id=\"0\"]")).isDisplayed()==true) {
				driver.findElement(By.xpath("//*[@id=\"0\"]/input[1]")).click();
			}
			else if (driver.findElement(By.xpath("//*[@id=\"1\"]")).isDisplayed()==true) {
				driver.findElement(By.xpath("//*[@id=\"1\"]/input[2]")).click();
			}
			else 
				driver.findElement(By.xpath("//*[@id=\"2\"]/input[3]")).click();
		}
		else
		{
			System.out.println("FAILED - SCREEN 10");
		}
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
		
		Thread.sleep(1000);
		
	//SCREEN-11
		if(driver.getPageSource().contains("Test")==true) {
			
			if (driver.findElement(By.xpath("//*[@id=\"0\"]")).isDisplayed()==true) {
				driver.findElement(By.xpath("//*[@id=\"0\"]/input[1]")).click();
			}
			else if (driver.findElement(By.xpath("//*[@id=\"1\"]")).isDisplayed()==true) {
				driver.findElement(By.xpath("//*[@id=\"1\"]/input[2]")).click();
			}
			else 
				driver.findElement(By.xpath("//*[@id=\"2\"]/input[3]")).click();
		}
		else
		{
			System.out.println("FAILED - SCREEN 11");
		}
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
		
		Thread.sleep(1000);
		
	//SCREEN-12
		if(driver.getPageSource().contains("Quit")==true) {
		WebElement shareOnFacebookBtn = driver.findElement(By.xpath("//*[@id=\"fackBook2\"]/img"));
		shareOnFacebookBtn.click();
		
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
		
			assertEquals(true, driver.getPageSource().contains("FACEBOOK"));
		
		}
		else
		{
			fail("TEST FAILED - BUG");
		}
	}
}
