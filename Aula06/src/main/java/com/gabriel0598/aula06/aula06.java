package com.gabriel0598.aula06;
//Encapsulamento
//Molde controle remoto
public class aula06
{
    public static void main(String[] args)
    {
        ControleRemoto c = new ControleRemoto();
        //Controle com nome c;
        c.ligar();
        c.maisVolume();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
    }
}
