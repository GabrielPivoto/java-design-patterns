package br.com.alura.loja.exceptions;

public class DomainException extends RuntimeException{

    public DomainException(String message) {
        super(message);
    }
}
