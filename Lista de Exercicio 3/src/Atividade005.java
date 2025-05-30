import javax.swing.JOptionPane;

public class Atividade005 {
    public static void main(String[] args) {
        // Solicita ao usuário o valor total da compra por meio de uma caixa de diálogo
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor total da compra: "));

        // Verifica se o valor da compra é maior que 100 para aplicar o desconto
        if (valor > 100) {
            // Calcula o desconto de 10% sobre o valor total
            double desconto = valor * 0.1;
            // Subtrai o desconto do valor total para obter o valor final
            double valorFinal = valor - desconto;
            // Exibe o valor final com desconto em uma caixa de diálogo
            JOptionPane.showMessageDialog(null, "Valor com desconto: R$ " + valorFinal);
        }
    }
}