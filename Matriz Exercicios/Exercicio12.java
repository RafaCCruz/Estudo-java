import javax.swing.JOptionPane;

public class Exercicio12 {
    public static void main(String[] args) {
        int[][] v = new int[3][3];

        //Criando a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String input = JOptionPane.showInputDialog(
                        null,
                        "Digite o valor para [" + (i + 1) + "][" + (j + 1) + "]:",
                        "Preenchendo Matriz",
                        JOptionPane.PLAIN_MESSAGE
                );
                v[i][j] = Integer.parseInt(input);
            }
        }

        //Imprimindo os valores da matriz
        StringBuilder sb = new StringBuilder("Matriz completa: \n");
        for (int i = 0; i < 3; i++) {
            sb.append("                 ");
            for (int j = 0; j < 3; j++) {
                sb.append(v[i][j]).append("  ");
            }
            sb.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(),
                "Matriz final" ,
                JOptionPane.INFORMATION_MESSAGE);

        //Contar e imprimit os valores multiplos de 3
        int contagem = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (v[i][j] % 3 == 0) {
                    contagem++;
                }
            }
        }
        JOptionPane.showMessageDialog(null,
                "Quantidade de valores multiplos de 3 é: " + contagem,
                "Contagem de valores multiplos de 3" ,
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
