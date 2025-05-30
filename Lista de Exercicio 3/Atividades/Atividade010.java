import javax.swing.JOptionPane; // Importação para usar JOptionPane (caixas de diálogo)

public class Atividade010 {
    public static void main(String[] args) {
        // Passo 1: Solicitar a idade do usuário.
        String input = JOptionPane.showInputDialog("Digite sua idade:"); // Exibe uma caixa de entrada para o usuário

        // Passo 2: Converter a entrada de texto para inteiro.
        int idade = Integer.parseInt(input); // Converte o texto recebido em um número inteiro

        // Passo 3: Determinar a categoria baseada na idade.
        String categoria; // Variável que armazena a categoria da pessoa

        if (idade >= 0 && idade <= 12) { // Verifica se a idade está entre 0 e 12 anos
            categoria = "Criança";
        } else if (idade >= 13 && idade <= 17) { // Verifica se a idade está entre 13 e 17 anos
            categoria = "Adolescente";
        } else { // Caso a idade seja acima de 18 anos
            categoria = "Adulto";
        }

        // Passo 4: Exibir a categoria para o usuário.
        JOptionPane.showMessageDialog(null, "Você é: " + categoria); // Mostra a categoria identificada
    }
}
