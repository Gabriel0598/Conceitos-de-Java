package com.gabriel0598.ultraemojicombat;
//Biblioteca para geração de números aleatórios (Pacote java util);
import java.util.Random;
//Luta

public class Luta
{
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    //Como tipo de desafiado/ desafiante foi utilizado Lutador, logo um tipo abstrato;
    private int rounds;
    private boolean aprovada;
    //Métodos Públicos
    public void marcarLuta(Lutador l1, Lutador l2)
    {
        //Equals = categoria de l1 for igual ao de l2;
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2)
        {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }
        else
        {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar()
    {
        if(this.aprovada)
        {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println(""); //Quebra de linha extra
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            System.out.println(""); //Quebra de linha extra
            System.out.println("### RESULTADO ###");
            
            //Geração de números aleatórios para aplicar a luta, utilizando função random:
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0 1 2
            //Switch para diferentes casos:
            switch(vencedor)
            {
                case 0: //Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //Desafiado vence
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //Desafiante vence
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
        }
        else
        {
            System.out.println("A luta não pode acontecer!");
        }
    }
    //Métodos Especiais

    public Lutador getDesafiado()
    {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado)
    {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante()
    {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante)
    {
        this.desafiante = desafiante;
    }

    public int getRounds()
    {
        return rounds;
    }

    public void setRounds(int rounds)
    {
        this.rounds = rounds;
    }
    //Por padrão quando é lógico ele cria o método com is:
    public boolean isAprovada()
    {
        return aprovada;
    }

    public void setAprovada(boolean aprovada)
    {
        this.aprovada = aprovada;
    }
    
}
