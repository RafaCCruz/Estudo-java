import javax.swing.JOptionPane;

public class Atividade001 {
    public static void main(String[] args) {

        // Solicita ao usuário que insira um número e o converte de String para inteiro
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        // Verifica se o número é maior que zero (positivo)
        if(numero > 0){
            // Exibe uma mensagem indicando que o número é positivo
            JOptionPane.showMessageDialog(null, "O número " + numero + " é positivo.");
        }

    }
}