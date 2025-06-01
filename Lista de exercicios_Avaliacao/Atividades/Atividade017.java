import javax.swing.JOptionPane;

public class Atividade017 {
    public static void main(String[] args) {

        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor:"));

        // Declaração de um vetor de tamanho especificado pelo usuário
        int [] v = new int[tamanho]; // Declaração de um vetor de 10 elementos do tipo inteiro

        // Preenchimento do vetor com números aleatórios de 1 a 10
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 10 + 1); // Gera números no intervalo de 1 a 10
        }

        // Monta uma String para exibir os valores do vetor
        String mostrar = " Os valor do vetor são: ";

        for (int i = 0; i < v.length; i++) {
            mostrar += v[i] + " "; // Adiciona os valores do vetor à String
        }

        // Exibe o vetor gerado em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, mostrar, "Vetor", JOptionPane.INFORMATION_MESSAGE);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para saber se existe algum valor maior no vetor:"));
        boolean existeMaior = false;
        int contador = 0;
        // Contador para verificar quantos valores são maiores que o número informado
        for (int i = 0; i < v.length; i++) {
            if (v[i] > numero) {
                contador++; // Incrementa o contador se o valor do vetor for maior que o número informado
            }
        }

        // Mensagem para exibir o resultado
        String mensagem = "Existem " + contador + " valores maiores que " + numero + " no vetor.";

        // Exibe a mensagem com o número de valores maiores
        JOptionPane.showMessageDialog(null, mensagem, "Valores maiores", JOptionPane.INFORMATION_MESSAGE);
    }
}
