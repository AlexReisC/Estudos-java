package basicos;

import java.io.IOException;
import java.util.Scanner;

public class PositivosMedia {
    public static void main(String[] args) throws IOException {

		try (Scanner leitor = new Scanner(System.in)) {
            int cont = 0;
            double media = 0;
            double x;
            
            int i;
            
            for (i = 0; i < 6; i++) {
            	x = leitor.nextDouble();
            	if(x > 0){
            		cont++;
            		media = media + x;
            	}
            }
            leitor.close();
            media = media/cont;
            
            System.out.println(cont + " valores positivos");
            System.out.println(String.format("%.1f", media));
        }

    }
}
