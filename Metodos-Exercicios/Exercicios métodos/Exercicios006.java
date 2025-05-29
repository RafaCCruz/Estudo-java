import javax.swing.JOptionPane; // Importação da classe JOptionPane para exibir caixas de diálogo

// Classe pública principal do programa
public class Exercicios006 {

    // Método estático para inverter uma palavra
    public static String Inverter(String palavra) {
        String palavraInvertida = ""; // Declaração de uma variável para armazenar a palavra invertida

        // Laço `for` para percorrer a string de trás para frente
        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i); // Concatena o caractere atual à variável palavraInvertida
        }
        return palavraInvertida; // Retorna a palavra invertida
    }

    // Método principal do programa, que é o ponto de entrada
    public static void main(String[] args) {
        // Solicita ao usuário que informe uma palavra através de uma caixa de entrada
        String palavra = JOptionPane.showInputDialog("Digite uma palavra:");

        // Invoca o método Inverter para obter a palavra invertida
        String palavraInvertida = Inverter(palavra);

        // Mostra uma caixa de diálogo com a mensagem contendo a palavra invertida
        JOptionPane.showMessageDialog(null, "A palavra invertida é: " + palavraInvertida);
    }
}