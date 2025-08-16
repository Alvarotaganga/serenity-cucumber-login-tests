package com.automationexercise2.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automationexercise2.Base;
import com.automationexercise2.Page.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps  {

	
	private WebDriver driver = Base.EdgeConnection();
	private LoginPage loginPage = new LoginPage();
	@Given("que estoy en la pagina de inicio de sesion")
	public void queQuieroEstoyEnLaPaginaDeInicioDeSesion() {
		loginPage.abrirHome();
		if(!loginPage.logoVisible()) {
			throw new AssertionError("La pagina inicio de sesion no es visible actualmente");
		}
		loginPage.irAlLoginRegister();
	}
	
	@When("ingreso mi correo y contraseña validos")
	public void ingresoMiCorreoYContraseñaValidos(String correo,String contraseña) {
		if(loginPage.enLoginPage()) {
			loginPage.digitarUsuarioContraseña(correo, contraseña);
			
		}else {
			throw new AssertionError("No se encuentra en la pagina del login");
		}
	}
	@When("le doy clic en el boton de login")
	public void leDoyClicEnElBotonDeLogin() {
		loginPage.clickLogin();
	}
	@Then("el sistema valida las credenciales y me permite ingresar")
	public void elSistemaValidaLasCredencialesYMePermiteIngresar() {
	    if(loginPage.loginExitoso()) {
	    	loginPage.eliminarCuenta();
	    	if(loginPage.cuentaEliminada()) {
	    		loginPage.clickContinuar();
	    	}else {
	    		throw new AssertionError("No se encontro el mensaje de cuenta eliminada");
	    	}
	    }else {
	    	throw new AssertionError("El mensaje no se encontro el mensaje de login exitoso");
	    }
	}
}
