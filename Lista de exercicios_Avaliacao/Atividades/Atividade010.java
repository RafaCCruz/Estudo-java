import javax.swing.JOptionPane;

public class Atividade010 {
    public static void main(String[] args) {
        try {
            // Solicita a nota do aluno através de uma caixa de diálogo
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno (0 a 10):"));

            // Verifica se a nota está no intervalo válido
            if (nota >= 0 && nota <= 10) {
                // Se a nota for maior ou igual a 7, aluno está aprovado
                if (nota >= 7) {
                    JOptionPane.showMessageDialog(null, "Aprovado", "Resultado", JOptionPane.INFORMATION_MESSAGE);

                    // Se a nota estiver entre 5 e 7 (exclusivo), o aluno está em recuperação
                } else if (nota >= 5) {
                    JOptionPane.showMessageDialog(null, "Recuperação", "Resultado", JOptionPane.INFORMATION_MESSAGE);

                    // Se a nota for menor que 5, o aluno está reprovado
                } else {
                    JOptionPane.showMessageDialog(null, "Reprovado", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                // Exibe uma mensagem de erro se a nota fornecida estiver fora do intervalo permitido
                JOptionPane.showMessageDialog(
                        null,
                        "Nota inválida. Digite uma nota entre 0 e 10.",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        } catch (NumberFormatException e) {
            // Trata exceção caso o usuário digite um valor que não seja um número
            JOptionPane.showMessageDialog(
                    null,
                    "Entrada inválida. Digite um número válido.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}