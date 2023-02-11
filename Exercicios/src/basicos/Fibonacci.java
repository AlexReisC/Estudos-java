package basicos;

import java.io.IOException;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
		
		int N = leitor.nextInt();
		leitor.close();
		if(N == 0) System.out.println(0);
		
		int proximo, anterior = 0, atual = 1;
		
		for (int i = 1; i <= N; i++) {
			System.out.print(anterior + " ");
			proximo = anterior + atual;
			anterior = atual; 
			atual = proximo;
			
		}
		
    }
}
