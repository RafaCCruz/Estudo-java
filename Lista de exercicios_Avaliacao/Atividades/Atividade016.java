import javax.swing.JOptionPane;

public class Atividade016 {
    public static void main(String[] args) {

        double[] v = new double[10]; // Declaração de um vetor de 10 elementos do tipo double

        // Preenchimento do vetor com números aleatórios de 1 a 10
        for (int i = 0; i < v.length; i++) {
            v[i] = Math.random() * 10 + 1; // Gera números no intervalo de 1 a 10
        }

        // Monta uma String para exibir os valores do vetor
        String mostrar = "Vetor: ";

        for (int i = 0; i < v.length; i++) {
            mostrar += String.format("%.2f", v[i]) + " "; // Adiciona os valores do vetor à String formatados com 2 casas decimais
        }

        // Exibe o vetor gerado em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, mostrar, "Vetor", JOptionPane.INFORMATION_MESSAGE);

        // Soma os valores do vetor
        double soma = 0;

        for (int i = 0; i < v.length; i++) {
            soma += v[i];
        }

        // Cria a mensagem com a soma dos valores do vetor
        String mensagem = "A soma dos valores do vetor é: " + String.format("%.2f", soma);

        // Exibe a soma dos valores do vetor em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, mensagem, "Soma dos valores do vetor", JOptionPane.INFORMATION_MESSAGE);

        // Calcula a média dos valores do vetor
        double media = soma / v.length;

        // Cria a mensagem com a média dos valores do vetor
        String mensagemMedia = "A média dos valores do vetor é: " + String.format("%.2f", media);

        // Exibe a média dos valores do vetor em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, mensagemMedia, "Média dos valores do vetor", JOptionPane.INFORMATION_MESSAGE);
    }
}
