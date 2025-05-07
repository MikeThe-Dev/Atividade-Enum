// Exercício 4

package br.edu.etec.RegiaoBrasil.model;

/**
 *
 * @author Admin
 */
public enum RegiaoBrasil {

NORTE("Região Norte"),

NORDESTE("Região Nordeste"),

CENTRO_OESTE("Região Centro-Oeste"),

SUDESTE("Região Sudeste"),

SUL("Região Sul");

private final String descricao;

// Construtor

RegiaoBrasil(String descricao) {

this.descricao = descricao;

}

// Getter

public String getDescricao() {

return descricao;

}

}
