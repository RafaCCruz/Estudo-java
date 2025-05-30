import javax.swing.JOptionPane;

public class Atividade020 {
    public static void main(String[] args){

        // Declarando as variáveis para os dois primeiros números da sequência de Fibonacci
        int num1 = 1;
        int num2 = 1;

        //Loop para calcular os 10 primeiro numeros da sequência de Fibonacci
        StringBuilder resultado = new StringBuilder("Sequência de Fibonacci:\n");
        for (int i = 1; i <= 10; i++) {
            resultado.append(num1).append(" "); // Adiciona o número atual à string de resultado
            int proximo = num1 + num2; // Calcula o próximo número na sequência
            num1 = num2; // Atualiza num1 para o próximo número
            num2 = proximo; // Atualiza num2 para o próximo número
        }

        // Exibe o resultado em uma janela de diálogo
        JOptionPane.showMessageDialog(
                null,
                resultado.toString(), // Mensagem a ser exibida
                "Resultado", // Título da janela
                JOptionPane.INFORMATION_MESSAGE // Tipo de mensagem (informação)
        );
    }
}
