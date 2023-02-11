package basicos;

import java.util.*;

public class Dragao {
    public static void main(String[] args) {
        int casos, poderDeLuta;

		Scanner ler = new Scanner(System.in);

		try {
			casos = ler.nextInt();
			
			for (int i = 0; i < casos; i++) {
				poderDeLuta = ler.nextInt();

				if (poderDeLuta <= 8000) {
					System.out.println("Inseto!");
				} else {
					System.out.println("Mais de 8000!");
				}
			}
		} finally {
			ler.close();
		}
    }
}
