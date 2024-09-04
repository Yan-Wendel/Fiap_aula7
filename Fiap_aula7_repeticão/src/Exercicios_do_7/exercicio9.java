package Exercicios_do_7;

import java.util.Scanner;

public class exercicio9 {
/*▪ Escreva um algoritmo que recebe um inteiro positivo n e imprime todos os divisores
positivos de n.
▪ Utilize o laço for.

▪ Exemplo:
Suponha que n = 28, nessa situação devemos imprimir os números
1, 2, 4, 7, 14 e 28, que são todos os divisores do 28.

▪ Dica: para o número ser divisor de n, a divisão precisa ter resto nulo.*/
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;

        // Solicita ao usuário que insira um número inteiro positivo
        System.out.print("Digite um número inteiro positivo: ");
        n = ler.nextInt();

        // Verifica se o número é positivo
        if (n <= 0) {
            System.out.println("Número inválido. Por favor, insira um número positivo.");
        } else {
            // Imprime todos os divisores de n
            System.out.println("Divisores positivos de " + n + ":");
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.println(i);
                }
            }
        }
	}

}
