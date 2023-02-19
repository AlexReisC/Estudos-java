package basicos.loops;

import java.util.Scanner;

/* Faça um programa que leia 5 numeros e informe o maior número e a média desses números. */

public class MaiorEMedia {
    public static void main(String[] args) {
        double ant = 0;
        double maior = 0;
        double media = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite cinco numeros");
        for (int i = 0; i < 5; i++) {
            maior = scan.nextDouble();
            if(ant > maior) maior = ant;
            ant = maior;
            media = media + ant;
        }

        scan.close();
        System.out.println("Maior numero: " + maior);
        System.out.println("Média: " + media/5);
    }
}
