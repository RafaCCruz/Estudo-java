import javax.swing.JOptionPane;

public class Atividade007 {
    public static void main(String[] args) {

        // Solicita ao usuário que insira sua idade através de uma caixa de diálogo.
        // O valor inserido é convertido de String para um número inteiro.
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade:"));

        // Verifica se a idade informada é menor que 18.
        if (idade < 18) {
            // Exibe uma caixa de diálogo informando que o usuário é menor de idade.
            JOptionPane.showMessageDialog(null,
                    "Você é menor de idade.", // Mensagem exibida ao usuário
                    "Resultado", // Título da caixa de diálogo
                    JOptionPane.INFORMATION_MESSAGE // Tipo de mensagem (informativa)
            );
        }
        // Verifica se a idade está entre 18 e 64 (ambos inclusive, no caso do limite inferior 18).
        else if (idade >= 18 && idade < 65) {
            // Exibe uma caixa de diálogo informando que o usuário é maior de idade.
            JOptionPane.showMessageDialog(null,
                    "Você é maior de idade.",
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
        // Caso a idade seja 65 ou maior.
        else {
            // Exibe uma caixa de diálogo informando que o usuário é idoso.
            JOptionPane.showMessageDialog(null,
                    "Você é idoso.",
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}