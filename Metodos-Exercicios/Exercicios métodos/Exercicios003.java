import javax.swing.JOptionPane; // Importação da biblioteca para exibir caixas de diálogo

public class Exercicios003 {

    // Método que calcula a média de três números
    public static float Media(float a, float b, float c) {
        float media = (a + b + c) / 3; // Soma os três números e divide por 3
        return media; // Retorna o resultado da média
    }

    public static void main(String[] args) {
        // Solicita a entrada da primeira nota ao usuário
        float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota:"));

        // Solicita a entrada da segunda nota ao usuário
        float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota:"));

        // Solicita a entrada da terceira nota ao usuário
        float nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota:"));

        // Calcula a média das três notas utilizando o método Media
        float media = Media(nota1, nota2, nota3);

        // Exibe a média calculada em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, "A média das notas é: " + media);
    }
}