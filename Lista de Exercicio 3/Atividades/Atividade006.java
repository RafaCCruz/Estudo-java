import javax.swing.JOptionPane;

public class Atividade006 {
    public static void main(String[] args) {

        // Solicita ao usuário que digite um número por meio de uma caixa de diálogo
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        // Verifica se o número é par ou ímpar
        if (numero % 2 == 0) {
            // Se o número for par, exibe uma mensagem informando que é par
            JOptionPane.showMessageDialog(null, "O número " + numero + " é par.");
        } else {
            // Se o número for ímpar, exibe uma mensagem informando que é ímpar
            JOptionPane.showMessageDialog(null, "O número " + numero + " é ímpar.");
        }
    }
}
