package com.gabriel0598.aula06;
//Escopo de controle remote encapsulado

public class ControleRemoto implements Controlador
{
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //Métodos Especiais

    public ControleRemoto()
    {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;

    }

    private int getVolume()
    {
        return volume;
    }

    private void setVolume(int volume)
    {
        this.volume = volume;
    }

    private boolean getLigado()
    {
        return ligado;
    }

    private void setLigado(boolean ligado)
    {
        this.ligado = ligado;
    }

    private boolean getTocando()
    {
        return tocando;
    }

    private void setTocando(boolean tocando)
    {
        this.tocando = tocando;
    }
    //Métodos Abstratos
    /*Como Controlador foi implementado por ControleRemmoto, automaticamente implementou os métodos abstratos,
    com isso recebe o Annotation @Override pois está sobrescrevendo todos os métodos, e também recebe exceções (apagadas posteriormente)*/
    @Override
    public void ligar()
    {
        this.setLigado(true);
    }

    @Override
    public void desligar()
    {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu()
    {
        System.out.println("------MENU------");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for(int i = 0; i <= this.getVolume(); i+=10)
        {
            System.out.print("|");
            //Sinal de volume;
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu()
    {
        System.out.println("Fechando menu");
    }

    @Override
    public void maisVolume()
    {
        if(this.getLigado())
        {
            this.setVolume(this.getVolume()+5);
            //Aumenta de 5 em 5 o volume;
        }
        else
        {
            System.out.println("Impossível aumentar volume");
        }
    }

    @Override
    public void menosVolume()
    {
        if(this.getLigado())
        {
            this.setVolume(this.getVolume()-5);
            //Aumenta de 5 em 5 o volume;
        }
        else
        {
            System.out.println("Impossível diminuir volume");
        }
    }

    @Override
    public void ligarMudo()
    {
        if(this.getLigado() && this.getVolume() > 0)
        {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo()
    {
        if(this.getLigado() && this.getVolume() == 0)
        {
            this.setVolume(50);
        }
    }

    @Override
    public void play()
    {
        if(this.getLigado() && !(this.getTocando()))
        {
            this.setTocando(true);
        }
        else
        {
            System.out.println("Não é possível reproduzir");
        }
    }

    @Override
    public void pause()
    {
        if(this.getLigado() && this.getTocando())
        {
            this.setTocando(false);
        }
        else
        {
            System.out.println("Não é possível pausar");
        }
    }
}
