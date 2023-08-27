package TOOLSQA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class JA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://demoqa.com/frames");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.switchTo().frame(driver.findElement(By.id("frame1")));
		WebElement s=driver.findElement(By.id("sampleHeading"));
		//System.out.println(s);
		
	
		 ((JavascriptExecutor)driver).executeScript("var ele=arguments[0]; ele.innerHTML = 'my new content';", s);
		
		
		
		
//		driver.switchTo().defaultContent();
//		
//		Actions ac = new Actions(driver);
//		ac.keyDown(Keys.CONTROL).build().perform();
//		ac.keyDown(Keys.SHIFT).build().perform();
//		ac.sendKeys("v").build().perform();
//		System.out.println("s");
//		ac.keyUp(Keys.SHIFT).build().perfor
		
		//elementLocator.sendKeys(Keys.ARROW_UP);
//		ac.keyDown(Keys.ARROW_UP).build().perform();
//		ac.keyUp(Keys.ARROW_UP).build().perform();
		
//		Select s1=new Select(elementLocator);
//		s1.selectByVisibleText("Inspect");
		//Thread.sleep(3000);
//		System.out.println("s");	
//		ac.keyDown(Keys.CONTROL).build().perform();
//		ac.keyDown(Keys.SHIFT).build().perform();
//		ac.sendKeys("i").build().perform();
//	System.out.println("s");
//		ac.keyUp(Keys.SHIFT).build().perform();
//		ac.keyUp(Keys.CONTROL).build().perform();
		
		
	
		
		/*Progressbar
		 JavascriptExecutor js=(JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,400)","");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[5]")).click();		
        driver.findElement(By.id("startStopButton")).click();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Stop']"))).click();
        WebElement wb=driver.findElement(By.xpath("//div[@id='progressBar']"));
        WebElement wb1=wait.until(ExpectedConditions.visibilityOf(wb));
        System.out.println("Progrees Report: "+wb1.getText());
        
        
        //Slider
        
        js.executeScript("window.scrollBy(0,400)","");
        driver.findElement(By.xpath("//span[text()='Slider']")).click();
        WebElement wb3=driver.findElement(By.xpath("//span[@class='range-slider__wrap']"));
        Actions act=new Actions(driver);
        act.dragAndDropBy(wb3, 89, 97).build().perform(); 
        act.dragAndDropBy(wb3, -23, 30).build().perform();
        WebElement wb6=driver.findElement(By.className("form-control"));
        System.out.println("Slider value: "+wb6.getAttribute("value"));*/
	
		
		
		

	}

}
