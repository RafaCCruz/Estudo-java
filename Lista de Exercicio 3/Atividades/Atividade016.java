import javax.swing.JOptionPane;

public class Atividade016 {
    public static void main(String[] args){

        String mensagem = "Números de 10 a 1: \n";
        // Looping de 10 até 1, decrementando 1 em cada iteração
        for (int i = 10; i >= 1; i--) {
            // Adiciona o número atual e um espaço à mensagem
            mensagem += i + " ";
        }

        // Exibe a mensagem contendo os números de 10 a 1 em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
