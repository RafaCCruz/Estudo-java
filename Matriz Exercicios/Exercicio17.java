import javax.swing.JOptionPane;

public class Exercicio17 {
    public static void main(String[] args) {
        int[][] v = new int[3][3];

        //Preenchendo a matriz
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
            sb.append("          ");
            for (int j = 0; j < 3; j++) {
                sb.append(v[i][j]).append("  ");
            }
            sb.append("\n");
        }
        JOptionPane.showMessageDialog(null,
                sb.toString(),
                "Matriz final" ,
                JOptionPane.INFORMATION_MESSAGE);

        //Vericando se uma matriz simetrica
        boolean simetrica = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (v[i][j] != v[j][i]) {
                    simetrica = false;
                    break;
                }
            }
            if (!simetrica) {
                break;
            }
        }

        // Resultado
        JOptionPane.showMessageDialog(null, simetrica ? "Simétrica" : "Não Simétrica");
    }
}
