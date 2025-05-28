import javax.swing.JOptionPane;
import java.util.Random;

public class Exercicio2 {
    public static void main(String[] args) {
        int[][] v = new int[2][4];
        Random r = new Random();

        //Criando os valores da matriz
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                v[i][j] = r.nextInt(10);
            }
        }

        //Imprimindo os valores da matriz
        StringBuilder sb = new StringBuilder("Matriz completa: \n");
        for (int i = 0; i < 2; i++) {
            sb.append("             ");
            for (int j = 0; j < 4; j++) {
                sb.append(v[i][j]).append("  ");
            }
            sb.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Matriz final" , JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
