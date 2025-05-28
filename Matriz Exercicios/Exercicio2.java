import javax.swing.JOptionPane;
import java.util.Random;

public class Exercicio2 {
    public static void main(String[] args) {
        int[][] v = new int[2][4];
        Random r = new Random();import javax.swing.JOptionPane;
import java.util.Random;

        public class Exercicio2 {
            public static void main(String[] args) {
                // Declaração de uma matriz 2x4
                int[][] v = new int[2][4];
                Random r = new Random();

                // Criando os valores da matriz aleatoriamente
                for (int i = 0; i < 2; i++) { // Itera sobre as linhas da matriz
                    for (int j = 0; j < 4; j++) { // Itera sobre as colunas da matriz
                        v[i][j] = r.nextInt(10); // Atribui números aleatórios entre 0 e 9
                    }
                }

                // Montando uma string para apresentação da matriz
                StringBuilder sb = new StringBuilder("Matriz completa: \n");
                for (int i = 0; i < 2; i++) { // Itera novamente sobre as linhas da matriz
                    sb.append("             "); // Adiciona espaçamento para formatação visual
                    for (int j = 0; j < 4; j++) { // Itera sobre as colunas da matriz
                        sb.append(v[i][j]).append("  "); // Adiciona os valores da matriz à string
                    }
                    sb.append("\n"); // Adiciona uma nova linha após cada linha completa da matriz
                }

                // Exibe a matriz completa em uma janela de diálogo
                JOptionPane.showMessageDialog(
                        null, // Sem um componente pai específico
                        sb.toString(), // Conteúdo da mensagem (a matriz formatada)
                        "Matriz final", // Título da janela
                        JOptionPane.INFORMATION_MESSAGE // Tipo de mensagem exibida
                );

                // Encerra a aplicação
                System.exit(0);
            }
        }

        //Criando os valores da matriz
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                v[i][j] = r.nextInt(10);
            }
        }

        //Imprimindo os valores da matriz
        StringBuilder sb = new StringBuilder("Matriz completa: \n");
        for (int i = 0; i < 2; i++) {
            sb.append("             ");
            for (int j = 0; j < 4; j++) {
                sb.append(v[i][j]).append("  ");
            }
            sb.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Matriz final" , JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
