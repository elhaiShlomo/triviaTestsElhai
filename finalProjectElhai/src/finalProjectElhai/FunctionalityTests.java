package finalProjectElhai;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class FunctionalityTests {
	
	@Test //1
	public void back1BtnTest () throws InterruptedException {
		
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
		WebElement backBtn = driver.findElement(By.xpath("//*[@id=\"backquest\"]"));
		backBtn.click();
		}
		else
		{
			System.out.println("FAILED - SCREEN 2");
		}
		
	//SCREEN-1
		if(driver.findElement(By.id("startB")).isDisplayed()==true) {
		}
		else
		{
			fail("TEST FAILED - BUG");
		}
		
		driver.close();
	}
	
	@Test //2
	public void back2BtnTest () throws InterruptedException {
		
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
		WebElement backBtn = driver.findElement(By.xpath("//*[@id=\"backquest\"]"));
		backBtn.click();
		}
		else
		{
			System.out.println("FAILED - SCREEN 3");
		}
		Thread.sleep(1000);
		
	//SCREEN-2
		if(driver.getPageSource().contains("Please type here your question :")==true) {
		assertEquals(true, driver.getPageSource().contains("Please type here your question :"));
		assertEquals(true, driver.getPageSource().contains("a?"));
		}
		else
		{
			fail("TEST FAILED - BUG");
		}
		
		driver.close();
	}
	
	@Test//3
	public void back3BtnTest () throws InterruptedException {
		
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
		WebElement backBtn = driver.findElement(By.xpath("//*[@id=\"backquest\"]"));
		backBtn.click();
		}
		else
		{
			System.out.println("FAILED - SCREEN 4");
		}
		Thread.sleep(1000);
		
	//SCREEN-3
		if(driver.getPageSource().contains("Please enter 4 possible answers and Mark the right one!")==true) {
		assertEquals(true, driver.getPageSource().contains("Please enter 4 possible answers and Mark the right one!"));
		assertEquals(true, driver.getPageSource().contains("a"));
		assertEquals(true, driver.getPageSource().contains("b"));
		assertEquals(true, driver.getPageSource().contains("c"));
		assertEquals(true, driver.getPageSource().contains("d"));
		WebElement setAnswer1 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input"));
		assertEquals(true, setAnswer1.isSelected());
		}
		else
		{
			fail("TEST FAILED - BUG");
		}
			
		driver.close();
	}
	
	@Test //4
	public void back4BtnTest () throws InterruptedException {
		
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
			System.out.println("TEST FAILED - SCREEN 1");
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
		WebElement backBtn = driver.findElement(By.xpath("//*[@id=\"backquest\"]"));
		backBtn.click();
		}
		else
		{
			System.out.println("FAILED - SCREEN 5");
		}		
		Thread.sleep(1000);
		
	//SCREEN-4
		if(driver.getPageSource().contains("Please type here your question :")==true) {
		assertEquals(true, driver.getPageSource().contains("Please type here your question :"));
		assertEquals(true, driver.getPageSource().contains("b?"));
		}
		else
		{
			fail("TEST FAILED - BUG");
		}		
		
		driver.close();
	}

	@Test //5
	public void back5BtnTest () throws InterruptedException {
		
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
		WebElement backBtn = driver.findElement(By.xpath("//*[@id=\"backquest\"]"));
		backBtn.click();
		}
		else
		{
			System.out.println("FAILED - SCREEN 6");
		}	
		Thread.sleep(1000);
		
	//SCREEN-5
		if(driver.getPageSource().contains("Please enter 4 possible answers and Mark the right one!")==true) {
		assertEquals(true, driver.getPageSource().contains("Please enter 4 possible answers and Mark the right one!"));
		assertEquals(true, driver.getPageSource().contains("a"));
		assertEquals(true, driver.getPageSource().contains("b"));
		assertEquals(true, driver.getPageSource().contains("c"));
		assertEquals(true, driver.getPageSource().contains("d"));
		WebElement setAnswer2 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[1]/input"));
		assertEquals(true, setAnswer2.isSelected());
		}
		else
		{
			fail("TEST FAILED - BUG");
		}	
		
		driver.close();
	}
	
	@Test //6
	public void back6BtnTest () throws InterruptedException {
		
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
		WebElement backBtn = driver.findElement(By.xpath("//*[@id=\"backquest\"]"));
		backBtn.click();
		}
		else
		{
			System.out.println("FAILED - SCREEN 7");
		}	
		Thread.sleep(1000);
		
	//SCREEN-6
		if(driver.getPageSource().contains("Please type here your question :")==true) {
		assertEquals(true, driver.getPageSource().contains("Please type here your question :"));
		assertEquals(true, driver.getPageSource().contains("c?"));
		}
		else
		{
			fail("TEST FAILED - BUG");
		}	
		
		driver.close();
	}
	
	@Test //7
	public void quit1BtnTest () throws InterruptedException {
		
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
		WebElement quit1Btn = driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[2]"));
		quit1Btn.click();
		}
		
		//SCREEN-EMPTY
			//assertEquals(false, quit2Btn.isEnabled());
			if(driver.getPageSource().contains("Quit")==false) {
			}
			else
			{
				fail("TEST FAILED - BUG");
			}	
			
		driver.close();
	}
	
	@Test //8
	public void back7BtnTest () throws InterruptedException {
		
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
		WebElement back7Btn = driver.findElement(By.xpath("//*[@id=\"btnback\"]")); 
		back7Btn.click();
		}
		else
		{
			System.out.println("FAILED - SCREEN 9");
		}
		Thread.sleep(1000);
		
	//SCREEN-8
		if(driver.getPageSource().contains("Play")==true) {
		WebElement playBtn = driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]"));
		assertEquals(true, playBtn.isDisplayed());
		System.out.println("SUCCESS");
		}
		else
		{
			fail("TEST FAILED - BUG");
		}	

		driver.close();
	}
	
	@Test //9
	public void back8BtnTest () throws InterruptedException {
		
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
		WebElement back7Btn = driver.findElement(By.xpath("//*[@id=\"btnback\"]")); 
		back7Btn.click();
		}
		else
		{
			System.out.println("FAILED - SCREEN 10");
		}
		Thread.sleep(1000);
		
	//SCREEN-9
		if(driver.getPageSource().contains("Test")==true) {
		assertEquals(true, driver.getPageSource().contains("Test"));
		assertEquals(true, driver.getPageSource().contains("c?"));
		WebElement Answer3 = driver.findElement(By.xpath("//*[@id=\"2\"]/input[3]"));
		assertEquals(true, Answer3.isSelected());
		}
		else
		{
			fail("TEST FAILED - BUG");
		}	
		
		driver.close();
	}
	
	@Test //10
	public void back9BtnTest () throws InterruptedException {
		
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
		WebElement back7Btn = driver.findElement(By.xpath("//*[@id=\"btnback\"]")); 
		back7Btn.click();
		}
		else
		{
			System.out.println("FAILED - SCREEN 11");
		}
		Thread.sleep(1000);
		
	//SCREEN-10
		if(driver.getPageSource().contains("Test")==true) {
		assertEquals(true, driver.getPageSource().contains("Test"));
		assertEquals(true, driver.getPageSource().contains("b?"));
		WebElement Answer2 = driver.findElement(By.xpath("//*[@id=\"1\"]/input[2]"));
		assertEquals(true, Answer2.isSelected());
		}
		else
		{
			fail("TEST FAILED - BUG");
		}	
		
		driver.close();
	}
	
	@Test //11
	public void quit2BtnTest () throws InterruptedException {
		
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
		WebElement quit2Btn = driver.findElement(By.xpath("//*[@id=\"markpage\"]/center/button[2]"));
		quit2Btn.click();
		}
		
	//SCREEN-EMPTY
		//assertEquals(false, quit2Btn.isEnabled());
		if(driver.getPageSource().contains("Quit")==false) {
		}
		else
		{
			fail("TEST FAILED - BUG");
		}	
			
		driver.close();
	}
		
	@Test //12
	public void tryAgainBtnTest () throws InterruptedException {
		
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
		if(driver.getPageSource().contains("Try again")==true) {
		WebElement tryAgainBtn = driver.findElement(By.xpath("//*[@id=\"markpage\"]/center/button[1]"));
		tryAgainBtn.click();
		}
		else
		{
			System.out.println("FAILED - SCREEN 12");
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
			assertEquals(true, driver.getPageSource().contains("Quit"));
		}
		else
		{
			fail("TEST FAILED - BUG");
		}
		
		driver.close();
	}
	
	@Test //13
	public void randomTest () throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		String question1 = "";
		String question2 = "";
		String question3 = "";
		String question4 = "";
		String question5 = "";
		String question6 = "";
		
		
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
				question1 = "//*[@id=\"0\"]/input[1]";
			}
			else if (driver.findElement(By.xpath("//*[@id=\"1\"]")).isDisplayed()==true) {
				driver.findElement(By.xpath("//*[@id=\"1\"]/input[2]")).click();
				question1 = "//*[@id=\"1\"]/input[2]";
			}
			else 
				driver.findElement(By.xpath("//*[@id=\"2\"]/input[3]")).click();
				question1 = "//*[@id=\"2\"]/input[3]";	
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
				question2 = "//*[@id=\"0\"]/input[1]";
			}
			else if (driver.findElement(By.xpath("//*[@id=\"1\"]")).isDisplayed()==true) {
				driver.findElement(By.xpath("//*[@id=\"1\"]/input[2]")).click();
				question2 = "//*[@id=\"1\"]/input[2]";
			}
			else 
				driver.findElement(By.xpath("//*[@id=\"2\"]/input[3]")).click();
				question2 = "//*[@id=\"2\"]/input[3]";
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
				question3 = "//*[@id=\"0\"]/input[1]";
			}
			else if (driver.findElement(By.xpath("//*[@id=\"1\"]")).isDisplayed()==true) {
				driver.findElement(By.xpath("//*[@id=\"1\"]/input[2]")).click();
				question3 = "//*[@id=\"1\"]/input[2]";
			}
			else 
				driver.findElement(By.xpath("//*[@id=\"2\"]/input[3]")).click();
				question3 = "//*[@id=\"2\"]/input[3]";
		}
		else
		{
			System.out.println("FAILED - SCREEN 11");
		}
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
		
		Thread.sleep(1000);
		
	//SCREEN-12
		if(driver.getPageSource().contains("Try again")==true) {
		WebElement tryAgainBtn = driver.findElement(By.xpath("//*[@id=\"markpage\"]/center/button[1]"));
		tryAgainBtn.click();
		}
		else
		{
			System.out.println("FAILED - SCREEN 12");
		}
		Thread.sleep(1000);
		
	//SCREEN-9
		if(driver.getPageSource().contains("Test")==true) {
			
			if (driver.findElement(By.xpath("//*[@id=\"0\"]")).isDisplayed()==true) {
				driver.findElement(By.xpath("//*[@id=\"0\"]/input[1]")).click();
				question4 = "//*[@id=\"0\"]/input[1]";
			}
			else if (driver.findElement(By.xpath("//*[@id=\"1\"]")).isDisplayed()==true) {
				driver.findElement(By.xpath("//*[@id=\"1\"]/input[2]")).click();
				question4 = "//*[@id=\"1\"]/input[2]";
			}
			else 
				driver.findElement(By.xpath("//*[@id=\"2\"]/input[3]")).click();
				question4 = "//*[@id=\"2\"]/input[3]";	
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
				question5 = "//*[@id=\"0\"]/input[1]";
			}
			else if (driver.findElement(By.xpath("//*[@id=\"1\"]")).isDisplayed()==true) {
				driver.findElement(By.xpath("//*[@id=\"1\"]/input[2]")).click();
				question5 = "//*[@id=\"1\"]/input[2]";
			}
			else 
				driver.findElement(By.xpath("//*[@id=\"2\"]/input[3]")).click();
				question5 = "//*[@id=\"2\"]/input[3]";
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
				question6 = "//*[@id=\"0\"]/input[1]";
			}
			else if (driver.findElement(By.xpath("//*[@id=\"1\"]")).isDisplayed()==true) {
				driver.findElement(By.xpath("//*[@id=\"1\"]/input[2]")).click();
				question6 = "//*[@id=\"1\"]/input[2]";
			}
			else 
				driver.findElement(By.xpath("//*[@id=\"2\"]/input[3]")).click();
				question6 = "//*[@id=\"2\"]/input[3]";
			
		}
		else
		{
			System.out.println("FAILED - SCREEN 11");
		}
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
		
		Thread.sleep(1000);
				
		
	//SCREEN-12
		//if(driver.getPageSource().contains("Quit")==true) {
		if (question1 != question4 || question2 != question5 || question3 != question6) {
		}
		else
		{
			fail("TEST FAILED - BUG");
		}
		
		driver.close();
	}
		
	@Test //14
	public void addQuestionMarkTest () throws InterruptedException {
		
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
		insertQ1.sendKeys("a");
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
		insertQ2.sendKeys("b");
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
		insertQ3.sendKeys("c");
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
			assertEquals(true, driver.getPageSource().contains("c?"));
		}
		else
		{
			fail("TEST FAILED - BUG");
		}	
			
		driver.close();
	}
	
	@Test //15
	public void oneMistakeTest () throws InterruptedException {
		
		
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
				driver.findElement(By.xpath("//*[@id=\"2\"]/input[1]")).click();
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
			assertEquals(false, driver.getPageSource().contains("Sucsses"));
		}
		else
		{
			fail("TEST FAILED - BUG"); 
		}
		
		driver.close();
	}
	
	@Test //16
	public void towMistakesTest () throws InterruptedException {
		
		
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
				driver.findElement(By.xpath("//*[@id=\"2\"]/input[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"1\"]/input[4]")).click();
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
			assertEquals(true, driver.getPageSource().contains("Failed"));
		}
		else
		{
			fail("TEST FAILED - BUG"); 
		}
		
		driver.close();
	}
	
	@Test //17
	public void threeMistakesTest () throws InterruptedException {
		
		
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
				driver.findElement(By.xpath("//*[@id=\"2\"]/input[1]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"1\"]/input[4]")).click();
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
				driver.findElement(By.xpath("//*[@id=\"0\"]/input[3]")).click();
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
			assertEquals(true, driver.getPageSource().contains("Failed"));
		}
		else
		{
			fail("TEST FAILED - BUG"); 
		}
		
		driver.close();
	}
	
	@Test //18
	public void editSetAnswerTest () throws InterruptedException {
		
		
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
		WebElement setAnswer2 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[1]/input"));
		setAnswer2.click();
		Thread.sleep(1000);
		WebElement setAnswer3 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[1]/input"));
		setAnswer3.click();
		Thread.sleep(1000);
		WebElement setAnswer4 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[1]/input"));
		setAnswer4.click();
		
			assertEquals(true, driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[1]/input")).isSelected());
			assertEquals(false, driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[1]/input")).isSelected());
			assertEquals(false, driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[1]/input")).isSelected());
			assertEquals(false, driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input")).isSelected());
		}
		else
		{
			fail("TEST FAILED - BUG"); 
		}
		
		driver.close();
	}

	@Test //19
	public void editSelectAnswerTest () throws InterruptedException {
		
		
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
				driver.findElement(By.xpath("//*[@id=\"2\"]/input[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"2\"]/input[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"2\"]/input[3]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"2\"]/input[4]")).click();
		
				assertEquals(true, driver.findElement(By.xpath("//*[@id=\"2\"]/input[4]")).isSelected());
				assertEquals(false, driver.findElement(By.xpath("//*[@id=\"2\"]/input[3]")).isSelected());
				assertEquals(false, driver.findElement(By.xpath("//*[@id=\"2\"]/input[2]")).isSelected());
				assertEquals(false, driver.findElement(By.xpath("//*[@id=\"2\"]/input[1]")).isSelected());
		}
		else
		{
			fail("TEST FAILED - BUG"); 
		}
		
		driver.close();
	}

	@Test //20
	public void editSetAnswerAfterBackTest () throws InterruptedException {
		
		
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
		WebElement backBtn = driver.findElement(By.id("backquest"));
		backBtn.click();
		}
		else
		{
			System.out.println("FAILED - SCREEN 4");
		}
		Thread.sleep(1000);
		
	//SCREEN-3
		if(driver.getPageSource().contains("Please enter 4 possible answers and Mark the right one!")==true) {
				
			WebElement setAnswer2 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[1]/input"));
			setAnswer2.click();
			Thread.sleep(1000);
			WebElement setAnswer3 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[1]/input"));
			setAnswer3.click();
			Thread.sleep(1000);
			WebElement setAnswer4 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[1]/input"));
			setAnswer4.click();
				
				assertEquals(true, driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[1]/input")).isSelected());
				assertEquals(false, driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[1]/input")).isSelected());
				assertEquals(false, driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[1]/input")).isSelected());
			}
		  	else
			{
				fail("TEST FAILED - BUG"); 
			}
			
			driver.close();		
	}

	@Test //21
	public void editSelectAnswerAfterBackTest () throws InterruptedException {
		
		
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
				driver.findElement(By.xpath("//*[@id=\"2\"]/input[1]")).click();
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
			WebElement backBtn = driver.findElement(By.id("btnback"));
			backBtn.click();
		}
		else
		{
			System.out.println("FAILED - SCREEN 10");
		}
		
		Thread.sleep(1000);
		
	//SCREEN-9
		if(driver.getPageSource().contains("Test")==true) {
				driver.findElement(By.xpath("//*[@id=\"2\"]/input[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"2\"]/input[3]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"2\"]/input[4]")).click();
				
				assertEquals(true, driver.findElement(By.xpath("//*[@id=\"2\"]/input[4]")).isSelected());
				assertEquals(false, driver.findElement(By.xpath("//*[@id=\"2\"]/input[3]")).isSelected());
				assertEquals(false, driver.findElement(By.xpath("//*[@id=\"2\"]/input[2]")).isSelected());
		}
		else
		{
			fail("TEST FAILED - BUG"); 
		}
		
		driver.close();
	}

	@Test //22
	public void RangeOfQuestionTest () throws InterruptedException {
		
		
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
		insertQ1.sendKeys("abcdefghijabcdefghijabcdefghijabcdefghijabcdefghi");
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

	@Test //23
	public void RangeOfAnswerTest () throws InterruptedException {
		
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
		arrTypeAnswerQ1[0].sendKeys("abcdefghij");
		Thread.sleep(1000);
		arrTypeAnswerQ1[1] = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
		arrTypeAnswerQ1[1].sendKeys("abcdefghijabcdefghij");
		Thread.sleep(1000);
		arrTypeAnswerQ1[2] = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
		arrTypeAnswerQ1[2].sendKeys("abcdefghijabcdefghijabcde");
		Thread.sleep(1000);
		arrTypeAnswerQ1[3] = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
		arrTypeAnswerQ1[3].sendKeys("abcdefghijabcdefghijabcdefghi");
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
			System.out.println("FAILED - SCREEN 4");
		}		
		Thread.sleep(1000);
		
		driver.close();
	}
} 


