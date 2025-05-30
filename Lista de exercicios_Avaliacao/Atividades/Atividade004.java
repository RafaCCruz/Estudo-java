import javax.swing.JOptionPane;

public class Atividade004 {
    public static void main(String[] args) {

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        //Trocar o primeiro número pelo segundo
        int temp = numero1;
        numero1 = numero2;
        numero2 = temp;

        // Exibir os números trocados
        JOptionPane.showMessageDialog(null,
                "Após a troca:\nPrimeiro número: " + numero1 + "\nSegundo número: " + numero2,
                "Números Trocados",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
