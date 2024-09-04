package Exercicios_do_7;
import java.util.Scanner;
public class exercicio5 {
/*▪ Faça um programa que receba 12 valores digitados pelo usuário e, ao final, informe
qual é o maior deles.*/
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor,maior=0;
		for (int i = 0; i < 12; i++) {
			System.out.print("Digite um valor: ");
			valor=ler.nextInt();
			if(valor > maior) {
				maior=valor;
			}
			}
		System.out.print("O maior valor: "+maior);
	}

}
