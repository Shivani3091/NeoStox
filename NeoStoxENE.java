package NeoStoxENE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NeoStoxENE {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://neostox.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement course=driver.findElement(By.xpath("//li[contains(@class, 'nav-item')]/a[text()='Courses']"));
		course.click();
	    Thread.sleep(1000);
	    
	    
         driver.navigate().back();
         
         Thread.sleep(1000);
         
         WebElement pricing = driver.findElement(By.xpath("(//li/a[text()='Pricing'])[1]"));
         pricing.click();
         Thread.sleep(1000);
         
         driver.navigate().back();
         
         Thread.sleep(1000);
         WebElement features = driver.findElement(By.xpath("(//li/a[text()='Features'])[1]"));
         features.click();
         Thread.sleep(1000);
         
         driver.navigate().back();
         
         Thread.sleep(1000);
         WebElement How = driver.findElement(By.xpath("(//li/a[text()='How it Works'])[1]"));
         How.click();
         Thread.sleep(1000);
         
         driver.navigate().back();
         
         Thread.sleep(1000);
         WebElement SignInGoogle = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
         SignInGoogle.click();
         Thread.sleep(1000);
         
         driver.navigate().back();
         
         Thread.sleep(1000);
         String mainWindow = driver.getWindowHandle();
         
         Thread.sleep(1000);
         WebElement googlePlay = driver.findElement(By.xpath("//div/a[@class='nodecor']"));
         googlePlay.click();
         Thread.sleep(1000);
         
         for(String handle: driver.getWindowHandles())
         {
        	 if(!handle.equals(mainWindow))
        		 {
        		  driver.switchTo().window(handle);
        		 }
        	 }
         driver.switchTo().window(mainWindow);
       
             Thread.sleep(1000);
         
       
         
           WebElement blog = driver.findElement(By.xpath("(//li/a[text()='Blog'])[1]"));
           blog.click();
           Thread.sleep(1000);
         
         for(String handle: driver.getWindowHandles())
         {
      	    if(!handle.equals(mainWindow))
          {
        		 driver.switchTo().window(handle);
        		 driver.close();
        		 
          }
      	    
          }
         
         driver.switchTo().window(mainWindow);
         
         Thread.sleep(1000);
         WebElement MobF= driver.findElement(By.id("txt_mobilenumber"));
         MobF.sendKeys("8626051484");
         Thread.sleep(1000);
        
         WebElement clck= driver.findElement(By.xpath("//button[@type='submit']"));
        clck.click();
        Thread.sleep(1000);
        
        driver.navigate().back();
        
		WebElement Acttext = driver.findElement(By.xpath("//h2[contains(text(),'Master the Art of Trading!')]"));
		Acttext.getText();
		String expectedText="Master the Art of Trading!\r\n"
				+ "Experience the Thrill of Live Trading with Zero Risk!";
		System.out.println(Acttext);
		
		if (Acttext.equals(expectedText))
		{
			System.out.println("Text is matching");
		}
		else
		{
			System.out.println("Text is not matching");
		}
		
		Thread.sleep(1000);
	
		driver.close();
        
	}

}
