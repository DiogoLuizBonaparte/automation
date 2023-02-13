package br.com.dimensa.corebankJosso;

import org.testng.annotations.Test;

public class CoreBankJossoTeste {

    public CoreBankPageObject paginaCorebank;

    public CoreBankSelenium pageRun;

    //@BeforeTest
    public void beforeTest() {
        pageRun = new CoreBankSelenium();
    }

    public void alterTest() {
        paginaCorebank = new CoreBankPageObject();
    }

    //@AfterTest
    public void afterTest() {
        this.paginaCorebank.fechar();
    }

    @Test(description = "Operação de Crédito - EMPKGPJ INCLUIR")
    public void OperacaoCreditoIncluirContratoEMPKGPJ() throws InterruptedException {
        beforeTest();
        pageRun.inicio();

        pageRun.InserirEMPKGPJIncluir();
    }


    @Test(description = "Operação de Crédito - ALTERAR VALOR")
    public void OperacaoCreditoAlterarValorContratoEMPKGPJ() throws InterruptedException {
        beforeTest();
        pageRun.inicio();

        pageRun.alterarEMPKGPJ();

    }


    @Test(description = "Operação de Crédito -  EXCLUIR")
    public void OperacaoCreditoExcluirContratoEMPKGPJ() throws InterruptedException {
        beforeTest();
        pageRun.inicio();

        pageRun.excluirEMPKGPJ();

    }



    @Test(description = "Operação de Crédito 1ª Curva - Inserir")
    public void OperacaoCreditoAq1CurvaInserir() throws InterruptedException {
        beforeTest();
        pageRun.inicio();

        pageRun.InserirAq1Curva();
    }

    @Test(description = "Operação de Crédito 1ª Curva - Editar")
    public void OperacaoCreditoAq1CurvaEditar() throws InterruptedException {
        beforeTest();
        pageRun.inicio();
        pageRun.alterarAq1Curva();


    }

    @Test(description = "Operação de Crédito 1ª Curva - Excluir")
    public void OperacaoCreditoAq1CurvaExcluir() throws InterruptedException {
        beforeTest();
        pageRun.inicio();
        pageRun.excluirAq1Curva();

    }

    @Test(description = "Operação de Crédito - Inserir 2ª Curva")
    public void OperacaoCreditoAq2CurvaInserir() throws InterruptedException {
        beforeTest();
        pageRun.inicio();
        pageRun.InserirAq2Curva();
    }
//
    @Test(description = "Operação de Crédito Financiamento SICOR- Inserir")
    public void OperacaoCreditoFinancianmentoSICORInserir() throws InterruptedException {
       beforeTest();
       pageRun.inicio();
       pageRun.financianmentoSICORInserir();

    }

    @Test(description = "Operação de Crédito Interveniência- INCLUIR")
    public void OperacaoCreditoIntervenienciaIncluir() throws InterruptedException {
        beforeTest();
        pageRun.inicio();
        pageRun.intervenienciaIncluir();

        // paginaCorebank.cobrador(); // click

        // paginaCorebank.dataEmissao(); // NÃO ESCREVENDO
    }

    @Test(description = "Operação de Crédito IPCPREPJ - INCLUIR")
    public void OperacaoCreditoIPCPREPJIncluir() throws InterruptedException {
        beforeTest();
        pageRun.inicio();
        pageRun.IPCPREPJIncluir();
        // paginaCorebank.cobrador(); // click
        // paginaCorebank.dataEmissao(); // NÃO ESCREVENDO
    }
//
    @Test(description = "Operação de Crédito RF360 - INCLUIR")
    public void OperacaoCreditoRF360JIncluir() throws InterruptedException {
        beforeTest();
        pageRun.inicio();
        pageRun.incluirRF360J();

    }

    @Test(description = "Operação de Crédito RF360 - INCLUIR")
    public void OperacaoCreditoconvenioRXDRepasseExternoIncluir() throws InterruptedException {
        beforeTest();
        pageRun.inicio();
        pageRun.incluirRXDRepasseExterno();

    }
    @Test(description = "Operação de Crédito Leasing - INCLUIR")
    public void OperacaoCreditoconvenioLeasingSemVRG() throws InterruptedException {
        beforeTest();
        pageRun.inicio();
        pageRun.inserirLeasingSemVRG();

    }

    @Test(description = "Operação de Crédito Leasing - INCLUIR")
    public void OperacaoCreditoconvenioLeasingVRGAntecipado() throws InterruptedException {
        beforeTest();
        pageRun.inicio();
        pageRun.inserirLeasingVRGAntecipado();
    }
    @Test(description = "Operação de Crédito Leasing - INCLUIR")
    public void OperacaoCreditoconvenioLeasingVRGDiluido() throws InterruptedException {
        beforeTest();
        pageRun.inicio();
        pageRun.inserirLeasingVRGDiluido();
    }
//
    @Test(description = "Operação de Crédito Leasing - INCLUIR")
    public void OperacaoCreditoconvenioLeasingVRGDiluidoVRGAntecipado() throws InterruptedException {
        beforeTest();
        pageRun.inicio();
        pageRun.inserirLeasingVRGDiluidoVRGAntecipado();
    }
//
    @Test(description = "Operação de Crédito Leasing - VGR FINAL -Incluir")
    public void OperacaoCreditoconvenioLeasingVRGFinal() throws InterruptedException {
        beforeTest();
        pageRun.inicio();
        pageRun.inserirLeasingVRGFinal();
    }

    @Test(description = "Operação de Crédito Leasing - VRG DILUIDO VGR FINAL -Incluir")
    public void OperacaoCreditoconvenioLeasingVRGDiluidoVRGFinal() throws InterruptedException {
        beforeTest();
        pageRun.inicio();
        pageRun.inserirLeasingVRGDiluidoVRGFinal();
    }
    //

}
