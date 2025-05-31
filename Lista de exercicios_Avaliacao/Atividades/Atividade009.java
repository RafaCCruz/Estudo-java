import javax.swing.JOptionPane;

public class Atividade009 {
    public static void main(String[] args) {

        // Solicita ao usuário que insira um número através de uma caixa de diálogo.
        // O número inserido é convertido de String para inteiro.
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        // Verifica se o número é positivo, negativo ou zero.
        if (numero > 0) {
            // Se o número for maior que zero, exibe uma mensagem indicando que ele é positivo.
            JOptionPane.showMessageDialog(null, "O número " + numero + " é positivo.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else if (numero < 0) {
            // Se o número for menor que zero, exibe uma mensagem indicando que ele é negativo.
            JOptionPane.showMessageDialog(null, "O número " + numero + " é negativo.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Se o número não for positivo nem negativo (zero), exibe uma mensagem indicando que é zero.
            JOptionPane.showMessageDialog(null, "O número é zero.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}