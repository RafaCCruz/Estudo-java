import javax.swing.JOptionPane;

public class Exercicios005 {
    // Função que conta o número de vogais em uma frase fornecida
    public static int ContarVogais(String frase) {
        int contador = 0; // Contador para rastrear a quantidade de vogais
        String vogais = "aeiouAEIOU";

        // Itera sobre cada caractere da frase
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i); // Obtém o caractere na posição atual
            if (vogais.indexOf(letra) != -1) { // Verifica se o caractere é uma vogal
                contador++; // Incrementa o contador se for uma vogal
            }
        }

        return contador; // Retorna o número total de vogais encontradas
    }

    public static void main(String[] args) {
        // Exibe uma janela para o usuário digitar uma frase
        String frase = JOptionPane.showInputDialog("Digite uma frase:");

        // Verifica se a entrada não é nula ou vazia
        if (frase != null && !frase.isEmpty()) {
            // Chama a função para contar as vogais
            int quantidadeVogais = ContarVogais(frase);

            // Exibe o número de vogais na frase inserida
            JOptionPane.showMessageDialog(null, "A quantidade de vogais na frase é: " + quantidadeVogais);
        } else {
            // Mensagem de erro caso nenhuma frase seja fornecida
            JOptionPane.showMessageDialog(null, "Nenhuma frase foi digitada.");
        }
    }
}