package projeto.teststore.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import projeto.teststore.pages.LoginPage;
import projeto.teststore.runner.Executa;
import projeto.teststore.utils.TestData;

public class LoginSteps {

	LoginPage page = new LoginPage();

	TestData td = new TestData();

	@Given("que acesse a aba login")
	public void queAcesseAAbaLogin() {
		Executa.iniciarTest();
	}

	@When("preencher usuario valido")
	public void preencherUsuarioValido() {
		page.preencherUsuario(td.loginNameValido);
	}

	@When("preencher a senha valida")
	public void preencherASenhaValida() {
		page.preencherPassword(td.senhaValida);
	}

	@Then("login efetuado com sucesso")
	public void loginEfetuadoComSucesso() {
		page.validarUrl(td.urllogado);
		page.evidencias(td.caminhoArquivo + "/loginSucesso.png");
		Executa.encerrarTest();
	}

	@When("nao preencher os campos obrigatorio")
	public void naoPreencherOsCamposObrigatorio() {

	}

	@When("preencher usuario incorreto")
	public void preencherUsuarioIncorreto() {
		page.preencherUsuario(td.massaInvalida);
	}

	@When("preencher senha incorreta")
	public void preencherSenhaIncorreta() {
		page.preencherPassword(td.massaInvalida);
	}

	@When("clicar no botao login")
	public void clicarNoBotaoLogin() {
		page.clicarBtn();
	}

	@Then("mensagem de erro em branco")
	public void mensagemDeErroEmBranco() {
		page.validarMsgError(td.mensagemErro);
		page.evidencias(td.caminhoArquivo + "/dadosBranco.png");
		Executa.encerrarTest();
	}

	@Then("mensagem de erro invalido")
	public void mensagemDeErroInvalido() {
		page.validarMsgError(td.mensagemErro);
		page.evidencias(td.caminhoArquivo + "/dadosIncorretos.png");
		Executa.encerrarTest();
	}

}