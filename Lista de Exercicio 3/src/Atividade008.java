import javax.swing.JOptionPane;

public class Atividade008 {

    public static void main(String[] args) {
        // Solicita ao usuário que insira o primeiro número inteiro
        String input1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        int numero1 = Integer.parseInt(input1);  // Converte o valor digitado para inteiro

        // Solicita ao usuário que insira o segundo número inteiro
        String input2 = JOptionPane.showInputDialog("Digite o segundo número:");
        int numero2 = Integer.parseInt(input2);  // Converte o valor digitado para inteiro

        // Compara os dois números e exibe a mensagem apropriada
        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, "O maior número é: " + numero1);
        } else if (numero2 > numero1) {
            JOptionPane.showMessageDialog(null, "O maior número é: " + numero2);
        } else {
            JOptionPane.showMessageDialog(null, "Os dois números são iguais.");  // Caso os números sejam iguais
        }
    }
}
