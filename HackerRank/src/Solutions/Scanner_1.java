//Questão 2
package Solutions;
import java.util.Scanner;

public class Scanner_1
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); //Chamando entrada de dados
		int a = scan.nextInt(); //Receber inteiro
		int b = scan.nextInt(); //Segundo valor a se verificar
		int c = scan.nextInt(); //Terceiro valor a se verificar
		
		scan.close();
		System.out.println(a); //Saída do valor de a
		System.out.println(b);
		System.out.println(c);
		//Stdin e stdout
	}
}

