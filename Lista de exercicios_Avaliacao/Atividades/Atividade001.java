import javax.swing.JOptionPane;

/**
 * Classe principal da aplicação que solicita a idade do usuário
 * através de uma interface gráfica e exibe a idade informada.
 */
public class Atividade001 {
    public static void main(String[] args) {

        // Solicita a idade do usuário via uma caixa de entrada gráfica (JOptionPane)
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade:"));

        // Exibe uma mensagem com a idade inserida pelo usuário
        JOptionPane.showMessageDialog(null,
                "Você tem " + idade + " anos.",
                "Idade",
                JOptionPane.INFORMATION_MESSAGE);
    }
}