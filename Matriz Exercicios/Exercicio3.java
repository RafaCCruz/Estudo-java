import javax.swing.JOptionPane;
import java.util.Random;

public class Exercicio3 {
    public static void main(String[] args) {
        int[][] v = new int[3][3];
        Random r = new Random();

        //Criando a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                v[i][j] = r.nextInt(10);
            }
        }

        //Imprimindo a matriz
        StringBuilder sb = new StringBuilder("Diagonal principal: \n");
        for (int i = 0; i < 3; i++) {
            sb.append(v[i][i]).append("  ");
        }
        JOptionPane.showMessageDialog(null, sb.toString() ," Diagonal principal final ", JOptionPane.INFORMATION_MESSAGE);


    }
}
