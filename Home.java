package Projeto2;

import javax.swing.JOptionPane;

public class Home {

    public static void main(String[] args) {
        try {
            String nome = JOptionPane.showInputDialog("Qual seu nome?");
            int sexo = JOptionPane.showConfirmDialog(null, "Você é Homem?");
            if (sexo == 0) {

            }
            int opcao = JOptionPane.showConfirmDialog(null, nome + " Você é um funcionário?");
            if (opcao == 0) {
                int welcome = JOptionPane.showConfirmDialog(null, "Bem vindo vedendor " + nome + ", \n Gostaria de fazer uma venda ?");
            }

            Funcionario vendedor = new Funcionario(1, "Joao", 0, 2, "Masculino", "brasil", "brasilia", "df", 6);

            System.out.println(vendedor.getNome());
            System.out.println(vendedor.getSexo());

            Cliente comprador = new Cliente("Luiz", 1, 0, "Masculino", "Colonia agricola samambaia", "Brasilia", "DF", 3);

            System.out.println(comprador.getNome());
        } catch (Exception erro) {
            String message = String.format("OPSSS Desulpa,\n mas você não pode fazer isso\n" + erro);
            JOptionPane.showMessageDialog(null, message);
        }
    }
}
