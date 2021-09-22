package com.gabriel0598.aula05;
//Operações de abertura e manipulação de duas contas;

public class Aula05
{
    public static void main(String[] args)
    {
        //Instancia objeto, nova conta no banco
        contaBanco p1 = new contaBanco();
        //Dados para abertura de conta:
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        //Abre conta como conta corrente;
        p1.abrirConta("CC");
        
        //Criação de nova conta
        contaBanco p2 = new contaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        //Inicialmente com estado false pois foi apenas modelada e não aberta ainda;
        p2.abrirConta("CP"); //Por fim, abertura realizada;
        
        p1.estadoAtual();
        p2.estadoAtual();
        
        p1.depositar(100);
        p2.depositar(500);
        
        p1.estadoAtual();
        p2.estadoAtual();
        
        p2.sacar(1000);
        p2.estadoAtual();
        
        p2.sacar(100);
        p2.estadoAtual();
    }
}
