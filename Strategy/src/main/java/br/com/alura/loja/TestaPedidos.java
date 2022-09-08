package br.com.alura.loja;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.acao.EnviarEmail;
import br.com.alura.loja.pedido.acao.LogDePedido;
import br.com.alura.loja.pedido.acao.SalvarBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestaPedidos {

    public static void main(String[] args) {

        String cliente = "Saul Goodman";
        BigDecimal valorOrcamento = new BigDecimal("500");
        int quantidadeItens = 5;

        GeraPedido gerador = new GeraPedido(cliente,valorOrcamento,quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(
                new EnviarEmail(), new SalvarBancoDeDados(), new LogDePedido()
        ));
        handler.execute(gerador);

    }

}
