@regressivos
Feature: login
  Como Usuario 
  Quero efetuar login 
  Para  utilizar o servico do site 

  Background: Acessar a aba de login
  Given que acesse a aba login
    
  
  	Scenario: login com sucesso 
    When  preencher usuario valido 
    And preencher a senha valida 
    And clicar no botao login
    Then  login efetuado com sucesso
    
    Scenario: login dados em branco
    When nao preencher os campos obrigatorio
    And clicar no botao login
    Then mensagem de erro em branco
    
    Scenario: login dados invalidos
    When preencher usuario incorreto
    And preencher senha incorreta 
    And clicar no botao login
    Then mensagem de erro invalido
    
 