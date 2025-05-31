import javax.swing.JOptionPane;

public class Atividade005 {
    public static void main(String[] args) {

        // Solicita ao usuário para inserir o primeiro número por meio de uma caixa de diálogo,
        // e converte a entrada de texto (String) para um número decimal (Double).
        double numero_1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));

        // Solicita ao usuário para inserir o segundo número por meio de uma caixa de diálogo,
        // e também converte a entrada para um número decimal (Double).
        double numero_2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

        // Solicita ao usuário para inserir o terceiro número por meio de uma caixa de diálogo,
        // e converte a entrada para um número decimal (Double).
        double numero_3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número:"));

        // Calcula a média aritmética dos três números inseridos pelo usuário,
        // somando os números e dividindo essa soma por 3.
        double media = (numero_1 + numero_2 + numero_3) / 3.0;

        // Exibe a média calculada em uma janela de diálogo amigável ao usuário.
        // Inclui um título ("Cálculo de Média") e um ícone de informação.
        JOptionPane.showMessageDialog(null,
                "A média dos números é: " + media,
                "Cálculo de Média",
                JOptionPane.INFORMATION_MESSAGE);
    }
}