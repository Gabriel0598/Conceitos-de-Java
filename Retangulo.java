import java.util.Locale;
import java.util.Scanner;

public class Retangulo
{
	public static void main (String [] args)
	{
		//Aula 198
		Locale.setDefault(Locale.US);
		Scanner sc4 = new Scanner(System.in); //Fun��o Scanner deve sempre iniciar com mai�sculo;
		
		double base, altura, area, perimetro, diagonal;
		
		System.out.print("Base do ret�ngulo: ");
		base = sc4.nextDouble();
		System.out.print("Altura do ret�ngulo: ");
		altura = sc4.nextDouble();
		
		area = base * altura;
		perimetro = 2 * (base + altura);
		diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));
		
		System.out.println("AREA = " + String.format("%.4f", area));
		System.out.println("PERIMETRO = " + String.format("%.4f", perimetro));
		System.out.println("DIAGONAL = " + String.format("%.4f", diagonal));
		
		sc4.close();
	}
}
