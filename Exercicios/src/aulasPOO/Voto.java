package aulasPOO;

import java.util.Scanner;

public class Voto {
    public static void main(String[] args) {

        int idade;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua idade");
        idade = scan.nextInt();
        scan.close();
        
        if (idade < 16) {
            System.out.println("Você não pode votar");
        } else if((idade >= 16 && idade < 18) || idade >= 70){
            System.out.println("Seu voto é facultativo");
        } else{
            System.out.println("Seu voto é obrigatório.");
        }

    }
}
