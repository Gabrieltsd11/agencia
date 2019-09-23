package Projeto2;

/**
 * @author GabrielTSD
 */
abstract public class Pessoa {

    protected String nome;
    protected int cpf;
    protected int idade;
    protected String sexo;

    public Pessoa(String nome, int cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
