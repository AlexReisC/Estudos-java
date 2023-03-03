package arrays;

/* Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes. */

public class Consoantes {
    public static void main(String[] args) {
        String[] consoantes = {"b", "c", "f", "m", "x", "z"};
        int leitor = 0;
        for (int i = 0; i < consoantes.length; i++) {
            leitor++;
        }

        System.out.println("Foram lidas " + leitor + " consoantes.");
        for (int i = 0; i < consoantes.length; i++) {
            System.out.print(consoantes[i] + " ");
        }
    }
}
