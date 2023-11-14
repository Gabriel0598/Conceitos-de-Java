package com.company;

public class ImprimirParesRecursivo
{
    public static void main(String[] args) {
        System.out.println("Inicio do programa.");
        ImprimirParesRecursivo ip = new ImprimirParesRecursivo();
        System.out.println(ip.imprimirRecursivo(5));
        System.out.println("Fim do programa.");
    }

    private int imprimirRecursivo(int x) {
        if(x == 0)
            return 0;

        if(x % 2 == 0)
            return x + imprimirRecursivo(x - 1);

        return imprimirRecursivo(x - 1);
    }
}
