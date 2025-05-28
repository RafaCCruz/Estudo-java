import javax.swing.JOptionPane;

//Criar uma matriz e multiplicar ela por um valor
public class Exercicio22 {
    public static void main(String[] args) {
        int [][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (i + 4) + (j + 5);
            }
        }

        String mostrar = " Matriz inicial\n";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mostrar += matriz[i][j] + " ";
            }
            mostrar += "\n";
        }

        JOptionPane.showMessageDialog(null, mostrar);

        int multiplicador = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para multiplicar a matriz"));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] *= multiplicador;
            }
        }

        String mostrar2 = " Matriz multiplicada\n";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mostrar2 += matriz[i][j] + " ";
            }
            mostrar2 += "\n";
        }
        JOptionPane.showMessageDialog(null, mostrar2);
    }
}
