package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        //Testando o valor do imposto pelo padrão Strategy
        Orcamento orc = new Orcamento(new BigDecimal("550"),4);
        CalculadoraDeImpostos ci = new CalculadoraDeImpostos();
        System.out.println("Valor do imposto: " + ci.calcular(orc, new ISS()));

        CalculadoraDeDescontos cd = new CalculadoraDeDescontos();
        System.out.println("Valor do desconto: " + cd.calcular(orc));


    }

}
