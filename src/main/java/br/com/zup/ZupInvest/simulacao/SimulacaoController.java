package br.com.zup.ZupInvest.simulacao;

import br.com.zup.ZupInvest.simulacao.dtos.CadastroSimulacaoDTO;
import br.com.zup.ZupInvest.simulacao.dtos.RendimentoDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDate;

@RestController
public class SimulacaoController {
    private ModelMapper modelMapper;
    private SimulacaoService simulacaoService;

    @Autowired
    public SimulacaoController(ModelMapper modelMapper, SimulacaoService simulacaoService) {
        this.modelMapper = modelMapper;
        this.simulacaoService = simulacaoService;
    }

    @PutMapping("/simulacao")
    public void cadastrarSimulacao(@RequestBody @Valid CadastroSimulacaoDTO simulacaoDTO){
        RendimentoDTO rendimentoDTO = new RendimentoDTO();
        rendimentoDTO.setNome(simulacaoDTO.getNome());
        rendimentoDTO.setRendimento(simulacaoService.cadastrarSimulacao(modelMapper.map(simulacaoDTO,Simulacao.class)));
        rendimentoDTO.setDataDeResgate(LocalDate.now().plusMonths(simulacaoDTO.getMesesAplicado()));
        rendimentoDTO.setValorAplicado(simulacaoDTO.getValorAplicado());

        return rendimentoDTO;
    }

}
