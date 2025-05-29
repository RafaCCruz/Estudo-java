import javax.swing.JOptionPane;

public class Exercicios008 {

    public static int Potencia(int base, int expoente) {
        // Inicializa o resultado como 1, pois qualquer número elevado a 0 é 1.
        int resultado = 1;

        // Multiplica a base pelo resultado 'expoente' vezes.
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        // Retorna o resultado da potência.
        return resultado;
    }
    public static void main(String[] args) {
        // Solicita ao usuário digitar a base e converte a entrada para inteiro.
        int base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base:"));

        // Solicita ao usuário digitar o expoente e converte a entrada para inteiro.
        int expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente:"));

        // Chama o método Potencia para calcular a potência da base elevada ao expoente.
        int resultado = Potencia(base, expoente);

        // Mostra uma mensagem com o resultado da potência calculada.
        JOptionPane.showMessageDialog(null, "O resultado de " + base + " elevado a " + expoente + " é: " + resultado);

    }
}
