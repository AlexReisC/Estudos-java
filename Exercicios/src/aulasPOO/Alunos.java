public class Alunos {

    private String nome;
    private int idade;
    private char sexo;

    public Alunos(String n, int i, char s){
        this.nome = n;
        this.idade = i;
        this.sexo = s;
    }

    //get e set idade
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //get e set nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //get e set sexo
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
