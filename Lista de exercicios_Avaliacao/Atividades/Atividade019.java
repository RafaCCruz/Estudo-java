import javax.swing.JOptionPane;

public class Atividade019 {
    public static void main(String[] args) {

        int[][] matriz = new int[2][2]; // Declaração de uma matriz 2x2
        int[][] matriz2 = new int[2][2]; // Declaração de uma segunda matriz 2x2

        // Preenchimento da matriz com números aleatórios de 1 a 10
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10 + 1); // Gera números no intervalo de 1 a 10
            }
        }

        // Monta uma String para exibir os valores da matriz
        String mostrar = "       Matriz Original:\n";
        for (int i = 0; i < matriz.length; i++) {
            mostrar += "                  "; // Espaçamento para alinhamento
            for (int j = 0; j < matriz[i].length; j++) {
                mostrar += matriz[i][j] + " "; // Adiciona os valores da matriz à String
            }
            mostrar += "\n"; // Nova linha após cada linha da matriz
        }

        // Exibe a matriz original em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, mostrar, "Matriz Original", JOptionPane.INFORMATION_MESSAGE);

        // Preenchimento da segunda matriz com números aleatórios de 1 a 10
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = (int) (Math.random() * 10 + 1); // Gera números no intervalo de 1 a 10
            }
        }

        // Monta uma String para exibir os valores da segunda matriz
        String mostrar2 = "       Segunda Matriz:\n";
        for (int i = 0; i < matriz2.length; i++) {
            mostrar2 += "                  "; // Espaçamento para alinhamento
            for (int j = 0; j < matriz2[i].length; j++) {
                mostrar2 += matriz2[i][j] + " "; // Adiciona os valores da segunda matriz à String
            }
            mostrar2 += "\n"; // Nova linha após cada linha da matriz
        }

        // Exibe a segunda matriz em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, mostrar2, "Segunda Matriz", JOptionPane.INFORMATION_MESSAGE);

        // Cálculo da multiplicação das duas matrizes
        int multiplicação = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                    multiplicação += matriz[i][j] * matriz2[i][j]; // Multiplicação das matrizes
            }
        }

        // Cria a mensagem com o resultado da multiplicação das matrizes
        String mensagem = "O resultado da multiplicação das matrizes é: " + multiplicação;

        // Exibe o resultado da multiplicação das matrizes em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, mensagem, "Multiplicação das Matrizes", JOptionPane.INFORMATION_MESSAGE);
    }
}
