import javax.swing.JOptionPane; // Importa a classe JOptionPane para exibir caixas de diálogo

public class Exercicios001 {

    // Método que realiza a soma de dois números inteiros
    public static int soma(int a, int b) {
        return a + b; // Retorna a soma dos dois números
    }

    public static void main(String[] args) {

        // Solicita ao usuário o primeiro número através de uma caixa de diálogo
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));

        // Solicita ao usuário o segundo número através de uma caixa de diálogo
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        // Chama o método soma para calcular a soma dos dois números
        int resultado = soma(num1, num2);

        // Exibe o resultado da soma em uma mensagem na tela
        JOptionPane.showMessageDialog(null, "A soma de " + num1 + " e " + num2 + " é: " + resultado);

    }
}