package basicos.arrays;

/* Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor. Ao final, mostre os números e seus sucessores. */

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        int numeros[] = new int[20];

        Random rand = new Random();
        
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = rand.nextInt(100); 
        }

        System.out.println("Numeros:");
        for(int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }

        System.out.println();
        System.out.println("Sucessores:");
        for(int i = 0; i < numeros.length; i++){
            System.out.print((numeros[i]+1) + " ");
        }
    }
}
