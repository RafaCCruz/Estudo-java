import javax.swing.JOptionPane;

public class Atividade005 {

    public static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        java.util.Arrays.sort(chars1);
        java.util.Arrays.sort(chars2);

        return java.util.Arrays.equals(chars1, chars2);
    }
    public static void main(String[] args) {
        // Solicita ao usuário que informe duas palavras
        String palavra1 = JOptionPane.showInputDialog("Digite a primeira palavra:");
        String palavra2 = JOptionPane.showInputDialog("Digite a segunda palavra:");

        // Chama o método areAnagrams para verificar se as palavras são anagramas
        boolean resultado = areAnagrams(palavra1, palavra2);

        // Exibe o resultado em uma caixa de diálogo
        JOptionPane.showMessageDialog(null,
                "As palavras \"" + palavra1 + "\" e \"" + palavra2 + "\" são anagramas: " + resultado,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
