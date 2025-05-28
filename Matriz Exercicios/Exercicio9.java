/**
 * Exercicio 9 - Matriz
 *
 * Este programa preenche uma matriz 3x3 com valores informados pelo usuário.
 * Em seguida, exibe a soma de cada linha separadamente.
 */
public class Exercicio9 {
    public static void main(String[] args) {
        // Declaração da matriz 3x3
        int[][] v = new int[3][3];

        // Preenchimento da matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                v[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número " + (i + 1) + "° valor da " + (j + 1) + "° coluna"));
            }
        }

        // Exibição da matriz completa
        StringBuilder sb1 = new StringBuilder("Matriz completa: \n");
        for (int i = 0; i < 3; i++) {
            sb1.append("                 ");
            for (int j = 0; j < 3; j++) {
                sb1.append(v[i][j]).append("  ");
            }
            sb1.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb1.toString(), "Matriz final", JOptionPane.INFORMATION_MESSAGE);

        // Calcula a soma de cada linha e exibe os resultados
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            int soma = 0;
            for (int j = 0; j < 3; j++) {
                soma += v[i][j];
            }
            sb.append("Soma da linha ").append(i + 1).append(": ").append(soma).append("\n");
        }

        // Mostra as somas das linhas
        JOptionPane.showMessageDialog(null, sb.toString(), "Somas das Linhas", JOptionPane.INFORMATION_MESSAGE);
    }
}import javax.swing.JOptionPane;

public class Exercicio9 {
    public static void main(String[] args) {
        int[][] v = new int[3][3];

        //Criando a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                v[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número " + (i + 1) + "° valor da " +(j +1) + "° coluna"));
            }
        }

        //Imprimindo a matriz
        StringBuilder sb1 = new StringBuilder("Matriz completa: \n");
        for (int i = 0; i < 3; i++) {
            sb1.append("                 ");
            for (int j = 0; j < 3; j++) {
                sb1.append(v[i][j]).append("  ");
            }
            sb1.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb1.toString(), "Matriz final" , JOptionPane.INFORMATION_MESSAGE);

        //Imprimindo a soma das linhas da matriz separadamente
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            int soma = 0;
            for (int j = 0; j < 3; j++) {
                soma += v[i][j];
            }
            sb.append("Soma da linha ").append(i + 1).append(": ").append(soma).append("\n");
        }

        // Mostrar as somas
        JOptionPane.showMessageDialog(
                null,
                sb.toString(),
                "Somas das Linhas",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
