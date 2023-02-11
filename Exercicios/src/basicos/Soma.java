package basicos;

import java.util.Scanner;
import java.lang.Math;

public class Soma {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double h = 0;

		double n = sc.nextDouble();
		sc.close();
		
		for(int i = 1; i <= n; i++) {
			h = h + (double)1/i;
		}
		
		System.out.println(Math.round(h));
    }
}
