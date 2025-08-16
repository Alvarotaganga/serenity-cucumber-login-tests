package com.automationexercise2.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automationexercise2.Base;

public class LoginPage extends Base {

	private WebDriver driver;
	public static By logoImagenLocator = By.xpath("//img[@src='/static/images/home/logo.png']");
	public static By btnLoginRegisterLocator = By.xpath("//a[text()=' Signup / Login']");
	public static By textLoginLocator = By.xpath("//h2[text()='Login to your account']");
	public static By userLoginLocator = By.xpath("//input[@data-qa='login-email']");
	public static By passLoginLocator = By.xpath("//input[@data-qa='login-password']");
	public static By btnLoginLocator = By.xpath("//button[@data-qa='login-button']");
	public static By msgVerifyLocator = By.xpath("//a[contains(normalize-space(), 'Logged in as Alvaro Mendoza')]");
	public static By btnDeleteLocator = By.xpath("//a[text()=' Delete Account']");
	public static By msgAccountDeleteLocator = By.xpath("//b[text()='Account Deleted!']");
	public static By btnContinueLocator = By.xpath("//a[@data-qa='continue-button']");
	
	
	public void abrirHome() {
		obtenerUrl( driver,"https://automationexercise.com");
	}
	
	public boolean logoVisible() {
		return enPantalla(driver, logoImagenLocator);
	}
	public void irAlLoginRegister() {
		hacerClic(driver, btnLoginRegisterLocator);
	}
	public boolean enLoginPage() {
		return enPantalla(driver,textLoginLocator);
	}
	public void digitarUsuarioContraseña(String usuario,String pass) {
		escribirTexto(driver, userLoginLocator, usuario);
		escribirTexto(driver, passLoginLocator, pass);
	}
	public void clickLogin() {
		hacerClic(driver, btnLoginLocator);
	}
	public boolean loginExitoso() {
		return enPantalla(driver, msgVerifyLocator);
	}
	
	public void eliminarCuenta() {
		hacerClic(driver, btnDeleteLocator);
	}
	public boolean cuentaEliminada() {
		return enPantalla(driver, msgAccountDeleteLocator);
	}
	public void clickContinuar() {
		hacerClic(driver, btnContinueLocator);
	}
}
