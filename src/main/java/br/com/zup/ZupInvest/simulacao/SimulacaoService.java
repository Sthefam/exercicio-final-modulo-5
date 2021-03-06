package br.com.zup.ZupInvest.simulacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimulacaoService {
    @Autowired
    private SimulacaoRepository simulacaoRepository;

    public double cadastrarSimulacao(Simulacao simulacao){
        simulacaoRepository.save(simulacao);
        return calcularInvestimento(simulacao);
    }

    public double calcularInvestimento(Simulacao simulacao){
        return (simulacao.getValorAplicado() * ((0.5/100) * simulacao.getMesesAplicado()));
    }
}
