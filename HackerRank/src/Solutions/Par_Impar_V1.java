package Solutions;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Par_Impar_V1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim()); //Numero digitado pelo usuario
        int P = N; //Par recebendo valor de N
        int I = N; //Impar recebendo valor de N
        
        //Verificao de par, operador mod verificar se o resto e zero(par por consequencia)
        if(N%2 == 0)
        {
            P = N; //Definicao de par
        }
        else
        {
            I = N; //Definicao de impar
        }
        
        //Aplica as condicoes da tarefa
        if(N == I)
        {
            System.out.println("Weird");
        }
        else if(N == P && N >=2 && N <= 5)
        {
            System.out.println("Not Weird");
        }
        else if(N == P && N >=6 && N <= 20)
        {
            System.out.println("Weird");
        }
        else if(N == P && N >= 20)
        {
            System.out.println("Not Weird");
        }
        
        //Switch case falhou por nao aceitar variavel no case
        /*
        switch(N)
        {
            //Par
            case I:
                System.out.println("Weird");
                break;
            //2 a 5
            case P && (N >= 2 && N <= 5):
                System.out.println("Not Weird");
                break;
            //6 a 20
            case P && (N >= 6 && N <= 20):
                System.out.println("Weird");
                break;
            //Acima de 20
            case P && N >= 20:
                System.out.println("Not Weird");
                break;
        }
        */

        bufferedReader.close();
    }
}
