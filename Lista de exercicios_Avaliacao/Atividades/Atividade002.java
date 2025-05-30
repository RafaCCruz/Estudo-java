import javax.swing.JOptionPane;

public class Atividade002 {
    public static void main(String[] args){
        // Solicita a base do triangulo do usuário via uma caixa de entrada gráfica (JOptionPane)
        int base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do seu triângulo:"));

        // Solicita a altura do triângulo do usuário via uma caixa de entrada gráfica (JOptionPane)
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do seu triângulo:"));

        // Calcula a área do triângulo
        double area = (base * altura) / 2.0;

        // Exibe uma mensagem com a área do triângulo calculada
        JOptionPane.showMessageDialog(null,
                "A área do triângulo é: " + area,
                "Cálculo de Área",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
