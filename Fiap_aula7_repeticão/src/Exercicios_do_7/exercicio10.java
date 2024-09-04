package Exercicios_do_7;

import java.util.Scanner;

public class exercicio10 {
/*▪ Determine e mostre todos os números primos no intervalo de 2 a 2000.

Dicas:
▪ Para resolver esse problema, primeiro faça um algoritmo que verifica se um número
inteiro qualquer é primo ou não.
▪ A seguir, com esse código em mãos, faça os ajustes necessários para mostrar todos os
números primos no intervalo solicitado.
▪ Você precisará colocar uma estrutura de repetição dentro da outra.*/
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		 System.out.println("Números primos no intervalo de 2 a 2000:");
	        
	        for (int i = 2; i <= 2000; i++) {
	            if (isPrimo(i)) {
	                System.out.println(i);
	            }
	        }
	    }

	    // Função para verificar se um número é primo
	    public static boolean isPrimo(int numero) {
	        // Números menores que 2 não são primos
	        if (numero < 2) {
	            return false;
	        }

	        // Verifica divisores de 2 até a raiz quadrada do número
	        for (int i = 2; i <= Math.sqrt(numero); i++) {
	            if (numero % i == 0) {
	                return false; // Não é primo se for divisível por i
	            }
	        }
	        return true; // Se não encontrou divisores, é primo
	}
}
