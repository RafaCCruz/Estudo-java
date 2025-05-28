import javax.swing.JOptionPane;
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