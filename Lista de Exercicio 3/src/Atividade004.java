import javax.swing.JOptionPane; // Importação da biblioteca para criar caixas de diálogo (JOptionPane)

public class Atividade004 {
    public static void main(String[] args) {

        // Solicita ao usuário, através de uma caixa de diálogo, que insira um número.
        // O texto digitado é convertido de String para int usando o método parseInt
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        // Verifica se o número é par ou ímpar
        if (numero % 2 == 0) { // Verifica se há resto 0 na divisão por 2 (número par)
            // Exibe uma mensagem dizendo que o número é par
            JOptionPane.showMessageDialog(null, "O número " + numero + " é par.");
        }
    }
}