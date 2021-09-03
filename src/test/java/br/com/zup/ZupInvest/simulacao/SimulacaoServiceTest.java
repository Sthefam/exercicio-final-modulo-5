package br.com.zup.ZupInvest.simulacao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class SimulacaoServiceTest {
    @Autowired
    private SimulacaoService simulacaoService;

    @MockBean
    private SimulacaoRepository simulacaoRepository;

    private Simulacao simulacao;

    @BeforeEach
    public void setUp(){
        simulacao = new Simulacao();
        simulacao.setNome("Xablau");
        simulacao.setEmail("xablau@xablau.com");
        simulacao.setTelefone("11985236547");
        simulacao.setValorAplicado(1000);
        simulacao.setMesesAplicado(12);
    }

    @Test
    public void testarMetodoCadastrarSimulacao(){
        Mockito.when(simulacaoRepository.save(Mockito.any(Simulacao.class))).thenReturn(simulacao);

        double resultado = simulacaoService.cadastrarSimulacao(simulacao);
        Assertions.assertEquals(60,resultado);
    }


}
