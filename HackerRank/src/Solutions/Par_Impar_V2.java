package Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Par_Impar_V2
{
	public static void main(String[] args)
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int N = 0; // Inicializa com zero para evitar erros
		try
		{
			N = Integer.parseInt(bufferedReader.readLine().trim());
		} catch (NumberFormatException | IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Numero digitado pelo usuario
		int P = N; // Par recebendo valor de N
		int I = N; // Impar recebendo valor de N

		// Verificao de par, operador mod verificar se o resto e zero(par por
		// consequencia)
		if (N % 2 == 0)
		{
			P = N; // Definicao de par
		} else
		{
			I = N; // Definicao de impar
		}

		// Aplica as condicoes da tarefa
		if (N == I)
		{
			System.out.println("Weird");
		} else if (N == P && N >= 2 && N <= 5)
		{
			System.out.println("Not Weird");
		} else if (N == P && N >= 6 && N <= 20)
		{
			System.out.println("Weird");
		} else if (N == P && N >= 20)
		{
			System.out.println("Not Weird");
		}

		// Switch case falhou por nao aceitar variavel no case
		/*
		 * switch(N) { //Par case I: System.out.println("Weird"); break; //2 a 5 case P
		 * && (N >= 2 && N <= 5): System.out.println("Not Weird"); break; //6 a 20 case
		 * P && (N >= 6 && N <= 20): System.out.println("Weird"); break; //Acima de 20
		 * case P && N >= 20: System.out.println("Not Weird"); break; }
		 */

		try
		{
			bufferedReader.close();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
