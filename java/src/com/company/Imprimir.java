package com.company;

public class Imprimir
{
    public static void main(String[] args) {
        Imprimir imprimir = new Imprimir();
        imprimir.imprimirSequencia(10);
    }

    // Método que imprime uma sequencia de números na ordem decrescente [x .. 1].
    public void imprimirSequencia(int x) {
    /* Quando o valor de x for igual a 0 (zero), para a chamada do método
       recursivamente. */
        if (x == 0)
            return;

        // Imprime o valor de x.
        System.out.println(x);
        // Chama recursivamente este mesmo método passando o valor de x menos 1.
        imprimirSequencia(x - 1);
    }
}
