package br.com.alura.loja;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Orcamento orc = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos ci = new CalculadoraDeImpostos();

        System.out.println(ci.calcular(orc, new ISS()));

    }

}
