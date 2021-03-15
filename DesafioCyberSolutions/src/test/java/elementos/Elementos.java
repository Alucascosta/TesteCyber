package elementos;

import org.openqa.selenium.By;

import pages.Metodos;
import tests.Steps;

public class Elementos {

	String texto;
	
	// elementos cenario 1
	public By campoFirstName = By.cssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(2) > input");
	public By campoLastName = By.cssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(3) > input");
	public By campoEndereco = By.cssSelector("#basicBootstrapForm > div:nth-child(2) > div > textarea");
	public By campoEmail = By.cssSelector("#eid > input");
	public By campoPhone = By.cssSelector("#basicBootstrapForm > div:nth-child(4) > div > input");
	public By radioMale = By.cssSelector("#basicBootstrapForm > div:nth-child(5) > div > label:nth-child(1) > input");
	public By radioFemale = By.cssSelector("#basicBootstrapForm > div:nth-child(5) > div > label:nth-child(2) > input");
	public By checkboxCricket = By.id("checkbox1");
	public By checkboxMovies = By.id("checkbox2");
	public By checkboxHockey = By.id("checkbox3");
	public By languagesArabic = By.linkText("Arabic"); 
	public By languagesBulgarian = By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[7]/div[1]/multi-select[1]/div[2]/ul[1]/li[2]");
	public By clickAleatorio = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[6]");
	public By languagesOpen = By.id("msdd");
	public By skills = By.id("Skills");
	public By country =  By.id("countries");
	public By selectCountry = By.cssSelector("#basicBootstrapForm > div:nth-child(10) > div > span > span.selection > span");
	public By year = By.id("yearbox");
	public By month = By.cssSelector("#basicBootstrapForm > div:nth-child(11) > div:nth-child(3) > select");
	public By day = By.id("daybox");
	public By password = By.id("firstpassword");
	public By comfirmPassword = By.id("secondpassword");
    public By btnSubmit = By.id("submitbtn");
	
	
	// elementos cenario 2
    public By frame = By.id("singleframe");
    public By frameSendKeys = By.xpath("/html/body/section/div/div/div/input");
	

	//elementos cenario 3
    //datepicker1
	public By datePicker1 = By.id("datepicker1");
	public By datePickerMes = org.openqa.selenium.By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]");
	public By datePickerbtnAnterior = org.openqa.selenium.By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/a[1]");
	public By dia4 = By.linkText("4");
	public By dia5 = By.linkText("5");
	
	//datepicker 2
	public By datePicker2 = By.id("datepicker2");
	
	
	//elementos cenario 4
	public By slider = By.xpath("//*[@id=\"slider\"]/a");

}
