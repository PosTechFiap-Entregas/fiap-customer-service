package br.com.fiap.postech.soat.techchallenge.domain.exceptions;

public class InvalidEmailException extends RuntimeException {
    public InvalidEmailException(String message) {
        super(message);
    }
}
