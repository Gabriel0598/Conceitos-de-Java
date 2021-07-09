import java.util.Locale;
import java.util.Scanner;

public class Soma_impares
{

	public static void main(String[] args)
	{
		//Aula 202
		Locale.setDefault(Locale.US);
		Scanner sc8 = new Scanner(System.in);
		
		int x, y, troca, soma;
		
		System.out.println("Digite dois números: ");
		x = sc8.nextInt();
		y = sc8.nextInt();
		
		if (x > y)
		{
			troca = x;
			x = y;
			y = troca;
		}
		
		soma = 0;
		for (int i = x+1; i < y; i++)
		{
			if(i % 2 != 0) //Se é divisível por 2 logo é par, por isso usar mod 2;
			{
				soma = soma + i;
			}
		}
		
		System.out.println("SOMA DOS IMPARES = " + soma);
		
		sc8.close();
	}

}
