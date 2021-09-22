package com.gabriel0598.aula04;

public class Aula04
{
    public static void main(String[] args)
    {
        //Instanciação do objeto c1 na classe Caneta (previamente criada):
        Caneta c1 = new Caneta("A", "B", 0.1f);
        //Sintaxe = Classe nomeObjeto = new Classe ();
        //Ou seja, na Classe X criar o objeto Y, o qual é new (novo) objeto desta Classe (No parâmetro entre dados se for construtor);
        
        //É possível setar esta string de duas formas:
        //Acessando o método modificador com setModelo:
        //c1.modelo = ("BIC"); = Não funciona acessando diretamente por estar privado;
        //Para acessá - lo é necessário o modificador:
        c1.setModelo("BIC");
        
        //Acima foi setado que este objeto c1 recebe um modelo "BIC";
        //c1.Ponta(0.5f); = Dessa forma não funciona //Necessário f como tipo depois do valor;
        //ponta foi privado na classe caneta, portanto para acessá - lo é necessário o modificador:
        c1.setPonta(0.5f);
        //Dessa última forma o acesso é de um objeto privado é realizado pelo modificador de acesso;
        
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
        
        c1.status();
        //Em seguida retorna o status;
        /*Ou seja, chamado o status aqui, ele trás toda a sintaxe criada na classe Caneta e aplica aqui,
        a partir do método status criado lá;*/
        
        Caneta c2 = new Caneta("NIC", "Amarelo", 0.4f);
        c2.status();
        
        Caneta c3 = new Caneta("AAA", "Laranja", 1.5f);
        c3.status();
    }
}
