import java.util.Locale;
import java.util.Scanner;

public class Crescente
{
	public static void main(String[] args)
	{
		//Aula 201
		Locale.setDefault(Locale.US);
		Scanner sc7 = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite dois numeros: ");
		x = sc7.nextInt();
		y = sc7.nextInt();
		
		while (x != y)
		{
			if (x < y)
			{
				System.out.println("CRESCENTE!");
			}
			else
			{
				System.out.println("DECRESCENTE!");
			}
			
			System.out.println("Digite outros dois números: ");
			x = sc7.nextInt();
			y = sc7.nextInt();
		}
		
		sc7.close();
	}

}
