import javax.swing.JOptionPane;

/**
 * Exercicio 1 - Matriz
 *
 * Este programa cria uma matriz 3x3 onde o usuário pode preencher os valores.
 * Após preenchida, a matriz é exibida no console em formato de tabela.
 *
 * @autor Rafael Costa
 */
public class Exercicio1 {
    public static void main(String[] args) {
        // Declaração da matriz 3x3
        int[][] v = new int[3][3];

        // Entrada de dados: preenchimento dos valores da matriz pelo usuário
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Lê os valores da matriz individualmente
                String entrada = JOptionPane.showInputDialog("Digite o número " + (i + 1) + "° valor da " + (j + 1) + "° coluna");
                v[i][j] = Integer.parseInt(entrada); // Converte para inteiro e salva na matriz
            }
        }

        // Constrói a string para exibição da matriz no formato de tabela
        StringBuilder sb = new StringBuilder("Matriz completa: \n");
        for (int i = 0; i < 3; i++) {
            sb.append("                       "); // Espaçamento para visualização
            for (int j = 0; j < 3; j++) {
                sb.append(v[i][j]).append("  "); // Adiciona cada número da matriz
            }
            sb.append("\n"); // Adiciona uma nova linha
        }

        // Mostra a matriz formatada como tabela
        JOptionPane.showMessageDialog(null, sb.toString(), "Matriz final", JOptionPane.INFORMATION_MESSAGE);

        // Finaliza o programa
        System.exit(0);
    }
}