import javax.swing.JOptionPane;


//FAZER UMA MATRIZ E SUA TRANSPOSTA
public class Exercicio21 {
    public static void main(String[] args) {

        //Usuario colocando o tamanho da matriz
        int tamanho1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da linha matriz"));
        int tamanho2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da coluna matriz"));

        //Criando a matriz
        int[][] v = new int[tamanho1][tamanho2];

        //Preenchendo a matriz
        for (int i = 0; i < tamanho1; i++) {
            for (int j = 0; j < tamanho2; j++) {
                v[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para [" + (i + 1) + "][" + (j + 1) + "]:"));
            }
        }

        //Mostrando a matriz
        String mostrar = "             Matriz final\n";
        for (int i = 0; i < tamanho1; i++) {
            mostrar += "                 ";
            for (int j = 0; j < tamanho2; j++) {
                mostrar += v[i][j] + "  ";
            }
            mostrar += "\n";
        }
        JOptionPane.showMessageDialog(null, mostrar);

        //Transformando em matriz transposta
        int[][] v2 = new int[tamanho2][tamanho1]; //Criando a matriz transposta
        for (int i = 0; i < tamanho1; i++) {
            for (int j = 0; j < tamanho2; j++) {
                v2[j][i] = v[i][j];
            }
        }

        //Mostrando a matriz transposta
        String mostrar2 = "             Matriz transposta final\n";
        for (int i = 0; i < tamanho2; i++) {
            mostrar2 += "                 ";
            for (int j = 0; j < tamanho1; j++) {
                mostrar2 += v2[i][j] + "  ";
            }
            mostrar2 += "\n";
        }
        JOptionPane.showMessageDialog(null, mostrar2);
    }
}
