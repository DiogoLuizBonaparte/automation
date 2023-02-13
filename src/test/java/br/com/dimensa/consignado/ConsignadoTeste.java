package br.com.dimensa.consignado;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ConsignadoTeste {
    private ConsignadoPageObject paginaConsignado;


    //@BeforeTest
    public void beforeTest() {
        this.paginaConsignado = new ConsignadoPageObject();
    }

    //@AfterTest
    public void afterTest() {
        this.paginaConsignado.fechar();
    }


    //                 INCLUSÃO
    @Test(description = "Canal de Atendimento - INCLUIR")
    public void CanalDeAtendimentoAdicionarIncluir() throws InterruptedException {
        beforeTest();
        paginaConsignado.loginSenha("tb", "tb");
        paginaConsignado.btnLoginSearch();
        paginaConsignado.menuConsignado();
        paginaConsignado.menuAbrangencia();
        paginaConsignado.btnConfimar();
        paginaConsignado.btnOptions();
        paginaConsignado.menuParametros();
        paginaConsignado.canalDeAtendimento();
        paginaConsignado.btnAdicionarNovo();
        paginaConsignado.adicionarCodigo();
        paginaConsignado.adicionarDescricao();
        paginaConsignado.btnSalvar();
        paginaConsignado.btnMensagemDeSucesso();
        paginaConsignado.fechar();
    }


    @Test(description = "Canal de Atendimento - ADICIONANDO SEGUIDAMENTE")
    public void CanalDeAtendimentoAdicionarNovoAdicionandoSeguidamente() throws InterruptedException {
        beforeTest();
        paginaConsignado.loginSenha("tb", "tb");
        paginaConsignado.btnLoginSearch();
        paginaConsignado.menuConsignado();
        paginaConsignado.menuAbrangencia();
        paginaConsignado.btnConfimar();
        paginaConsignado.btnOptions();
        paginaConsignado.menuParametros();
        paginaConsignado.canalDeAtendimento();
        paginaConsignado.btnAdicionarNovoFluxoCompleto();
        paginaConsignado.fechar();
    }


    //                     EXCLUSÃO
    @Test(description = "Canal de Atendimento - EXCLUIR")
    public void CanalDeAtendimentoExcluirAtendimento() throws InterruptedException {
        beforeTest();
        paginaConsignado.loginSenha("tb", "tb");
        paginaConsignado.btnLoginSearch();
        paginaConsignado.menuConsignado();
        paginaConsignado.menuAbrangencia();
        paginaConsignado.btnConfimar();
        paginaConsignado.btnOptions();
        paginaConsignado.menuParametros();
        paginaConsignado.canalDeAtendimento();
        paginaConsignado.btnMenuAcoes();
        paginaConsignado.btnExluir();
        paginaConsignado.btnCancelarExclusão();
        paginaConsignado.btnMenuAcoes();
        paginaConsignado.btnExluir();
        paginaConsignado.btnConfirmarExclusão();
        paginaConsignado.btnMensagemDeSucesso();
        paginaConsignado.fechar();

    }

    //              EDIÇÃO
    @Test(description = "Canal de Atendimento - EDITAR")
    public void CanalDeAtendimentoEditarAtendimento() throws InterruptedException {
        beforeTest();
        paginaConsignado.loginSenha("tb", "tb");
        paginaConsignado.btnLoginSearch();
        paginaConsignado.menuConsignado();
        paginaConsignado.menuAbrangencia();
        paginaConsignado.btnConfimar();
        paginaConsignado.btnOptions();
        paginaConsignado.menuParametros();
        paginaConsignado.canalDeAtendimento();
        paginaConsignado.btnMenuAcoes();
        paginaConsignado.btnEditar();
        paginaConsignado.campoCodigoNaoAlteravel();
        paginaConsignado.campoDescricao();
        paginaConsignado.campoSituacao();
        paginaConsignado.btnSalvarEdicao();
        paginaConsignado.btnSMensagemDeSucesso();
        paginaConsignado.fechar();
    }

    //                VISUALIZAÇAO
    @Test(description = "Canal de Atendimento - VISUALIZAR")
    public void CanalDeAtendimentoVisualizarAtendimento() throws InterruptedException {
        beforeTest();
        paginaConsignado.loginSenha("tb", "tb");
        paginaConsignado.btnLoginSearch();
        paginaConsignado.menuConsignado();
        paginaConsignado.menuAbrangencia();
        paginaConsignado.btnConfimar();
        paginaConsignado.btnOptions();
        paginaConsignado.menuParametros();
        paginaConsignado.canalDeAtendimento();
        paginaConsignado.btnMenuAcoes();
        paginaConsignado.btnVisualizar();
        paginaConsignado.btnCancelarVisualizacao();
        paginaConsignado.fechar();
    }


    //          MOTIVO DE EXCLUSÃO DE EMPRÉSTIMO
    @Test(description = "Motivo de Exclusão de Empréstimo - INCLUIR")
    public void MotivoDeExclusãoDeEmprestimoIncluir() throws InterruptedException {
        beforeTest();
        paginaConsignado.loginSenha("tb", "tb");
        paginaConsignado.btnLoginSearch();
        paginaConsignado.menuConsignado();
        paginaConsignado.menuAbrangencia();
        paginaConsignado.btnConfimar();
        paginaConsignado.btnOptions();
        paginaConsignado.menuParametros();
        paginaConsignado.motivoExclusaoTeste();
        paginaConsignado.exclusãoDeEmprestimoBtnAddNovo();
        paginaConsignado.exclusãoDeEmprestimoCampoCódigo();
        paginaConsignado.exclusãoDeEmprestimoCampoDescricao();
        paginaConsignado.btnSalvar();
        paginaConsignado.btnMensagemDeSucesso();
        paginaConsignado.fechar();
    }
    @Test(description = "Motivo de Exclusão de Empréstimo - EDITAR")
    public void MotivoDeExclusãoDeEmprestimoEditar() throws InterruptedException {
        beforeTest();
        paginaConsignado.loginSenha("tb", "tb");
        paginaConsignado.btnLoginSearch();
        paginaConsignado.menuConsignado();
        paginaConsignado.menuAbrangencia();
        paginaConsignado.btnConfimar();
        paginaConsignado.btnOptions();
        paginaConsignado.menuParametros();
        paginaConsignado.motivoExclusaoTeste();
        paginaConsignado.btnMenuAcoes();
        paginaConsignado.btnEditar();
        paginaConsignado.campoCodigoNaoAlteravel();
        paginaConsignado.campoDescricao();
        paginaConsignado.campoSituacao();
        paginaConsignado.btnSalvarEdicao();
        paginaConsignado.btnSMensagemDeSucesso();
        paginaConsignado.fechar();
    }

    @Test(description = "Motivo de Exclusão de Empréstimo - EXCLUIR")
    public void MotivoDeExclusãoDeEmprestimoExcluir() throws InterruptedException {
        beforeTest();
        paginaConsignado.loginSenha("tb", "tb");
        paginaConsignado.btnLoginSearch();
        paginaConsignado.menuConsignado();
        paginaConsignado.menuAbrangencia();
        paginaConsignado.btnConfimar();
        paginaConsignado.btnOptions();
        paginaConsignado.menuParametros();
        paginaConsignado.motivoExclusaoTeste();
        paginaConsignado.btnMenuAcoes();
        paginaConsignado.btnExluir();
        paginaConsignado.btnCancelarExclusão();
        paginaConsignado.btnMenuAcoes();
        paginaConsignado.btnExluir();
        paginaConsignado.btnConfirmarExclusão();
        paginaConsignado.fechar();
    }
    @Test(description = "Motivo de Exclusão de Empréstimo - VISUALIZAR")
    public void MotivoDeExclusãoDeEmprestimoVisualizar() throws InterruptedException {
        beforeTest();
        paginaConsignado.loginSenha("tb", "tb");
        paginaConsignado.btnLoginSearch();
        paginaConsignado.menuConsignado();
        paginaConsignado.menuAbrangencia();
        paginaConsignado.btnConfimar();
        paginaConsignado.btnOptions();
        paginaConsignado.menuParametros();
        paginaConsignado.motivoExclusaoTeste();
        paginaConsignado.btnMenuAcoes();
        paginaConsignado.btnVisualizar();
        paginaConsignado.btnCancelarVisualizacao();
        paginaConsignado.fechar();
    }
//                     CLASSIFICADOR DA MODALIDADE
    @Test(description = "Classificador da Modalidade - INCLUIR")
    public void ClassificadorDaModalidadeIncluir() throws InterruptedException {
        beforeTest();
        paginaConsignado.loginSenha("tb", "tb");
        paginaConsignado.btnLoginSearch();
        paginaConsignado.menuConsignado();
        paginaConsignado.menuAbrangencia();
        paginaConsignado.btnConfimar();
        paginaConsignado.btnOptions();
        paginaConsignado.menuParametros();
        paginaConsignado.classificadorDaModalidade();
        paginaConsignado.btnAdicionarNovo();
        paginaConsignado.adicionarCodigo();
        paginaConsignado.adicionarDescricao();
        paginaConsignado.tipoConsignatario();
        paginaConsignado.btnSalvar();
        paginaConsignado.btnMensagemDeSucesso();
        paginaConsignado.fechar();

    }
    @Test(description = "Classificador da Modalidade - EDITAR")
    public void ClassificadorDaModalidadeEditar() throws InterruptedException {
        beforeTest();
        paginaConsignado.loginSenha("tb", "tb");
        paginaConsignado.btnLoginSearch();
        paginaConsignado.menuConsignado();
        paginaConsignado.menuAbrangencia();
        paginaConsignado.btnConfimar();
        paginaConsignado.btnOptions();
        paginaConsignado.menuParametros();
        paginaConsignado.classificadorDaModalidade();
        paginaConsignado.btnMenuAcoes();
        paginaConsignado.classificadorDaModalidadeBtnEditar();
        paginaConsignado.campoCodigoNaoAlteravel();
        paginaConsignado.campoDescricao();
        paginaConsignado.btnSalvarEdicao();
        paginaConsignado.btnSMensagemDeSucesso();
        paginaConsignado.fechar();
    }
    @Test(description = "Classificador da Modalidade - EXCLUIR")
    public void ClassificadorDaModalidadeExcluir() throws InterruptedException {
        beforeTest();
        paginaConsignado.loginSenha("tb", "tb");
        paginaConsignado.btnLoginSearch();
        paginaConsignado.menuConsignado();
        paginaConsignado.menuAbrangencia();
        paginaConsignado.btnConfimar();
        paginaConsignado.btnOptions();
        paginaConsignado.menuParametros();
        paginaConsignado.classificadorDaModalidade();
        paginaConsignado.btnMenuAcoes();
        paginaConsignado.classificadorDaModalidadeBtnExluir();
        paginaConsignado.btnCancelarExclusão();
        paginaConsignado.btnMenuAcoes();
        paginaConsignado.classificadorDaModalidadeBtnExluir();
        paginaConsignado.btnConfirmarExclusão();
        paginaConsignado.fechar();
    }
    @Test(description = "Classificador da Modalidade - VISUALIZAR")
    public void ClassificadorDaModalidadeVisualizar() throws InterruptedException {
        beforeTest();
        paginaConsignado.loginSenha("tb", "tb");
        paginaConsignado.btnLoginSearch();
        paginaConsignado.menuConsignado();
        paginaConsignado.menuAbrangencia();
        paginaConsignado.btnConfimar();
        paginaConsignado.btnOptions();
        paginaConsignado.menuParametros();
        paginaConsignado.classificadorDaModalidade();
        paginaConsignado.btnMenuAcoes();
        paginaConsignado.classificadorDaModalidadeBtnVisualizar();
        paginaConsignado.btnCancelarVisualizacao();
        paginaConsignado.fechar();

    }

    //           MOTIVO DE REVISÃO DE REFINANCIAMENTO
    @Test(description = "Motivo de Revisão de Refinanciamento - INCLUIR")
    public void MotivoDeRevisaoDeRefinaciamentoIncluir() throws InterruptedException {
        beforeTest();
        paginaConsignado.loginSenha("tb", "tb");
        paginaConsignado.btnLoginSearch();
        paginaConsignado.menuConsignado();
        paginaConsignado.menuAbrangencia();
        paginaConsignado.btnConfimar();
        paginaConsignado.btnOptions();
        paginaConsignado.menuParametros();
        paginaConsignado.motivoDeRevisaoDeRefinanciamento();
        paginaConsignado.btnAdicionarNovo();
        paginaConsignado.adicionarCodigo();
        paginaConsignado.campoDocumento();
        paginaConsignado.campoSituacao();
        paginaConsignado.btnSalvar();
        paginaConsignado.btnMensagemDeSucesso();
        paginaConsignado.fechar();

    }
    @Test(description = "Motivo de Revisão de Refinanciamento - EDITAR")
    public void MotivoDeRevisaoDeRefinaciamentoEditar() throws InterruptedException {
        beforeTest();
        paginaConsignado.loginSenha("tb", "tb");
        paginaConsignado.btnLoginSearch();
        paginaConsignado.menuConsignado();
        paginaConsignado.menuAbrangencia();
        paginaConsignado.btnConfimar();
        paginaConsignado.btnOptions();
        paginaConsignado.menuParametros();
        paginaConsignado.motivoDeRevisaoDeRefinanciamento();
        paginaConsignado.btnMenuAcoes();
        paginaConsignado.btnEditar();
        paginaConsignado.campoCodigoNaoAlteravel();
        paginaConsignado.campoDocumento();
        paginaConsignado.campoSituacao();
        paginaConsignado.btnSalvar();
        paginaConsignado.btnMensagemDeSucesso();
        paginaConsignado.fechar();

    }
    @Test(description = "Motivo de Revisão de Refinanciamento - EXCLUIR")
    public void MotivoDeRevisaoDeRefinaciamentoExcluir() throws InterruptedException {
        beforeTest();
        paginaConsignado.loginSenha("tb", "tb");
        paginaConsignado.btnLoginSearch();
        paginaConsignado.menuConsignado();
        paginaConsignado.menuAbrangencia();
        paginaConsignado.btnConfimar();
        paginaConsignado.btnOptions();
        paginaConsignado.menuParametros();
        paginaConsignado.motivoDeRevisaoDeRefinanciamento();
        paginaConsignado.btnMenuAcoes();
        paginaConsignado.btnExluir();
        paginaConsignado.btnCancelarExclusão();
        paginaConsignado.btnMenuAcoes();
        paginaConsignado.btnExluir();
        paginaConsignado.btnConfirmarExclusão();
        paginaConsignado.btnMensagemDeSucesso();
        paginaConsignado.fechar();

    }
    @Test(description = "Motivo de Revisão de Refinanciamento - VISUALIZAR")
    public void MotivoDeRevisaoDeRefinaciamentoVisualizar() throws InterruptedException {
        beforeTest();
        paginaConsignado.loginSenha("tb", "tb");
        paginaConsignado.btnLoginSearch();
        paginaConsignado.menuConsignado();
        paginaConsignado.menuAbrangencia();
        paginaConsignado.btnConfimar();
        paginaConsignado.btnOptions();
        paginaConsignado.menuParametros();
        paginaConsignado.motivoDeRevisaoDeRefinanciamento();
        paginaConsignado.btnMenuAcoes();
        paginaConsignado.btnVisualizar();
        paginaConsignado.btnCancelarVisualizacao();
        paginaConsignado.fechar();
    }
    @Test(description = "Documento de Identificação - INCLUIR")
    public void DocumentoDeIdentificacaoIncluir() throws InterruptedException {
        beforeTest();
        paginaConsignado.loginSenha("tb", "tb");
        paginaConsignado.btnLoginSearch();
        paginaConsignado.menuConsignado();
        paginaConsignado.menuAbrangencia();
        paginaConsignado.btnConfimar();
        paginaConsignado.btnOptions();
        paginaConsignado.menuParametros();
        paginaConsignado.documentoDeIdentificacao();
        paginaConsignado.btnAdicionarNovo();
        paginaConsignado.adicionarCodigo();
        paginaConsignado.campoDocumento();
        paginaConsignado.campoSituacao();
        paginaConsignado.btnSalvar();
        paginaConsignado.btnMensagemDeSucesso();
        paginaConsignado.fechar();
    }

    @Test(description = "Documento de Identificação - EXCLUIR")
    public void DocumentoDeIdentificacaoExcluir() throws InterruptedException {
        beforeTest();
        paginaConsignado.loginSenha("tb", "tb");
        paginaConsignado.btnLoginSearch();
        paginaConsignado.menuConsignado();
        paginaConsignado.menuAbrangencia();
        paginaConsignado.btnConfimar();
        paginaConsignado.btnOptions();
        paginaConsignado.menuParametros();
        paginaConsignado.documentoDeIdentificacao();
        paginaConsignado.btnMenuAcoes();
        paginaConsignado.btnExluir();
        paginaConsignado.btnCancelarExclusão();
        paginaConsignado.btnMenuAcoes();
        paginaConsignado.btnExluir();
        paginaConsignado.btnConfirmarExclusão();
        paginaConsignado.fechar();
    }
    @Test(description = "Documento de Identificação - EDITAR")
    public void DocumentoDeIdentificacaoEditar() throws InterruptedException {
        beforeTest();
        paginaConsignado.loginSenha("tb", "tb");
        paginaConsignado.btnLoginSearch();
        paginaConsignado.menuConsignado();
        paginaConsignado.menuAbrangencia();
        paginaConsignado.btnConfimar();
        paginaConsignado.btnOptions();
        paginaConsignado.menuParametros();
        paginaConsignado.documentoDeIdentificacao();
        paginaConsignado.btnMenuAcoes();
        paginaConsignado.btnEditar();
        paginaConsignado.campoCodigoNaoAlteravel();
        paginaConsignado.campoDescricao();
        paginaConsignado.campoSituacao();
        paginaConsignado.btnSalvarEdicao();
        paginaConsignado.btnSMensagemDeSucesso();
        paginaConsignado.fechar();
    }
    @Test(description = "Documento de Identificação - VISUALIZAR")
    public void DocumentoDeIdentificacaoVisualizar() throws InterruptedException {
        beforeTest();
        paginaConsignado.loginSenha("tb", "tb");
        paginaConsignado.btnLoginSearch();
        paginaConsignado.menuConsignado();
        paginaConsignado.menuAbrangencia();
        paginaConsignado.btnConfimar();
        paginaConsignado.btnOptions();
        paginaConsignado.menuParametros();
        paginaConsignado.documentoDeIdentificacao();
        paginaConsignado.btnMenuAcoes();
        paginaConsignado.btnVisualizar();
        paginaConsignado.btnCancelarVisualizacao();
        paginaConsignado.fechar();
    }

    @Test(description = "Instiuição Financeira - INCLUIR")
    public void InstituicaoFinanceiraIncluir() throws InterruptedException {
        beforeTest();
        paginaConsignado.loginSenha("tb", "tb");
        paginaConsignado.btnLoginSearch();
        paginaConsignado.menuConsignado();
        paginaConsignado.menuAbrangencia();
        paginaConsignado.btnConfimar();
        paginaConsignado.btnOptions();
        paginaConsignado.menuParametros();
        paginaConsignado.instituicaoFinanceira();
        paginaConsignado.btnAdicionarNovo();
        paginaConsignado.adicionarCodigo();
        paginaConsignado.adicionarDescricao();
        paginaConsignado.cnpj();
        paginaConsignado.tipoConsignatarioInstiuicaoFinanceira();
        paginaConsignado.btnSalvar();
        paginaConsignado.btnMensagemDeSucesso();
        paginaConsignado.fechar();
    }
    @Test(description = "Instiuição Financeira - EXCLUIR")
    public void InstituicaoFinanceiraExcluir() throws InterruptedException {
        beforeTest();
        paginaConsignado.loginSenha("tb", "tb");
        paginaConsignado.btnLoginSearch();
        paginaConsignado.menuConsignado();
        paginaConsignado.menuAbrangencia();
        paginaConsignado.btnConfimar();
        paginaConsignado.btnOptions();
        paginaConsignado.menuParametros();
        paginaConsignado.instituicaoFinanceira();
        paginaConsignado.btnMenuAcoes();
        paginaConsignado.instituicaoFinanceiraBtnExluir();
        paginaConsignado.btnCancelarExclusão();
        paginaConsignado.btnMenuAcoes();
        paginaConsignado.instituicaoFinanceiraBtnExluir();
        paginaConsignado.btnConfirmarExclusão();
        paginaConsignado.btnMensagemDeSucesso();
        paginaConsignado.fechar();
    }
    @Test(description = "Instiuição Financeira - EDITAR")
    public void InstituicaoFinanceiraEditar() throws InterruptedException {
        beforeTest();
        paginaConsignado.loginSenha("tb", "tb");
        paginaConsignado.btnLoginSearch();
        paginaConsignado.menuConsignado();
        paginaConsignado.menuAbrangencia();
        paginaConsignado.btnConfimar();
        paginaConsignado.btnOptions();
        paginaConsignado.menuParametros();
        paginaConsignado.instituicaoFinanceira();
        paginaConsignado.btnMenuAcoes();
        paginaConsignado.instituicaoFinanceiraBtnEditar();
        paginaConsignado.adicionarDescricao();
        paginaConsignado.btnSalvar();
        paginaConsignado.btnMensagemDeSucesso();
        paginaConsignado.fechar();

    }
    @Test(description = "Instiuição Financeira - VISUALIZAR")
    public void InstituicaoFinanceiraVisualizar() throws InterruptedException {
        beforeTest();
        paginaConsignado.loginSenha("tb", "tb");
        paginaConsignado.btnLoginSearch();
        paginaConsignado.menuConsignado();
        paginaConsignado.menuAbrangencia();
        paginaConsignado.btnConfimar();
        paginaConsignado.btnOptions();
        paginaConsignado.menuParametros();
        paginaConsignado.instituicaoFinanceira();
        paginaConsignado.btnMenuAcoes();
        paginaConsignado.instituicaoFinanceiraBtnVisualizar();
        paginaConsignado.btnCancelarVisualizacao();
        paginaConsignado.fechar();
    }



    @Test(description = "Emprestimo - Autorização e Desbloqueio")
    public void EmprestimoAutorizacaoDesbloqueio() throws InterruptedException {
        beforeTest();
        paginaConsignado.loginSenha("tb", "tb");
        paginaConsignado.btnLoginSearch();
        paginaConsignado.menuConsignado();
        paginaConsignado.menuAbrangencia();
        paginaConsignado.btnConfimar();
        paginaConsignado.btnOptions();
        paginaConsignado.menuEmprestimo();
        paginaConsignado.autorizacaoDesbloqueio();
        paginaConsignado.btnAdicionarNovo();
        paginaConsignado.tipoConsignatarioEmprestimo();
        paginaConsignado.autorizacaoDesbloqueioCampoLocalizarNome();
        paginaConsignado.autorizacaoDesbloqueioBtnPesquisar();
        paginaConsignado.scroll();
        paginaConsignado.autorizacaoDesbloqueioRadiobuttonSelecionar();
        paginaConsignado.fechar();
    }

    @Test(description = "Portabilidade - Consulta Dataprev - INCLUIR")
    public void PortabilidadeConsultaDataprevIncluir() throws InterruptedException {
        beforeTest();
        paginaConsignado.loginSenha("tb", "tb");
        paginaConsignado.btnLoginSearch();
        paginaConsignado.menuConsignado();
        paginaConsignado.menuAbrangencia();
        paginaConsignado.btnConfimar();
        paginaConsignado.btnOptions();
        paginaConsignado.menuPortabilidade();
        paginaConsignado.portabilidadeConsultaDataprev();
        paginaConsignado.portabilidadeBatnAdicionarNovo();
        paginaConsignado.portabilidadeModalSelecaoConsignatario();
        paginaConsignado.consultaDataprevCampoSituacaoAberta();
        paginaConsignado.portabilidadeCampoNumeroBeneficio();
        paginaConsignado.portabilidadeCampoCodigoIFOrigem();
        paginaConsignado.portabilidadeDataInicio();
        paginaConsignado.portabilidadeDataFim();
        paginaConsignado.btnConusltarDataprev();
        paginaConsignado.portabilidadaBtnMensagemDeSucesso();
    }
    @Test(description = "Portabilidade - Consulta Dataprev - VISUALIZAR")
    public void PortabilidadeConsultaDataprevVisualizar() throws InterruptedException {
        beforeTest();
        paginaConsignado.loginSenha("tb", "tb");
        paginaConsignado.btnLoginSearch();
        paginaConsignado.menuConsignado();
        paginaConsignado.menuAbrangencia();
        paginaConsignado.btnConfimar();
        paginaConsignado.btnOptions();
        paginaConsignado.menuPortabilidade();
        paginaConsignado.portabilidadeConsultaDataprev();
        paginaConsignado.portabilidadeBtnMenuAcoes();
        paginaConsignado.portabilidadeBtnVisualizar();
        paginaConsignado.portabilidadeBtnVoltar();
    }
    //      PORTABILIDADE - EXCLUSÃO
    @Test(description = "Portabilidade - Exclusão - INCLUIR")
    public void PortabilidadeConsultaExclusãoIncluir() throws InterruptedException {
        beforeTest();
        paginaConsignado.loginSenha("tb", "tb");
        paginaConsignado.btnLoginSearch();
        paginaConsignado.menuConsignado();
        paginaConsignado.menuAbrangencia();
        paginaConsignado.btnConfimar();
        paginaConsignado.btnOptions();
        paginaConsignado.menuPortabilidade();
        paginaConsignado.portabilidadeExclusão();
        paginaConsignado.portabilidadeBatnAdicionarNovo();
        paginaConsignado.portabilidadeExclusaoModalSelecaoConsignatario();
        paginaConsignado.PortabilidadeExclusaoBtnPesquisarBeneficiario();
        paginaConsignado.PortabilidadeExclusaoCampoLocalizarNome("ARLEI FAGUNDES");
        paginaConsignado.PortabilidadeExclusaoSelecionarNome();
        paginaConsignado.PortabilidadeExclusaoBtnPesquisarBeneficio();
        paginaConsignado.PortabilidadeExclusaoSelecionarBeneficio();
        paginaConsignado.PortabilidadeExclusaoBtnPesquisarIfProponente();
        paginaConsignado.PortabilidadeExclusaoCampoLocalizarIfProponente("BANCO SICOOB");
        paginaConsignado.PortabilidadeExclusaoSelecionarBanco();
        paginaConsignado.scroll();
        paginaConsignado.PortabilidadeExclusaoRadioButtonSelecionarContrato();
        paginaConsignado.exclusaoBtnSalvar();
        paginaConsignado.btnMensagemDeSucesso();
        paginaConsignado.fechar();
    }
    @Test(description = "Portabilidade - Exclusão - VISUALIZAR")
    public void PortabilidadeConsultaExclusãoVisualizar() throws InterruptedException {
        beforeTest();
        paginaConsignado.loginSenha("tb", "tb");
        paginaConsignado.btnLoginSearch();
        paginaConsignado.menuConsignado();
        paginaConsignado.menuAbrangencia();
        paginaConsignado.btnConfimar();
        paginaConsignado.btnOptions();
        paginaConsignado.menuPortabilidade();
        paginaConsignado.portabilidadeExclusão();
        paginaConsignado.portabilidadeBtnMenuAcoes();
        paginaConsignado.portabilidadeBtnVisualizar();
        paginaConsignado.PortabilidadeExclusaoBtnPesquisarBeneficiario();
        paginaConsignado.PortabilidadeExclusaoBtnPesquisarBeneficio();
        paginaConsignado.PortabilidadeExclusaoBtnPesquisarIfProponente();
        paginaConsignado.portabilidadeBtnVoltar();
        paginaConsignado.fechar();
    }
    @Test(description = "Portabilidade - Exclusão - EDITAR")
    public void PortabilidadeConsultaExclusãoEditar() throws InterruptedException {
        beforeTest();
        paginaConsignado.loginSenha("tb", "tb");
        paginaConsignado.btnLoginSearch();
        paginaConsignado.menuConsignado();
        paginaConsignado.menuAbrangencia();
        paginaConsignado.btnConfimar();
        paginaConsignado.btnOptions();
        paginaConsignado.menuPortabilidade();
        paginaConsignado.portabilidadeExclusão();
        paginaConsignado.portabilidadeBtnMenuAcoes();
        paginaConsignado.portabilidadeBtnEditar();
        paginaConsignado.PortabilidadeExclusaoBtnPesquisarBeneficiario();
        paginaConsignado.PortabilidadeExclusaoBtnPesquisarBeneficio();
        paginaConsignado.PortabilidadeExclusaoBtnPesquisarIfProponente();
        paginaConsignado.PortabilidadeExclusaoEditSelecionarBanco();
        paginaConsignado.exclusaoBtnSalvar();
        paginaConsignado.fechar();
    }
}