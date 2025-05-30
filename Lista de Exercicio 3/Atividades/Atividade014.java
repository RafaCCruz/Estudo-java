import javax.swing.JOptionPane; // Importa a classe JOptionPane para caixas de diálogo.

public class Atividade014 {
    public static void main(String[] args) {
        int numero; // Variável para armazenar o número informado

        // Loop que continua enquanto o número for inválido (zero ou negativo)
        do {
            // Solicita um número ao usuário
            String input = JOptionPane.showInputDialog("Digite um número positivo:");

            try {
                numero = Integer.parseInt(input); // Converte o número para inteiro
                if (numero <= 0) { // Verifica se o número é inválido
                    JOptionPane.showMessageDialog(null, "Por favor, insira um número positivo."); // Exibe mensagem de erro
                }
            } catch (NumberFormatException e) {
                numero = 0; // Trata entradas inválidas como zero
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número válido."); // Mensagem de erro
            }
        } while (numero <= 0); // Repete até que o número seja positivo

        // Exibe mensagem final com o número válido informado
        JOptionPane.showMessageDialog(null, "Número válido informado: " + numero);
    }
}
