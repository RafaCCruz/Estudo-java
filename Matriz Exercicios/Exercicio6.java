/**
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
}import javax.swing.JOptionPane;

public class Exercicio6 {
    public static void main(String[] args) {
        int[][] v = new int[3][2];

        //Criando a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                v[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número " + (i + 1) + "° valor da " +(j +1) + "° coluna"));
            }
        }

        //Imprimindo a matriz
        StringBuilder sb1 = new StringBuilder("Matriz completa: \n");
        for (int i = 0; i < 3; i++) {
            sb1.append("                 ");
            for (int j = 0; j < 2; j++) {
                sb1.append(v[i][j]).append("  ");
            }
            sb1.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb1.toString(), "Matriz final" , JOptionPane.INFORMATION_MESSAGE);

        //Imprimindo a soma dos numeros da matriz
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                soma += v[i][j];
            }
        }
        JOptionPane.showMessageDialog(null, "Soma dos valores da matriz: " + soma ," Soma final ", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
