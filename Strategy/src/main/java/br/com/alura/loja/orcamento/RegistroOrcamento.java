package br.com.alura.loja.orcamento;

import br.com.alura.loja.exceptions.DomainException;
import br.com.alura.loja.http.HttpAdapter;

import java.util.Map;

public class RegistroOrcamento {

    private HttpAdapter http;

    public RegistroOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento){
        //Chamada HTTP para a API externa
        //URL Connection
        //HTTP Client
        //lib Rest
        if(!orcamento.isFinalizado())
            throw  new DomainException("Orcamento precisa ser finalizado!");

        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeItens()
        );
        http.post("http://api.externa/orcamento",dados);
    }

}
