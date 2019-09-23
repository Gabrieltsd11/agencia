package Projeto2;
/**
 * @author GabrielTSD
 */
public class Funcionario extends Pessoa {

    private String PIS;
    private String cargo;
    private int id;

    public Funcionario(String nome, int cpf, int idade) {
        super(nome, cpf, idade);
    }

    public Funcionario(String PIS, String cargo, int id, String nome, int cpf, int idade, String sexo) {
        super(nome, cpf, idade);
        this.PIS = PIS;
        this.cargo = cargo;
        this.id = id;
    }

    public String getPIS() {
        return PIS;
    }

    public void setPIS(String PIS) {
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

}
