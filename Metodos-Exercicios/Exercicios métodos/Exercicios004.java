import javax.swing.JOptionPane;

public class Exercicios004 {

    // Método recursivo para calcular o fatorial de um número.
    public static int Fatorial(int n) {
        // Caso base: se n é 0 ou 1, o fatorial é 1.
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Caso recursivo: n * fatorial de (n - 1).
            return n * Fatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // Lê um número do usuário usando um diálogo de entrada.
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para calcular o fatorial:"));

        // Calcula o fatorial do número usando o método Fatorial.
        int resultado = Fatorial(numero);

        // Mostra o resultado em um diálogo de mensagem.
        JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é: " + resultado);
    }
}