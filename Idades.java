import java.util.Locale;
import java.util.Scanner;

public class Idades
{

	public static void main(String[] args)
	{
		//Aula 199
		Locale.setDefault(Locale.US);
		Scanner sc5 = new Scanner(System.in);
		
		String nome1, nome2;
		int idade1, idade2;
		double media;
		
		System.out.println("Dados da primeira pessoa: ");
		System.out.print("Nome: ");
		nome1 = sc5.nextLine();
		System.out.print("Idade: ");
		idade1 = sc5.nextInt();
		
		System.out.println("Dados da segunda pessoa: ");
		System.out.print("Nome: ");
		sc5.nextLine();
		nome2 = sc5.nextLine();
		System.out.print("Idade: ");
		idade2 = sc5.nextInt();
		
		media = (double) (idade1 + idade2) / 2.0; //Usando double entre parenteses ou at� 2.0 converter c�lculo para ponto flutuante;
		
		System.out.println("A idade m�dia de " + nome1 + " e " + nome2 + " � " + String.format("%.1f", media) + " anos."); //Formatado para garantir uma casa decimal sempre;
		
		sc5.close();
	}

}
