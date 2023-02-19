package basicos.loops;

import java.util.Scanner;

/* Faça um programa que peça N numeros inteiros, calcule e mostre a quantidade de numeros pares e a quantidade de numeros impares. */

public class ParEImpar {
    public static void main(String[] args) {
        int par = 0, impar = 0, n, num;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de numeros: ");
        n = scan.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Digite um numero: ");
            num = scan.nextInt();
            if(num % 2 == 0){
                par += 1;
            } else{
                impar++;
            }
        }

        System.out.println("Quantidade de nummeros pares: " + par);
        System.out.println("Quantidade de numeros impares: " + impar);

        scan.close();
    }
}
