package projeto.teststore.pages;

import projeto.teststore.elementos.Elementos;
import projeto.teststore.metodos.Metodos;

public class LoginPage {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	public void preencherUsuario(String texto) {
		metodo.preencher(el.campoUsuario, texto, "Preencher usuario ");
	}

	public void preencherPassword(String texto) {
		metodo.preencher(el.campoPassword, texto, "preencher senha");
	}

	public void clicarBtn() {
		metodo.clicar(el.btnLogin, "clicar botao login");
	}

	public void validarMsgError(String texto) {
		metodo.validarTexto(el.msgError, texto, "validando mensagem de erro");
	}

	public void validarUrl(String url) {
		metodo.validarUrl(url, "Validando URL.");
		
	}
	public void evidencias(String caminhoArquivo) {
		metodo.screenShot(caminhoArquivo);
		
	}
}
