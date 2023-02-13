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

public class CoreBankSelenium extends CoreBankPageObject{

    String loginDiogo = "diogol.monteiro";
    String senhaDiogo = "tb";




    String convenioEMPKGPJ = "viewListaConvenio:result:dt:1:j_idt4903";
    String convenioInterveniencia = "viewListaConvenio:result:dt:4:j_idt4903";
    String conveniorAq1Curva  = "viewListaConvenio:result:dt:2:j_idt4903";
    String modalidadeEMPKGPJ = "EMPKGPJ - EMPRESTIMO CAPITAL DE GIRO PJ";
    String modalidadeAq1Curva = "CASS02 - AQUISIÇÃO DE SFN SEM COOBRIGAÇÃO";
    String operacaoEMPKGPJ = "TESTE EMPKGPJ";
    String operacaoAq1Curva = "TESTE Aq1CURVA";


    @Step("Login")
    public void inicio () throws InterruptedException {

        loginSenha(loginDiogo, senhaDiogo);
        btnLoginSearch();
        menuOperacaoDeCredito();
        empresa();
        unidade();
        btnConfirmar();
        operacaoDeCredito();
        novaInclsaoAutomacaoDeTestes();
    }

    @Step("Inserir EMPKGPJ")
    public void InserirEMPKGPJIncluir() throws InterruptedException {

       btnInserir();
       campoConvenioParametro(convenioEMPKGPJ);
      // convenioEMPKGPJ();
       numeroAmortizacoes();
       dataPrimeiraAmortizacao("10/11/2022");
       valor("1000000");
       taxaOperacao(1);
       tac1();
       direcionamento();
       scrollFim();
       valorIOF();
       nomeOperacao(operacaoEMPKGPJ);
       notaFiscal();
       gerente();
       meioLiquidacao();
       btnCalcular();
       scrollFim();
       scrollTopo();

       abaParticipantes();
       abaParticipantesPesquisarCliente();
       btnPesquisarCliente();
       selecionarCliente();
       abaLiberacao();

       abaLiberacao();
       liberacaoBtnAdicionar();
       scrollFim();
       btnEnviar();
    }

    @Step("Alterar EMPKGPJ")
    public void alterarEMPKGPJ() throws InterruptedException {
        varrerContratoExistente();
        pesquisarContratoPorModalidade(modalidadeEMPKGPJ);
        btnPesquisar();
        selecionarContrato();
        btnAlterar();
        valor("900000");
        scrollFim();
        btnCalcular();

        abaLiberacao();
        abaLiberacaoBtnExcluir();
        liberacaoBtnAdicionar();

        scrollFim();
        btnEnviar();

    }

    @Step("Alterar EMPKGPJ")
    public void excluirEMPKGPJ() throws InterruptedException {
        pesquisarContratoPorModalidade(modalidadeEMPKGPJ);
        btnPesquisar();
        selecionarContrato();
        btnExcluirContrato();
        btnConfirmarExclusao();
        mensagemExclusaoRealizadaComSucesso();
    }

    @Step("Inserir Aq 1ª curva")
    public void InserirAq1Curva() throws InterruptedException {

        btnInserir();
        campoConvenioParametro(conveniorAq1Curva); //1 ok
        convenio1Curva();//2 ok
        numeroAmortizacoes(); // 3 ok
        dataPrimeiraAmortizacao("10112022"); //TESTAR
        valor("5000"); //4 ok
        taxaOperacao(1);
        tac1(); // 7
        direcionamento(); // 5 click ok, com demora pós click
        scrollMeio(); // 6 ok
        valorIOF();//7 Falha, ainda não sei onde
        nomeOperacao(operacaoAq1Curva);
        notaFiscal(); // 7 ok
        gerente(); // 7 ok, com demora pós click
        meioLiquidacao();
        btnCalcular();
        btnCalcular();
        scrollFim();
        scrollTopo();
        abaParticipantes();
        abaParticipantesPesquisarCliente();
        btnPesquisarCliente();
        selecionarCliente();
        abaLiberacao();
        liberacaoBtnAdicionar();
        abaAquisicaoDeCessao();
        aquisicaoDeCessaoBtnAdicionar();
        aquisicaoDeCessaoGrupo();
        aquisicaoDeCessaoGrupo10();
        aquisicaoDeCessaoSubGrupo();
        aquisicaoDeCessaoSubGrupo01();
        aquisicaoDeCessaoTagCD("CD - 1999");
        aquisicaoDeCessaoTagIDENT("IDENT - 1999");
        aquisicaoDeCessaoTagValor("3000");
        scrollFim();
        btnEnviar();
        mensagemOperacaoRealizadaComSucesso();
    }

    @Step("Alterar Aq 1ª curva")
    public void alterarAq1Curva() throws InterruptedException {
        pesquisarContratoPorModalidade(modalidadeAq1Curva);
        btnPesquisar();
        selecionarContrato();
        btnAlterar();
        valor("700000");
        scrollFim();
        btnCalcular();

        abaLiberacao();
        abaLiberacaoBtnExcluir();
        liberacaoBtnAdicionar();
        scrollFim();
        btnEnviar();
        mensagemOperacaoRealizadaComSucesso();
        // cobrador(); // click
    }
    @Step("Excluir Aq1Curva")
    public void excluirAq1Curva() throws InterruptedException {
        pesquisarContratoPorModalidade(modalidadeAq1Curva);
        btnPesquisar();
        selecionarContrato();
        btnExcluirContrato();
        btnConfirmarExclusao();
        mensagemExclusaoRealizadaComSucesso();
    }

    @Step("Inserir EMPKGPJ")
    public void InserirAq2Curva() throws InterruptedException {
        btnInserir();
        campoConvenio(); //1 ok
        convenio2Curva();//2 ok
        numeroAmortizacoes(); // 3 ok
        dataPrimeiraAmortizacao("10112022"); //TESTAR
        valor("5000"); //4 ok
        taxaOperacao(1);
        tac1(); // 7
        direcionamento(); // 5 click ok, com demora pós click
        scrollMeio(); // 6 ok
        valorIOF();//7 Falha, ainda não sei onde
        nomeOperacao("Operação Teste");
        notaFiscal(); // 7 ok
        gerente(); // 7 ok, com demora pós click
        meioLiquidacao();
        btnCalcular();
        scrollFim();
        scrollTopo();
        abaParticipantes();
        abaParticipantesPesquisarCliente();
        btnPesquisarCliente();
        selecionarCliente();
        abaLiberacao();
        liberacaoBtnAdicionar();
        scrollFim();
        btnEnviar();
        mensagemOperacaoRealizadaComSucesso();
    }

    @Step("Inserir EMPKGPJ")
    public void financianmentoSICORInserir() throws InterruptedException {
        btnInserir();
        campoConvenio(); //1 ok
        convenioSICOR();//2 ok
        numeroAmortizacoes(); // 3 ok
        dataPrimeiraAmortizacao("10112022"); //TESTAR
        valor("5000"); //4 ok
        // valorParcela();// Não deve ser inserido
        taxaOperacao(1);
        tac1(); // 7
        direcionamento(); // 5 click ok, com demora pós click
        scrollMeio(); // 6 ok
        valorIOF();//7 Falha, ainda não sei onde
        nomeOperacao("Operação Teste");
        notaFiscal(); // 7 ok
        gerente(); // 7 ok, com demora pós click
        meioLiquidacao();
        btnCalcular();
        scrollFim();
        scrollTopo();
        abaParticipantes();
        abaParticipantesPesquisarCliente();
        btnPesquisarCliente();
        selecionarCliente();
        abaLiberacao();
        liberacaoBtnAdicionar();
        scrollFim();
        btnEnviar();
        mensagemOperacaoRealizadaComSucesso();
    }

    @Step("Inserir Interveniencia")
    public void intervenienciaIncluir() throws InterruptedException {
        btnInserir();
        campoConvenio(); //1 ok
        convenioInterveniencia();//2 ok
        numeroAmortizacoes(); // 3 ok
        dataPrimeiraAmortizacao("10/11/2022"); //TESTAR
        valor("5000"); //4 ok
        // valorParcela();// Quebrando
        taxaOperacao(1);
        tac1(); // 7
        contratoInterveniencia();
        taxaComissao("2");
        direcionamento(); // 5 click ok, com demora pós click
        scrollMeio(); // 6 ok
        valorIOF();//7 Falha, ainda não sei onde
        nomeOperacao("Operação Teste");
        notaFiscal(); // 7 ok

        gerente(); // 7 ok, com demora pós click

        meioLiquidacao();
        btnCalcular();
        scrollFim();
        scrollTopo();
        abaParticipantes();
        abaParticipantesPesquisarCliente();
        btnPesquisarCliente();
        selecionarCliente();
        abaLiberacao();
        liberacaoBtnAdicionar();
        scrollFim();
        btnEnviar();
    }

    @Step("Inserir Interveniencia")
    public void IPCPREPJIncluir() throws InterruptedException {
        btnInserir();
        campoConvenio(); //1 ok
        convenioIPCPREPJ();//2 ok
        numeroAmortizacoes(); // 3 ok
        dataPrimeiraAmortizacao("10/11/2022"); //TESTAR
        valor("5000"); //4 ok
        // valorParcela();// Quebrando
        taxaOperacao(1);
        tac1(); // 7
        linhaDeRepasse();
        direcionamento(); // 5 click ok, com demora pós click
        scrollMeio(); // 6 ok
        valorIOF();//7 Falha, ainda não sei onde
        nomeOperacao("Operação Teste");
        notaFiscal(); // 7 ok
        gerente(); // 7 ok, com demora pós click
        meioLiquidacao();
        btnCalcular();
        scrollFim();
        scrollTopo();
        abaParticipantes();
        abaParticipantesPesquisarCliente();
        btnPesquisarCliente();
        selecionarCliente();
        abaLiberacao();
        liberacaoBtnAdicionar();
        scrollFim();
        btnEnviar();
    }

    @Step("Inserir Interveniencia")
    public void incluirRF360J() throws InterruptedException {
       btnInserir();
       campoConvenio(); //1 ok
       convenioRF360J();//2 ok
       numeroAmortizacoes(); // 3 ok
       dataPrimeiraAmortizacao("10/11/2022"); //TESTAR
       valor("5000"); //4 ok
        //valorParcela();// Quebrando
       taxaOperacao(1);
       tac1(); // 7
       linhaDeRepasse();
       direcionamento(); // 5 click ok, com demora pós click
       scrollMeio(); // 6 ok
       valorIOF();//7 Falha, ainda não sei onde
       nomeOperacao("Operação Teste");
       notaFiscal(); // 7 ok
       gerente(); // 7 ok, com demora pós click
       meioLiquidacao();
       btnCalcular();
       scrollFim();
       scrollTopo();
       abaParticipantes();
       abaParticipantesPesquisarCliente();
       btnPesquisarCliente();
       selecionarCliente();
       abaLiberacao();
       liberacaoBtnAdicionar();
       scrollFim();
       btnEnviar();
       scrollFim();
       btnEnviar();
    }

    @Step("Inserir Interveniencia")
    public void incluirRXDRepasseExterno() throws InterruptedException {
        btnInserir();
        campoConvenio(); //1 ok
        convenioRF360J();//2 ok
        numeroAmortizacoes(); // 3 ok
        dataPrimeiraAmortizacao("10/11/2022"); //TESTAR
        valor("5000"); //4 ok
        //valorParcela();// Quebrando
        taxaOperacao(1);
        tac1(); // 7
        linhaDeRepasse();
        direcionamento(); // 5 click ok, com demora pós click
        scrollMeio(); // 6 ok
        valorIOF();//7 Falha, ainda não sei onde
        nomeOperacao("Operação Teste");
        notaFiscal(); // 7 ok
        gerente(); // 7 ok, com demora pós click
        meioLiquidacao();
        btnCalcular();
        scrollFim();
        scrollTopo();
        abaParticipantes();
        abaParticipantesPesquisarCliente();
        btnPesquisarCliente();
        selecionarCliente();
        abaLiberacao();
        liberacaoBtnAdicionar();
        scrollFim();
        btnEnviar();
        scrollFim();
        btnEnviar();
    }

    @Step("Inserir Leasing sem VRG")
    public void inserirLeasingSemVRG() throws InterruptedException {
        btnInserir();
        campoConvenio(); //1 ok
        convenioLeasing();//2 ok
        numeroAmortizacoes(); // 3 ok
        dataPrimeiraAmortizacao("10/11/2022"); //TESTAR
        valor("5000000"); //4 ok
        // valorParcela();// Quebrando
        taxaOperacao(1);
        tac1(); // 7
        //linhaDeRepasseExterno();
        direcionamento(); // 5 click ok, com demora pós click
        tipoAntecipado();
        //valorAntecipado();
        scrollMeio(); // 6 ok
        //valorIOF();//7 Falha, ainda não sei onde
        nomeOperacao("Operação Teste");
        notaFiscal(); // 7 ok
        gerente(); // 7 ok, com demora pós click
        meioLiquidacao();
        btnCalcular();
        scrollFim();
        scrollTopo();
        abaParticipantes();
        abaParticipantesPesquisarCliente();
        btnPesquisarCliente();
        selecionarCliente();
        abaLiberacao();
        liberacaoBtnAdicionar();
        scrollFim();
        btnEnviar();
    }

    @Step("Inserir Leasing com VRG antecipado")
    public void inserirLeasingVRGAntecipado() throws InterruptedException {
        btnInserir();
        campoConvenio(); //1 ok
        convenioLeasing();//2 ok
        numeroAmortizacoes(); // 3 ok
        dataPrimeiraAmortizacao("10/11/2022"); //TESTAR
        valor("5000000"); //4 ok
        // valorParcela();// Quebrando
        taxaOperacao(1);
        tac1(); // 7
        //linhaDeRepasseExterno();
        direcionamento(); // 5 click ok, com demora pós click
        tipoAntecipado();
        //valorAntecipado();
        scrollMeio(); // 6 ok
        //valorIOF();//7 Falha, ainda não sei onde
        nomeOperacao("Operação Teste");
        notaFiscal(); // 7 ok
        gerente(); // 7 ok, com demora pós click
        meioLiquidacao();
        btnCalcular();
        scrollFim();
        scrollTopo();
        abaParticipantes();
        abaParticipantesPesquisarCliente();
        btnPesquisarCliente();
        selecionarCliente();
        abaLiberacao();
        liberacaoBtnAdicionar();
        scrollFim();
        btnEnviar();
    }

    @Step("Inserir Leasing com VRG diluido")
    public void inserirLeasingVRGDiluido() throws InterruptedException {
        btnInserir();
        campoConvenio(); //1 ok
        convenioLeasing();//2 ok
        numeroAmortizacoes(); // 3 ok
        dataPrimeiraAmortizacao("10/11/2022"); //TESTAR
        valor("5000000"); //4 ok
        // valorParcela();// Quebrando
        taxaOperacao(1);
        tac1(); // 7
        //linhaDeRepasseExterno();
        direcionamento(); // 5 click ok, com demora pós click
        tipoAntecipado();
        //valorAntecipado();
        valorVRGDiluido(10000);
        scrollMeio(); // 6 ok
        //valorIOF();//7 Falha, ainda não sei onde
        nomeOperacao("Operação Teste");
        notaFiscal(); // 7 ok
        gerente(); // 7 ok, com demora pós click
        meioLiquidacao();
        btnCalcular();
        scrollFim();
        scrollTopo();
        abaParticipantes();
        abaParticipantesPesquisarCliente();
        btnPesquisarCliente();
        selecionarCliente();
        abaLiberacao();
        liberacaoBtnAdicionar();
        scrollFim();
        btnEnviar();
    }

    @Step("Inserir Leasing com VRG antecipado")
    public void inserirLeasingVRGDiluidoVRGAntecipado() throws InterruptedException {
        btnInserir();
        campoConvenio(); //1 ok
        convenioLeasing();//2 ok
        numeroAmortizacoes(); // 3 ok
        dataPrimeiraAmortizacao("10/11/2022"); //TESTAR
        valor("5000000"); //4 ok
        // valorParcela();// Quebrando
        taxaOperacao(1);
        tac1(); // 7
        //linhaDeRepasseExterno();
        direcionamento(); // 5 click ok, com demora pós click
        tipoAntecipado();
        //valorAntecipado();
        valorVRGDiluido(10000);
        scrollMeio(); // 6 ok
        //valorIOF();//7 Falha, ainda não sei onde
        nomeOperacao("Operação Teste");
        notaFiscal(); // 7 ok
        gerente(); // 7 ok, com demora pós click
        meioLiquidacao();
        btnCalcular();
        scrollFim();
        scrollTopo();
        abaParticipantes();
        abaParticipantesPesquisarCliente();
        btnPesquisarCliente();
        selecionarCliente();
        abaLiberacao();
        liberacaoBtnAdicionar();
        scrollFim();
        btnEnviar();
    }

    @Step("Inserir Leasing com VRG antecipado")
    public void inserirLeasingVRGFinal() throws InterruptedException {
       btnInserir();
       campoConvenio(); //1 ok
       convenioLeasing();//2 ok
       numeroAmortizacoes(); // 3 ok
       dataPrimeiraAmortizacao("10/11/2022"); //TESTAR
       valor("5000000"); //4 ok
        //valorParcela();// Quebrando
       taxaOperacao(1);
       tac1(); // 7
        //paginaCorebank.linhaDeRepasseExterno();
       direcionamento(); // 5 click ok, com demora pós click
       tipoAntecipado();
        //paginaCorebank.valorAntecipado();
       carenciaMinimaClear();
       valorVRGFinal(10000);
       scrollMeio(); // 6 ok
        //paginaCorebank.valorIOF();//7 Falha, ainda não sei onde
       nomeOperacao("Operação Teste");
       notaFiscal(); // 7 ok
       gerente(); // 7 ok, com demora pós click
       meioLiquidacao();
       btnCalcular();
       scrollFim();
       scrollTopo();
       abaParticipantes();
       abaParticipantesPesquisarCliente();
       btnPesquisarCliente();
       selecionarCliente();
       abaLiberacao();
       liberacaoBtnAdicionar();
       scrollFim();
       btnEnviar();
        Thread.sleep(7000);
       btnEnviar();
    }
    @Step("Inserir Leasing com VRG antecipado")
    public void inserirLeasingVRGDiluidoVRGFinal() throws InterruptedException {
       btnInserir();
       campoConvenio(); //1 ok
       convenioLeasing();//2 ok
       numeroAmortizacoes(); // 3 ok
       dataPrimeiraAmortizacao("10/11/2022"); //TESTAR
       valor("5000000"); //4 ok
       taxaOperacao(1);

       tac1(); // 7
        //paginaCorebank.linhaDeRepasseExterno();
       direcionamento(); // 5 click ok, com demora pós click
       tipoAntecipado();
       valorVRGDiluido(10000);
        //paginaCorebank.valorAntecipado();
        //paginaCorebank.carenciaMinimaClear();
       valorVRGFinal(10000);
       scrollMeio(); // 6 ok
        //paginaCorebank.valorIOF();//7 Falha, ainda não sei onde
       nomeOperacao("Operação Teste");
       notaFiscal(); // 7 ok
       gerente(); // 7 ok, com demora pós click
       meioLiquidacao();
       btnCalcular();
       scrollFim();
       scrollTopo();
       abaParticipantes();
       abaParticipantesPesquisarCliente();
       btnPesquisarCliente();
       selecionarCliente();
       abaLiberacao();
       liberacaoBtnAdicionar();
       scrollFim();
       btnEnviar();
        Thread.sleep(7000);
       btnEnviar();
    }


}