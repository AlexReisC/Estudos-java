package basicos.arrays;

/* Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa. */

public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {3, 9, 4, -1, 0};
        
        System.out.println("Vetor: ");
        int cont = 0;
        while(cont < (vetor.length)){
            System.out.print(vetor[cont] + " ");
            cont++;
        }
        
        System.out.println("\nVetor na ordem inversa: ");
        for(int i = vetor.length - 1; i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    
    }
    
}
