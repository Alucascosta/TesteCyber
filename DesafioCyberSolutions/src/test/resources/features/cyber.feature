#Author: your.email@your.domain.com

@executa
Feature: Teste Cyber
  Eu como usuario quero validar os desafios do teste da Cyber Solutions
  
  
  @tag1
  Scenario: Preencher formulario do menu de navegacao Register
    Given que eu esteja no "http://demo.automationtesting.in/Register.html"
    When quando preencher o formulario <firstName> <lastName> <endereco> <email> <phone> <sexo> <cricket> <movies> <hockey> <languages> <skills> <country> <selectCountry> <year> <month> <day> <password> <confirmPassword>
    

    Examples: 
      | firstName|lastName  |endereco     |email            |phone        |sexo        |cricket |movies  |hockey|languages   |skills   |country |selectCountry  |year   |month   |day | password |confirmPassword|
      |"José"    |"Fabio"   |"rua teste"  |"teste@teste.com"|"1140003000" |"masculino" |"Sim"   |""      |""    |"Bulgarian" |"Windows"|"Brazil"|"India"        |"1998" |"March" |"1" |"Test123" |"Test123"      |
  		
  
  
  @tag2
  Scenario: Preencher o campo Frame
    Given que eu esteja no "http://demo.automationtesting.in/Frames.html"
    When quando preencher o frame <frame1> 
    
    Examples: 
      | frame1                           |
      |"1º frame preenchido com sucesso" |
  

  
  @tag3
  Scenario: Interagir com Datepicker
    Given que eu esteja no "http://demo.automationtesting.in/Datepicker.html"
    Then entao preencho a data <mesAno> <dia> <dataCompleta>

    Examples: 
      | mesAno      | dia   | dataCompleta  |
      |"July 1998"  |  "4"  | "07/04/1998"  |
    
      
      
       @tag4
  Scenario: Movimentar Barra Slider
    Given que eu esteja no "http://demo.automationtesting.in/Slider.html"
    Then entao Movimento a barra slider <valor1> 

    Examples: 
      |valor1   |
      |350      |
     
