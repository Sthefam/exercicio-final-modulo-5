package br.com.zup.ZupInvest.simulacao.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CadastroSimulacaoDTO {
    @Size(min = 2, max = 20, message = "{cliente.nome}")
    private String nome;
    @Email(message = "{cliente.email}")
    private String email;
    @Size(min = 10, max = 11, message = "{cliente.telefone}")
    private String telefone;
    @NotNull(message = "{cliente.valorAplicado}")
    private double valorAplicado;
    @NotNull(message = "{mesesAplicado}")
    private int mesesAplicado;

    public CadastroSimulacaoDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getValorAplicado() {
        return valorAplicado;
    }

    public void setValorAplicado(double valorAplicado) {
        this.valorAplicado = valorAplicado;
    }

    public int getMesesAplicado() {
        return mesesAplicado;
    }

    public void setMesesAplicado(int mesesAplicado) {
        this.mesesAplicado = mesesAplicado;
    }
}
