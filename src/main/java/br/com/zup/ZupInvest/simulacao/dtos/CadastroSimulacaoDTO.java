package br.com.zup.ZupInvest.simulacao.dtos;

public class CadastroSimulacaoDTO {
    private String nome;
    private String email;
    private String telefone;
    private double valorAplicado;
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
