import javax.swing.JOptionPane;
import java.util.Random;

public class Exercicio19 {
    public static void main(String[] args) {
        int [][] v = new int[2][2];
        Random r = new Random();

        //Preenchendo a matriz
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length; j++) {
                v[i][j] = r.nextInt(10);
            }
        }

        //Mostrando a matriz
        String mostra = "Matriz: \n";
        for (int i = 0; i < v.length; i++) {
            mostra +=("                 ");
            for (int j = 0; j < v.length; j++) {
                mostra +=(v[i][j]) + ("  ");
            }
            mostra += ("\n");
        }
        JOptionPane.showMessageDialog(null, mostra, "Matriz final" , JOptionPane.INFORMATION_MESSAGE);

        //Verificar se elementos repetidos
        boolean repetidos = false;
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length; j++) {
                for (int k = 0; k < v.length; k++) {
                    for (int l = 0; l < v.length; l++) {
                        if ((i != k || j != l) && v[i][j] == v[k][l]) {
                            repetidos = true;
                            break;
                        }
                    }
                }
            }
        }
        if (repetidos) {
            String mensagem = "Elementos repetidos";
            JOptionPane.showMessageDialog(null, mensagem, "Elementos repetidos" , JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum elemento repetido", "Elementos repetidos" , JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
