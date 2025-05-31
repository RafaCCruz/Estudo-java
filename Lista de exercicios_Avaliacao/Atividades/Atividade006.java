import javax.swing.JOptionPane; // Importação para utilização de janelas de input e output

public class Atividade006 {
    public static void main(String[] args) {
        // Solicita ao usuário que insira um número usando uma caixa de diálogo
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        // Verifica se o número inserido é par ou ímpar
        if(numero % 2 == 0){ // Se o resto da divisão do número por 2 for 0, ele é par
            // Exibe uma mensagem informando que o número é par
            JOptionPane.showMessageDialog(null,
                    "O número " + numero + " é par.", // Mensagem exibida ao usuário
                    "Resultado", // Título da janela de diálogo
                    JOptionPane.INFORMATION_MESSAGE); // Tipo de mensagem
        } else { // Se o resto não for 0, o número é ímpar
            // Exibe uma mensagem informando que o número é ímpar
            JOptionPane.showMessageDialog(null,
                    "O número " + numero + " é ímpar.", // Mensagem exibida ao usuário
                    "Resultado", // Título da janela de diálogo
                    JOptionPane.INFORMATION_MESSAGE); // Tipo de mensagem
        }
    }
}