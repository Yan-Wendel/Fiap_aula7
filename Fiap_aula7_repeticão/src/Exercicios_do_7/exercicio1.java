package Exercicios_do_7;
import java.util.Scanner;
public class exercicio1 {
/*▪ Faça um programa que exiba a mensagem “Olá, Mundo”.
▪ Essa mensagem deverá ser exibida repetidamente.
▪ Ao final de toda iteração da repetição, você deve perguntar ao usuário se ele deseja
exibir a mensagem novamente.
▪ Se sim, exiba novamente. Senão, saia do loop e exiba a mensagem “Fim”.*/
	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		// Variável para controle do loop
	        boolean continuar = true;
	        
	        while (continuar) {
	            // Exibe a mensagem
	            System.out.println("Olá, Mundo");
	            
	            // Solicita ao usuário se deseja exibir a mensagem novamente
	            System.out.println("Deseja exibir a mensagem novamente? (s/n)");
	            String resposta = ler.nextLine().trim().toLowerCase();
	            
	            // Verifica a resposta do usuário
	            if (!resposta.equals("s")) {
	                continuar = false; // Encerra o loop se a resposta não for "s"
	            }
	        }
	        
	        // Exibe a mensagem final
	        System.out.println("Fim");
	}
}
