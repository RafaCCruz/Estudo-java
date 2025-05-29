import javax.swing.JOptionPane;

public class MatrizSoma {
    public static void main(String[] args) {
        // Declaração da matriz 3x3
        int[][] matriz = new int[3][3];
        
        // Vetores para armazenar a soma de cada linha e de cada coluna
        int[] somaLinhas = new int[3];
        int[] somaColunas = new int[3];

        // Preenchendo a matriz com valores informados pelo usuário
        for (int i = 0; i < 3; i++) { // percorre as linhas
            for (int j = 0; j < 3; j++) { // percorre as colunas
                // Solicita o valor para a posição [i][j]
                String input = JOptionPane.showInputDialog("Digite o valor para a posição [" + i + "][" + j + "]:");
                matriz[i][j] = Integer.parseInt(input); // converte e armazena
            }
        }

        // Calcula a soma de cada linha e de cada coluna
        for (int i = 0; i < 3; i++) { // percorre as linhas
            for (int j = 0; j < 3; j++) { // percorre as colunas
                somaLinhas[i] += matriz[i][j];   // acumula valores da linha i
                somaColunas[j] += matriz[i][j];  // acumula valores da coluna j
            }
        }

        // Monta a mensagem com a soma de todas as linhas
        StringBuilder resultadoLinhas = new StringBuilder("Soma das Linhas:\n");
        for (int i = 0; i < 3; i++) {
            resultadoLinhas.append("Linha ").append(i + 1).append(": ").append(somaLinhas[i]).append("\n");
        }

        // Monta a mensagem com a soma de todas as colunas
        StringBuilder resultadoColunas = new StringBuilder("Soma das Colunas:\n");
        for (int j = 0; j < 3; j++) {
            resultadoColunas.append("Coluna ").append(j + 1).append(": ").append(somaColunas[j]).append("\n");
        }

        // Exibe a soma de todas as linhas
        JOptionPane.showMessageDialog(null, resultadoLinhas.toString());

        // Exibe a soma de todas as colunas
        JOptionPane.showMessageDialog(null, resultadoColunas.toString());
    }
}