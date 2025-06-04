import javax.swing.JOptionPane;

public class Atividade003 {
    public static int Consoante(String palavra) {
        int contador = 0; // Inicializa um contador para armazenar o número de consoantes
        for (int i = 0; i < palavra.length(); i++) { // Percorre cada caractere da palavra
            char letra = palavra.charAt(i); // Obtém o caractere atual
            if (Character.isLetter(letra) && "aeiouAEIOU".indexOf(letra) == -1) { // Verifica se é letra e não é vogal
                contador++; // Incrementa o contador se for consoante
            }
        }
        return contador; // Retorna o número de consoantes encontradas
    }

    public static void main(String[] args) {
        // Solicita ao usuário que informe uma palavra
        String palavra = JOptionPane.showInputDialog("Digite uma palavra:");

        // Chama o método Consoante para contar as consoantes na palavra informada
        int resultado = Consoante(palavra);

        // Exibe o resultado em uma caixa de diálogo
        JOptionPane.showMessageDialog(null,
                "A palavra \"" + palavra + "\" contém " + resultado + " consoantes.",
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
