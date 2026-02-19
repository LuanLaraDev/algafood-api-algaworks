package com.algaworks.algafood.domain.exceptionHandler;

import lombok.Getter;

@Getter
public enum ProblemType {

    ENTIDADE_NAO_ENCONTRADA("/entidade-nao-encontrada", "Entidade não encontrada");

    private String title;
    private String uri;

    ProblemType(String path, String title) {
        this.title =  title;
        this.uri = "https://algafood.com.br" + path;
    }

}
