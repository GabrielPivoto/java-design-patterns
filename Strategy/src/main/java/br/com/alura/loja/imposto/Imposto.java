package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Imposto {

    private Imposto outro;
    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

    public Imposto(Imposto outro) {
        this.outro = outro;
    }

    public BigDecimal calcularImposto(Orcamento orcamento){
        BigDecimal valorImposto = realizarCalculo(orcamento);
        return outro != null ? valorImposto.add(outro.realizarCalculo(orcamento)) : valorImposto.add(BigDecimal.ZERO);
    }

}
