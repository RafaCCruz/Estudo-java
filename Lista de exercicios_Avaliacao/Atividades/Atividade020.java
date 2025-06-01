import javax.swing.JOptionPane;

public class Atividade020 {
    public static void main(String[] args) {
        // Solicita ao usuário o tamanho da linha e da coluna da matriz
        int tamanho_Linha = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da linha da matriz:"));
        int tamanho_Coluna = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da coluna da matriz:"));

        // Declara e inicializa uma matriz com os tamanhos fornecidos pelo usuário
        int[][] matriz = new int[tamanho_Linha][tamanho_Coluna];

        // Preenche a matriz com números aleatórios entre 1 e 10
        for (int i = 0; i < tamanho_Linha; i++) {
            for (int j = 0; j < tamanho_Coluna; j++) {
                matriz[i][j] = (int) (Math.random() * 10 + 1); // Gera números no intervalo de 1 a 10
            }
        }

        // Monta uma representação da matriz original em forma de String
        String resultado = "         Matriz Original:\n";
        for (int i = 0; i < tamanho_Linha; i++) {
            resultado += "                  "; // Adiciona espaçamento para melhor visualização
            for (int j = 0; j < tamanho_Coluna; j++) {
                resultado += matriz[i][j] + " "; // Adiciona os valores da matriz na String
            }
            resultado += "\n"; // Adiciona uma nova linha após a exibição de cada linha da matriz
        }

        // Exibe a matriz original ao usuário
        JOptionPane.showMessageDialog(null, resultado, "Matriz Original", JOptionPane.INFORMATION_MESSAGE);

        // Solicita ao usuário o número que deseja buscar na matriz
        int busca = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para buscar na matriz:"));

        // Variável que indica se o número foi encontrado na matriz
        boolean encontrado = false;
        // String para armazenar as posições em que o número foi encontrado
        String posicoes = "Posições do número " + busca + " na matriz:\n";

        // Percorre a matriz para buscar o número fornecido pelo usuário
        for (int i = 0; i < tamanho_Linha; i++) {
            for (int j = 0; j < tamanho_Coluna; j++) {
                if (matriz[i][j] == busca) { // Verifica se o valor da célula é igual ao número buscado
                    encontrado = true; // Marca que o número foi encontrado
                    // Adiciona a posição (linha e coluna) do número à String de resultados
                    posicoes += "Linha: " + (i + 1) + ", Coluna: " + (j + 1) + "\n";
                }
            }
        }

        // Exibe o resultado da busca
        if (encontrado) {
            // Caso o número seja encontrado, exibe suas posições
            JOptionPane.showMessageDialog(null, posicoes, "Resultado da Busca", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Caso o número não seja encontrado, informa a ausência
            JOptionPane.showMessageDialog(null, "O número " + busca + " não foi encontrado na matriz.", "Resultado da Busca", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}