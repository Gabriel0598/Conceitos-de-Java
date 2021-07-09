import java.util.Locale;
import java.util.Scanner;

public class Diagonal_negativos
{
	public static void main(String[] args)
	{
		//Aula 204 - Exercício diagonal - Matriz
		Locale.setDefault(Locale.US);
		Scanner sc10 = new Scanner(System.in);
		
		int N, cont;
		
		System.out.print("Qual a ordem da matriz? ");
		N = sc10.nextInt();
		
		int [][] mat = new int [N][N]; //Parâmetro para criação de matriz; 
		
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				System.out.print("Elemento: [" + i + "," + j + "]: ");
				mat[i][j] = sc10.nextInt();
			}
		}
		
		System.out.println("DIAGONAL PRINCIPAL: ");
		for(int i = 0; i < N; i++)
		{
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		
		cont = 0;	
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				if(mat[i][j] < 0)
				{
					cont++;
				}
			}
		}
		System.out.println("QUANTIDADE DE NEGATIVOS = " + cont);
		
		sc10.close();
	}

}
