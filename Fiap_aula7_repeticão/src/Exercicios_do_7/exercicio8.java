package Exercicios_do_7;
import java.util.Scanner;
public class exercicio8 {
/*▪ Escreva um programa que dado um inteiro n positivo calcula e imprime a soma de
todos os números inteiros entre 1 e n.
▪ Valide a entrada do usuário, só aceite números positivos!!

▪ Dica: use do/while para a validação e for para a soma.

▪ Por exemplo, se n = 10 então deverá ser calculado:
▪ 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
▪ E a impressão final seria:
▪ A soma de 1 até 10 é: 55*/
	public static void main(String[] args) {
		// Criação de um Scanner para ler a entrada do usuário
        Scanner ler = new Scanner(System.in);
        int n;

        // Validação da entrada: deve ser um número positivo
        do {
            System.out.print("Digite um número inteiro positivo: ");
            n = ler.nextInt();
            if (n <= 0) {
                System.out.println("Número inválido. Por favor, insira um número positivo.");
            }
        } while (n <= 0);

        // Calcula a soma dos números de 1 até n
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }

        // Exibe o resultado
        System.out.println("A soma de 1 ate " + n + " e: " + soma);
	}
}
