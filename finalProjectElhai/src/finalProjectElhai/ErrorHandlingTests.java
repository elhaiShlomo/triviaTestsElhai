package finalProjectElhai;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class ErrorHandlingTests {

	@Test //1
	public void QuestionInsertHebrewCharactersTest () throws InterruptedException {
		
		
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
		insertQ1.sendKeys("א");
		Thread.sleep(1000);
		WebElement nextBtn = driver.findElement(By.id("nextquest"));
		nextBtn.click();
		
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			assertEquals(true, alert.getText().contains(""));
		
		}	    
		else
		{
			fail("TEST FAILED - BUG");
		}		
		Thread.sleep(1000);
	}

	@Test //2
	public void QuestionInsertNumbersTest () throws InterruptedException {
		
		
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
		insertQ1.sendKeys("1");
		Thread.sleep(1000);
		WebElement nextBtn = driver.findElement(By.id("nextquest"));
		nextBtn.click();
		
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			assertEquals(true, alert.getText().contains(""));
		
		}	    
		else
		{
			fail("TEST FAILED - BUG");
		}		
		Thread.sleep(1000);
	}

	@Test //3
	public void AnswerInsertHebrewCharactersTest () throws InterruptedException {
		
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
		arrTypeAnswerQ1[0].sendKeys("אבגדה");
		Thread.sleep(1000);
		arrTypeAnswerQ1[1] = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
		arrTypeAnswerQ1[1].sendKeys("אבגדה");
		Thread.sleep(1000);
		arrTypeAnswerQ1[2] = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
		arrTypeAnswerQ1[2].sendKeys("אבגדה");
		Thread.sleep(1000);
		arrTypeAnswerQ1[3] = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
		arrTypeAnswerQ1[3].sendKeys("אבגדה");
		Thread.sleep(1000);
		
		WebElement setAnswer1 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input"));
		setAnswer1.click();
		Thread.sleep(1000);
		
		WebElement nextBtn = driver.findElement(By.id("nextquest"));
		nextBtn.click();
		
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			assertEquals(true, alert.getText().contains(""));
		
		}	    
		else
		{
			fail("TEST FAILED - BUG");
		}		
		Thread.sleep(1000);
	}
	
	@Test //4
	public void AnswerInsertNumbersTest () throws InterruptedException {
		
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
		arrTypeAnswerQ1[0].sendKeys("12345");
		Thread.sleep(1000);
		arrTypeAnswerQ1[1] = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
		arrTypeAnswerQ1[1].sendKeys("12345");
		Thread.sleep(1000);
		arrTypeAnswerQ1[2] = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
		arrTypeAnswerQ1[2].sendKeys("12345");
		Thread.sleep(1000);
		arrTypeAnswerQ1[3] = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
		arrTypeAnswerQ1[3].sendKeys("12345");
		Thread.sleep(1000);
		
		WebElement setAnswer1 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input"));
		setAnswer1.click();
		Thread.sleep(1000);
		
		WebElement nextBtn = driver.findElement(By.id("nextquest"));
		nextBtn.click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		assertEquals(true, alert.getText().contains(""));
		
	}	    
	else
	{
		fail("TEST FAILED - BUG");
	}		
	Thread.sleep(1000);
	}
	
	@Test //5
	public void QuestionOverFiftyCharactersTest () throws InterruptedException {
		
		
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
		insertQ1.sendKeys("abcdefghijabcdefghijabcdefghijabcdefghijabcdefghija");
		Thread.sleep(1000);
		WebElement nextBtn = driver.findElement(By.id("nextquest"));
		nextBtn.click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		assertEquals(true, alert.getText().contains("To many charest in question number - 1"));
		
	}	    
	else
	{
		fail("TEST FAILED - BUG");
	}		
	Thread.sleep(1000);
	}

	@Test //6
	public void AnswerOverThirtyCharactersTest () throws InterruptedException {
		
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
		arrTypeAnswerQ1[0].sendKeys("abcdefghijabcdefghijabcdefghija");
		Thread.sleep(1000);
		arrTypeAnswerQ1[1] = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
		arrTypeAnswerQ1[1].sendKeys("a");
		Thread.sleep(1000);
		arrTypeAnswerQ1[2] = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
		arrTypeAnswerQ1[2].sendKeys("a");
		Thread.sleep(1000);
		arrTypeAnswerQ1[3] = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
		arrTypeAnswerQ1[3].sendKeys("a");
		Thread.sleep(1000);
		
		WebElement setAnswer1 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input"));
		setAnswer1.click();
		Thread.sleep(1000);
		
		WebElement nextBtn = driver.findElement(By.id("nextquest"));
		nextBtn.click();
 
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			assertEquals(true, alert.getText().contains("To many charest in answer number - 1"));
			
		}	    
		else
		{
			fail("TEST FAILED - BUG");
		}		
		Thread.sleep(1000);
	}

	@Test //7
	public void questionPressBackInsteadOfNext () throws InterruptedException {
		
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
		
		WebElement backBtn = driver.findElement(By.id("backquest"));
		backBtn.click();
		
			assertEquals(true, driver.getPageSource().contains("question number: 2"));
		
		}
		else
		{
			fail("TEST FAILED - BUG");
		}
	}	
}