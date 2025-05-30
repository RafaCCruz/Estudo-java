import javax.swing.JOptionPane;

public class Atividade018 {
    public static void main(String[] args) {

        // Solicita que o usuário insira um número por meio de uma janela de diálogo
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        // Inicializa a variável para o cálculo do fatorial
        int fatorial = 1;

        // Loop para calcular o fatorial do número inserido
        for (int i = 1; i <= numero; i++) {
            fatorial *= i; // Multiplica o valor de fatorial pelo valor atual de i
        }

        // Exibe o resultado do cálculo em uma janela de diálogo
        JOptionPane.showMessageDialog(
                null,
                "O fatorial de " + numero + " é: " + fatorial, // Mensagem a ser exibida
                "Resultado", // Título da janela
                JOptionPane.INFORMATION_MESSAGE // Tipo de mensagem (informação)
        );
    }
}