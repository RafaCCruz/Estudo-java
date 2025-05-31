import javax.swing.JOptionPane;

public class Atividade008 {
    public static void main(String[] args) {

        // Solicita ao usuário que insira o valor do produto através de uma caixa de diálogo
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto:"));

        // Verifica se o valor do produto é maior que 100
        if (valor > 100) {
            // Calcula 10% de desconto no valor do produto
            double desconto = valor * 0.1;

            // Subtrai o desconto do valor original do produto
            double valorComDesconto = valor - desconto;

            // Exibe o valor do produto com o desconto aplicado
            JOptionPane.showMessageDialog(null,
                    "O valor do produto com 10% de desconto é: R$ " + valorComDesconto,
                    "Desconto Aplicado",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Informa ao usuário que produtos com valor menor ou igual a 100 não recebem desconto
            JOptionPane.showMessageDialog(null,
                    "O produto não tem desconto.",
                    "Sem Desconto",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }
}