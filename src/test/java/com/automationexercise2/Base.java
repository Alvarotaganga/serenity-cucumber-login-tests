package com.automationexercise2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	
	public static WebDriver EdgeConnection() {
		System.setProperty("webdriver.edge.driver", "./src/test/resources/edgedriver/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public static WebElement seleccionarlocalizador(WebDriver driver,By locator) {
		return driver.findElement(locator);
	}
	
	public static List<WebElement> seleccionarListaLocalizadores(WebDriver driver,By locator){
		return driver.findElements(locator);
	}
	
	public static void hacerClic(WebDriver driver,By locator) {
		seleccionarlocalizador(driver, locator).click();;
	}
	
	public static void escribirTexto(WebDriver driver,By locator,String texto) {
		WebElement elemento = seleccionarlocalizador(driver, locator);
		elemento.clear();
		elemento.sendKeys(texto);
	}
	
	public static String obtenerTexto(WebDriver driver, By locator) {
		return seleccionarlocalizador(driver, locator).getText();
	}
	
	public static void esperarHastaElementoVisible(WebDriver driver,By locator,int segundos) {
		WebDriverWait tiempoEspera = new WebDriverWait(driver, Duration.ofSeconds(segundos));
		tiempoEspera.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static void obtenerUrl(WebDriver driver,String url) {
		driver.get(url);
	}
	
	public static boolean enPantalla(WebDriver driver,By locator) {
		try {
			return seleccionarlocalizador(driver,locator).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
}
