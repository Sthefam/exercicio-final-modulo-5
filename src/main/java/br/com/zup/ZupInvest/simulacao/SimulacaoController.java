package br.com.zup.ZupInvest.simulacao;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimulacaoController {
    private ModelMapper modelMapper;
    private SimulacaoService simulacaoService;

    @Autowired
    public SimulacaoController(ModelMapper modelMapper, SimulacaoService simulacaoService) {
        this.modelMapper = modelMapper;
        this.simulacaoService = simulacaoService;
    }
}
