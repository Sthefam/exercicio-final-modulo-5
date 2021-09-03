package br.com.zup.ZupInvest.simulacao;

import br.com.zup.ZupInvest.simulacao.dtos.CadastroSimulacaoDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import org.json.JSONString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(SimulacaoController.class)
public class SimulacaoControllerTest {
    @MockBean
    private SimulacaoService simulacaoService;

    @SpyBean
    private ModelMapper modelMapper;

    @Autowired
    private MockMvc mockMVC;

    private CadastroSimulacaoDTO simulacaoDTO;
    private ObjectMapper objMapper;

    @BeforeEach
    public void setUp(){
        simulacaoDTO = new CadastroSimulacaoDTO();
        simulacaoDTO.setNome("Xablau");
        simulacaoDTO.setEmail("xablauxablau.com");
        simulacaoDTO.setTelefone("11985632564");
        simulacaoDTO.setValorAplicado(1000);
        simulacaoDTO.setMesesAplicado(12);
        objMapper = new ObjectMapper();
    }



}
