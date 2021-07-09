import java.util.Locale;
import java.util.Scanner;

public class Menor_de_tres
{

	public static void main(String[] args)
	{
		//Aula 200
		Locale.setDefault(Locale.US);
		Scanner sc6 = new Scanner(System.in);
		
		int a, b, c, menor;
		
		System.out.print("Primeiro valor: ");
		a = sc6.nextInt();
		System.out.print("Segundo valor: ");
		b = sc6.nextInt();
		System.out.print("Terceiro valor: ");
		c = sc6.nextInt();
		
		if(a<b && a<c)
		{
			menor = a;
		}
		else if(b<c)
		{
			menor = b;
		}
		else
		{
			menor = c;
		}
		
		System.out.println("MENOR = " + menor);
		
		sc6.close();
	}

}
