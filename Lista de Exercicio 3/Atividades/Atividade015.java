import javax.swing.JOptionPane;

public class Atividade015 {
    public static void main(String[] args) {
        // StringBuilder para armazenar os números em sequência
        StringBuilder numeros = new StringBuilder();

        // Loop que realiza a contagem regressiva de 10 a 1
        for (int i = 10; i >= 1; i--) { // inicializa i com 10, verifica se i >= 1, e decrementa 1 a cada iteração
            numeros.append(i).append("\n"); // Adiciona cada número à string com quebra de linha
        }

        // Exibe os números utilizando JOptionPane
        JOptionPane.showMessageDialog(null, "Números de 10 a 1:\n" + numeros);
    }
}
