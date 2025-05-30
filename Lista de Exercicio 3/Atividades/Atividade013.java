import javax.swing.JOptionPane; // Importação para exibir caixas de diálogo

public class Atividade013 {
    public static void main(String[] args) {
        // Passo 1: Solicitar ao usuário um número inteiro para gerar a tabuada
        String input = JOptionPane.showInputDialog("Digite um número inteiro para ver sua tabuada:");

        // Passo 2: Declarar uma variável para armazenar a mensagem da tabuada
        StringBuilder tabuada = new StringBuilder();

        try {
            // Converte a entrada de texto em um número inteiro
            int numero = Integer.parseInt(input);

            // Passo 3: Usar um loop while para calcular a tabuada de 1 a 10
            int multiplicador = 1; // Inicia o multiplicador em 1
            while (multiplicador <= 10) { // Repetir até 10
                // Cálculo do resultado da multiplicação
                int resultado = numero * multiplicador;
                // Adicionar o resultado ao texto da tabuada
                tabuada.append(numero).append(" x ").append(multiplicador).append(" = ").append(resultado).append("\n");
                // Incrementar o multiplicador
                multiplicador++;
            }

            // Passo 4: Mostrar a tabuada completa em uma caixa de diálogo
            JOptionPane.showMessageDialog(null, "Tabuada de " + numero + ":\n" + tabuada);

        } catch (NumberFormatException e) {
            // Mensagem de erro caso a entrada não seja um número
            JOptionPane.showMessageDialog(null, "Por favor, insira um número inteiro válido.");
        }
    }
}
