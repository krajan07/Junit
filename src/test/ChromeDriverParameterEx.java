package test;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.chrome.ChromeDriver;

@ExtendWith(PramaeterProvideExamlpe.class)

public class ChromeDriverParameterEx {
	
	@Test
	public void LoginTest(ChromeDriver driver) {
		driver.get("https://www.simplilearn.com/");
		
	}

}
