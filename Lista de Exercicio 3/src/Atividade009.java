import javax.swing.JOptionPane; // Import JOptionPane for GUI dialog boxes

public class Atividade009 {
    public static void main(String[] args) {
        // Solicita que o usuário insira uma única letra
        String letra = JOptionPane.showInputDialog("Insira uma única letra:");

        // Verifica se a letra recebida é uma vogal ou consoante
        if (letra != null && (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u"))) {
            JOptionPane.showMessageDialog(null, "Vogal"); // Exibe "Vogal" caso a letra seja 'a', 'e', 'i', 'o' ou 'u'
        } else {
            JOptionPane.showMessageDialog(null, "Consoante"); // Exibe "Consoante" caso contrário
        }
    }
}
