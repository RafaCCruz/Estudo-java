import javax.swing.JOptionPane;

public class Atividade017 {
    public static void main(String[] args){

        //Declando avariavel soma
        int soma = 0;

        //Looping de 1 até 20, incrementando 1 em cada iteração
        for (int i = 1; i <= 20; i++) {
            //Adicionando uma concional para verificar se o número é par
            if (i % 2 == 0) {
                //Adiciona o número atual à soma
                soma += i;
            }
        }

        //Exibe a soma dos números pares de 1 a 20 em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, "A soma dos números pares de 1 a 20 é: " + soma);
    }
}
