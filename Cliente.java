package Projeto2;
public class Cliente extends Pessoa{
    private String cnh;
    
    public Cliente(String nome, int cpf, int idade) {
       
        super(nome, cpf, idade);
    }

    public Cliente(String cnh, String nome, int cpf, int idade) {
        super(nome, cpf, idade);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

}