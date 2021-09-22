package com.gabriel0598.aula03;

public class Caneta
{
    //Declaração de determinadas variáveis;
    //Algumas delas tratam - se de atributos;
    //String precisa começar com maiúscula;
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    //Não fica 100% claro, dependendo do contexto, o entendimento sobre a sintaxe;
    //Declaração de método a partir daqui, nota - se que trata - se de métodos por possuir parênteses;
    //Void - sem retorno
    
    void status()
    {
        //this = auto-referência;
        //this = referência ao próprio objeto que chamou;
        //Ex: this.modelo traz conteúdo da string modelo e retorna naquela chamada;
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Pontas: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada?" + this.tampada);
        //Atributo = sem parênteses; Método = com parênteses;
    }
    
    void rabiscar()
    {
        //Executa verificações por operador ternário para saber se está tampada ou não;
        //Igualdade apresentada como ==
        if(this.tampada == true)
        {
            System.out.println("ERRO: Não posso rabiscar!");
        }
        else
        {
            System.out.println("Estou rabiscando");
        }
    }
        
    void tampar()
    {
       //Neste caso this retorna o seguinte: chama variável c1 e aloca este retorno (0 ou 1) nela;
       this.tampada = true;
       //Result = 1;
    }
        
    void destampar()
    {
        this.tampada = false;
        //Result = 0;
    }
}
