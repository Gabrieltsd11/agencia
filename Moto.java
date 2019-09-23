package Projeto2;

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String placa, String ano, String marca, String modelo, float valor) {
        super(placa, ano, marca, modelo, valor);
        
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    
    
}
