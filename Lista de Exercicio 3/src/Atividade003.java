import javax.swing.JOptionPane;

public class Atividade003 {
    public static void main(String[] args) {

        String senha = JOptionPane.showInputDialog("Digite a senha:"); // Solicita ao usuário que insira uma senha

        // Verifica se a senha é igual a "java123"
        if (senha.equals("java123")) {
            // Se a senha estiver correta, exibe uma mensagem de acesso permitido
            JOptionPane.showMessageDialog(null, "Acesso permitido.");
        }
    }
}
