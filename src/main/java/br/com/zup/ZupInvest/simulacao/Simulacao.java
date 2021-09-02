package br.com.zup.ZupInvest.simulacao;

import  javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "simulacoes")
public class Simulacao {
    @Column(nullable = false, length = 50)
    private String nome;
    @Id
    private String email;
    @Column(nullable = false,length = 11)
    private String telefone;
    @Column(nullable = false)
    private double valorAplicado;
    @Column(nullable = false)
    private int mesesAplicado;

    public Simulacao() {
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
