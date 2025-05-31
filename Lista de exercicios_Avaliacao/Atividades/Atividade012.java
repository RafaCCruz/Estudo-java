import javax.swing.JOptionPane;

public class Atividade012 {
    public static void main(String[] args) {

        // Variável para armazenar a soma dos números digitados pelo usuário
        int soma = 0;

        // Variável para contar quantas vezes o usuário inseriu um número
        int vezes = 0;

        // Loop que será executado enquanto 'vezes' for menor ou igual a 5
        while (vezes <= 5) {
            // Solicita ao usuário que insira um número através de uma caixa de diálogo
            // A entrada é convertida de String para inteiro
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (ou -1 para sair):"));

            // Verifica se o número inserido pelo usuário é -1 (condição para sair)
            if (numero == -1) {
                // Exibe mensagem informando que o programa será encerrado
                JOptionPane.showMessageDialog(null, "Saindo do programa.");
                // Interrompe o loop
                break;
            }

            // Caso o número não seja -1, ele é adicionado à variável 'soma'
            soma += numero;

            // Incrementa o contador para rastrear o número de entradas do usuário
            vezes++;
        }

        // Exibe uma mensagem com o resultado da soma dos números digitados
        // JOptionPane.INFORMATION_MESSAGE define o tipo da mensagem exibida
        JOptionPane.showMessageDialog(null,
                "A soma dos números digitados é: " + soma,
                "Resultado da Soma",
                JOptionPane.INFORMATION_MESSAGE);
    }
}