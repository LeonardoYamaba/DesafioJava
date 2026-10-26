import java.util.Scanner;

/**
 * ============================================================
 *  DESAFIO: Validador de Operacoes Bancarias
 * ============================================================
 *
 * CONTEXTO
 * No setor bancario, pequenas automacoes ajudam a evitar erros em tarefas
 * repetitivas. Em uma agencia, a equipe de atendimento recebe codigos de
 * operacao digitados por diferentes sistemas internos. Antes de seguir com o
 * processamento, um programa simples deve verificar se o codigo informado
 * representa uma operacao valida para o caixa digital.
 *
 * Como este e um treinamento para novos desenvolvedores, a validacao foi
 * reduzida a uma regra unica e objetiva.
 *
 * OBJETIVO
 * Criar um programa que leia uma unica palavra e verifique se ela e
 * exatamente igual a:
 *
 *   - DEPOSITO
 *   - SAQUE
 *   - TRANSFERENCIA
 *
 * REGRAS
 *   - Se for igual a uma das tres opcoes -> operacao VALIDA.
 *   - Caso contrario                      -> operacao INVALIDA.
 *   - A comparacao deve respeitar exatamente os caracteres informados,
 *     incluindo maiusculas e minusculas.
 *     Ex.: "deposito" e "DEPOSITO" sao valores DIFERENTES.
 *
 * ENTRADA
 *   Uma unica linha com uma string representando o codigo da operacao
 *   bancaria informado pelo sistema interno.
 *
 * SAIDA
 *   Imprima VALID   se a string for exatamente DEPOSITO, SAQUE ou TRANSFERENCIA.
 *   Imprima INVALID caso contrario.
 *
 * EXEMPLOS
 *   +-----------+---------+
 *   | Entrada   | Saida   |
 *   +-----------+---------+
 *   | DEPOSITO  | VALID   |
 *   | SAQUE     | VALID   |
 *   | deposito  | INVALID |
 *   | PAGAMENTO | INVALID |
 *   +-----------+---------+
 *
 * CONCEITOS PRATICADOS
 *   Leitura de entrada (Scanner), Strings, comparacao de texto,
 *   estruturas condicionais.
 *
 * OBSERVACAO
 *   A solucao pode ser implementada em qualquer linguagem usando apenas
 *   recursos padrao.
 */
public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operacao = scanner.nextLine();

        // A validacao deve ser exata, respeitando maiusculas e minusculas.
        // Compare a entrada com os tres codigos permitidos.
        boolean operacaoValida = false;

        // TODO: atualize a variavel operacaoValida para true se a operacao for DEPOSITO, SAQUE ou TRANSFERENCIA.

        System.out.println(operacaoValida ? "VALID" : "INVALID");

        scanner.close();
    }
}