package week3testleaf;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("bags",Keys.ENTER);
	 Thread.sleep(1000);
	driver.findElement(By.xpath("//label[@for='Men']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
	
	Thread.sleep(1000);
	String toalitem= driver.findElement(By.className("length")).getText();
System.out.println("the total count is :" +toalitem);
List<WebElement> brandlist = driver.findElements(By.className("brand"));
System.out.println("size: "+brandlist.size());
for(WebElement webelement : brandlist) {
	String text =webelement.getText();
	System.out.println(text);
}
List<WebElement> brandname = driver.findElements(By.className("nameCls"));
System.out.println("namesize: "+brandname.size());
for(WebElement webelement : brandname) {
	String text =webelement.getText();
	System.out.println(text);
}

	

}
}
