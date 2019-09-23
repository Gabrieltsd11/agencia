package Projeto2;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Home {

    public static void main(String[] args) {
        try {
            String nome = JOptionPane.showInputDialog("Qual seu nome?");
            int opcao = JOptionPane.showConfirmDialog(null, nome + " Você é um funcionário?");
            if (opcao == 0) {
                String welcome = JOptionPane.showInputDialog("Bem vindo  " + nome + ",\n Gostaria de fazer uma venda ? \n 1-Sim \n 2-Não");
                int confirm = Integer.parseInt(welcome);
                if(confirm == 1){
                    
                }
                JComboBox jcb = new JComboBox();{
                    jcb.addItem("Sim");
                    jcb.addItem("Não");
                }
                JOptionPane.showMessageDialog(null, jcb, "Selecione o motivo", JOptionPane.QUESTION_MESSAGE);
                
            }
        }
        catch (Exception erro) {
            String message = String.format("OPSSS Desulpa,\n mas você não pode fazer isso\n" + erro);
        JOptionPane.showMessageDialog(null, message);
    }

    }

}

