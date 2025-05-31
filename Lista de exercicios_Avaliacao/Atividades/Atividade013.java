import javax.swing.JOptionPane;

public class Atividade013 {
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero que queira saber a tabuada"));

        String resultado = "";
        for (int i = 1; i <= 10; i++) {
            resultado += numero + " x " + i + " = " + (numero * i) + "\n";
        }

        JOptionPane.showMessageDialog(null, "A tabuada do " + numero + " é \n" + resultado,
                "Tabuada do " + numero,
                JOptionPane.INFORMATION_MESSAGE);
    }
}
