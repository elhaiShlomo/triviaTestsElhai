package finalProjectElhai;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class BoundaryValuesTests {

	@Test //1
	public void maxCharactersOfQuestionWithQuestionMarkTest () throws InterruptedException {
		
		
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
		insertQ1.sendKeys("abcdefghijabcdefghijabcdefghijabcdefghijabcdefghi?");
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
			assertEquals(true, driver.findElement(By.name("answer1")).isEnabled());
		}
		else
		{
			fail("TEST FAILED - BUG"); 
		}
		
		driver.close();
	}
	
	@Test //2
	public void maxCharactersOfQuestionWithoutQuestionMarkTest () throws InterruptedException {
		
		
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
		insertQ1.sendKeys("abcdefghijabcdefghijabcdefghijabcdefghijabcdefghij");
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
			assertEquals(false, driver.findElement(By.name("question")).isEnabled());
		}
		else
		{
			fail("TEST FAILED - BUG"); 
		}
		
		driver.close();
	}
	
	@Test //3
	public void maxCharactersOfAnswerTest () throws InterruptedException {
		
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
		arrTypeAnswerQ1[0].sendKeys("abcdefghijabcdefghijabcdefghij");
		Thread.sleep(1000);
		arrTypeAnswerQ1[1] = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
		arrTypeAnswerQ1[1].sendKeys("abcdefghijabcdefghijabcdefghij");
		Thread.sleep(1000);
		arrTypeAnswerQ1[2] = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
		arrTypeAnswerQ1[2].sendKeys("abcdefghijabcdefghijabcdefghij");
		Thread.sleep(1000);
		arrTypeAnswerQ1[3] = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
		arrTypeAnswerQ1[3].sendKeys("abcdefghijabcdefghijabcdefghij");
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
			assertEquals(true, driver.findElement(By.name("question")).isEnabled());
		}
		else
		{
			fail("TEST FAILED - BUG");
		}		
		Thread.sleep(1000);
		
		driver.close();
	}
}
