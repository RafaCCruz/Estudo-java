import javax.swing.JOptionPane;

public class Exercicio6 {
    public static void main(String[] args) {
        int[][] v = new int[3][2];

        //Criando a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                v[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número " + (i + 1) + "° valor da " +(j +1) + "° coluna"));
            }
        }

        //Imprimindo a matriz
        StringBuilder sb1 = new StringBuilder("Matriz completa: \n");
        for (int i = 0; i < 3; i++) {
            sb1.append("                 ");
            for (int j = 0; j < 2; j++) {
                sb1.append(v[i][j]).append("  ");
            }
            sb1.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb1.toString(), "Matriz final" , JOptionPane.INFORMATION_MESSAGE);

        //Imprimindo a soma dos numeros da matriz
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                soma += v[i][j];
            }
        }
        JOptionPane.showMessageDialog(null, "Soma dos valores da matriz: " + soma ," Soma final ", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
