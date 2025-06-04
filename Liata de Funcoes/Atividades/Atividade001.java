import javax.swing.JOptionPane;

public class Atividade001 {
    public static int Nummero_Impar(int numero){
        int soma = 0; // Inicializa o contador de números ímpares
        for (int i = 1; i <= numero; i++) { // Loop de 1 até o número informado
            if (i % 2 != 0) { // Verifica se o número é ímpar
                soma+= i; // Incrementa o contador se for ímpar
            }
        }
        return soma; // Retorna o total de números ímpares encontrados
    }

    public static void main(String[] args) {
        // Solicita ao usuário que informe um número
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        // Chama o método Nummero_Impar para contar os números ímpares até o número informado
        int resultado = Nummero_Impar(numero);

        // Exibe o resultado em uma caixa de diálogo
        JOptionPane.showMessageDialog(null,
                "A soma dos números ímpares até " + numero + " é: " + resultado,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
