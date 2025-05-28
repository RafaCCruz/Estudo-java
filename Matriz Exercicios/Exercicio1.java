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
}/**
 * Exercicio 6
 *
 * Este programa cria uma matriz 3x2 a partir de valores fornecidos pelo usuário,
 * exibe a matriz completa e calcula a soma de todos os elementos.
 */
public class Exercicio6 {
    public static void main(String[] args) {
        // Declaração da matriz 3x2
        int[][] v = new int[3][2];

        // Entrada de valores para preencher a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                // Lê os valores da matriz
                v[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número " + (i + 1) + "° valor da " + (j + 1) + "° coluna"));
            }
        }

        // Exibe a matriz completa
        StringBuilder sb1 = new StringBuilder("Matriz completa: \n");
        for (int i = 0; i < 3; i++) {
            sb1.append("                 ");
            for (int j = 0; j < 2; j++) {
                sb1.append(v[i][j]).append("  "); // Adiciona os valores da matriz
            }
            sb1.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb1.toString(), "Matriz final", JOptionPane.INFORMATION_MESSAGE);

        // Calcula a soma de todos os elementos da matriz
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                soma += v[i][j]; // Soma os elementos
            }
        }

        // Mostra a soma final
        JOptionPane.showMessageDialog(null, "Soma dos valores da matriz: " + soma, "Soma final", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0); // Encerra o programa
    }
}
 */
public class Exercicio1 {
    public static void main(String[] args) {
        //Matriz com 3 inhas e 3 colunas
        int [][] v = new int[3][3];

        //Usuario escrever os valor da matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String entrada = JOptionPane.showInputDialog("Digite o número " + (i + 1) + "° valor da " +(j +1) + "° coluna");
                v[i][j] = Integer.parseInt(entrada);
            }
        }

        //Imprimindo a matriz em forma de tabela
        StringBuilder sb = new StringBuilder("Matriz completa: \n");
        for (int i = 0; i < 3; i++) {
            sb.append("                       ");
            for (int j = 0; j < 3; j++) {
                sb.append(v[i][j]).append("  ");
            }
            sb.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Matriz final" , JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}