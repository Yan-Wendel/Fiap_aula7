package Exercicios_do_7;
import java.util.Scanner;
public class exercicio4 {
/*▪ Faça um programa que receba 10 valores digitados pelo usuário e, ao final, informe
qual é a soma deles.*/
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor,soma=0;
		for(int i=0;i<10;i++) {
			System.out.print("Digite um valor pra somar: ");
			valor=ler.nextInt();
			soma=soma+valor;
		}
		System.out.print("Valor da soma: "+soma);
	}

}
