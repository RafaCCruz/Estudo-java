import javax.swing.JOptionPane;

public class Exercicio18 {
    public static void main(String[] args) {
        int[][] v = new int[4][4];

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

        int[] somas = new int[4];
        int maiorSoma = Integer.MIN_VALUE;
        int linhaMaiorSoma = -1;

        // Calcula as somas e identifica a maior
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                somas[i] += v[i][j];
            }
            if (somas[i] > maiorSoma) {
                maiorSoma = somas[i];
                linhaMaiorSoma = i;
            }
        }

        // Verifica se todas as somas são iguais
        boolean todasIguais = true;
        for (int i = 1; i < 4; i++) {
            if (somas[i] != somas[0]) {
                todasIguais = false;
                break;
            }
        }

        // Resultado
        String resultado;
        if (todasIguais) {
            resultado = "Todas as linhas possuem a mesma soma: " + somas[0];
        } else {
            resultado = "Linha com maior soma: " + linhaMaiorSoma + "\nSoma: " + maiorSoma;
        }

        JOptionPane.showMessageDialog(null, resultado);
        System.exit(0);
    }
}
