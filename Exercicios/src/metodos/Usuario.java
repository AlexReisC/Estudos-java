package metodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTv tv = new SmartTv();

        System.out.println("A TV está ligada? " + tv.ligada);
        System.out.println("O canal é " + tv.canal);
        System.out.println("O volume é " + tv.volume);

        tv.ligar();
        System.out.println("A TV está ligada? " + tv.ligada);

        tv.mudarCanal(12);
        System.out.println("O canal é " + tv.canal);

        tv.aumentarVolume();
        System.out.println("O volume é " + tv.volume);
    }
}
