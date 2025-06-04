import javax.swing.JOptionPane;

public class Atividade002 {
    public static int Fibonaci (int numero){
        int a = 1;
        int b = 1;
        int proximo = 0;

        for (int i = 1; i <= numero; i++) {
            if (i == 1 || i == 2) {
                proximo = 1; // Os dois primeiros números da sequência são 1
            } else {
                proximo = a + b; // O próximo número é a soma dos dois anteriores
                a = b; // Atualiza 'a' para o próximo número
                b = proximo; // Atualiza 'b' para o próximo número
            }
        }
        return proximo; // Retorna o último número calculado da sequência de Fibonacci
    }

    public static void main(String[] args) {
        // Solicita ao usuário que informe um número
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        // Chama o método Fibonaci para calcular o número de Fibonacci correspondente
        int resultado = Fibonaci(numero);

        // Exibe o resultado em uma caixa de diálogo
        JOptionPane.showMessageDialog(null,
                "O " + numero + "º número de Fibonacci é: " + resultado,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
