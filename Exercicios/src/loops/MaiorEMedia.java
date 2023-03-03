package loops;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        int maior = -1;
        double media = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite cinco numeros");
        for (int i = 0; i < 5; i++) {
            int atual = scan.nextInt();
            if(atual > maior) maior = atual;
            media = media + atual;
        }

        scan.close();
        System.out.println("Maior numero: " + maior);
        System.out.println("Média: " + media/5);
    }
}