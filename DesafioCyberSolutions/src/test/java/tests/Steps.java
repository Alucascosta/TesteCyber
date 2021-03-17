package tests;

import java.text.spi.DateFormatProvider;
import java.util.List;

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
	public void quando_preencher_o_formulario(String firstName, String lastName, String endereco, String email, String phone, String sexo, String cricket, String movies, String hockey, String languages, String skills, String country, String selectCountry, String year, String month, String day, String password, String confirmPassword) throws InterruptedException {
	        
		 
		try {
			metodos.escrever(elementos.campoFirstName, firstName);
			
		} catch (Exception e) {
			System.out.println("Houve um erro no campo First Name: "+ e);	
			metodos.fecharNavegador();
		}
		
		try {
			metodos.escrever(elementos.campoLastName, lastName);
			
		} catch (Exception e) {
			System.out.println("Houve um erro no campo Last Name: "+ e);
			metodos.fecharNavegador();
		}
		
		try {
			metodos.escrever(elementos.campoEndereco, endereco);
			
		} catch (Exception e) {
			System.out.println("Houve um erro no campo Endereco: "+ e);	
			metodos.fecharNavegador();
		}
		
		try {
			metodos.escrever(elementos.campoEmail, email);
			
		} catch (Exception e) {
			System.out.println("Houve um erro no campo Email: "+ e);	
			metodos.fecharNavegador();
		}
		
		try {
			metodos.escrever(elementos.campoPhone, phone);
			
		} catch (Exception e) {
			System.out.println("Houve um erro no campo Telefone: "+ e);	
			metodos.fecharNavegador();
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
			metodos.fecharNavegador();
			
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
			metodos.fecharNavegador();
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
			metodos.fecharNavegador();
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
			metodos.fecharNavegador();
		}
		
		try {
			switch (languages) {
			case"Bulgarian":
				metodos.clicar(elementos.languagesOpen);
				metodos.esperar(1000);
				metodos.clicar(elementos.languagesBulgarian);
				metodos.esperar(1000);
				metodos.clicar(elementos.clickAleatorio);
				break;
			case "Arabic":
				metodos.clicar(elementos.languagesOpen);
				metodos.esperar(1000);
				metodos.clicar(elementos.languagesArabic);
				metodos.esperar(1000);
				metodos.clicar(elementos.clickAleatorio);
				break;
			}
		} catch (Exception e) {
			System.out.println("Houve um erro no Combo Languages: "+ e);
			metodos.fecharNavegador();
		}
		
		try {
			metodos.clicar(elementos.skills);
			metodos.interagirComCombo(elementos.skills, skills);
			
		} catch (Exception e) {
			System.out.println("Houve um erro no Combo Skills: "+ e);
			metodos.fecharNavegador();
		}
		
		try {
			metodos.clicar(elementos.country);
			metodos.interagirComCombo(elementos.country, country);
			
		} catch (Exception e) {
			System.out.println("Houve um erro no Combo country: "+ e);
			metodos.fecharNavegador();
		}
		
		try {
			metodos.clicar(elementos.selectCountry);
			metodos.escrever(elementos.campoSelectCountry, selectCountry);
			metodos.enter(elementos.selectCountry);
			
		} catch (Exception e) {
			System.out.println("Houve um erro no Combo selectCountry: "+ e);
			metodos.fecharNavegador();
		}
		
		try {
			metodos.clicar(elementos.year);
			metodos.interagirComCombo(elementos.year, year);
			
		} catch (Exception e) {
			System.out.println("Houve um erro no Combo year: "+ e);
			metodos.fecharNavegador();
		}
		
		try {
			metodos.clicar(elementos.month);
			metodos.interagirComCombo(elementos.month, month);
			
		} catch (Exception e) {
			System.out.println("Houve um erro no Combo month: "+ e);
			metodos.fecharNavegador();
		}
		
		try {
			metodos.clicar(elementos.day);
			metodos.interagirComCombo(elementos.day, day);
			
		} catch (Exception e) {
			System.out.println("Houve um erro no Combo day: "+ e);
			metodos.fecharNavegador();
		}
		
		try {
			metodos.escrever(elementos.password, password);
			
		} catch (Exception e) {
			System.out.println("Houve um erro ao tentar escrever no campo passWord: "+ e);
			metodos.fecharNavegador();
		}
		
		try {
			metodos.escrever(elementos.comfirmPassword, confirmPassword);
			
		} catch (Exception e) {
			System.out.println("Houve um erro ao tentar escrever no campo confirmPassword: "+ e);
			metodos.fecharNavegador();
		}
		
		try {
			
			metodos.clicar(elementos.btnSubmit);
			metodos.zoom("67%");
			
			
		} catch (Exception e) {
			System.out.println("Houve um erro ao tentar clicar no btnSubmit: "+ e);
			metodos.fecharNavegador();
		}
		try {
			metodos.ScreenShot(firstName);
		} catch (Exception e) {
			System.out.println("Nao foi possivel tirar o screenShoot, é provavel que o nome do arquivo gerado tenha algum caractere invalido" + e);
			metodos.fecharNavegador();
		}	
			
	}
	
	//cenario 2
	@When("quando preencher o frame {string}")
	public void quando_preencher_o_frame(String frame1) throws InterruptedException {
	    
		try {
			metodos.focarNoFrame("singleframe");
		} catch (Exception e) {
			System.out.println("Houve um erro ao tentar focar no frame: " + e);
		}
		
		try {
			metodos.esperar(1000);
			metodos.escrever(elementos.frameSendKeys, frame1);
			
		} catch (Exception e) {
			System.out.println("Houve um erro ao tentar escrever no frame focado: " + e);
		}
		try {
			metodos.ScreenShot(frame1);
		} catch (Exception e) {
			System.out.println("Nao foi possivel tirar o screenShoot, é provavel que o nome do arquivo gerado tenha algum caractere invalido" + e);
		}
		
	}
	
	
	//cenario 3
	@Then("entao preencho a data {string} {string} {string}")
	public void entao_preencho_a_data(String mesAno, String dia, String dataCompleta) throws InterruptedException {
		
		try {
			metodos.clicar(elementos.datePicker1);
			metodos.esperar(1000);
		} catch (Exception e) {
			System.out.println("houve um erro ao tentar clicar no primeiro campo de data" + e);
			metodos.fecharNavegador();
		}
		try {
			while (!metodos.pegarTexto(elementos.datePickerMes, mesAno)) {
				
				metodos.clicar(elementos.datePickerbtnAnterior);
				
			}
			
		} catch (Exception e) {
			System.out.println("houve um erro ao tentar procurar o mes e ano esperado: " + e);
			metodos.fecharNavegador();
			
		}
		
		try {
			switch (dia) {
			case "4":
			//elementos.equals(dia);
			metodos.clicar(elementos.dia4);
			break;
		
			case "5":
			metodos.clicar(elementos.dia5);
			break;
		}
			
		} catch (Exception e) {
			System.out.println("Houve um erro ao tentar clicar no dia esperado: "+ e);
			metodos.fecharNavegador();
		}
		
		try {
			metodos.escrever(elementos.datePicker2, dataCompleta);
			metodos.enter(elementos.datePicker2);
		} catch (Exception e) {
			System.out.println("houve um erro ao tentar escrever no segundo campo de data: "+ e);
			metodos.fecharNavegador();
		}
		
		try {
			metodos.ScreenShot(mesAno);
		} catch (Exception e) {
			System.out.println("Nao foi possivel tirar o screenShoot, é provavel que o nome do arquivo gerado tenha algum caractere invalido" + e);
			metodos.fecharNavegador();
		}	
			
	}

	//cenario 4
	@Then("entao Movimento a barra slider {int}")
	public void entao_movimento_a_barra_slider(Integer valor1) {
		//obs  70 = 10%, 350 = 50%
		
		try {
			 metodos.movimentarBarra(elementos.slider, valor1 );
			
		} catch (Exception e) {
			System.out.println("Houve um erro ao tentar movimentar a barra Slier: "+ e);
			metodos.fecharNavegador();
		}
		try {
			metodos.ScreenShot(valor1.toString());
		} catch (Exception e) {
			System.out.println("Nao foi possivel tirar o screenShoot, é provavel que o nome do arquivo gerado tenha algum caractere invalido" + e);
			metodos.fecharNavegador();
		}
	   
	}

	
		
	
}

	
