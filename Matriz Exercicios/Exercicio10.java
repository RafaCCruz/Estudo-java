import javax.swing.JOptionPane;

public class Exercicio10 {
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
        JOptionPane.showMessageDialog(null, sb.toString(), "Matriz final" , JOptionPane.INFORMATION_MESSAGE);

        //Imprimindo a soma da colonas separadamente
        StringBuilder sb1 = new StringBuilder();
        for (int j = 0; j < 3; j++) {
            int soma = 0;
            for (int i = 0; i < 3; i++) {
                soma += v[i][i];
            }
            sb1.append("Soma da coluna " + (j + 1) + ": " + soma + "\n");
        }
        JOptionPane.showMessageDialog(null, sb1.toString(), "Soma das colunas" , JOptionPane.INFORMATION_MESSAGE);
    }
}
