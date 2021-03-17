package tests;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.text.spi.DateFormatProvider;
import java.util.List;

import org.junit.internal.runners.statements.Fail;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {
	
	Metodos metodos = new Metodos();
	Elementos elementos = new Elementos();
	WebDriver driver;
	
	// engloba todos os cenarios
	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String url) throws InterruptedException {
		
	   metodos.abrirNavegador(url, "CHROME");
	   metodos.esperar(500);
	  
	   
	}
	
	//Cenario 1
	@When("quando preencher o formulario {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
	public void quando_preencher_o_formulario(String firstName, String lastName, String endereco, String email, String phone, String sexo, String cricket, String movies, String hockey, String languages, String skills, String country, String selectCountry, String year, String month, String day, String password, String confirmPassword) throws InterruptedException, IOException {
	        
		 
		try {
			metodos.escrever(elementos.campoFirstName, firstName);
			
		} catch (Exception e) {
			System.out.println("Houve um erro no campo First Name: "+ e);
			metodos.zoom("67%");
			metodos.ScreenShotErro("erro encontrado no campo first name "+firstName);
			metodos.fecharNavegador();
			fail();
		}
		
		try {
			metodos.escrever(elementos.campoLastName, lastName);
			
		} catch (Exception e) {
			System.out.println("Houve um erro no campo Last Name: "+ e);
			metodos.zoom("67%");
			metodos.ScreenShotErro("erro encontrado no campo Last Name "+ lastName);
			metodos.fecharNavegador();
			fail();
		}
		
		try {
			metodos.escrever(elementos.campoEndereco, endereco);
			
		} catch (Exception e) {
			System.out.println("Houve um erro no campo Endereco: "+ e);	
			metodos.zoom("67%");
			metodos.ScreenShotErro("erro encontrado no campo endereco "+ endereco);
			metodos.fecharNavegador();
			fail();
		}
		
		try {
			metodos.escrever(elementos.campoEmail, email);
			
		} catch (Exception e) {
			System.out.println("Houve um erro no campo Email: "+ e);
			metodos.zoom("67%");
			metodos.ScreenShotErro("erro encontrado no campo email "+ email);
			metodos.fecharNavegador();
			fail();
		}
		
		try {
			metodos.escrever(elementos.campoPhone, phone);
			
		} catch (Exception e) {
			System.out.println("Houve um erro no campo Telefone: "+ e);	
			metodos.zoom("67%");
			metodos.ScreenShotErro("erro encontrado no campo Last Name "+ phone);
			metodos.fecharNavegador();
			fail();
		}
		
		try {
			metodos.esperar(500);
			switch (sexo) {
			case "masculino":
				metodos.clicar(elementos.radioMale);
				break;

			case"feminino":
				metodos.clicar(elementos.radioFemale);
				break;
			}
			
		} catch (Exception e) {
			System.out.println("Houve um erro no radio Sexo: "+ e);	
			metodos.zoom("67%");
			metodos.ScreenShotErro("erro encontrado no radio sexo "+ sexo);
			metodos.fecharNavegador();
			fail();
			
		}
		try {
			switch (cricket) {
			case "Sim":
				metodos.clicar(elementos.checkboxCricket);
				metodos.esperar(200);
				break;

			}
			
		} catch (Exception e) {
			System.out.println("Houve um erro no Checkbox cricket: "+ e);	
			metodos.zoom("67%");
			metodos.ScreenShotErro("erro encontrado no CheckBox cricket");
			metodos.fecharNavegador();
			fail();
		}
		
		try {
			switch (movies) {
			case "Sim":
				metodos.clicar(elementos.checkboxMovies);
				metodos.esperar(200);
				break;

			}
			
		} catch (Exception e) {
			System.out.println("Houve um erro no Checkbox movies: "+ e);
			metodos.zoom("67%");
			metodos.ScreenShotErro("erro encontrado no Checkbox movies ");
			metodos.fecharNavegador();
			fail();
		}
	
		try {
			switch (hockey) {
			case "Sim":
				metodos.clicar(elementos.checkboxHockey);
				metodos.esperar(200);
				break;
			}
		} catch (Exception e) {
			System.out.println("Houve um erro no Checkbox hockey: "+ e);	
			metodos.zoom("67%");
			metodos.ScreenShotErro("erro encontrado no Checkbox hockey ");
			metodos.fecharNavegador();
			fail();
		}
		metodos.esperar(1000);
		
		try {
			
			switch (languages) {
			
			case"Bulgarian":
				
				try {
				metodos.clicar(elementos.languagesOpen);
				metodos.esperar(1000);
				metodos.clicar(elementos.languagesBulgarian);
				metodos.esperar(1000);
				metodos.clicar(elementos.clickAleatorio);
				break;
					
				} catch (Exception e) {
					System.out.println("o erro foi encontrado ao tentar selecionar Bulgarian: " + e);
					metodos.zoom("67%");
					metodos.ScreenShotErro(" erro encontrado no campo languages "+languages);
					metodos.fecharNavegador();
					fail();
				}
				
			case "Arabic":
				try {
					metodos.clicar(elementos.languagesOpen);
					metodos.esperar(1000);
					metodos.clicar(elementos.languagesArabic);
					metodos.esperar(1000);
					metodos.clicar(elementos.clickAleatorio);
					break;
					
				} catch (Exception e) {
					System.out.println("o erro foi encontrado ao tentar selecionar Arabic: " + e);
					metodos.zoom("67%");
					metodos.ScreenShotErro(" erro encontrado no campo languages "+languages);
					metodos.fecharNavegador();
					fail();
				}
				
			}
		} catch (Exception e) {
			System.out.println("Houve um erro no Combo Languages: "+ e);
			metodos.zoom("67%");
			metodos.ScreenShotErro(" erro encontrado ao clicar no combo languages ");
			metodos.fecharNavegador();
			fail();
		}
		
		try {
			metodos.clicar(elementos.skills);
			metodos.interagirComCombo(elementos.skills, skills);
			
		} catch (Exception e) {
			System.out.println("Houve um erro no Combo Skills: "+ e);
			metodos.zoom("67%");
			metodos.ScreenShotErro(" erro encontrado no combo skilss "+skills);
			metodos.fecharNavegador();
			fail();
		}
		
		try {
			metodos.clicar(elementos.country);
			metodos.interagirComCombo(elementos.country, country);
			
		} catch (Exception e) {
			System.out.println("Houve um erro no Combo country: "+ e);
			metodos.zoom("67%");
			metodos.ScreenShotErro(" erro encontrado no combo country "+country);
			metodos.fecharNavegador();
			fail();
		}
		
		try {
			metodos.clicar(elementos.selectCountry);
			metodos.escrever(elementos.campoSelectCountry, selectCountry);
			metodos.enter(elementos.selectCountry);
			
		} catch (Exception e) {
			System.out.println("Houve um erro no Combo selectCountry: "+ e);
			metodos.zoom("67%");
			metodos.ScreenShotErro(" erro encontrado no combo selectCountry "+selectCountry);
			metodos.fecharNavegador();
			fail();
		}
		
		try {
			metodos.clicar(elementos.year);
			metodos.interagirComCombo(elementos.year, year);
			
		} catch (Exception e) {
			System.out.println("Houve um erro no Combo year: "+ e);
			metodos.zoom("67%");
			metodos.ScreenShotErro(" erro encontrado no combo Year "+year);
			metodos.fecharNavegador();
			fail();
		}
		
		try {
			metodos.clicar(elementos.month);
			metodos.interagirComCombo(elementos.month, month);
			
		} catch (Exception e) {
			System.out.println("Houve um erro no Combo month: "+ e);
			metodos.zoom("67%");
			metodos.ScreenShotErro(" erro encontrado no combo Month "+month);
			metodos.fecharNavegador();
			fail();
		}
		
		try {
			metodos.clicar(elementos.day);
			metodos.interagirComCombo(elementos.day, day);
			
		} catch (Exception e) {
			System.out.println("Houve um erro no Combo day: "+ e);
			metodos.zoom("67%");
			metodos.ScreenShotErro(" erro encontrado no combo Day "+day);
			metodos.fecharNavegador();
			fail();
		}
		
		try {
			metodos.escrever(elementos.password, password);
			
		} catch (Exception e) {
			System.out.println("Houve um erro ao tentar escrever no campo passWord: "+ e);
			metodos.zoom("67%");
			metodos.ScreenShotErro(" erro encontrado no campo passWord "+password);
			metodos.fecharNavegador();
			fail();
		}
		
		try {
			metodos.escrever(elementos.comfirmPassword, confirmPassword);
			
		} catch (Exception e) {
			System.out.println("Houve um erro ao tentar escrever no campo confirmPassword: "+ e);
			metodos.zoom("67%");
			metodos.ScreenShotErro(" erro encontrado no combo comfirmPassWord "+confirmPassword);
			metodos.fecharNavegador();
			fail();
		}
		
		try {
			
			metodos.clicar(elementos.btnSubmit);
			
			
			
		} catch (Exception e) {
			System.out.println("Houve um erro ao tentar clicar no btnSubmit: "+ e);
			metodos.zoom("67%");
			metodos.ScreenShotErro(" erro encontrado ao clicar no btnSubmit");
			metodos.fecharNavegador();
			fail();
		}
		try {
			metodos.zoom("67%");
			metodos.esperar(500);
			metodos.ScreenShot(firstName);
			metodos.fecharNavegador();
			//teste passou
			
		} 
		catch (Exception e) {
			System.out.println("Nao foi possivel tirar o screenShoot, é provavel que o nome do arquivo gerado tenha algum caractere invalido" + e);
			metodos.ScreenShotErro("erro encontrado ao tentar tirar screenshot do teste que passou nome arquivo errado");
			metodos.fecharNavegador();
			fail();
			// teste nao passou
		}	
			
	}
	
	//cenario 2
	@When("quando preencher o frame {string}")
	public void quando_preencher_o_frame(String frame1) throws InterruptedException, IOException {
	    
		try {
			metodos.focarNoFrame("singleframe");
		} 
		catch (Exception e) {
			System.out.println("Houve um erro ao tentar focar no frame: " + e);
			metodos.ScreenShotErro(" erro encontrado ao tentar focar no frame 1");
			metodos.fecharNavegador();
			fail();
		}
		
		try {
			metodos.esperar(1000);
			metodos.escrever(elementos.frameSendKeys, frame1);
			
		} catch (Exception e) {
			System.out.println("Houve um erro ao tentar escrever no frame focado: " + e);
			metodos.ScreenShotErro(" erro encontrado ao tentar escrever no frame focado");
			metodos.fecharNavegador();
			fail();
		}
		try {
			metodos.ScreenShot(frame1);
			metodos.fecharNavegador();
			//teste passou
			
		} catch (Exception e) {
			System.out.println("Nao foi possivel tirar o screenShoot, é provavel que o nome do arquivo gerado tenha algum caractere invalido" + e);
			metodos.ScreenShotErro("erro encontrado ao tentar tirar screenshot do teste que passou nome arquivo errado");
			metodos.fecharNavegador();
			fail();
			//teste nao passou
		}
		
	}
	
	
	//cenario 3
	@Then("entao preencho a data {string} {string} {string}")
	public void entao_preencho_a_data(String mesAno, String dia, String dataCompleta) throws InterruptedException, IOException {
		
		try {
			metodos.clicar(elementos.datePicker1);
			metodos.esperar(1000);
		} catch (Exception e) {
			System.out.println("houve um erro ao tentar clicar no primeiro campo de data" + e);
			metodos.ScreenShotErro(" erro encontrado ao clicar primeiro campo de data");
			metodos.fecharNavegador();
			fail();
		}
		try {
			while (!metodos.pegarTexto(elementos.datePickerMes, mesAno)) {
				
				metodos.clicar(elementos.datePickerbtnAnterior);
				
			}
			
		} catch (Exception e) {
			System.out.println("houve um erro ao tentar procurar o mes e ano esperado: " + e);
			metodos.ScreenShotErro(" erro encontrado ao tentar procurar o mes e ano esperado"+ mesAno);
			metodos.fecharNavegador();
			fail();
			
		}
		
		try {
			switch (dia) {
			case "4":
			metodos.clicar(elementos.dia4);
			break;
		
			case "5":
			metodos.clicar(elementos.dia5);
			break;
		}
			
		} catch (Exception e) {
			System.out.println("Houve um erro ao tentar clicar no dia esperado: "+ e);
			metodos.ScreenShotErro(" erro encontrado ao tentar clicar no dia esperado" + dia);
			metodos.fecharNavegador();
			fail();
		}
		
		try {
			metodos.escrever(elementos.datePicker2, dataCompleta);
			metodos.enter(elementos.datePicker2);
		} catch (Exception e) {
			System.out.println("houve um erro ao tentar escrever no segundo campo de data: "+ e);
			metodos.ScreenShotErro(" erro encontrado ao tentar escrever no segundo campo de data");
			metodos.fecharNavegador();
			fail();
		}
		
		try {
			
			metodos.ScreenShot(mesAno);
			metodos.fecharNavegador();
			//teste passou
			
		} catch (Exception e) {
			System.out.println("Nao foi possivel tirar o screenShoot, é provavel que o nome do arquivo gerado tenha algum caractere invalido" + e);
			metodos.ScreenShotErro("erro encontrado ao tentar tirar screenshot do teste que passou nome arquivo errado");
			metodos.fecharNavegador();
			fail();
			//teste nao passou
		}	
			
	}

	//cenario 4
	@Then("entao Movimento a barra slider {int}")
	public void entao_movimento_a_barra_slider(Integer valor1) throws IOException {
		//obs  70 = 10%, 350 = 50%
		
		try {
			 metodos.movimentarBarra(elementos.slider, valor1 );
			
		} catch (Exception e) {
			System.out.println("Houve um erro ao tentar movimentar a barra Slier: "+ e);
			metodos.ScreenShotErro("erro encontrado ao tentar movimentar barra slider" + valor1);
			metodos.fecharNavegador();
			fail();
		}
		try {
			metodos.ScreenShot(valor1.toString());
			metodos.fecharNavegador();
			//teste passou
			
		} catch (Exception e) {
			System.out.println("Nao foi possivel tirar o screenShoot, é provavel que o nome do arquivo gerado tenha algum caractere invalido" + e);
			metodos.ScreenShotErro("erro encontrado ao tentar tirar screenshot do teste que passou nome arquivo errado");
			metodos.fecharNavegador();
			fail();
			//teste nao passou
		}
	   
	}

	
		
	
}

	
