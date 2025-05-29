import javax.swing.JOptionPane;

public class Exercicios002 {

    // Método para verificar se um número é par ou ímpar
    public static boolean Verificação(boolean valor, int a){
        int num = a % 2;
        if (num == 0) {
            valor = true; // É par
        } else {
            valor = false; // É ímpar
        }
        return valor;
    }
    public static void main(String[] args) {
        // Solicita ao usuário que insira um número
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        // Chama o método de verificação
        boolean resultado = Verificação(false, numero);

        // Exibe o resultado em uma caixa de diálogo
        if (resultado) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é par.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é ímpar.");
        }
    }
}
