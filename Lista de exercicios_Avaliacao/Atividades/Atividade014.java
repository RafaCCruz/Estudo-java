import javax.swing.JOptionPane;

public class Atividade014 {
    public static void main(String[] args) {

        // Solicita ao usuário que insira um número e o converte de String para inteiro
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para ver o seu fatorial:"));

        // Variável para armazenar o valor do fatorial
        int fatorial = 1;

        // Variável para construir a string do resultado
        String resultado = "";

        // Verifica se o número é menor que 0 (fatorial não definido para números negativos)
        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "O fatorial não é definido para números negativos.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
        // Caso o número seja 0, o fatorial é igual a 1 por definição
        else if (numero == 0) {
            resultado = "O fatorial de 0 é 1.";
            JOptionPane.showMessageDialog(null, resultado, "Resultado do Fatorial", JOptionPane.INFORMATION_MESSAGE);
        }
        // Caso o número seja positivo, calcula o fatorial
        else {
            for (int i = 1; i <= numero; i++) {
                // Multiplica o fatorial pelo valor atual de i
                fatorial *= i;

                // Monta a string do resultado passo a passo (ex.: "1 x 2 x 3 x ... = resultado")
                resultado += i + (i < numero ? " x " : " = ") + fatorial + "\n";
            }

            // Exibe o resultado final do cálculo do fatorial
            JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é:\n" + resultado,
                    "Resultado do Fatorial", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}