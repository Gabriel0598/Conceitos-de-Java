import java.util.Locale;
import java.util.Scanner;

public class Soma_vetor
{
	public static void main(String[] args)
	{
		//Aula 203 - Criação de vetor
		Locale.setDefault(Locale.US);
		Scanner sc9 = new Scanner (System.in);
		
		int N;
		double soma, media;
		
		System.out.print("Quantos números vc vai digitar? ");
		N = sc9.nextInt();
		
		double[] vet = new double [N]; //Criação de vetor de N elementos com tipo double;
		
		for (int i = 0; i < N; i++)
		{
			System.out.print("Digite um número: ");
			vet[i] = sc9.nextDouble();
		}
		
		System.out.println();
		System.out.print("VALORES = ");
		
		for (int i = 0; i < N; i++)
		{
			System.out.print(String.format("%.1f ", vet[i]));
		}
		System.out.println();
		
		soma = 0;
		for (int i = 0; i < N; i++)
		{
			soma = soma + vet[i];
		}
		System.out.println("SOMA = " + String.format("%.2f", soma));
		
		media = soma / N;
		System.out.println("MEDIA = " + String.format("%.2f", media));
		
		sc9.close();
	}

}
