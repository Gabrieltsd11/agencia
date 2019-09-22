package Projeto2;
/**
 * @author GabrielTSD
 */
public class Funcionario extends Pessoa {

    private boolean PIS;
    private String cargo;
    private int id;

    public Funcionario(String nome, int cpf, int idade, String sexo) {
        super(nome, cpf, idade, sexo);
    }

    public Funcionario(boolean PIS, String cargo, int id, String nome, int cpf, int idade, String sexo) {
        super(nome, cpf, idade, sexo);
        this.PIS = PIS;
        this.cargo = cargo;
        this.id = id;
    }

    public boolean getPIS() {
        return PIS;
    }

    public void setPIS(boolean PIS) {
        this.PIS = PIS;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


}
