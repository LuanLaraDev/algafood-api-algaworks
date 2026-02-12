package com.algaworks.algafood.domain.exception;

public class CozinhaNaoEncontradaException extends EntidadeNaoEncontradaException {

    private static final Long serialVersionUID = 1L;

    public CozinhaNaoEncontradaException(String message) {
        super(message);
    }

    public CozinhaNaoEncontradaException(Long cozinhaId) {
        this(String.format("Não existe um cadastro de cozinha com o código %d", cozinhaId));
    }
}
