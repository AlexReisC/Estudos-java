package aulasPOO;

public class Intervalo {
    public static void main(String[] args) {
        System.out.println("Imprimindo os numeros pares entre 299 e 101");
        for(int i = 299; i >= 101; i--){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
