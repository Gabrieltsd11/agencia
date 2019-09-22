package Projeto2;

public class Carro extends Veiculo{
    private int cavalos ;
    private int portas;      

    public Carro(String placa, String ano, String marca, String modelo, float valor) {
        super(placa, ano, marca, modelo, valor);
        this.cavalos = cavalos;
        this.portas = portas;
    }
    
    public int getCavalos() {
        return cavalos;
    }

    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
    
    
}    

