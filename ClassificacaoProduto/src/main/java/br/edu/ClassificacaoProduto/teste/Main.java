//Exercício 3

package br.edu.ClassificacaoProduto.teste;
import br.edu.ClassificacaoProduto.model.ClassificacaoProduto;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Classificações de Produto:");
        
        for (ClassificacaoProduto classificacao : ClassificacaoProduto.values()) {
            System.out.println(
                "Nome: " + classificacao.name() + 
                " | Descrição: " + classificacao.getDescricao()
            );
        }
    }
}
