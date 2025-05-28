import javax.swing.JOptionPane;
import java.util.Random;

//Somas as diagonais da matriz
public class Exercicio23 {
    public static void main(String[] args) {
        int[][] v = new int[3][3];
        Random r = new Random();

        //Prenchendo a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                v[i][j] = r.nextInt(10) +1;
            }
        }

        //Mostrando a matriz
        String mostra = "Matriz: \n";
        for (int i = 0; i < 3; i++) {
           mostra +=("                 ");
            for (int j = 0; j < 3; j++) {
                mostra +=(v[i][j]) + ("  ");
            }
            mostra += ("\n");
        }
        JOptionPane.showMessageDialog(null, mostra, "Matriz final" , JOptionPane.INFORMATION_MESSAGE);

        //Soma de diagonal principal
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    soma += v[i][j];
                }
            }
        }

        //Soma da matriz secundaria
        int soma2 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i + j == (v.length - 1)) {
                    soma2 += v[i][j];
                }
            }
        }

        //Somar as diagonais
        int soma3 = soma + soma2;

        JOptionPane.showMessageDialog(null, "Soma das diagonais: " + soma3, "Soma final" , JOptionPane.INFORMATION_MESSAGE);
    }
}
