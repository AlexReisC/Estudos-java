package classes;

public class Main {
    public static void main(String[] args) {
        Proprietario dono1 = new Proprietario();
        dono1.nome = "João";
        dono1.idade = 23;
        dono1.cpf = "123.456.789-00";

        Carro seuCarro = new Carro();
        seuCarro.ano = 2006;
        seuCarro.cor = "Prata";
        seuCarro.fabricante = "Fiat";
        seuCarro.valor = 45000.99;
        seuCarro.dono = dono1;

        System.out.println("Dono do carro: " + seuCarro.dono.nome);
        
    }
}
