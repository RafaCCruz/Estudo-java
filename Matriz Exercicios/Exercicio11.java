import javax.swing.JOptionPane;

public class Exercicio11 {
    public static void main(String[] args) {
        int[][] v = new int[3][3];

        //Criando a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String input = JOptionPane.showInputDialog(
                        null,
                        "Digite o valor para [" + (i + 1) + "][" + (j + 1) + "]:",
                        "Preenchendo Matriz",
                        JOptionPane.PLAIN_MESSAGE
                );
                v[i][j] = Integer.parseInt(input);
            }
        }

        //Imprimindo os valores da matriz
        StringBuilder sb = new StringBuilder("Matriz completa: \n");
        for (int i = 0; i < 3; i++) {
            sb.append("                 ");
            for (int j = 0; j < 3; j++) {
                sb.append(v[i][j]).append("  ");
            }
            sb.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Matriz final" , JOptionPane.INFORMATION_MESSAGE);

        //Imprimir a media dos elementos da matriz
        int soma = 0;
        int elementos = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma += v[i][j];
                elementos++;
            }
        }
        double media = soma / elementos;

        // Mostrar a média
        String resultado = "Média de todos os números: " + media;

        JOptionPane.showMessageDialog(
                null,
                resultado,
                "Média da Matriz",
                JOptionPane.INFORMATION_MESSAGE
        );
        System.exit(0);
    }

}
