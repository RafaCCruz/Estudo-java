import javax.swing.JOptionPane;
import java.util.Random;

public class Atividade015 {
    public static void main(String[] args) {

        // Declaração de um vetor de 5 elementos inteiros
        int [] v = new int[5];

        // Criação de um objeto Random para gerar números aleatórios
        Random r = new Random();

        // Preenchimento do vetor com números aleatórios de 1 a 10
        for (int i = 0; i < v.length; i++) {
            v[i] = r.nextInt(10) + 1; // Gera números no intervalo de 1 a 10
        }

        // Monta uma String para exibir os valores do vetor
        String mostrar = "Vetor: ";
        for (int i = 0; i < v.length; i++) {
            mostrar += v[i] + " "; // Adiciona os valores do vetor à String
        }

        // Exibe o vetor gerado em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, "O vetor é \n" + mostrar, "Vetor", JOptionPane.INFORMATION_MESSAGE);

        // Soma os valores do vetor
        int soma = 0;
        for (int i = 0; i < v.length; i++) {
            soma += v[i];
        }

        // Cria a mensagem com a soma dos valores do vetor
        String mensagem = "A soma dos valores do vetor é: " + soma;

        // Exibe a soma dos valores do vetor em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, mensagem, "Soma dos valores do vetor", JOptionPane.INFORMATION_MESSAGE);
    }
}