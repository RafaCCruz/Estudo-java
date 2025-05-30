import javax.swing.JOptionPane; // Importação para usar JOptionPane (interface gráfica)

public class Atividade012 {

    public static void main(String[] args) {
        int soma = 0; // Variável para armazenar a soma dos números informados
        StringBuilder numerosInformados = new StringBuilder(); // Variável para armazenar os números recebidos

        // Loop para continuar solicitando números enquanto a soma for menor ou igual a 50
        while (soma <= 50) {
            // Solicita um número ao usuário com uma caixa de entrada gráfica
            String input = JOptionPane.showInputDialog("Digite um número (Soma atual: " + soma + "):");

            try {
                int numero = Integer.parseInt(input); // Converte o texto inserido para um inteiro
                soma += numero; // Adiciona o número à soma
                numerosInformados.append(numero).append(", "); // Armazena o número informado
            } catch (NumberFormatException e) {
                // Caso o usuário insira algo que não é um número, exibe uma mensagem de erro
                JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
            }
        }

        // Exibe a soma total e os números recebidos em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, "Soma total: " + soma + "\nNúmeros informados: " + numerosInformados);
    }
}
