package projeto.teststore.metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import projeto.teststore.drivers.DriversFactory;

public class Metodos extends DriversFactory {

	public void preencher(By elemento, String texto, String passo) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("Erro no passo: " + passo);
			System.out.println("Causa do erro: " + e.getCause());
			System.out.println("Mensagem de erro: " + e.getMessage());
		}

	}

	public void clicar(By elemento, String passo) {
		try {
			driver.findElement(elemento).click();

		} catch (Exception e) {
			System.out.println("Erro no passo: " + passo);
			System.out.println("Causa do erro: " + e.getCause());
			System.out.println("Mensagem de erro: " + e.getMessage());
		}
	}

	public void validarTexto(By elemento, String mensagem, String passo) {
		try {
			driver.findElement(elemento).getText().contains(mensagem);

		} catch (Exception e) {
			System.out.println("Erro no passo: " + passo);
			System.out.println("Causa do erro: " + e.getCause());
			System.out.println("Mensagem de erro: " + e.getMessage());
		}
	}

	public void validarUrl(String url, String passo) {
		try {
			assertEquals(url, driver.getCurrentUrl());

		} catch (Exception e) {
			System.out.println("Erro no passo: " + passo);
			System.out.println("Causa do erro: " + e.getCause());
			System.out.println("Mensagem de erro: " + e.getMessage());
		}

	}
	public void screenShot(String caminhoArquivo) {
	    try {
	        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(screenshot, new File(caminhoArquivo));
	    } catch (Exception e) {
	        System.out.println("Erro ao capturar a tela:");
	        e.printStackTrace();
	    }
		
	}

}
