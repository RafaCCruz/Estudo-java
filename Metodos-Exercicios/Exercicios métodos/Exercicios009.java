import javax.swing.JOptionPane;

// A classe Exercicios009 contém um método para verificar se uma palavra ou frase é um palíndromo.
public class Exercicios009 {

    // Método que inverte a palavra ou frase fornecida
    public static String Palindromo(String palavra) {
        String palavraInvertida = "";// Variável que armazenará a palavra ou frase invertida

        // Loop para percorrer a palavra ou frase de trás para frente
        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i); // Adiciona cada caractere na ordem inversa
        }
        return palavraInvertida; // Retorna a palavra ou frase invertida
    }

    public static void main(String[] args) {
        // Solicita ao usuário que insira uma palavra ou frase usando uma janela pop-up
        String palavra = JOptionPane.showInputDialog("Digite uma palavra ou frase:");

        // Chama o método Palindromo para inverter a palavra ou frase digitada
        String palavraInvertida = Palindromo(palavra);

        // Compara a palavra original com a versão invertida, ignorando diferenças entre maiúsculas e minúsculas
        if (palavra.equalsIgnoreCase(palavraInvertida)) {
            // Se forem iguais, exibe uma mensagem dizendo que a palavra/frase é um palíndromo
            JOptionPane.showMessageDialog(null, "A palavra ou frase é um palíndromo.");
        } else {
            // Caso contrário, exibe uma mensagem dizendo que não é um palíndromo
            JOptionPane.showMessageDialog(null, "A palavra ou frase não é um palíndromo.");
        }
    }
}