package br.com.dimensa.consignado;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import br.com.dimensa.consignado.GeraCNPJ;


public class ConsignadoPageObject {

    GeraCNPJ novoCNPJ = new GeraCNPJ();

    Random random = new Random();

    int radomNumber = random.nextInt(9);

    private static final String URL_LOGIN = "http://10.51.2.25:8080/portal-consignado-web/";
    private static final String URL_COREBANKJOSSO = "http://vrotsqa:8080/jsp_login";


    private WebDriver driver;


    public ConsignadoPageObject() {
        System.setProperty("webdriver.Chrome.driver", "src\\driver\\chromedriver.exe");
        ChromeDriverService service = new ChromeDriverService.Builder()

                .usingDriverExecutable(new File("src\\driver\\chromedriver.exe"))

                .usingAnyFreePort()

                .build();

        try {
            service.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.driver = new ChromeDriver(service);
        this.driver.navigate().to(URL_LOGIN);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));

    }




    @Step("Login")
    public void loginSenha(String login, String senha) throws InterruptedException {
        driver.findElement(By.id("username")).sendKeys(login);
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys(senha);
       // WebElement search = driver.findElement(By.xpath("/html/body/div[2]/form/div/button"));
        //search.click();
        Thread.sleep(700);
        screenshot();
    }

    @Step("Botão Search")
    public void btnLoginSearch() throws InterruptedException {
        WebElement search = driver.findElement(By.id("kc-login"));
        search.click();
        Thread.sleep(500);
        screenshot();
    }
   // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(35));
    @Step("Menú Consignado")
    public void menuConsignado() throws InterruptedException {
        //Thread.sleep(25000);

        WebElement bank = driver.findElement(By.xpath("/html/body/div[3]/div/ul/div/div[1]/div/div[2]"));
        bank.click();
        Thread.sleep(1000);
        screenshot();
    }

    @Step("Menu Abrangência")
    public void menuAbrangencia() throws InterruptedException {

        WebElement empresa = driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/form/div[1]/div/div/div/a"));
        empresa.click();
        Thread.sleep(900);
        empresa.sendKeys("FINANCEIRA BECKER S.A");
        Thread.sleep(900);
        WebElement financeira = driver.findElement(By.xpath("/html/body/div[8]/ul/li"));
        financeira.click();
        Thread.sleep(1000);
        WebElement unidade = driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/form/div[2]/div/div/div/a"));
        unidade.click();
        unidade.sendKeys("MATRIZ");
        Thread.sleep(1100);
        WebElement matriz = driver.findElement(By.xpath("/html/body/div[9]/ul/li[1]"));
        matriz.click();

        Thread.sleep(1500);
        screenshot();
    }

    @Step("Botão Confirmar")
    public void btnConfimar() throws InterruptedException {
        Thread.sleep(200);
        WebElement btnConfirmar = driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/form/div[3]/div/div/button[2]"));
        btnConfirmar.click();
        Thread.sleep(2000);
        screenshot();
        //return new BackOfficePageObject(driver);

    }

    @Step("Botão opções")
    public void btnOptions() throws InterruptedException {
        Thread.sleep(6000);
        WebElement search = driver.findElement(By.xpath("/html/body/div[3]/div/div/button[2]"));
        search.click();
        Thread.sleep(500);

        WebElement consig = driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li"));
        consig.click();
        Thread.sleep(500);
        screenshot();
    }

    @Step("Menú Parâmetros")
    public void menuParametros() throws InterruptedException {
        WebElement menuParametros = driver.findElement(By.xpath("/html/body/div[4]/div[1]/ul/li[3]"));
        menuParametros.click();
        Thread.sleep(1000);
        screenshot();
    }

    @Step("Menú Empréstimo")
    public void menuEmprestimo() throws InterruptedException {
        WebElement menuEmprestimo = driver.findElement(By.xpath("/html/body/div[4]/div[1]/ul/li[5]"));
        menuEmprestimo.click();
        Thread.sleep(1000);
        screenshot();
    }
    @Step("Menú Portabilidade")
    public void menuPortabilidade() throws InterruptedException {
        WebElement menuParametros = driver.findElement(By.xpath("/html/body/div[4]/div[1]/ul/li[6]"));
        menuParametros.click();
        Thread.sleep(1000);
        screenshot();
    }

    @Step("Adicionar Novo - Botão Adicionar Novo")
    public void exclusãoDeEmprestimoBtnAddNovo() throws InterruptedException {
        WebElement btnAddNovo = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form[1]/div[1]/div/div/div/span[2]/a"));
        btnAddNovo.click();
        Thread.sleep(1500);
        screenshot();
    }

    @Step("Menú Ações")
    public void btnMenuAcoes() throws InterruptedException {
        Thread.sleep(300);
        WebElement btnMenuAcoes = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form[2]/table/tbody/tr[1]/td[3]"));
        btnMenuAcoes.click();
        Thread.sleep(500);
        screenshot();
    }
    @Step("Menú Ações")
    public void portabilidadeBtnMenuAcoes() throws InterruptedException {
        Thread.sleep(300);
        WebElement btnMenuAcoes = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form[2]/table/tbody/tr[1]/td[6]/div/button"));
        btnMenuAcoes.click();
        Thread.sleep(500);
        screenshot();
    }
    @Step("Botão Visualixar")
    public void portabilidadeBtnVisualizar() throws InterruptedException {
        Thread.sleep(300);
        WebElement btnMenuAcoes = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form[2]/table/tbody/tr[1]/td[6]/div/div/button"));
        btnMenuAcoes.click();
        Thread.sleep(1000);
        screenshot();
    }
    @Step("Botão Editar")
    public void portabilidadeBtnEditar() throws InterruptedException {
        Thread.sleep(300);
        WebElement btnMenuAcoes = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form[2]/table/tbody/tr[1]/td[6]/div/div/button[2]"));
        btnMenuAcoes.click();
        Thread.sleep(1000);
        screenshot();
    }
    @Step("Botão Voltar")
    public void portabilidadeBtnVoltar() throws InterruptedException {
        Thread.sleep(300);
        WebElement btnMenuAcoes = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/nav/button"));
        btnMenuAcoes.click();
        Thread.sleep(900);
        screenshot();
    }
    @Step("Botão Excluir")
    public void btnExluir() throws InterruptedException {
        WebElement btnMenuAcoes = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form[2]/table/tbody/tr[1]/td[4]/div/div/button[3]"));
        btnMenuAcoes.click();
        Thread.sleep(1500);
        screenshot();
    }
    @Step("Botão Excluir")
    public void instituicaoFinanceiraBtnExluir() throws InterruptedException {
        WebElement btnMenuAcoes = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form[2]/table/tbody/tr[1]/td[7]/div/div/button[3]"));
        btnMenuAcoes.click();
        Thread.sleep(1500);
        screenshot();
    }
    @Step("Botão Excluir")
    public void instituicaoFinanceiraBtnEditar() throws InterruptedException {
        WebElement btnMenuAcoes = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form[2]/table/tbody/tr[1]/td[7]/div/div/button[2]"));
        btnMenuAcoes.click();
        Thread.sleep(1500);
        screenshot();
    }
    @Step("Botão Excluir")
    public void instituicaoFinanceiraBtnVisualizar() throws InterruptedException {
        WebElement btnMenuAcoes = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form[2]/table/tbody/tr[1]/td[7]/div/div/button[1]"));
        btnMenuAcoes.click();
        Thread.sleep(1500);
        screenshot();
    }
    @Step("Botão Excluir")
    public void classificadorDaModalidadeBtnExluir() throws InterruptedException {
        WebElement btnMenuAcoes = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form[2]/table/tbody/tr[1]/td[5]/div/div/button[3]"));
        btnMenuAcoes.click();
        Thread.sleep(1500);
        screenshot();
    }

    @Step("Botão Editar")
    public void btnEditar() throws InterruptedException {
        WebElement btnEditar = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form[2]/table/tbody/tr[1]/td[4]/div/div/button[2]"));
        btnEditar.click();
        Thread.sleep(1500);
        screenshot();
    }
    @Step("Botão Editar")
    public void classificadorDaModalidadeBtnEditar() throws InterruptedException {
        WebElement btnEditar = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form[2]/table/tbody/tr[1]/td[5]/div/div/button[2]"));
        btnEditar.click();
        Thread.sleep(1500);
        screenshot();
    }

    @Step("Botão Visualizar")
    public void btnVisualizar() throws InterruptedException {
        WebElement btnVisualizar = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form[2]/table/tbody/tr[1]/td[4]/div/div/button[1]"));
        btnVisualizar.click();
        Thread.sleep(1500);
        screenshot();
    }
    @Step("Botão Visualizar")
    public void classificadorDaModalidadeBtnVisualizar() throws InterruptedException {
        WebElement btnVisualizar = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form[2]/table/tbody/tr[1]/td[5]/div/div/button[1]"));
        btnVisualizar.click();
        Thread.sleep(1500);
        screenshot();
    }

    @Step("Botão Cancelar vizualização")
    public void btnCancelarVisualizacao() throws InterruptedException {
        WebElement btnCancelar = driver.findElement(By.xpath(" /html/body/div[4]/div[2]/form/nav/button"));
        btnCancelar.click();
        Thread.sleep(1500);
        screenshot();
    }


    @Step("BotÃO Confirmar Exclusão")
    public void btnConfirmarExclusão() throws InterruptedException {
        WebElement btnMenuAcoes = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[2]"));
        btnMenuAcoes.click();
        Thread.sleep(1500);
        screenshot();
    }
    @Step("Botão Cancelar Exclusão")
    public void btnCancelarExclusão() throws InterruptedException {
        WebElement btnMenuAcoes = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[1]"));
        btnMenuAcoes.click();
        Thread.sleep(1500);
        screenshot();
    }
    @Step("Campo Código - Não pode ser alterado")
    public void campoCodigoNaoAlteravel() throws InterruptedException {
        WebElement campoCodigo = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div/div/div[2]/div/div/input"));
        campoCodigo.click();
        Thread.sleep(1500);
        screenshot();
    }
    @Step("Campo Descrição")
    public void campoDescricao() throws InterruptedException {
        WebElement campoDescricao = driver.findElement(By.cssSelector("#main > form > div > div > div:nth-child(3) > div > div > input"));
        campoDescricao.sendKeys(Keys.BACK_SPACE);
        campoDescricao.sendKeys("" + radomNumber);
        Thread.sleep(300);

        //Thread.sleep(1500);
        screenshot();
    }
    @Step("Campo Descrição")
    public void campoSituacao() throws InterruptedException {
        WebElement campoDescricao = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div/div/div[4]/div/div/div/a/span[1]"));
        campoDescricao.click();
        Thread.sleep(300);
        WebElement campoDescricao2click = driver.findElement(By.xpath("/html/body/div[7]/ul/li[1]/div"));
        campoDescricao2click.click();
        Thread.sleep(300);

        screenshot();
    }

    @Step("Botão Salva")
    public void btnSalvarEdicao() throws InterruptedException {
        Thread.sleep(300);
        WebElement btnSalvar = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/nav/button[2]"));
        btnSalvar.click();
        Thread.sleep(300);
        screenshot();
    }
    @Step("Botão Salva")
    public void exclusaoBtnSalvar() throws InterruptedException {
        Thread.sleep(300);
        WebElement btnSalvar = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/nav/button[2]"));
        btnSalvar.click();
        Thread.sleep(900);
        screenshot();
    }
    @Step("Botão da mensagem de sucesso")
    public void btnSMensagemDeSucesso() throws InterruptedException {
        Thread.sleep(300);
        WebElement btnSalvar = driver.findElement(By.cssSelector("body > div.modal-scrollable > div > div.modal-body > div > button"));
        btnSalvar.click();
        Thread.sleep(300);
        screenshot();
    }


    @Step("Canal de Atendimento")
    public void canalDeAtendimento() throws InterruptedException {
        WebElement btnConfirmar = driver.findElement(By.xpath("/html/body/div[4]/div[1]/ul/li[3]/ul/li[1]/a"));
        btnConfirmar.click();
        Thread.sleep(1500);
        screenshot();
    }
    @Step("Portabilidade - Consulta Dataprev")
    public void portabilidadeConsultaDataprev() throws InterruptedException {
        WebElement btnConfirmar = driver.findElement(By.xpath("/html/body/div[4]/div[1]/ul/li[6]/ul/li[3]/a"));
        btnConfirmar.click();
        Thread.sleep(1500);
        screenshot();
    }
    @Step("Portabilidade - Exclusão")
    public void portabilidadeExclusão() throws InterruptedException {
        WebElement btnConfirmar = driver.findElement(By.xpath("/html/body/div[4]/div[1]/ul/li[6]/ul/li[1]/a"));
        btnConfirmar.click();
        Thread.sleep(1500);
        screenshot();
    }

    @Step("Botão Adicionar Novo")
    public void btnAdicionarNovo() throws InterruptedException {
        Thread.sleep(200);
        WebElement btnConfirmar = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form[1]/div[1]/div/div/div/span[2]/a"));
        btnConfirmar.click();
        Thread.sleep(500);
        screenshot();
    }
    @Step("Portabilidade - Botão Adicionar Novo")
    public void portabilidadeBatnAdicionarNovo() throws InterruptedException {
        Thread.sleep(200);
        WebElement btnConfirmar = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form[1]/div[1]/div/div/div/span/a"));
        btnConfirmar.click();
        Thread.sleep(500);
        screenshot();
    }
    @Step("Campo Localizar Nome")
    public void autorizacaoDesbloqueioCampoLocalizarNome() throws InterruptedException {
        Thread.sleep(200);
        WebElement autorizacaoDesbloqueioCampoLocalizarNome = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div[2]/div/form/div[2]/div/div/input[2]"));
        autorizacaoDesbloqueioCampoLocalizarNome.sendKeys("TESTE");
        Thread.sleep(500);
        screenshot();
    }
    @Step("Campo Localizar Nome")
    public void autorizacaoDesbloqueioBtnPesquisar() throws InterruptedException {
        Thread.sleep(200);
        WebElement autorizacaoDesbloqueioCampoLocalizarNome = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div[2]/div/form/div[3]/div/div/div/button[2]"));
        autorizacaoDesbloqueioCampoLocalizarNome.click();
        Thread.sleep(500);
        screenshot();
    }
    @Step("Campo Localizar Nome")
    public void autorizacaoDesbloqueioRadiobuttonSelecionar() throws InterruptedException {
        Thread.sleep(700);
        WebElement autorizacaoDesbloqueioRadiobuttonSelecionar = driver.findElement(By.cssSelector("#main > form > div:nth-child(3) > div > table > tbody > tr > td:nth-child(1) > span"));
        autorizacaoDesbloqueioRadiobuttonSelecionar.click();
        Thread.sleep(500);
        screenshot();
    }

    @Step("Botão Adicionar Novo - Fluxo Completo")
    public void btnAdicionarNovoFluxoCompleto() throws InterruptedException {

     this.btnAdicionarNovo();
     this.adicionarCodigo();
     this.adicionarDescricao();
     this.btnSalvar();
     this.btnMensagemDeSucesso();
     this.btnAdicionarNovo();
     this.adicionarCodigo();
     this.adicionarDescricao();
     this.btnSalvar();
     this.btnMensagemDeSucesso();
     this.btnAdicionarNovo();
     this.adicionarCodigo();
     this.adicionarDescricao();
     this.btnSalvar();
     this.btnMensagemDeSucesso();
     this.btnAdicionarNovo();
     this.adicionarCodigo();
     this.adicionarDescricao();
     this.btnSalvar();
     this.btnMensagemDeSucesso();
    }

    @Step("Adicionar Código")
    public void adicionarCodigo() throws InterruptedException {
        WebElement campoAdicionarCodigo = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div/div/div[2]/div/div/input"));
        campoAdicionarCodigo.sendKeys("" + radomNumber);
        Thread.sleep(100);
        screenshot();
    }

    @Step("Adicionar Descrição")
    public void adicionarDescricao() throws InterruptedException {
        Thread.sleep(100);
        WebElement adicionarDescricao = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div/div/div[3]/div/div/input"));
        adicionarDescricao.sendKeys("Teste" + radomNumber);
        Thread.sleep(100);
        screenshot();
    }
    @Step("Campo Situação")
    public void consultaDataprevCampoSituacaoAberta() throws InterruptedException {
        Thread.sleep(100);
        WebElement situacao = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div/div[2]/div/div/div/a"));
        situacao.click();
        situacao.sendKeys("ABERTA");
        Thread.sleep(400);
        situacao.sendKeys(Keys.ENTER);
        Thread.sleep(400);
        situacao.sendKeys(Keys.TAB);
        Thread.sleep(100);
        screenshot();
    }
    @Step("Campo Documento")
    public void campoDocumento() throws InterruptedException {
        Thread.sleep(100);
        WebElement adicionarDescricao = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div/div/div[3]/div/div/input"));
        adicionarDescricao.sendKeys("Teste" + radomNumber);
        Thread.sleep(100);
        screenshot();
    }
    @Step("Campo Número Benefício")
    public void portabilidadeCampoNumeroBeneficio() throws InterruptedException {
        Thread.sleep(100);
        WebElement adicionarDescricao = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div/div[3]/div/div/input"));
        adicionarDescricao.sendKeys(""+radomNumber);
        Thread.sleep(100);
        screenshot();
    }
    @Step("Campo Código IF Origem")
    public void portabilidadeCampoCodigoIFOrigem() throws InterruptedException {
        Thread.sleep(100);
        WebElement adicionarDescricao = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div/div[4]/div/div/input"));
        adicionarDescricao.sendKeys("Teste"+radomNumber);
        Thread.sleep(100);
        screenshot();
    }
    @Step("Data início")
    public void portabilidadeDataInicio() throws InterruptedException {
        Thread.sleep(100);
        WebElement adicionarDescricao = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div/div[5]/div/div/div/input"));
        adicionarDescricao.sendKeys("10102020");
        Thread.sleep(100);
        screenshot();
    }
    @Step("Data início")
    public void portabilidadeDataFim() throws InterruptedException {
        Thread.sleep(100);
        WebElement adicionarDescricao = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div/div[6]/div/div/div/input"));
        adicionarDescricao.sendKeys("10102022");
        Thread.sleep(100);
        screenshot();
    }
    @Step("Botão Consultar Dataprev")
    public void btnConusltarDataprev() throws InterruptedException {
        WebElement btnSalvar = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/nav/button[2]"));
        btnSalvar.click();
        Thread.sleep(100);
        screenshot();
    }


    @Step("Botão Salvar")
    public void btnSalvar() throws InterruptedException {
        WebElement btnSalvar = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/nav/button[2]"));
        btnSalvar.click();
        Thread.sleep(100);
        screenshot();
    }

    @Step("Botão Mensagem de Sucesso")
    public void btnMensagemDeSucesso() throws InterruptedException {
        Thread.sleep(200);
        WebElement btnMensagemSucesso = driver.findElement(By.cssSelector("body > div.modal-scrollable > div > div.modal-body > div > button"));
        screenshot();
        btnMensagemSucesso.click();
        Thread.sleep(150);
        screenshot();
    }
    @Step("Botão Mensagem de Sucesso")
    public void portabilidadaBtnMensagemDeSucesso() throws InterruptedException {
        Thread.sleep(1300);
        WebElement btnMensagemSucesso = driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div/button"));
        btnMensagemSucesso.click();
        Thread.sleep(150);
        screenshot();
    }

    @Step("Motivo de Exclusão de testes")
    public void motivoExclusaoTeste() throws InterruptedException {
        WebElement exclusaoTeste = driver.findElement(By.xpath("/html/body/div[4]/div[1]/ul/li[3]/ul/li[2]"));
        exclusaoTeste.click();
        Thread.sleep(1500);
        screenshot();
    }

    @Step("Campo Código")
    public void exclusãoDeEmprestimoCampoCódigo() throws InterruptedException {
        Thread.sleep(100);
        WebElement adicionarDescricao = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div/div/div[2]/div/div/input"));
        adicionarDescricao.sendKeys("" + radomNumber);
        Thread.sleep(100);
        screenshot();
    }
    @Step("Campo Descrição")
    public void exclusãoDeEmprestimoCampoDescricao() throws InterruptedException {
        Thread.sleep(100);
        WebElement adicionarDescricao = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div/div/div[3]/div/div/input"));
        adicionarDescricao.sendKeys("Teste" + radomNumber);
        Thread.sleep(100);
        screenshot();
    }

    @Step("Classificador da Modalidade")
    public void classificadorDaModalidade() throws InterruptedException {
        WebElement classficadorDaModalidade = driver.findElement(By.xpath("/html/body/div[4]/div[1]/ul/li[3]/ul/li[3]"));
        classficadorDaModalidade.click();
        Thread.sleep(1500);
        screenshot();
    }
    @Step("Motivo de Revisão de Refinaciamento")
    public void motivoDeRevisaoDeRefinanciamento() throws InterruptedException {
        WebElement revisaoDeRefinanciamento = driver.findElement(By.xpath("/html/body/div[4]/div[1]/ul/li[3]/ul/li[5]/a"));
        revisaoDeRefinanciamento.click();
        Thread.sleep(1500);
        screenshot();
    }
    @Step("Documento de Identificação")
    public void documentoDeIdentificacao() throws InterruptedException {
        WebElement documentoDeIdentificacao = driver.findElement(By.xpath("/html/body/div[4]/div[1]/ul/li[3]/ul/li[6]/a"));
        documentoDeIdentificacao.click();
        Thread.sleep(1500);
        screenshot();
    }
    @Step("Instituição Financeira")
    public void instituicaoFinanceira() throws InterruptedException {
        WebElement instituicaoFinanceira = driver.findElement(By.xpath("/html/body/div[4]/div[1]/ul/li[3]/ul/li[4]/a"));
        instituicaoFinanceira.click();
        Thread.sleep(1500);
        screenshot();
    }

    @Step("Autorização e Desbloqueio")
    public void autorizacaoDesbloqueio() throws InterruptedException {
        WebElement autorizacaoDesbloqueio = driver.findElement(By.xpath("/html/body/div[4]/div[1]/ul/li[5]/ul/li[1]/a"));
        autorizacaoDesbloqueio.click();
        Thread.sleep(1500);
        screenshot();
    }
    @Step("Portabilidade - Exclusão - Botão pesquisar beneficiário")
    public void PortabilidadeExclusaoBtnPesquisarBeneficiario() throws InterruptedException {
        WebElement pesquisarBeneficiario = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div[1]/div/div[2]/div/div/div/button"));
        pesquisarBeneficiario.click();
        Thread.sleep(1500);
        screenshot();
    }
    @Step("Portabilidade - Exclusão - Botão pesquisar benefício")
    public void PortabilidadeExclusaoBtnPesquisarBeneficio() throws InterruptedException {
        WebElement pesquisarBeneficio = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div[1]/div/div[3]/div/div/div/button"));
        pesquisarBeneficio.click();
        Thread.sleep(1500);
        screenshot();
    }
    @Step("Portabilidade - Exclusão - Botão pesquisar If Proponente")
    public void PortabilidadeExclusaoBtnPesquisarIfProponente() throws InterruptedException {
        WebElement pesquisarIfProponente = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div[2]/div/div[2]/div/div/div/button"));
        pesquisarIfProponente.click();
        Thread.sleep(1500);
        screenshot();
    }
    @Step("Portabilidade - Exclusão - Campo Localizar Nome")
    public void PortabilidadeExclusaoCampoLocalizarNome(String nome) throws InterruptedException {
        WebElement pesquisarBeneficiario = driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/form/div/div/div/input[2]"));
        pesquisarBeneficiario.sendKeys(nome + Keys.ENTER);
        Thread.sleep(1500);
        screenshot();
    }
    @Step("Portabilidade - Exclusão - Campo Localizar If Proponente")
    public void PortabilidadeExclusaoCampoLocalizarIfProponente(String nome) throws InterruptedException {
        WebElement pesquisarBeneficiario = driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/form[1]/div/div/div/input[2]"));
        pesquisarBeneficiario.sendKeys(nome + Keys.ENTER);
        Thread.sleep(1500);
        screenshot();
    }
    @Step("Portabilidade - Exclusão - Selecionar Nome")
    public void PortabilidadeExclusaoSelecionarNome() throws InterruptedException {
        WebElement pesquisarBeneficiario = driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/table/tbody/tr/td[3]"));
        pesquisarBeneficiario.click();
        Thread.sleep(1500);
        screenshot();
    }
    @Step("Portabilidade - Exclusão - Selecionar Banco")
    public void PortabilidadeExclusaoSelecionarBanco() throws InterruptedException {
        WebElement pesquisarBeneficiario = driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/form[2]/table/tbody/tr/td[2]"));
        pesquisarBeneficiario.click();
        Thread.sleep(1500);
        screenshot();
    }
    @Step("Portabilidade - Exclusão - Selecionar Banco")
    public void PortabilidadeExclusaoEditSelecionarBanco() throws InterruptedException {
        WebElement pesquisarBeneficiario = driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/form[2]/table/tbody/tr[5]/td[2]"));
        pesquisarBeneficiario.click();
        Thread.sleep(1500);
        screenshot();
    }

    @Step("Scroll")
    public void scroll(){
        JavascriptExecutor fimpagina = (JavascriptExecutor)driver;
        fimpagina.executeScript("window.scrollBy(0,500)");

    }
    @Step("Portabilidade - Exclusão - Radio button Selecionar Contrato")
    public void PortabilidadeExclusaoRadioButtonSelecionarContrato() throws InterruptedException {

        Thread.sleep(1500);
        WebElement pesquisarBeneficiario = driver.findElement(By.cssSelector("#main > form > div:nth-child(3) > div > table > tbody > tr:nth-child(1) > td:nth-child(1)"));
        pesquisarBeneficiario.click();
        Thread.sleep(1500);
        screenshot();
    }
    @Step("Portabilidade - Exclusão - Selecionar Nome")
    public void PortabilidadeExclusaoSelecionarBeneficio() throws InterruptedException {
        WebElement pesquisarBeneficiario = driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/form/table/tbody/tr[1]/td[1]"));
        pesquisarBeneficiario.click();
        Thread.sleep(1500);
        screenshot();
    }

    @Step("Tipo Consignatário")
    public void tipoConsignatarioInstiuicaoFinanceira() throws InterruptedException {
        Thread.sleep(200);
        WebElement tipoConsignatario = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div/div/div[6]/div/div/div/a"));
        tipoConsignatario.click();
        Thread.sleep(700);
        WebElement dataPrev = driver.findElement(By.xpath("/html/body/div[7]/ul/li/div"));
        dataPrev.click();
        Thread.sleep(150);
        screenshot();
    }
    @Step("Tipo Consignatário")
    public void tipoConsignatarioEmprestimo() throws InterruptedException {
        Thread.sleep(200);
        WebElement tipoConsignatario = driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/form/div/div/div/div/a"));
        tipoConsignatario.click();
        Thread.sleep(700);
        WebElement dataPrev = driver.findElement(By.xpath("/html/body/div[9]/ul/li/div"));
        dataPrev.click();
        WebElement confirmar = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[2]"));
        confirmar.click();

        Thread.sleep(150);
        screenshot();
    }


    @Step("Modal Seleção Consignatário")
    public void portabilidadeModalSelecaoConsignatario() throws InterruptedException {
        Thread.sleep(200);
        WebElement tipoConsignatario = driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/form/div/div/div/div/a"));
        tipoConsignatario.click();
        Thread.sleep(700);
        WebElement dataPrev = driver.findElement(By.xpath("/html/body/div[11]/ul/li/div"));
        dataPrev.click();
        Thread.sleep(200);
        WebElement confirmar = driver.findElement(By.xpath("/html/body/div[8]/div/div[3]/button[2]"));
        confirmar.click();

        Thread.sleep(150);
        screenshot();
    }
    @Step("Modal Seleção Consignatário")
    public void portabilidadeExclusaoModalSelecaoConsignatario() throws InterruptedException {
        Thread.sleep(200);
        WebElement tipoConsignatario = driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/form/div/div/div/div/a"));
        tipoConsignatario.click();
        Thread.sleep(700);
        WebElement dataPrev = driver.findElement(By.xpath(" /html/body/div[9]/ul/li/div"));
        dataPrev.click();
        Thread.sleep(200);
        WebElement confirmar = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[2]"));
        confirmar.click();

        Thread.sleep(150);
        screenshot();
    }
    @Step("Tipo Consignatário")
    public void tipoConsignatario() throws InterruptedException {
        Thread.sleep(200);
        WebElement tipoConsignatario = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div/div/div[4]/div/div/div/a"));
        tipoConsignatario.click();
        Thread.sleep(700);
        WebElement dataPrev = driver.findElement(By.xpath("/html/body/div[7]/ul/li/div"));
        dataPrev.click();
        Thread.sleep(150);
        screenshot();
    }
    @Step("CNPJ")
    public void cnpj() throws InterruptedException {
        Thread.sleep(200);
        WebElement cnpj = driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div/div/div[5]/div/div/input"));
        cnpj.sendKeys("" + novoCNPJ.geraCNPJ());
        screenshot();
    }
    @Step("Fechar navegador")
    public void fechar(){
        this.driver.quit();
    }

    @Attachment(value = "Passos", type = "image/png")
    public byte[] screenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

}
