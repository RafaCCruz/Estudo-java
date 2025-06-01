import javax.swing.JOptionPane;

public class Atividade018 {
    public static void main(String[] args) {

        int[][] matriz = new int[2][3]; // Declaração de uma matriz 2x3
        int[][] transposta = new int[3][2]; // Declaração da matriz transposta 3x2

        // Preenchimento da matriz com números aleatórios de 1 a 10
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10 + 1); // Gera números no intervalo de 1 a 10
            }
        }

        // Monta uma String para exibir os valores da matriz original
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

        // Cálculo da matriz transposta
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transposta[j][i] = matriz[i][j]; // Transposição da matriz
            }
        }

        // Monta uma String para exibir os valores da matriz transposta
        String mostrarTransposta = "      Matriz Transposta:\n";
        for (int i = 0; i < transposta.length; i++) {
            mostrarTransposta += "                  "; // Espaçamento para alinhamento
            for (int j = 0; j < transposta[i].length; j++) {
                mostrarTransposta += transposta[i][j] + " "; // Adiciona os valores da matriz transposta à String
            }
            mostrarTransposta += "\n"; // Nova linha após cada linha da matriz
        }

        // Exibe a matriz transposta em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, mostrarTransposta, "Matriz Transposta", JOptionPane.INFORMATION_MESSAGE);
    }
}
