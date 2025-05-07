//Exercício 3

package br.edu.ClassificacaoProduto.model;

/**
 *
 * @author Admin
 */

public enum ClassificacaoProduto {
    BASICO("Produto simples"),
    PADRAO("Produto padrão"),
    PREMIUM("Produto de alto nível");

    private final String descricao;

    ClassificacaoProduto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
