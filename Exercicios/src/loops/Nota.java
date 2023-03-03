package loops;

import java.util.Scanner;

/* Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido. */

public class Nota {
    public static void main(String[] args) {
        double nota;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Digite um valor entre 0 e 10: ");
            nota = scan.nextDouble();
            if(nota < 0 || nota > 10) System.out.println("Valor inválido!");
        } while (nota < 0 || nota > 10);

        scan.close();
    }
}
