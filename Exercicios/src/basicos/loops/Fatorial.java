package basicos.loops;

import java.util.Scanner;

/* Faça um programa que calcule o fatorial de um numero inteiro fornecido pelo usuario. */

public class Fatorial {
    public static void main(String[] args) {
        int num, fat;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        num = scan.nextInt();
        fat = num;
        for(int i = 1; i < num; i++){
            fat = fat * i; 
        }

        scan.close();
        System.out.println("Fatorial: " + fat);
    }
}
