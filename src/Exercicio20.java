// Importa as classes necessárias do Swing para a interface gráfica
import javax.swing.JOptionPane; // Para exibir caixas de diálogo
import javax.swing.UIManager; // Para gerenciar a aparência da interface
import javax.swing.UnsupportedLookAndFeelException; // Para tratar exceções de Look and Feel

// Declaração da classe principal
public class Exercicio20 {

    // CONSTANTES PARA CONFIGURAÇÃO
    // Define o tamanho da matriz (3x3)
    private static final int TAMANHO_MATRIZ = 3;
    // Define um estilo CSS geral para ser aplicado nos componentes HTML das caixas de diálogo
    private static final String ESTILO_GERAL = "font-family: Times New Roman, sans-serif; font-size: 12pt;";
    // Define o estilo para títulos de nível 2 (h2) em HTML
    private static final String ESTILO_TITULO_H2 = "color: #005A9C; margin-bottom: 10px;"; // Azul escuro
    // Define o estilo para tabelas em HTML
    private static final String ESTILO_TABELA = "border: 1px solid #CCCCCC; border-collapse: collapse; margin-top: 10px;";
    // Define o estilo para células de cabeçalho (th) de tabelas em HTML
    private static final String ESTILO_CELULA_TH = "background-color: #E0E0E0; padding: 8px; text-align: center; border: 1px solid #CCCCCC;";
    // Define o estilo para células de dados (td) de tabelas em HTML
    private static final String ESTILO_CELULA_TD = "padding: 8px; text-align: center; border: 1px solid #CCCCCC;";
    // Define o estilo para itens de lista em HTML
    private static final String ESTILO_LISTA_ITEM = "margin-bottom: 5px;";
    // Define a cor para destacar a soma das linhas
    private static final String COR_SOMA_LINHA = "#D32F2F"; // Vermelho
    // Define a cor para destacar a soma das colunas
    private static final String COR_SOMA_COLUNA = "#388E3C"; // Verde

    // Método principal que inicia a execução do programa
    public static void main(String[] args) {
        // Bloco try-catch para tentar definir um Look and Feel (aparência) mais moderno para a interface gráfica
        try {
            // Percorre todos os Look and Feels instalados no sistema
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                // Verifica se o Look and Feel "Nimbus" está disponível
                if ("Nimbus".equals(info.getName())) {
                    // Define "Nimbus" como o Look and Feel da aplicação
                    UIManager.setLookAndFeel(info.getClassName());
                    break; // Sai do loop após encontrar e definir Nimbus
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException e) {
            // Se ocorrer um erro ao tentar definir o Nimbus (ex: não encontrado, não pode ser instanciado, acesso ilegal, não suportado)
            // Tenta definir o Look and Feel padrão do sistema operacional como alternativa
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ex) {
                // Se também falhar ao definir o Look and Feel do sistema, exibe uma mensagem de erro no console
                System.err.println("Não foi possível definir o Look and Feel: " + ex.getMessage());
            }
        }

        // Exibe uma mensagem de boas-vindas ao usuário
        exibirMensagemBoasVindas();

        // Cria uma matriz de inteiros com o tamanho definido pela constante TAMANHO_MATRIZ
        int[][] matriz = new int[TAMANHO_MATRIZ][TAMANHO_MATRIZ];

        // Chama o método para preencher a matriz com valores inseridos pelo usuário
        // Se o usuário cancelar a entrada de dados (retorno false do método preencherMatriz)
        if (!preencherMatriz(matriz)) {
            // Exibe uma mensagem informando que a operação foi cancelada
            JOptionPane.showMessageDialog(null,
                    "<html><body style='" + ESTILO_GERAL + "'>Operação cancelada pelo usuário.</body></html>",
                    "Cancelado",
                    JOptionPane.WARNING_MESSAGE);
            return; // Encerra o programa
        }

        // Após a matriz ser preenchida com sucesso, exibe a matriz formatada
        exibirMatriz(matriz);
        // Exibe a soma dos elementos de cada linha da matriz
        exibirSomasLinhas(matriz);
        // Exibe a soma dos elementos de cada coluna da matriz
        exibirSomasColunas(matriz);

        // Exibe uma mensagem de despedida ao usuário
        exibirMensagemDespedida();
    }

    /**
     * Exibe uma caixa de diálogo com uma mensagem de boas-vindas e instruções iniciais.
     * Utiliza HTML para formatar o conteúdo da mensagem.
     */
    private static void exibirMensagemBoasVindas() {
        // Constrói a mensagem HTML de boas-vindas
        String mensagem = "<html><body style='" + ESTILO_GERAL + " width: 350px;'>" +
                "<h1 style='color: #003366; text-align: center;'>Calculadora de Matriz 3x3</h1>" + // Título principal
                "<hr><p style='text-align: justify;'>Bem-vindo! Este programa irá solicitar que você insira os valores para uma matriz 3x3 de números inteiros.</p>" + // Descrição
                "<p style='text-align: justify;'>Após a entrada, a matriz será exibida, seguida pela soma dos elementos de cada uma de suas linhas e colunas.</p>" + // Mais detalhes
                "<p style='text-align: center;'>Clique em 'OK' para começar.</p>" + // Chamada para ação
                "</body></html>";
        // Exibe a caixa de diálogo de informação
        JOptionPane.showMessageDialog(null, mensagem, "Bem-vindo!", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Solicita ao usuário que insira os valores para cada elemento da matriz.
     * Valida se a entrada é um número inteiro. Permite que o usuário cancele a operação.
     *
     * @param matriz A matriz a ser preenchida.
     * @return true se a matriz foi preenchida com sucesso, false se o usuário cancelou a operação.
     */
    private static boolean preencherMatriz(int[][] matriz) {
        String entrada; // Variável para armazenar a entrada do usuário como texto
        // Loop para percorrer as linhas da matriz
        for (int i = 0; i < TAMANHO_MATRIZ; i++) {
            // Loop para percorrer as colunas da matriz
            for (int j = 0; j < TAMANHO_MATRIZ; j++) {
                boolean entradaValida = false; // Flag para controlar se a entrada atual é válida
                // Loop para continuar solicitando a entrada até que um valor válido seja fornecido
                while (!entradaValida) {
                    // Exibe uma caixa de diálogo solicitando o valor para o elemento atual da matriz
                    entrada = JOptionPane.showInputDialog(null,
                            "<html><body style='" + ESTILO_GERAL + "'>" +
                                    "Insira o valor para o elemento da <b>Linha " + (i + 1) + "</b>, <b>Coluna " + (j + 1) + "</b>:" + // (i+1) e (j+1) para apresentar ao usuário de forma mais intuitiva (começando em 1)
                                    "</body></html>",
                            "Entrada de Dados da Matriz",
                            JOptionPane.QUESTION_MESSAGE); // Ícone de pergunta

                    // Verifica se o usuário clicou no botão "Cancelar" ou fechou a caixa de diálogo
                    if (entrada == null) {
                        return false; // Retorna false indicando que a operação foi cancelada
                    }

                    // Bloco try-catch para tentar converter a entrada para um número inteiro
                    try {
                        // Converte a string de entrada (removendo espaços em branco extras com trim()) para um inteiro
                        matriz[i][j] = Integer.parseInt(entrada.trim());
                        entradaValida = true; // Define a flag como true, pois a entrada é válida
                    } catch (NumberFormatException e) {
                        // Se ocorrer um NumberFormatException (ex: o usuário digitou texto em vez de número)
                        // Exibe uma mensagem de erro
                        JOptionPane.showMessageDialog(null,
                                "<html><body style='" + ESTILO_GERAL + "'>" +
                                        "<font color='red'><b>Erro:</b></font> Por favor, digite um número inteiro válido." +
                                        "</body></html>",
                                "Entrada Inválida",
                                JOptionPane.ERROR_MESSAGE); // Ícone de erro
                        // entradaValida continua false, então o loop while repetirá para pedir a entrada novamente
                    }
                }
            }
        }
        return true; // Retorna true indicando que a matriz foi preenchida com sucesso
    }

    /**
     * Exibe a matriz em uma caixa de diálogo, formatada como uma tabela HTML.
     *
     * @param matriz A matriz a ser exibida.
     */
    private static void exibirMatriz(int[][] matriz) {
        // Usa StringBuilder para construir a string HTML de forma eficiente
        StringBuilder htmlBuilder = new StringBuilder("<html><body style='" + ESTILO_GERAL + "'>");
        htmlBuilder.append("<h2 style='").append(ESTILO_TITULO_H2).append("'>Matriz Original Informada:</h2>"); // Título
        htmlBuilder.append("<table style='").append(ESTILO_TABELA).append("'>"); // Início da tabela HTML

        // Cria o cabeçalho da tabela (opcional, mas melhora a clareza)
        htmlBuilder.append("<tr>"); // Nova linha da tabela (table row)
        for (int j = 0; j < TAMANHO_MATRIZ; j++) {
            // Adiciona células de cabeçalho (table header) para cada coluna
            htmlBuilder.append("<th style='").append(ESTILO_CELULA_TH).append("'>Coluna ").append(j + 1).append("</th>");
        }
        htmlBuilder.append("</tr>"); // Fim da linha do cabeçalho

        // Preenche os dados da matriz na tabela
        // Loop para percorrer as linhas da matriz
        for (int i = 0; i < TAMANHO_MATRIZ; i++) {
            htmlBuilder.append("<tr>"); // Nova linha da tabela para cada linha da matriz
            // Loop para percorrer as colunas da matriz
            for (int j = 0; j < TAMANHO_MATRIZ; j++) {
                // Adiciona células de dados (table data) com o valor do elemento da matriz
                htmlBuilder.append("<td style='").append(ESTILO_CELULA_TD).append("'><b>").append(matriz[i][j]).append("</b></td>"); // Valor em negrito
            }
            htmlBuilder.append("</tr>"); // Fim da linha da tabela
        }
        htmlBuilder.append("</table></body></html>"); // Fim da tabela e do corpo HTML

        // Exibe a caixa de diálogo com a matriz formatada
        JOptionPane.showMessageDialog(null, htmlBuilder.toString(), "Visualização da Matriz", JOptionPane.PLAIN_MESSAGE); // PLAIN_MESSAGE remove ícones padrão
    }

    /**
     * Calcula e exibe a soma dos elementos de cada linha da matriz.
     * Os resultados são apresentados em uma lista HTML.
     *
     * @param matriz A matriz cujas somas das linhas serão calculadas.
     */
    private static void exibirSomasLinhas(int[][] matriz) {
        StringBuilder htmlBuilder = new StringBuilder("<html><body style='" + ESTILO_GERAL + "'>");
        htmlBuilder.append("<h2 style='").append(ESTILO_TITULO_H2).append("'>Soma dos Elementos de Cada Linha:</h2>"); // Título
        htmlBuilder.append("<ul style='list-style-type: none; padding-left: 0;'>"); // Início de uma lista não ordenada HTML (sem marcadores padrão)

        // Loop para percorrer cada linha da matriz
        for (int i = 0; i < TAMANHO_MATRIZ; i++) {
            int somaLinhaAtual = 0; // Variável para acumular a soma da linha atual
            // Loop para percorrer os elementos da linha atual
            for (int j = 0; j < TAMANHO_MATRIZ; j++) {
                somaLinhaAtual += matriz[i][j]; // Adiciona o elemento atual à soma da linha
            }
            // Adiciona um item de lista (list item) com a soma da linha atual
            htmlBuilder.append("<li style='").append(ESTILO_LISTA_ITEM).append("'>")
                    .append("Linha ").append(i + 1).append(": <b style='color:").append(COR_SOMA_LINHA).append(";'>") // Destaca a soma com a cor definida
                    .append(somaLinhaAtual).append("</b></li>");
        }
        htmlBuilder.append("</ul></body></html>"); // Fim da lista e do corpo HTML

        // Exibe a caixa de diálogo com as somas das linhas
        JOptionPane.showMessageDialog(null, htmlBuilder.toString(), "Resultados - Soma das Linhas", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Calcula e exibe a soma dos elementos de cada coluna da matriz.
     * Os resultados são apresentados em uma lista HTML.
     *
     * @param matriz A matriz cujas somas das colunas serão calculadas.
     */
    private static void exibirSomasColunas(int[][] matriz) {
        StringBuilder htmlBuilder = new StringBuilder("<html><body style='" + ESTILO_GERAL + "'>");
        htmlBuilder.append("<h2 style='").append(ESTILO_TITULO_H2).append("'>Soma dos Elementos de Cada Coluna:</h2>"); // Título
        htmlBuilder.append("<ul style='list-style-type: none; padding-left: 0;'>"); // Início de uma lista não ordenada HTML

        // Loop para percorrer cada coluna da matriz
        for (int j = 0; j < TAMANHO_MATRIZ; j++) { // O loop externo itera sobre as colunas
            int somaColunaAtual = 0; // Variável para acumular a soma da coluna atual
            // Loop para percorrer os elementos da coluna atual (iterando sobre as linhas)
            for (int i = 0; i < TAMANHO_MATRIZ; i++) {
                somaColunaAtual += matriz[i][j]; // Adiciona o elemento atual à soma da coluna
            }
            // Adiciona um item de lista com a soma da coluna atual
            htmlBuilder.append("<li style='").append(ESTILO_LISTA_ITEM).append("'>")
                    .append("Coluna ").append(j + 1).append(": <b style='color:").append(COR_SOMA_COLUNA).append(";'>") // Destaca a soma com a cor definida
                    .append(somaColunaAtual).append("</b></li>");
        }
        htmlBuilder.append("</ul></body></html>"); // Fim da lista e do corpo HTML

        // Exibe a caixa de diálogo com as somas das colunas
        JOptionPane.showMessageDialog(null, htmlBuilder.toString(), "Resultados - Soma das Colunas", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Exibe uma caixa de diálogo com uma mensagem de despedida.
     * Utiliza HTML para formatar o conteúdo da mensagem, incluindo um emoji.
     */
    private static void exibirMensagemDespedida() {
        // Constrói a mensagem HTML de despedida
        String mensagem = "<html><body style='" + ESTILO_GERAL + " width: 300px; text-align: center;'>" +
                "<h2 style='color: #003366;'>Programa Finalizado</h2>" + // Título
                "<p>Obrigado por utilizar a Calculadora de Matriz!</p>" + // Agradecimento
                "<p>&#128522;</p>" + // Emoji de sorriso (código HTML para emoji)
                "</body></html>";
        // Exibe a caixa de diálogo de informação
        JOptionPane.showMessageDialog(null, mensagem, "Até Mais!", JOptionPane.INFORMATION_MESSAGE);
    }
}
