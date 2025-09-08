package problem_1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {

	
	WebDriver driver = new ChromeDriver();
		
	@Test(priority = 0)	
	void first() throws InterruptedException {
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		 Thread.sleep(2000);
	}

	@Test(priority = 1)	
	void getElement() {
		driver.findElement(By.xpath("//h5[text()='Elements']")).click();
		driver.get("https://demoqa.com/elements");
		driver.findElement(By.id("item-0")).click();
	}
	
	@Test(priority = 2)
	void info() {
		driver.findElement(By.id("userName")).sendKeys("Rani Agrawal");
		driver.findElement(By.id("userEmail")).sendKeys("agrawal2003r@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Bhopal (m.p.)");
		driver.findElement(By.id("permanentAddress")).sendKeys("Bhopal");
		driver.findElement(By.id("submit")).click();
		
	}
	@Test(priority = 3)
	void radio() {
		driver.findElement(By.id("item-2")).click();
		driver.findElement(By.id("impressiveRadio")).click();
		driver.quit();
	}
	
	@Test(priority = 4)
	void widgets() {
		driver.get("https://demoqa.com/");
		driver.findElement(By.xpath("//h5[text()='Widgets']")).click();
		driver.get("https://demoqa.com/widgets");
		driver.findElement(By.id("item-8")).click();
		driver.findElements(By.className(" css-1wy0on6"));
		driver.findElements(By.className(" css-1wy0on6"));
		
//		target date picker
		driver.findElement(By.id("item-2")).click();
	}
	
	
	
	@Test(priority = 5)
	void alert() {
		driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();
		driver.get("https://demoqa.com/alertsWindows");
		driver.findElement(By.id("item-0")).click();
		driver.findElement(By.id("tabButton")).click();
		
		
		
		driver.findElement(By.id("item-1")).click();
		driver.findElement(By.id("alertButton")).click();
		
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
	}
	
	
	@Test(priority = 6)
	void screenshort() throws IOException {
		driver.get("https://demoqa.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\rania\\OneDrive\\Desktop\\screenshot\\denoqa.png");
		FileUtils.copyFile(sourcefile, target);
		
	}
}
