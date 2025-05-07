// Exercício 4
package br.edu.etec.RegiaoBrasil.teste;
import br.edu.etec.RegiaoBrasil.model.RegiaoBrasil;

/**
 *
 * @author Admin
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("==== Regiões do Brasil ====");
        for (RegiaoBrasil regiao : RegiaoBrasil.values()) {
            System.out.println("• " + regiao + " - " + regiao.getDescricao());
        }
    }
}
