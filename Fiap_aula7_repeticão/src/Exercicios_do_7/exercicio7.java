package Exercicios_do_7;
import java.util.Scanner;
public class exercicio7 {
/*▪ Um professor quer saber quantos alunos de uma sala de 20 tiveram nota maior do
que a média. Faça um programa onde o professor informe a média da turma e as
notas de cada um dos 20 alunos e, ao final, seja exibido quantos alunos tiveram nota
superior à média e quantos tiveram nota inferior à média.*/
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		 // Número de alunos
        final int NUM_ALUNOS = 20;

        // Solicita ao professor que insira a média da turma
        System.out.print("Digite a média da turma: ");
        double mediaTurma = ler.nextDouble();

        // Contadores para notas acima e abaixo da média
        int countAcimaMedia = 0;
        int countAbaixoMedia = 0;

        // Leitura das notas dos 20 alunos
        System.out.println("Digite as notas dos " + NUM_ALUNOS + " alunos:");
        for (int i = 1; i <= NUM_ALUNOS; i++) {
            System.out.print("Nota do aluno " + i + ": ");
            double nota = ler.nextDouble();

            // Verificação da nota em relação à média
            if (nota > mediaTurma) {
                countAcimaMedia++;
            } else if (nota < mediaTurma) {
                countAbaixoMedia++;
            }
        }

        // Exibição dos resultados
        System.out.println("Número de alunos com nota acima da média: " + countAcimaMedia);
        System.out.println("Número de alunos com nota abaixo da média: " + countAbaixoMedia);
	}
}
