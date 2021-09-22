package com.gabriel0598.aula02;

public class Main
{
    public static void main(String[] args)
    {
        //Sout + Tab = autocompleta system.out.prinln();
        //Instanciação de objeto:
        //Sintaxe = Classe nomeObjeto = new Classe ();
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        //Nova instanciação de objeto:
        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
