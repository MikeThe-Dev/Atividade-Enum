//Exercício 2

package br.edu.etec.MesesSemana.teste;
import br.edu.etec.MesesSemana.model.Mes;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número de 1 a 12: ");
        int numero = scanner.nextInt();
        
        try {
            Mes mes = Mes.fromNumero(numero);
            System.out.println("Mês correspondente: " + mes);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}
