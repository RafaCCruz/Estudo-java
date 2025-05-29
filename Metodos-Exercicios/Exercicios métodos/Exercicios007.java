import javax.swing.JOptionPane;

public class Exercicios007 {

    // Método que calcula o maior número entre três valores inteiros fornecidos como parâmetros.
    public static int Maior(int a, int b, int c) {
        // Inicializa o maior número com o valor do primeiro parâmetro.
        int maior = a;

        // Compara o segundo número com o maior atual.
        if (b > maior) {
            maior = b;
        }

        // Compara o terceiro número com o maior atual.
        if (c > maior) {
            maior = c;
        }

        // Retorna o maior número encontrado.
        return maior;
    }

    public static void main(String[] args) {
        // Solicita ao usuário digitar o primeiro número e converte a entrada para inteiro.
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));

        // Solicita ao usuário digitar o segundo número e converte a entrada para inteiro.
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        // Solicita ao usuário digitar o terceiro número e converte a entrada para inteiro.
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));

        // Chama o método Maior para encontrar o maior dos três números fornecidos.
        int maiorNumero = Maior(a, b, c);

        // Mostra uma mensagem indicando o maior número encontrado.
        JOptionPane.showMessageDialog(null, "O maior número é: " + maiorNumero);
    }
}