import java.util.Locale; //traz a base para converter linguagem para ingl�s e demais formata��es do padr�o americano;
import java.util.Scanner; //Biblioteca para trazer fun��o Scanner;
//Caso n�o for declarada previamente a biblioteca, ao longo do c�digo � poss�vel usar Ctrl + Shift + O para incluir as bibliotecas que faltam;

public class Main //Classe principal sempre � necess�ria
{

    public static void main (String[] args) //Instru��o principal para execu��o do programa
    {
        
    	//Aula 190 - Vari�veis
        Locale.setDefault(Locale.US); //usado para converter as v�rgulas em ponto (padr�o americano);
        System.out.println("Hello world!"); //Escrita de texto

        int idade;
        double salario, altura;
        char genero;
        String nome; //vari�vel String sempre deve ser escrita com S mai�sculo;

        idade = 30;
        salario = 5800.5;
        altura = 1.72;
        genero = 'F';
        nome = "Maria Silva";

        System.out.println("IDADE = " + idade); //sysout pode ser usado como atalho para essa instru��o
        System.out.println("SALARIO = " + String.format("%.2f", salario)); //String format usado para Para formatar double aparecendo com duas casas decimais;
        System.out.println("ALTURA = " + String.format("%.2f", altura));
        System.out.println("GENERO = " + genero);
        System.out.println("NOME = " + nome);

        //Aula 191 - Sa�da de dados
        System.out.print("Bom dia/ "); //Escreve e n�o pula linha
        System.out.println("Boa noite"); //Escreve e pula linha

        int x, y;
        x = 10;
        y = 20;
        System.out.println(x);
        System.out.println(y);

        double x1;
        x1 = 2.3456;
        System.out.println(String.format("%.2f", x1));

        int idade2;
        double salario2;
        String nome2;
        char sexo2;

        idade2 = 32;
        salario2 = 4560.9;
        nome2 = "Jo�o Nascimento";
        sexo2 = 'M';

        System.out.println("Idade = " + idade2);
        System.out.println("Salario" + String.format("%.2f", salario2));
        System.out.println("Nome = " + nome2);
        System.out.println("Sexo = " + sexo2);

        System.out.println("O funcion�rio " + nome2 + ", sexo " + sexo2 + ", ganha " + String.format("%.2f", salario2) + " e tem " + idade2 + " anos.");

        //Aula 191 - Casting
        int x2, y2;
        x2 = 5;
        y2 = 2 * x2;

        System.out.println(x2);
        System.out.println(y2);

        int x3;
        double y3;
        x3 = 5;
        y3 = 2 * 5;

        System.out.println(x3);
        System.out.println(String.format("%.1f", y3)); //Nesse caso String Format formata apenas com uma casa decimal aparecendo;

        double b1, b2, h, area;
        b1 = 6.0;
        b2 = 8.0;
        h = 5.0;
        area = (b1 + b2)/ 2.0 * h;
        System.out.println(area); //Quando vc imprime sem formatar ele imprime o n�mero de casas que achar necess�rio;

        int a, b;
        double resultado;
        a = 5;
        b = 2;

        resultado = (double) a / b; //Para que seja exibido o resultado com casas decimais � necess�rio fazer o casting (convers�o) de uma dessas duas vari�veis, nesse caso convertendo A de int para double;

        System.out.println(resultado);

        double a3;
        int b3;
        a3 = 5.0;
        b3 = (int) a3; //� necess�rio fazer casting para informar que voc� n�o se importa com uma poss�vel perda de dados, isso for�a a convers�o de um tipo para outro;

        System.out.println(b3);
        System.out.println();

        //Aula 193 - Entrada de dados
        Scanner sc = new Scanner(System.in); //Fun��o Scanner/ Nome/ = para atribui��o/ New para alocar na mem�ria/ Scanner novamente/ (System.in) para trazer seus recursos;
        //Fun��o Scanner separa a entrada dos textos em blocos;
        //Utiliza de Tokes (Caracteres com separadores); Analisa tipos primitivos e strings utilizando express�es regulares;

        String nome3, nome4;
        double salario3, salario4;
        int idade3;
        char sexo;

        System.out.print("Digite o nome da primeira pessoa: ");
        nome3 = sc.nextLine(); //Valor sendo armazenado em sc;
        System.out.print("Digite o sal�rio da primeira pessoa: ");
        salario3 = sc.nextDouble(); //Novamente sendo armazenado em sc;

        System.out.print("Digite o nome da segunda pessoa: ");
        sc.nextLine(); //Limpeza de buffer, quebra de linha;
        nome4 = sc.nextLine(); //Para armazenar string pode ser usado sc.nextLine() diretamente;
        System.out.print("Digite o sal�rio da segunda pessoa: ");
        salario4 = sc.nextDouble(); //Para armazenar double � necess�rio declarar como sc.nextDouble();

        System.out.print("Digite uma idade: ");
        idade3 = sc.nextInt(); //sc.nextInt para armazenar n�meros inteiros;
        System.out.print("Digite um sexo (F/M): ");
        sexo = sc.next().charAt(0); //sc.next().charAt(0) para armazenar char;

        System.out.println();
        System.out.println("Nome 1: " + nome3);
        System.out.println("Salario 1: " + String.format("%.2f", salario3)); //Novamente uso do String.format("%.2f", variavel) para formatar o double com duas casas decimais;
        System.out.println("Nome 2: " + nome4);
        System.out.println("Salario 2: " + String.format("%.2f", salario4));
        System.out.println("Idade: " + idade3);
        System.out.println("Sexo: " + sexo);

        sc.close(); //Fecha a fun��o Scanner;
    }
    
}
