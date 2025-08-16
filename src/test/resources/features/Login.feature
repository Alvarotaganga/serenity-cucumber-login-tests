#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Inicio de sesion 
  como usuario previamente registrado
  quiero ingresar a la plataforma
  para acceder a sus beneficios

  @tag1
  Scenario Outline: iniciar seseion exitosamente
    Given que estoy en la pagina de inicio de sesion
    When ingreso mi correo "<correo>" y contraseña "<contrasena>" validos
    And le doy clic en el boton de login
    Then el sistema valida las credenciales y me permite ingresar

 Examples:
 | correo               | contrasena   |
 | alvaro1205@gmail.com | Alvaro123456 |
