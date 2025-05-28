import javax.swing.JOptionPane;

public class Exercicio15 {
    public static void main(String[] args) {
        int[][] v = new int[3][3];

        //Prenchendo a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                v[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
                        null,
                        "Digite o valor para a primeira matriz [" + (i + 1) + "][" + (j + 1) + "]:",
                        "Preenchendo Matriz",
                        JOptionPane.PLAIN_MESSAGE));
            }
        }

        //Imprimindo os valores da matriz
        StringBuilder sb = new StringBuilder("Matriz completa: \n");
        for (int i = 0; i < 3; i++) {
            sb.append("                     ");
            for (int j = 0; j < 3; j++) {
                sb.append(v[i][j]).append("  ");
            }
            sb.append("\n");
        }
        JOptionPane.showMessageDialog(null,
                sb.toString(),
                "Matriz final" ,
                JOptionPane.INFORMATION_MESSAGE);

        //Imprimindo os valores alterando os numeros negativos por 0
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (v[i][j] < 0) {
                    v[i][j] = 0;
                }
            }
        }

        //Imprimindo os valores da nova matriz
        StringBuilder sb1 = new StringBuilder("Matriz nova completa: \n");
        for (int i = 0; i < 3; i++) {
            sb1.append("                     ");
            for (int j = 0; j < 3; j++) {
                sb1.append(v[i][j]).append("  ");
            }
            sb1.append("\n");
        }
        JOptionPane.showMessageDialog(null,
                sb1.toString(),
                "Matriz nova final" ,
                JOptionPane.INFORMATION_MESSAGE);
    }
}
