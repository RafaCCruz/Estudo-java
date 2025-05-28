import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        int[][] v = new int[3][3];

        //Criando a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                v[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número " + (i + 1) + "° valor da " +(j +1) + "° coluna"));
            }
        }

        //Imprimindo a matriz
        StringBuilder sb1 = new StringBuilder("Matriz completa: \n");
        for (int i = 0; i < 3; i++) {
            sb1.append("                 ");
            for (int j = 0; j < 3; j++) {
                sb1.append(v[i][j]).append("  ");
            }
            sb1.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb1.toString(), "Matriz final" , JOptionPane.INFORMATION_MESSAGE);

        //Imprimir os numeros maiores que 10
        StringBuilder sb = new StringBuilder("Numeros maiores que 10: \n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (v[i][j] > 10) {
                    sb.append(v[i][j]).append("  ");
                }
            }
        }
        JOptionPane.showMessageDialog(null, sb.toString() ," Numeros maiores que 10 final ", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
