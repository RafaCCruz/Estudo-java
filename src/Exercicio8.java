import javax.swing.JOptionPane;

public class Exercicio8 {
    public static void main(String[] args) {
        int[][] v = new int[4][2];

        //Criando a matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                v[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número " + (i + 1) + "° valor da " +(j +1) + "° coluna"));
            }
        }

        //Imprimindo a matriz
        StringBuilder sb1 = new StringBuilder("Matriz completa: \n");
        for (int i = 0; i < 4; i++) {
            sb1.append("                     ");
            for (int j = 0; j < 2; j++) {
                sb1.append(v[i][j]).append("  ");
            }
            sb1.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb1.toString(), "Matriz final" , JOptionPane.INFORMATION_MESSAGE);

        //Imprimir o maior e o menor valor da matriz
        int maior = v[0][0];
        int menor = v[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                if (v[i][j] > maior) {
                    maior = v[i][j];
                }
                if (v[i][j] < menor) {
                    menor = v[i][j];
                }
            }
        }

        String resultado = "Maior valor: " + maior + "\nMenor valor: " + menor;

        JOptionPane.showMessageDialog(null, resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
