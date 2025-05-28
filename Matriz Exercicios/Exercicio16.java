import javax.swing.JOptionPane;
import java.util.Random;

public class Exercicio16 {
    public static void main(String[] args) {
        int[][] v = new int[5][5];
        Random r = new Random();

        //Prenchendo a matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                v[i][j] = r.nextInt(100) + 1;
            }
        }

        //Imprimindo os valores da matriz
        StringBuilder sb = new StringBuilder("Matriz completa: \n");
        for (int i = 0; i < 5; i++) {
            sb.append("          ");
            for (int j = 0; j < 5; j++) {
                sb.append(v[i][j]).append("  ");
            }
            sb.append("\n");
        }
        JOptionPane.showMessageDialog(null,
                sb.toString(),
                "Matriz final" ,
                JOptionPane.INFORMATION_MESSAGE);

        //Contar os valores entre 30 e 60
        int contagem = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (v[i][j] >= 30 && v[i][j] <= 60) {
                    contagem++;
                }
            }
        }
        String resultado = "A quantidade de numeros maior de 30 e menor que 60 é: " + contagem;

        JOptionPane.showMessageDialog(null, resultado, "Resultado" , JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
