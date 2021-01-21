package br.com.webmotors.step_definitions;

import br.com.webmotors.pages.SearchCarsPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class SearchCarsSteps{

    private DriverFactory driverFactory = new DriverFactory();
    private SearchCarsPage searchCarsPage;

    @Before
    public void setUp() throws Exception {
    }

    @Dado("que tenho estou na tela de pesquisa de carros")
    public void acessarTelaPesquisa() throws Exception {
        searchCarsPage = new SearchCarsPage(driverFactory.driver);
        searchCarsPage.acesarTelaPesquisa();
    }
    @Dado("que tenho estou na tela de estoque de uma loja")
    public void queTenhoEstouNaTelaDeEstoqueDeUmaLoja() {
        searchCarsPage = new SearchCarsPage(driverFactory.driver);
        searchCarsPage.acesarTelaEstoqueLoja();
    }

    @Quando("pesquiso o carro por {string} {string} {string}")
    public void pesquisarCarro(String marca, String modelo, String versao) throws InterruptedException {
        searchCarsPage.pesquisaCarro(marca,modelo,versao);
    }

    @Então("devo visualizar a lista de carros pesquisados por {string} {string} {string}")
    public void validarListaCarros(String marca, String modelo, String versao){
        Assert.assertTrue(searchCarsPage.validaCarros(marca,modelo,versao));
    }

    @After
    public void afterClass() throws Exception {

    }
}
