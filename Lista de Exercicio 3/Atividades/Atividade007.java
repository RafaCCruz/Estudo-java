import javax.swing.JOptionPane; // Importação para utilizar caixas de diálogo (input e output)

public class Atividade007 {
    public static void main(String[] args) {

        // Solicita a entrada da nota do aluno através de uma caixa de diálogo
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno: "));

        // Verifica se o aluno foi aprovado (nota maior ou igual a 7)
        if (nota >= 7) {
            // Exibe uma mensagem dizendo que o aluno foi aprovado
            JOptionPane.showMessageDialog(null, "Aluno aprovado!");
        } else {
            // Caso contrário, exibe uma mensagem dizendo que o aluno foi reprovado
            JOptionPane.showMessageDialog(null, "Aluno reprovado!");
        }
    }
}