import javax.swing.JOptionPane;

public class Atividade011 {
    public static void main(String[] args) {
        // Passo 1: Declarar uma variável para realizar a contagem
        int numero = 1; // Inicia o número com 1

        // Passo 2: Criar uma variável para acumular os números como string
        String numeros = ""; // Variável para guardar os números

        // Passo 3: Criar uma estrutura de repetição while
        while (numero <= 10) { // Enquanto o número for menor ou igual a 10
            numeros += numero + " "; // Adiciona o número atual à string
            numero++; // Incrementa o número para a próxima iteração
        }

        // Passo 4: Exibir os números usando o JOptionPane
        JOptionPane.showMessageDialog(null, "Números de 1 a 10:\n" + numeros);
    }
}
