import javax.swing.JOptionPane;

public class Exercicios010 {

    // Método responsável por contar o número de ocorrências de um caractere em uma palavra ou frase
    public static int ContadorCaracteres(String palavra, char caractere) {
        int contador = 0; // Variável para armazenar o número de ocorrências do caractere
        // Percorre a string (palavra/frase) caractere por caractere
        for (int i = 0; i < palavra.length(); i++) {
            // Verifica se o caractere atual é igual ao caractere informado
            if (palavra.charAt(i) == caractere) {
                contador++; // Incrementa o contador caso a condição seja verdadeira
            }
        }
        // Retorna o número total de ocorrências
        return contador;
    }

    public static void main(String[] args) {
        // Solicita ao usuário que insira uma palavra ou frase usando uma janela pop-up
        String texto = JOptionPane.showInputDialog("Digite uma palavra ou frase:");

        // Solicita ao usuário que insira o caractere a ser contado
        // Como o método retorna uma string, é necessário pegar o primeiro caractere dela
        char caractere = JOptionPane.showInputDialog("Digite o caractere a ser contado:").charAt(0);

        // Chama o método ContadorCaracteres para contar as ocorrências do caractere na palavra ou frase digitada
        int contador = ContadorCaracteres(texto, caractere);

        // Exibe o resultado final em uma janela pop-up
        // Mostra ao usuário quantas vezes o caractere aparece na palavra ou frase fornecida
        JOptionPane.showMessageDialog(null, "O caractere '" + caractere + "' aparece " + contador + " vezes na palavra ou frase.");
    }
}