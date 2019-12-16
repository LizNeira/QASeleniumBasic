// verificar si el t�tulo de la p�gina es correcto
package proyecto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejemplo1 {


		// declaro variables

		private String baseUrl = "http://automationpractice.com/index.php";
		private String actualResult;
		private String expectedResult = "My Store";
		WebDriver driver;
		
    
		public Ejemplo1 (String baseUrl,String actualResult,String espectedResult) {
			this.baseUrl=baseUrl;
			this.actualResult=actualResult;
			this.expectedResult="My Store";
					
		}
		
		public Ejemplo1() {
		
	}

		public void ejecutar() {
			
		
		// indico la localizaci�n del archivo chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// creo el objeto ChromeDriver
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		// entro a la p�gina
		driver.get(baseUrl);

		// obtengo el t�tulo de la p�gina
		actualResult = driver.getTitle();


		if (actualResult.contentEquals(expectedResult)) {
			System.out.println("Prueba pasada");
		} else {
			System.out.println("Prueba fallida");
		}

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       }
		public void cerrar() {
			driver.close();;
		}
	
		
		
	
}
