//Exercício 1

package br.edu.etec.main.model;


public enum DiaSemana {
    SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);

    private final int numero;

    DiaSemana(int numero) {
        this.numero = numero;
    }

    public static DiaSemana fromNumero(int numero) {
        for (DiaSemana dia : DiaSemana.values()) {
            if (dia.numero == numero) {
                return dia;
            }
        }
        throw new IllegalArgumentException("Número inválido: " + numero);
    }
}

