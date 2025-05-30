import javax.swing.JOptionPane; // Importa a classe JOptionPane para exibir caixas de diálogo

public class Atividade002 {
    public static void main(String[] args) {

        // Exibe uma caixa de diálogo para o usuário inserir um número.
        // O valor inserido é obtido como String e convertido para inteiro.
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        // Verifica se o número inserido é maior que 18.
        if (numero >= 18) {
            // Exibe uma mensagem indicando que o usuário é maior de idade.
            JOptionPane.showMessageDialog(null, "Você é maior de idade.");
        }
    }
}