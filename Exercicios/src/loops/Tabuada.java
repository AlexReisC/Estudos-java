package loops;

/* Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer numero entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo: 5 X 1 = 5 */

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        int n, resultado;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        n = scan.nextInt();
        scan.close();

        System.out.println("TABUADA");
        for(int i = 1; i < 11; i++){
            resultado = n * i;
            System.out.println(n + " x " + i + " = " + resultado);
        }
    }
}
