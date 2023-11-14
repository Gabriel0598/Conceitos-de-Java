package com.company;

public class ImprimirPares
{
    public static void main(String[] args)
    {
        System.out.println("Inicio do programa.");
        ImprimirPares ip = new ImprimirPares();
        ip.imprimir(5);
        System.out.println("Fim do programa");
    }

    private void imprimir(int x){
        int soma = 0;

        for (int cont = 0; cont < x; cont ++){
            if(cont % 2 == 0)
                soma = soma = cont;
        }

        System.out.println("Soma dos pares " + soma);
    }
}
