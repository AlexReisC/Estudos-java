package arrays;

/* Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. Após isso determine o menor número da matriz e a sua posição(linha, coluna). */

import java.util.Random;

public class Matriz {
    public static void main(String[] args) {
        Random rand = new  Random();
        int[][] matriz = new int[4][4];
        int menor = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rand.nextInt(9);
            }
        }

        System.out.print("Matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }

        menor = matriz[0][0];
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(matriz[i][j] < menor){
                    menor = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        System.out.println("\nO menor numero da matriz é " + menor);
        System.out.println("Posição: linha " + (linha+1) + ", coluna " + (coluna+1));
    }
}