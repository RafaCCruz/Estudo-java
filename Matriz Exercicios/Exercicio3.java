import javax.swing.JOptionPane;
import java.util.Random;

/**
 * Exercicio 3 - Matriz
 *
 * Este programa cria uma matriz 3x3 com valores preenchidos aleatoriamente.
 * Em seguida, imprime os valores da diagonal principal.
 */
public class Exercicio3 {
    public static void main(String[] args) {
        // Declaração da matriz 3x3 e criação do gerador de números aleatórios
        int[][] v = new int[3][3];
        Random r = new Random();

        // Preenchimento da matriz com valores aleatórios
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                v[i][j] = r.nextInt(10); // Gera valores aleatórios entre 0 e 9
            }
        }

        // Construção da string que exibe a diagonal principal
        StringBuilder sb = new StringBuilder("Diagonal principal: \n");
        for (int i = 0; i < 3; i++) {
            sb.append(v[i][i]).append("  "); // Adiciona os valores da diagonal
        }

        // Exibe a diagonal principal
        JOptionPane.showMessageDialog(null, sb.toString(), "Diagonal principal final", JOptionPane.INFORMATION_MESSAGE);
    }
}

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
