package br.com.dimensa.corebankJosso;

import br.com.dimensa.consignado.GeraCNPJ;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

public class CoreBankPageObject {


    GeraCNPJ novoCNPJ = new GeraCNPJ();
    Random random = new Random();

    int radomNumber = random.nextInt(9);

    private static final String URL_COREBANKJOSSO = "http://vrotsqa.poa01.local:8080/jsp_login";

    public WebDriver driver;

    public CoreBankPageObject() {
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
        this.driver.navigate().to(URL_COREBANKJOSSO);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));

    }


    @Step("Login")
    public void loginSenha(String login, String senha) throws InterruptedException {
        driver.findElement(By.id("frm:j_id72:cdUsu")).sendKeys(login);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/form/div/div[2]/div/div[2]/input")).sendKeys(senha);
        // WebElement search = driver.findElement(By.xpath("/html/body/div[2]/form/div/button"));
        //search.click();
        Thread.sleep(700);
        screenshot();

    }
    @Step("Botão Search")
    public void btnLoginSearch() throws InterruptedException {
        WebElement search = driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/form/div/div[4]/input[2]"));
        Thread.sleep(700);
        search.click();
        screenshot();
    }

    @Step("Operação de Crédito")
    public void operacaoDeCredito() throws InterruptedException {
        Thread.sleep(3500);
        WebElement search = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/ul/li[3]/a"));
      //  search.sendKeys(Keys.TAB);
        Thread.sleep(1000);
        search.click();
        Thread.sleep(500);
        screenshot();

    }

    @Step("Operação de Crédito")
    public void auxilio() throws InterruptedException {
        Thread.sleep(3000);
        WebElement search = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/ul/li"));
        search.click();
        Thread.sleep(3000);
        screenshot();

    }

    @Step("Empresa")
    public void empresa() throws InterruptedException {


        Select empre = new Select(driver.findElement(By.id("frm:j_idt68:comboEmpresa")));
        empre.selectByVisibleText("33 - LUIZ MONTEIRO");

        Thread.sleep(500);

        Thread.sleep(500);
        screenshot();

        WebElement unidade = driver.findElement(By.id("frm:u:comboUnidade"));
        unidade.click();
        Thread.sleep(700);
        WebElement unidade1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form/div/div[2]/div/div[2]/select/option[2]"));
        unidade1.click();
        Thread.sleep(500);
        screenshot();
    }

    @Step("Unidade")
    public void unidade() throws InterruptedException {
        WebElement unidade = driver.findElement(By.id("frm:u:comboUnidade"));
        unidade.click();
        Thread.sleep(700);
        WebElement unidade1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form/div/div[2]/div/div[2]/select/option[2]"));
        unidade1.click();
        Thread.sleep(500);
        screenshot();
    }
    @Step("Botão Confirmar")
    public void btnConfirmar() throws InterruptedException {
        WebElement search = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form/div/div[4]/input[2]"));
        search.click();
        Thread.sleep(3000);
        screenshot();
    }

    @Step("Menú Operação de Crédito")
    public void menuOperacaoDeCredito() throws InterruptedException {
        Thread.sleep(3000);
        WebElement operacaoDeCredito = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form/table/tbody/tr[1]/td[4]/div/a/span"));
        Thread.sleep(2000);
        operacaoDeCredito.click();
        screenshot();
    }
    @Step("Nova Inclusão - Automação de Testes")
    public void novaInclsaoAutomacaoDeTestes() throws InterruptedException {
        WebElement novaInclsaoAutomacaoDeTestes = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/ul/li[3]/ul/li[2]/a"));
        novaInclsaoAutomacaoDeTestes.click();
        Thread.sleep(500);
        screenshot();
    }
    @Step("Botão Inserir")
    public void btnInserir() throws InterruptedException {
        Thread.sleep(9000);
        WebElement btnInserir = driver.findElement(By.id("result:j_idt194:j_idt195:0:j_idt197"));
        btnInserir.click();
        Thread.sleep(15000);
        screenshot();
    }
    @Step("Botão Alterar")
    public void btnAlterar() throws InterruptedException {
        Thread.sleep(9000);
        WebElement btnAlterar = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form[2]/div[1]/div[2]/a[2]"));
        btnAlterar.click();
        Thread.sleep(15000);
        screenshot();
    }
    @Step("Botão Excluir")
    public void btnExcluirContrato() throws InterruptedException {
        WebElement btnExcluir = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form[2]/div[1]/div[2]/a[3]"));
        btnExcluir.click();
        Thread.sleep(3000);
        screenshot();
    }
    @Step("Botão Excluir")
    public void btnConfirmarExclusao() throws InterruptedException {

        WebElement btnConfirmarExclusao = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form/div/input[2]"));
        btnConfirmarExclusao.click();
        Thread.sleep(2000);
        screenshot();
    }
    @Step("Aba Liberação - Botão excluir")
    public void abaLiberacaoBtnExcluir() throws InterruptedException {
        Thread.sleep(2000);
        WebElement btnAlterar = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form/div[1]/div[2]/div[2]/div[5]/div/dl/dd/div[8]/a"));
        btnAlterar.click();
        Thread.sleep(5000);
        screenshot();
    }

    @Step("Campo Contrato")
    public void varrerContratoExistente() throws InterruptedException {
        WebElement campoContrato = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form[1]/div[3]/div[1]/div[2]/span[1]/input"));
        campoContrato.clear();
        int number = 42;
        campoContrato.sendKeys("" + number);
        btnPesquisar();
        Thread.sleep(4000);

// VARRER CÓDIGO FONTE BUSCANDO O NOME BERNARDO E GABRIELA
        WebElement fonte = driver.findElement(By.xpath("/html/body"));
        String fonte1  = fonte.getText();
        Boolean condicao = fonte1.contains("BERNARDO");

// VERIFICAR CÓDIGO FONTE DENTRO DO LOOPING

        while(condicao == false){

            WebElement fonteLooping = driver.findElement(By.xpath("/html/body"));
            String fonte1Looping  = fonteLooping.getText();

            Boolean condicaoLooping = fonte1Looping.contains("BERNARDO");

// SE O CÓDIGO FONTE TIVER O NOME ESPERADO, LER A DESCRIÇÃO DO CONTRAT0

            if(condicaoLooping == true)
            {
                WebElement contratoEMPKGPJ = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form[2]/table/tbody[1]/tr/td[5]"));
                String leituraContrato = contratoEMPKGPJ.getText();
                Boolean confirmarContratoEMPKGPJ = leituraContrato.contains("EMPKGPJ");
//LER O CONTRATO VERIFICANDO SE EXISTE O NOME EMPKGPJ
                if(confirmarContratoEMPKGPJ == true){

// SE A LEITURA DO CONTRATO TIVER O NOME EMPKGPJ, SAIR DO LAÇO E CLICAR NO CONTRATO
                WebElement mensagemSucesso = driver.findElement(By.id("result:dt:0:j_idt233"));
                mensagemSucesso.click();
                //btnAlterar();

                Thread.sleep(1000);
                screenshot();

                    break;
                }
            }

            WebElement campocont = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form[1]/div[3]/div[1]/div[2]/span[1]/input"));
            campocont.click();
            campocont.clear();
            number += 1;
            campocont.sendKeys("" + number);
            btnPesquisar();
            Thread.sleep(2500);
        }
// RETONAR AO CAMPO DE PESQUISA DE NÚMERO DE CONTRATO E BOTÃO PESQUISAR
    }

    @Step("Campo Contrato")
    public void campoContrato(String numeroContrato) throws InterruptedException {

        WebElement campoContrato = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form[1]/div[3]/div[1]/div[2]/span[1]/input"));
        campoContrato.sendKeys("" + numeroContrato);

        Thread.sleep(1000);
        screenshot();
    }

    @Step("Botão Pesquisar")
    public void btnPesquisar() throws InterruptedException {
        Thread.sleep(1000);
        WebElement btnPesquisar = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form[1]/div[5]/input[2]"));
        btnPesquisar.click();
        Thread.sleep(3000);
        screenshot();
    }
    @Step("Selecionar Contrato")
    public void selecionarContrato() throws InterruptedException {
        Thread.sleep(1000);
        WebElement contrato = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form[2]/table/tbody[1]/tr/td[2]"));
        contrato.click();
        Thread.sleep(3000);
        screenshot();
    }
    String convenioEMPKGPJ = "html/body/div[4]/div[4]/div/form[2]/table/tbody[1]/tr[2]/td[2]";

    @Step("Campo Convênio")
    public void campoConvenio() throws InterruptedException {
        WebElement lupaConvenio = driver.findElement(By.id("frm:dConvenio:findConvenio"));
        lupaConvenio.click();
        Thread.sleep(500);
        screenshot();

    }
    @Step("Campo Convênio")
    public void campoConvenioParametro(String convenio) throws InterruptedException {
        WebElement lupaConvenio = driver.findElement(By.id("frm:dConvenio:findConvenio"));
        lupaConvenio.click();
        Thread.sleep(500);
        screenshot();

        WebElement campoConvenio = driver.findElement(By.id(convenio));
        campoConvenio.click();

    }
    @Step("Convênio EMPKGPJ")
    public void convenioEMPKGPJ() throws InterruptedException {
        WebElement convenioEMPKGPJ = driver.findElement(By.xpath("/html/body/div[4]/div[4]/div/form[2]/table/tbody[1]/tr[2]/td[2]"));
        convenioEMPKGPJ.click();
        Thread.sleep(500);
        screenshot();
        Thread.sleep(9000);
    }
    @Step("Taxa Comissão")
    public void taxaComissao(String taxa) throws InterruptedException {
        WebElement taxaComissao = driver.findElement(By.name("frm:idTaxaComissao:j_idt640"));
        taxaComissao.sendKeys(taxa);
        Thread.sleep(5000);
        screenshot();
    }



    @Step("Convênio Interveniencia")
    public void convenioInterveniencia() throws InterruptedException {
        WebElement campoConvenio = driver.findElement(By.id("viewListaConvenio:result:dt:4:j_idt4903"));
        campoConvenio.click();
        Thread.sleep(500);
        screenshot();
        Thread.sleep(9000);
    }

    @Step("Convênio IPCPREPJ ")
    public void convenioIPCPREPJ () throws InterruptedException {
        WebElement campoConvenio = driver.findElement(By.id("viewListaConvenio:result:dt:5:j_idt4903"));
        campoConvenio.click();
        Thread.sleep(500);
        screenshot();
        Thread.sleep(5000);
    }

    @Step("Convênio RF360J ")
    public void convenioRF360J () throws InterruptedException {
        WebElement campoConvenio = driver.findElement(By.id("viewListaConvenio:result:dt:6:j_idt4903"));
        campoConvenio.click();
        Thread.sleep(500);
        screenshot();
        Thread.sleep(5000);
    }

    @Step("Convênio RXD Repasse Externo ")
    public void convenioRXDRepasseExterno () throws InterruptedException {
        WebElement campoConvenio = driver.findElement(By.id("viewListaConvenio:result:dt:7:j_idt4903"));
        campoConvenio.click();
        Thread.sleep(500);
        screenshot();
        Thread.sleep(5000);
    }
    @Step("Convênio Leasing ")
    public void convenioLeasing () throws InterruptedException {
        WebElement campoConvenio = driver.findElement(By.id("viewListaConvenio:result:dt:8:j_idt4903"));
        campoConvenio.click();
        Thread.sleep(500);
        screenshot();
        Thread.sleep(5000);
    }
    @Step("Convênio 1ª Curva")
    public void convenio1Curva() throws InterruptedException {
        WebElement campoConvenio = driver.findElement(By.xpath("/html/body/div[4]/div[4]/div/form[2]/table/tbody[1]/tr[3]/td[2]"));
        campoConvenio.click();
        Thread.sleep(500);
        screenshot();
        Thread.sleep(9000);
    }

    @Step("Convênio 2ª Curva")
    public void convenio2Curva() throws InterruptedException {
        WebElement campoConvenio = driver.findElement(By.xpath("/html/body/div[4]/div[4]/div/form[2]/table/tbody[1]/tr[4]/td[2]"));
        campoConvenio.click();
        Thread.sleep(500);
        screenshot();
        Thread.sleep(9000);
    }
    @Step("Convênio Financiamento SICOR")
    public void convenioSICOR() throws InterruptedException {
        WebElement campoConvenio = driver.findElement(By.xpath("/html/body/div[4]/div[4]/div/form[2]/table/tbody[1]/tr[1]/td[2]"));
        campoConvenio.click();
        Thread.sleep(500);
        screenshot();
        Thread.sleep(9000);
    }
    @Step("Número Amortizações")
    public void numeroAmortizacoes() throws InterruptedException {
        Thread.sleep(7000);
        WebElement numeroAmortizacoes = driver.findElement(By.name("frm:amortizacoesDec:amortizacoes"));
        numeroAmortizacoes.click();
        Thread.sleep(2000);
        numeroAmortizacoes.sendKeys("10");


        screenshot();
    }




    @Step("Campo Valor")
    public void valor(String valor) throws InterruptedException {
        Thread.sleep(2500);

        WebElement valor1 = driver.findElement(By.name("frm:idValorFinanciado:j_idt274"));
        valor1.clear();
        Thread.sleep(1000);
        valor1.sendKeys(valor);
        valor1.sendKeys(Keys.TAB);
        Thread.sleep(5000);
        screenshot();
    }


    @Step("Tac 1º vencimento")
    public void tac1() throws InterruptedException {
        int valor1 = 1;
        WebElement taxaOperacao = driver.findElement(By.name("frm:j_idt503:inputValorTarifaTAC"));
        taxaOperacao.sendKeys("" + valor1);
       // taxaOperacao.sendKeys(Keys.TAB);
        Thread.sleep(2000);

        screenshot();
    }

    @Step("Pesquisar por Modalidade - AQ 1ª CURVA")
    public void pesquisarContratoPorModalidade(String modalidade) throws InterruptedException {
        Thread.sleep(3000);
        Select select = new Select(driver.findElement(By.name("frm:modalidade:j_idt151")));
        select.selectByVisibleText(modalidade);
        Thread.sleep(3000);
        // WebElement admDireta = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form/div[1]/div[2]/div[2]/div[3]/div/div[15]/div/div[2]/select/option[2]"));
        //admDireta.click();
        Thread.sleep(1000);
        screenshot();
    }
    @Step("Linha de Repasse")
    public void linhaDeRepasse() throws InterruptedException {
        Thread.sleep(3000);
        Select select = new Select(driver.findElement(By.name("frm:j_idt526:j_idt533")));
        select.selectByVisibleText("1000196 - 1 - TESTE - REPASSE INTERNO");
        Thread.sleep(3000);
        // WebElement admDireta = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form/div[1]/div[2]/div[2]/div[3]/div/div[15]/div/div[2]/select/option[2]"));
        //admDireta.click();
        Thread.sleep(1000);
        screenshot();
    }
    @Step("Linha de Repasse Externo")
    public void linhaDeRepasseExterno() throws InterruptedException {
        Thread.sleep(3000);
        Select select = new Select(driver.findElement(By.name("frm:j_idt526:j_idt533")));
        select.selectByVisibleText("1000196 - 1 - REPASSADOR - RXD");
        Thread.sleep(3000);
        // WebElement admDireta = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form/div[1]/div[2]/div[2]/div[3]/div/div[15]/div/div[2]/select/option[2]"));
        //admDireta.click();
        Thread.sleep(1000);
        screenshot();
    }


    @Step("Direcionamento")
    public void direcionamento() throws InterruptedException {
        Thread.sleep(3000);
        Select select = new Select(driver.findElement(By.name("frm:j_idt650:j_idt657")));
        select.selectByVisibleText("1110 - Governo Federal - Administração Direta");
        Thread.sleep(3000);
       // WebElement admDireta = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form/div[1]/div[2]/div[2]/div[3]/div/div[15]/div/div[2]/select/option[2]"));
        //admDireta.click();
        Thread.sleep(1000);
        screenshot();
    }

    @Step("Tipo Antecipado")
    public void tipoAntecipado() throws InterruptedException {
        Thread.sleep(3000);
        Select select = new Select(driver.findElement(By.name("frm:j_idt770:inputTipoAntecipado")));
        select.selectByVisibleText("VRG");
        Thread.sleep(3000);
        // WebElement admDireta = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form/div[1]/div[2]/div[2]/div[3]/div/div[15]/div/div[2]/select/option[2]"));
        //admDireta.click();
        Thread.sleep(1000);
        screenshot();
    }
    @Step("Gerente")
    public void gerente() throws InterruptedException {
        Select gerente = new Select(driver.findElement(By.id("frm:gerente:j_idt992")));
        gerente.selectByVisibleText("4 - TESTE GERENTE");

        Thread.sleep(2500);
        screenshot();
    }

    @Step("Contrato Interveniencia")
    public void contratoInterveniencia() throws InterruptedException {
        Select contratoInterveniencia = new Select(driver.findElement(By.name("frm:j_idt604:j_idt611")));
        contratoInterveniencia.selectByVisibleText("1000196 - 19 - CONTRATO MÃE");

        Thread.sleep(2500);
        screenshot();
    }
    @Step("Data Emissão")
    public void dataEmissao() throws InterruptedException {
        Thread.sleep(3000);
        int data1 = 22011022;
        WebElement dataEmissao = driver.findElement(By.id("frm:dEmissao:j_idt244InputDate"));
        dataEmissao.clear();
        Thread.sleep(900);
        dataEmissao.sendKeys(""+ data1);
        screenshot();
        Thread.sleep(1000);
    }
    @Step("Data Primeira Amortização")
    public void dataPrimeiraAmortizacao(String data2) throws InterruptedException {

        WebElement dataPrimeiraAmortizacao = driver.findElement(By.name("frm:j_idt253:dtPrimAmortizacaoInputDate"));
        for (int i = 0; i <= 8; i ++ ){
            dataPrimeiraAmortizacao.sendKeys(Keys.BACK_SPACE);
        }
        dataPrimeiraAmortizacao.sendKeys(data2);
        screenshot();

        Thread.sleep(3000);

    }
    @Step("Data Primeira Amortização SICOR")
    public void SICORdataPrimeiraAmortizacao(String data2) throws InterruptedException {

        WebElement dataPrimeiraAmortizacao = driver.findElement(By.name("frm:j_idt253:dtPrimAmortizacaoInputDate"));
        for (int i = 0; i <= 8; i ++ ){
            dataPrimeiraAmortizacao.sendKeys(Keys.BACK_SPACE);
        }
        dataPrimeiraAmortizacao.sendKeys(data2);
        screenshot();

        Thread.sleep(3000);

    }
    @Step("Meio Liquidação")
    public void meioLiquidacao()throws InterruptedException{
        Select liquidacao = new Select(driver.findElement(By.name("frm:j_idt1001:j_idt1008")));
        liquidacao.selectByVisibleText("ACORDO JUDICIAL");
        Thread.sleep(2500);

        WebElement liqui = driver.findElement(By.name("frm:j_idt1001:j_idt1008"));
        liqui.sendKeys(Keys.TAB);
        Thread.sleep(2000);
        //


      //  WebElement acordo = driver.findElement(By.name("frm:j_idt1001:j_idt1008"));
       // acordo.click();
        screenshot();

    }

    @Step("Cobrador")
    public void cobrador() throws InterruptedException {
        Thread.sleep(2000);
        WebElement cobrador = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form/div[1]/div[2]/div[2]/div[3]/div/div[15]/div/div[2]/a"));
        cobrador.click();
        Thread.sleep(3000);
        WebElement cobradorBradesco = driver.findElement(By.xpath("/html/body/div[4]/div[4]/div/form[2]/table/tbody[1]/tr[1]/td[2]"));
        cobradorBradesco.click();
        Thread.sleep(500);
        screenshot();
    }
    @Step("Valor IOF")
    public void valorIOF() throws InterruptedException{


        WebElement valorIOF = driver.findElement(By.name("frm:j_idt942:valorIOF"));
        valorIOF.click();
        valorIOF.sendKeys("1");
    }

    @Step("Valor antecipado")
    public void valorAntecipado() throws InterruptedException{

        int valor = 10000;
        WebElement valorIOF = driver.findElement(By.name("frm:j_idt784:inputValorAntecipado"));
        valorIOF.click();
        valorIOF.sendKeys("" + valor);
    }

    @Step("Valor antecipado")
    public void valorVRGDiluido(int valor) throws InterruptedException{

       // int valor = 10000;
        WebElement valorDiluido = driver.findElement(By.name("frm:j_idt798:inputVrgDiluido"));
        valorDiluido.click();
        valorDiluido.sendKeys("" + valor);
    }
    @Step("Valor antecipado")
    public void valorVRGFinal(int valor) throws InterruptedException{

        // int valor = 10000;
        WebElement valorFinal = driver.findElement(By.name("frm:j_idt811:inputVrgFinal"));
        valorFinal.click();
        valorFinal.sendKeys("" + valor);
    }

    @Step("Valor antecipado")
    public void carenciaMinimaClear() throws InterruptedException{
        WebElement valorFinal = driver.findElement(By.name("frm:j_idt753:j_idt760"));
        valorFinal.click();
        Thread.sleep(2000);
        valorFinal.clear();

    }
    @Step("Valor Parcela")
    public void valorParcela() throws InterruptedException{
        Thread.sleep(4000);
        int valor = 3000;
        WebElement valorParcela = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form/div[1]/div[2]/div[2]/div[3]/div/div[8]/div/div[2]/span/input"));
        valorParcela.click();
        Thread.sleep(4000);
        valorParcela.sendKeys("" + valor);

    }
    @Step("Taxa Operação")
    public void taxaOperacao(int valor) throws InterruptedException {
        WebElement taxaOperacao = driver.findElement(By.name("frm:taxaOperacao:txOperacao"));
        taxaOperacao.click();
        Thread.sleep(500);
        taxaOperacao.sendKeys("" + valor);
        taxaOperacao.sendKeys(Keys.TAB);
        Thread.sleep(2000);
    }



    @Step("Nome da Operação")
    public void nomeOperacao(String nomeOperacao) throws InterruptedException{
            Thread.sleep(3000);
            WebElement valorParcela = driver.findElement(By.name("frm:j_idt956:j_idt963"));
            valorParcela.sendKeys(nomeOperacao);
        }
        @Step("Nota Fiscal")
    public void notaFiscal(){

        WebElement notaFiscal = driver.findElement(By.name("frm:j_idt971:j_idt978"));
        notaFiscal.sendKeys("2");
    }
    @Step("Scroll")
    public void scrollMeio(){
        JavascriptExecutor scroll = (JavascriptExecutor)driver;
        scroll.executeScript("window.scrollBy(0,500)");
    }
    @Step("Scroll topo")
    public void scrollTopo() throws InterruptedException{
        JavascriptExecutor scroll = (JavascriptExecutor)driver;
        scroll.executeScript("window.scrollBy(0,100)");
        Thread.sleep(4000);
    }
    @Step("Scroll fim da página")
    public void scrollFim() throws InterruptedException{
        Thread.sleep(5000);
        JavascriptExecutor scroll = (JavascriptExecutor)driver;
        scroll.executeScript("window.scrollBy(0,990)");
        screenshot();
    }
    @Step("Botão Calcular")
    public void btnCalcular() throws InterruptedException {
       // Thread.sleep(10000);
        WebElement btnCalcular = driver.findElement(By.id("frm:btnCalcular"));
        btnCalcular.click();
        screenshot();
        Thread.sleep(12000);
    }
    @Step("Aba Participantes")
    public void abaParticipantes() throws InterruptedException {

        WebElement abaParticipantes = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form/div[1]/div[2]/div[2]/div[1]/table/tbody/tr/td[4]"));
        abaParticipantes.click();
        screenshot();
        Thread.sleep(9000);
    }
    @Step("Aba Participantes")
    public void abaAquisicaoDeCessao() throws InterruptedException {
        Thread.sleep(3000);
        WebElement abaAquisicaoDeCessao = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form/div[1]/div[2]/div[2]/div[1]/table/tbody/tr/td[8]"));
        abaAquisicaoDeCessao.click();
        screenshot();
        Thread.sleep(3000);
    }

    @Step("Pesquisar cliente")
    public void abaParticipantesPesquisarCliente() throws InterruptedException {
        WebElement pesquisarCliente = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form/div[1]/div[2]/div[2]/div[4]/div/div[1]/div[1]/div[2]/a"));
        pesquisarCliente.click();
        Thread.sleep(500);
        screenshot();
    }
    @Step("Botão pesquisar cliente")
    public void btnPesquisarCliente() throws InterruptedException {
        WebElement btnPesquisarCliente = driver.findElement(By.xpath("/html/body/div[4]/div[4]/div/form[1]/div[5]/input[2]"));
        btnPesquisarCliente.click();
        Thread.sleep(500);
        screenshot();
    }
    @Step("Selecionar Cliente")
    public void selecionarCliente() throws InterruptedException {
        WebElement selecionarCliente = driver.findElement(By.xpath("/html/body/div[4]/div[4]/div/form[2]/table/tbody[1]/tr[1]/td[2]"));
        selecionarCliente.click();
        Thread.sleep(500);
        screenshot();
    }
    @Step("Aba Liberação")
    public void abaLiberacao() throws InterruptedException {
        Thread.sleep(3000);
        WebElement abaPLiberacao = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form/div[1]/div[2]/div[2]/div[1]/table/tbody/tr/td[6]"));
        abaPLiberacao.click();
        screenshot();
        Thread.sleep(3000);
    }
    @Step("Aba Operacao")
    public void abaOperacao() throws InterruptedException {
        Thread.sleep(3000);
        WebElement abaPLiberacao = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form/div[1]/div[2]/div[2]/div[1]/table/tbody/tr/td[2]"));
        abaPLiberacao.click();
        screenshot();
        Thread.sleep(3000);
    }
    @Step("Aba liberação - Botão Adicionar")
    public void liberacaoBtnAdicionar() throws InterruptedException {
        Thread.sleep(3000);
        WebElement abaLiberacaoBtnAdicionar = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form/div[1]/div[2]/div[2]/div[5]/div/div/input"));
        abaLiberacaoBtnAdicionar.click();
        screenshot();
        Thread.sleep(3000);
    }

    @Step("Aba Aquisição de Cessão - Botão Adicionar")
    public void aquisicaoDeCessaoBtnAdicionar() throws InterruptedException {
        Thread.sleep(3000);
        WebElement abaAquisicaoDeCessaoBtnAdicionar = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form/div[1]/div[2]/div[2]/div[6]/div/div/div/input"));
        abaAquisicaoDeCessaoBtnAdicionar.click();
        screenshot();
        Thread.sleep(3000);
    }
    @Step("Aba Aquisição de Cessão - Botão Adicionar")
    public void aquisicaoDeCessaoGrupo() throws InterruptedException {
        Thread.sleep(3000);
        WebElement abaAquisicaoDeCessaoGrupo = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form/div[1]/div[2]/div[2]/div[6]/div/div/div[2]/div[1]/div[2]/select"));
        abaAquisicaoDeCessaoGrupo.click();
        screenshot();
        Thread.sleep(3000);
    }
    @Step("Aba Aquisição de Cessão - Subgrupo")
    public void aquisicaoDeCessaoSubGrupo() throws InterruptedException {
        Thread.sleep(3000);
        WebElement aquisicaoDeCessaoSubGrupo = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form/div[1]/div[2]/div[2]/div[6]/div/div/div[2]/div[2]/div[2]/select"));
        aquisicaoDeCessaoSubGrupo.click();
        screenshot();
        Thread.sleep(3000);
    }
    @Step("Aba Aquisição de Cessão - Subgrupo")
    public void aquisicaoDeCessaoSubGrupo01() throws InterruptedException {
        Thread.sleep(3000);
        WebElement aquisicaoDeCessaoSubGrupo = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form/div[1]/div[2]/div[2]/div[6]/div/div/div[2]/div[2]/div[2]/select/option[2]"));
        aquisicaoDeCessaoSubGrupo.click();
        screenshot();
        Thread.sleep(3000);
    }
    @Step("Aba Aquisição de Cessão - Tag CD")
    public void aquisicaoDeCessaoTagCD(String tagCD) throws InterruptedException {

        Thread.sleep(5000);
        WebElement aquisicaoDeCessaoSubGrupo = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form/div[1]/div[2]/div[2]/div[6]/div/div/div[3]/div[1]/div[1]/div[2]/span/input"));
        aquisicaoDeCessaoSubGrupo.click();
        aquisicaoDeCessaoSubGrupo.sendKeys(tagCD + radomNumber);
        screenshot();
        Thread.sleep(3000);
    }
    @Step("Aba Aquisição de Cessão - Tag IDENT")
    public void aquisicaoDeCessaoTagIDENT(String tagIDENT) throws InterruptedException {
        WebElement aquisicaoDeCessaoSubGrupo = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form/div[1]/div[2]/div[2]/div[6]/div/div/div[3]/div[1]/div[2]/div[2]/span/input"));
        aquisicaoDeCessaoSubGrupo.sendKeys(tagIDENT);
        screenshot();
        Thread.sleep(3000);
    }
    @Step("Aba Aquisição de Cessão - Tag Valor")
    public void aquisicaoDeCessaoTagValor(String tagValor) throws InterruptedException {
        WebElement aquisicaoDeCessaoTagValor = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form/div[1]/div[2]/div[2]/div[6]/div/div/div[3]/div[2]/div[1]/div[2]/span/input"));
        aquisicaoDeCessaoTagValor.sendKeys(tagValor);
        screenshot();
        Thread.sleep(3000);
    }

    @Step("Aba Aquisição de Cessão - Botão Adicionar")
    public void aquisicaoDeCessaoGrupo10() throws InterruptedException {
        Thread.sleep(3000);
        WebElement abaAquisicaoDeCessaoGrupo = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form/div[1]/div[2]/div[2]/div[6]/div/div/div[2]/div[1]/div[2]/select/option[7]"));
        abaAquisicaoDeCessaoGrupo.click();
        screenshot();
        Thread.sleep(3000);
    }
    @Step("Botão Enviar")
    public void btnEnviar() throws InterruptedException {
        Thread.sleep(5000);
        WebElement botaoEnviar = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form/div[3]/div/div[12]/input[2]"));
        botaoEnviar.click();
        Thread.sleep(9000);
        screenshot();

    }
    @Step("Mensagem Operação realizada com Sucesso")
    public void mensagemOperacaoRealizadaComSucesso() throws InterruptedException {
        Thread.sleep(7000);
        WebElement mensagem = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form[2]/div[2]/div/div/span[2]"));
        String mensagemSucesso = mensagem.getText();
        System.out.println(mensagemSucesso);
        Assert.assertTrue(mensagemSucesso.contains("Operação realizada com sucesso. Contrato"));

        Thread.sleep(500);
        screenshot();
    }
    @Step("Mensagem Operação realizada com Sucesso - Exclusão de contrato")
    public void mensagemExclusaoRealizadaComSucesso() throws InterruptedException {
        Thread.sleep(6000);
        WebElement mensagem = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/form[2]/div[2]/div/div"));
        String mensagemSucesso = mensagem.getText();
        System.out.println(mensagemSucesso);
        Assert.assertTrue(mensagemSucesso.contains("Operação realizada com sucesso"));

        Thread.sleep(500);
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
