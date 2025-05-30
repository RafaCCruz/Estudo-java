import javax.swing.JOptionPane;

public class Atividade003 {
    public static void main (String[]args){

        // Solicita um número ao usuário como um valor fracionado (double)
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço:"));

        // Converte o valor double para inteiro e armazena no valorInteiro
        int valorInteiro = (int) preco;

        // Exibe o valor inteiro convertido ao usuário
        JOptionPane.showMessageDialog(null,
                "O valor convertido para inteiro é: " + valorInteiro,
                "Valor Convertido",
                JOptionPane.INFORMATION_MESSAGE);


    }
}
