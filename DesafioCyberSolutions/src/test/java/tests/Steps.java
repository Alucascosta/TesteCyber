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
	   metodos.esperar(1500);
	   
	}
	
	//Cenario 1
	@When("quando preencher o formulario {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
	public void quando_preencher_o_formulario(String firstName, String lastName, String endereco, String email, String phone, String sexo, String cricket, String movies, String hockey, String languages, String skills, String country, String selectCountry, String year, String month, String day, String password, String confirmPassword) throws InterruptedException {
	        
		metodos.escrever(elementos.campoFirstName, firstName);
		metodos.escrever(elementos.campoLastName, lastName);
		metodos.escrever(elementos.campoEndereco, endereco);
		metodos.escrever(elementos.campoEmail, email);
		metodos.escrever(elementos.campoPhone, phone);
		
		switch (sexo) {
		case "masculino":
			metodos.clicar(elementos.radioMale);
			break;

		case"feminino":
			metodos.clicar(elementos.radioFemale);
			break;
		}
		switch (cricket) {
		case "Sim":
			metodos.clicar(elementos.checkboxCricket);
			metodos.esperar(200);
			break;

		}
		switch (movies) {
		case "Sim":
			metodos.clicar(elementos.checkboxMovies);
			metodos.esperar(200);
			break;

		}
		switch (hockey) {
		case "Sim":
			metodos.clicar(elementos.checkboxHockey);
			metodos.esperar(200);
			break;
		}
		
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
		
		
		metodos.clicar(elementos.skills);
		metodos.interagirComCombo(elementos.skills, skills);
		
		metodos.clicar(elementos.country);
		metodos.interagirComCombo(elementos.country, country);
		
		metodos.clicar(elementos.selectCountry);
		metodos.escrever(elementos.selectCountry, selectCountry);
		metodos.enter(elementos.selectCountry);
		
		metodos.clicar(elementos.year);
		metodos.interagirComCombo(elementos.year, year);
		
		metodos.clicar(elementos.month);
		metodos.interagirComCombo(elementos.month, month);
		
		metodos.clicar(elementos.day);
		metodos.interagirComCombo(elementos.day, day);
		
		metodos.escrever(elementos.password, password);
		metodos.escrever(elementos.comfirmPassword, confirmPassword);
		
		metodos.clicar(elementos.btnSubmit);
		
		
		
		
		
		
	}
	
	
	
	
	//cenario 2
	@When("quando preencher o frame {string}")
	public void quando_preencher_o_frame(String frame1) throws InterruptedException {
	    
		metodos.focarNoFrame("singleframe");
		metodos.esperar(1000);
		metodos.escrever(elementos.frameSendKeys, frame1);
	}
	
	
	//cenario 3
	@Then("entao preencho a data {string} {string} {string}")
	public void entao_preencho_a_data(String mesAno, String dia, String dataCompleta) throws InterruptedException {
		
		metodos.clicar(elementos.datePicker1);
		metodos.esperar(1000);
		
		while (!metodos.pegarTexto(elementos.datePickerMes, mesAno)) {
			
			metodos.clicar(elementos.datePickerbtnAnterior);
			
		}
		
		switch (dia) {
			case "4":
			elementos.equals(dia);
			metodos.clicar(elementos.dia4);
			break;
		
			case "5":
			metodos.clicar(elementos.dia5);
			break;
		
	
		}
		 
		metodos.escrever(elementos.datePicker2, dataCompleta);
		metodos.enter(elementos.datePicker2);
	}

	//cenario 4
	@Then("entao Movimento a barra slider {int}")
	public void entao_movimento_a_barra_slider(Integer valor1) {
		//obs  70 = 10%, 350 = 50%
	    metodos.movimentarBarra(elementos.slider, valor1 );
	}

	
		
	
}

	
