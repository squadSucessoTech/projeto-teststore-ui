package projeto.teststore.elementos;

import org.openqa.selenium.By;

public class Elementos {
	 
	public By campoUsuario = By.xpath("//input[@name='loginname']");
	public By campoPassword = By.xpath("//input[@name='password']");
	public By btnLogin = By.xpath("//button[@title='Login']");	
	public By msgError = By.xpath("//div[@class='alert alert-error alert-danger']");
	
	

}
