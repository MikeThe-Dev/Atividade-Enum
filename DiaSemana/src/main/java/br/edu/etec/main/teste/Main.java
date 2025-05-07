//Exercício 1

package br.edu.etec.main.teste;
//Exercício 1
/**
 *
 * @author Admin
 */
import br.edu.etec.main.model.DiaSemana;
import br.edu.etec.main.model.Mes;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("//Exercício 1: Digite um número de 1 a 7: ");
        int numero = scanner.nextInt();
        
        try {
            DiaSemana dia = DiaSemana.fromNumero(numero);
            System.out.println("Dia correspondente: " + dia);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
