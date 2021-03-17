package pages;

import static org.junit.Assert.assertEquals;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.swing.text.Document;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;

import junit.framework.Assert;

public class Metodos {
	
WebDriver driver;
	
	public void  abrirNavegador(String urlApp, String navegador){
		if(navegador == "CHROME") {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(urlApp);
		driver.manage().window().maximize();
		
		} else if (navegador =="FIREFOX") {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(urlApp);
			driver.manage().window().maximize();
			
			
			
		}
		else {
			System.out.println("Opçâo Invalida, escolha CHROME ou FIREFOX em navegador");
		}
		
	}
	
	public void escrever(By elemneto, String texto) {
		driver.findElement(elemneto).sendKeys(texto);
		
	}
	
	public void clicar (By elemento) {
		driver.findElement(elemento).click();
			
	}
	public void enter(By elemento) {
		driver.findElement(elemento).isSelected();
		driver.findElement(elemento).sendKeys(Keys.ENTER);
	}
	
	public void esperar(int tempo) throws InterruptedException {
		
		Thread.sleep(tempo);
	}
	
	public void fecharNavegador() {
		driver.quit();
	}
	
public void interagirComCombo( By elemento, String texto) {
		
		WebElement element = driver.findElement(elemento);
		org.openqa.selenium.support.ui.Select combo = new org.openqa.selenium.support.ui.Select(element);
		combo.selectByVisibleText(texto);
		
		
	}
	public void focarNoFrame( String frame) {
		
		driver.switchTo().frame(frame);
		
	}
	
	public void movimentarBarra(By elemento, int distancia) {
		
		WebElement slider = driver.findElement(elemento);
		Actions act = new Actions(driver);
		
		//  dragAndDropBy(Arrastar e soltar) é um metodo pronto que vem da classe Actions 
		act.dragAndDropBy(slider, distancia,0).perform();
		
	}
	
	
	public boolean pegarTexto(By elemento, String textoEsperado) {
		            // esse metodo pega o elemento compara se o texto do elemento esta correto de acordo com o texto esperado
		return driver.findElement(elemento).getText().contains(textoEsperado);
		
	}
	
	
// metodo inutilizado
	public void interagiratePicker( By elemento ) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		WebElement datePicker = driver.findElement(elemento);  
	    js.executeScript("document.getElementsById('"+elemento+"').removeAttribute('readonly')", datePicker);
	    //JavascriptExecutor js = (JavascriptExecutor)driver;
	    //js.executeScript("arguments[0].setAttribute('value','"+data+"');", elemento);
			}
	
	
	public void validarTexto(By elemento, String textoEsperado) {
		String texto = driver.findElement(elemento).getText();
		System.out.println("Texto apresentado na tela: "+ texto);
		assertEquals(textoEsperado, texto);
		
	}
	public void ScreenShot(String nome) throws IOException {
		TakesScreenshot srcShot = ((TakesScreenshot)driver);
		
		File SrcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/"+nome+".png");
		FileUtils.copyFile(SrcFile, destFile);
		}
	
	public void ScreenShotErro(String nome) throws IOException {
		TakesScreenshot srcShot = ((TakesScreenshot)driver);
		
		File SrcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/erros/teste Fail "+nome+".png");
		FileUtils.copyFile(SrcFile, destFile);
		}
	
	
	public void zoom (String qtdZoom) {
		((JavascriptExecutor)driver).executeScript("document.body.style.zoom='"+qtdZoom+"'");
		
		
	}
	
	
	
	
	
}
