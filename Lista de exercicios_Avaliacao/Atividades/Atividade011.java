import javax.swing.JOptionPane;

public class Atividade011 {
    public static void main(String[] args) {

        // Declara uma variável para armazenar o resultado (números de 1 a 10)
        String resultado = "";

        // Loop 'for' que percorre os números de 1 a 10
        for (int i = 1; i <= 10; i++) {
            // Concatena o número atual na string 'resultado', seguido por um espaço
            resultado += i + " ";
        }

        // Exibe os números de 1 a 10 em uma caixa de diálogo
        JOptionPane.showMessageDialog(null,
                "Os números de 0 a 10 são:\n" + resultado, // Mensagem que será exibida
                "Números de 0 a 10", // Título da caixa de diálogo
                JOptionPane.INFORMATION_MESSAGE); // Tipo de mensagem (informação)
    }
}