package com.company;

public class AssinaturaMetodo
{
    public void imprimir() {
        System.out.println("Ola!!!");
    }

    public long calcular(int x, int y) {
        return x * y;
    }

    public String buscarDados(int matricula) {
        return "abcdef";
    }

    public Pessoa consultarPessoa(String nome) {
        return new Pessoa();
    }

    public void enviarEmail(Email e) {
    }
}
