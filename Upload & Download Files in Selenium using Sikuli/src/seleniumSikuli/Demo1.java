package seleniumSikuli;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class Demo1 {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JOKERPC1\\eclipse-workspace\\Upload & Download Files in Selenium using Sikuli\\src\\Driver\\chromedriver.exe");
		
	 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://chrome.google.com/webstore/detail/grammarly-for-chrome/kbfnbcaeplbcioakkpcpgfkobkghlhen?hl=en");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(text(),'Add to Chrome')])[1]")).click();
		Thread.sleep(3000);
		String inputFilepath="C:\\Users\\JOKERPC1\\eclipse-workspace\\Upload & Download Files in Selenium using Sikuli\\src\\Images\\add.PNG";
		Screen screen = new Screen();
		Pattern pattern = new Pattern(inputFilepath);
		screen.click(pattern);
		Thread.sleep(20000);
		
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    driver.close();
	    driver.switchTo().window(tabs2.get(0));
		driver.get("chrome://extensions/");
		Thread.sleep(3000);
		Screen screen1 = new Screen();
		Pattern pattern1 = new Pattern("C:\\Users\\JOKERPC1\\eclipse-workspace\\Upload & Download Files in Selenium using Sikuli\\src\\Images\\Button.PNG");
		try {
			screen1.find(pattern1);
			System.out.print("Correct");
		}catch(Exception e) {
			System.out.print("InCorrect");
		}
		
		
		 
//		Pattern searchImage = new Pattern("C:\\Users\\JOKERPC1\\eclipse-workspace\\Upload & Download Files in Selenium using Sikuli\\src\\Images\\grameerly.PNG").similar((float)0.9);
////		String ScreenImage = "grameerly.png"; //In this case, the image you want to search
//		Finder objFinder = null;
//		Match objMatch = null;
//		objFinder = new Finder(screen1.capture());
//		objFinder.find(searchImage); //searchImage is the image you want to search within ScreenImage
//		int counter = 0;
//		while(objFinder.hasNext())
//		{
//		    objMatch = objFinder.next(); //objMatch gives you the matching region.
//		    counter++;
//		}
//		if(counter!=0)
//		System.out.println("Match Found!");
	//	screen1.click(pattern1);
//		pattern = new Pattern("C:\\Users\\JOKERPC1\\eclipse-workspace\\Upload & Download Files in Selenium using Sikuli\\src\\Images\\grameerly.PNG");
//		if(screen1.exists(pattern)!= null) {
//			System.out.print("true");
//		}else {
//			System.out.print("false");
//		}
		
		driver.quit();
	}
	}


