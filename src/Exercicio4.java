import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {
        int[][] v = new int[3][3];

        //Criando a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                v[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número " + (i + 1) + "° valor da " +(j +1) + "° coluna"));
            }
        }

        //Imprimindo a matrix completa
        StringBuilder sb1 = new StringBuilder("Matriz completa: \n");
        for (int i = 0; i < 3; i++) {
            sb1.append("                 ");
            for (int j = 0; j < 3; j++) {
                sb1.append(v[i][j]).append("  ");
            }
            sb1.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb1.toString(), "Matriz final" , JOptionPane.INFORMATION_MESSAGE);


        //Imrpimindo a diagonal secundaria
        StringBuilder sb = new StringBuilder("Diagonal secundaria: \n");
        for (int i = 0; i < 3; i++) {
            sb.append(v[i][2 - i]).append("  ");
        }
        JOptionPane.showMessageDialog(null, sb.toString() ," Diagonal secundaria final ", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
