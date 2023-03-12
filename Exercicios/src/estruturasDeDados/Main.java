package estruturasDeDados;

public class Main {
    public static void main(String[] args) {
        No no1 = new No("Primeiro nó");
        No no2 = new No("Segundo nó");

        no1.setProximoNo(no2);
        
        No no3 = new No("Terciero nó");
        No no4 = new No("Quarto nó");

        no2.setProximoNo(no3);
        no3.setProximoNo(no4);

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
    }
}