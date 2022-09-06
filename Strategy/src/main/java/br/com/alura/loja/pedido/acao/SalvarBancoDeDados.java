package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.AcaoAposGerarPedido;
import br.com.alura.loja.pedido.Pedido;

public class SalvarBancoDeDados implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido){
        System.out.println("Salvando informações do pedido no banco de dados!");
    }

}
