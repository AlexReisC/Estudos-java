/* Faça um programa que leia conjuntos de dois valores, o primeio representando o nome do aluno e o segundo representando sua idade.
(Pare inserindo o valor 0 no campo nome) */

package basicos.loops;

import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {
        String aluno;
        int idade;

        Scanner dado = new Scanner(System.in);

        while (true){
            System.out.println("Digite seu nome: ");
            aluno = dado.next();
            if(aluno.equals("0")) break;

            System.out.println("Digite sua idade: ");
            idade = dado.nextInt();
        }
        
        dado.close();
    }
    
}
