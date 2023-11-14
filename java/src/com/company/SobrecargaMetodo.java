package com.company;

public class SobrecargaMetodo
{
    //Exemplo de metodo sobrecarregado
    private int myMethod(int x){
        return x;
    }
    private float myMethod(float x){
        return x;
    }
    private double myMethod(double x, double y){
        return x;
    }

    //Metodos distintos
    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    //Metodo sobrecarregado
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum0 = plusMethodInt(8, 5);
        double myNum1 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum0);
        System.out.println("double: " + myNum1);

        int myNum2 = plusMethod(8, 5);
        double myNum3 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum2);
        System.out.println("double: " + myNum3);
    }
}
