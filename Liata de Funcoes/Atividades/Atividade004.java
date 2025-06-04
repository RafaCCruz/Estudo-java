import javax.swing.JOptionPane;

public class Atividade004 {

    public static int[] sortArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Trocar array[j] e array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        // Solicita ao usuário que informe o tamanho do array
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do array:"));
        int[] array = new int[tamanho];

        // Preenche o array com valores informados pelo usuário
        for (int i = 0; i < tamanho; i++) {
            array[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para a posição " + (i + 1) + ":"));
        }

        // Chama o método sortArray para ordenar o array
        int[] resultado = sortArray(array);

        // Exibe o resultado em uma caixa de diálogo
        StringBuilder sb = new StringBuilder("Array ordenado: ");
        for (int num : resultado) {
            sb.append(num).append(" ");
        }

        JOptionPane.showMessageDialog(null, sb.toString(),
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
