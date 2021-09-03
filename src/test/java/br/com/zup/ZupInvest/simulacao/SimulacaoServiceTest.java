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



}