import javax.swing.JOptionPane;

public class Atividade019 {
    public static void main(String[] args) {
        
        String palavra = JOptionPane.showInputDialog("Digite uma palavra:");

        //Exibir cada character da palavra em uma nova linha
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < palavra.length(); i++) {
            resultado.append(palavra.charAt(i)).append("\n");
        }
        // Exibir o resultado em uma janela de diálogo
        JOptionPane.showMessageDialog(
                null,
                resultado.toString(), // Mensagem a ser exibida
                "Resultado", // Título da janela
                JOptionPane.INFORMATION_MESSAGE // Tipo de mensagem (informação)
        );
    }
}
