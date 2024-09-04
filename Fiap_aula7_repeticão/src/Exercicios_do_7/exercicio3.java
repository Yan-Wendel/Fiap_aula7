package Exercicios_do_7;

import java.util.Scanner;

public class exercicio3 {
/*▪ Faça um programa que receba um número n
▪ Exiba a tabuada deste número do 0 ao 25.
▪ Utilize laços de repetição.*/
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, mul;
		System.out.print("Digite um numero para a tabuada dele: ");
		n=ler.nextInt();
		for (int cc = 0; cc <= 25; cc++) {
			mul= n * cc;
			System.out.println(n + " x " + cc + " = " + mul);
			}
	}

}
