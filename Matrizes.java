import java.util.Locale;
import java.util.Scanner;

public class Matrizes
{
	public static void main (String[] args)
	{
		Locale.setDefault(Locale.US);
		//Aula 197 - Matrizes
        Scanner sc3 = new Scanner(System.in);
        
        int M, N;
        System.out.print("Quantas linhas vai ter a Matriz?");
        M = sc3.nextInt();
        System.out.print("Quantas colunas vai ter a Matriz?");
        N = sc3.nextInt();
        
        int [][] mat = new int[M][N]; //Par�metro para cria��o de matriz;
        // tipo/dois colchetes para indicar duas posic�es, logo matriz/ nome da vari�vel/ new para alocar espa�o na mem�ria/ tipo/ vari�vel ou tamanho de linhas e colunas entre colchetes;
        
        for (int i = 0; i < M; i++)
        {
        	for (int j=0; j < N; j++)
        	{
        		System.out.print("Elemento [" + i + "," + j + "]: ");
        		mat[i][j] = sc3.nextInt();
        	}
        }
        
        System.out.println();
        System.out.println("MATRIZ DIGITADA: ");
        
        for(int i = 0; i < M; i++)
        {
        	for(int j = 0; j < N; j++)
        	{
        		System.out.print(mat[i][j] + " ");
        	}
        	System.out.println();
        }
        
        sc3.close();
	}
}
