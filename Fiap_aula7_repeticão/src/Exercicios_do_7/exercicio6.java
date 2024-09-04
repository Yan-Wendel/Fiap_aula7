package Exercicios_do_7;
import java.util.Scanner;
public class exercicio6 {
/*▪ Faça um programa capaz de exibir todos os valores pares entre 2 e um valor fornecido
pelo usuário.*/
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor;
		System.out.print("Digite um valor: ");
		valor=ler.nextInt();
		for (int i = 2; i < valor; i+=2) {
			System.out.print(i);
			System.out.print("\n");
		}
	}
}
