import javax.swing.JOptionPane;

public class Exercicio14 {
    public static void main(String[] args) {
        int[][] v = new int[2][2];
        int[][] v2 = new int[2][2];
        int[][] v3 = new int[2][2];

        //Preenchendo a primeira matriz
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                v[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
                        null,
                        "Digite o valor para a primeira matriz [" + (i + 1) + "][" + (j + 1) + "]:",
                        "Preenchendo Matriz",
                        JOptionPane.PLAIN_MESSAGE));
            }
        }

        //Preenchendo a segunda matriz
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                v2[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
                        null,
                        "Digite o valor para a segunda matriz [" + (i + 1) + "][" + (j + 1) + "]:",
                        "Preenchendo Matriz",
                        JOptionPane.PLAIN_MESSAGE));
            }
        }

        //Prenchendo a terciera matriz
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                v3[i][j] = v[i][j] * v2[i][j];
            }
        }

        //Imprimindo os valores da matriz
        StringBuilder sb = new StringBuilder("Matriz completa: \n");
        for (int i = 0; i < 2; i++) {
            sb.append("                     ");
            for (int j = 0; j < 2; j++) {
                sb.append(v3[i][j]).append("  ");
            }
            sb.append("\n");
        }
        JOptionPane.showMessageDialog(null,
                sb.toString(),
                "Matriz final" ,
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
