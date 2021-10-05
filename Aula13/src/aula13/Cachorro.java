package aula13;
//Implementação de cachorro
public class Cachorro extends Lobo
{
    //Sobreposição
    @Override
    public void emitirSom()
    {
        System.out.println("Au! Au! Au!");
    }
    
    //Sobrecarga
    public void reagir(String frase)
    {
        if("Toma comida".equals(frase) || "Olá".equals(frase))
        {
            System.out.println("Abanar e Latir");
        }
        else
        {
            System.out.println("Rosnar");
        }
    }
    
    public void reagir(int hora, int min)
    {
        //Passado na ordem cronológica o primeiro, depois o último e depois o do meio na condição;
        if(hora < 12)
        {
            System.out.println("Abanar");
        }
        else if(hora >= 18)
        {
            System.out.println("Ignorar");
        }
        else
        {
            System.out.println("Abanar e latir");
        }
    }
    
    public void reagir(boolean dono)
    {
        if(dono)
        {
            System.out.println("Abanar");
        }
        else
        {
            System.out.println("Rosnar e Latir");
        }
    }
    
    public void reagir(int idade, float peso)
    {
        if(idade < 5)
        {
            if(peso < 10)
            {
                System.out.println("Abanar");
            }
            else
            {
                System.out.println("Latir");
            }
        }
        else
        {
            if(peso < 10)
            {
                System.out.println("Rosnar");
            }
            else
            {
                System.out.println("Ignorar");
            }
        }
    }
    
    //Aqui acusa o erro, pois você está repetindo a assinatura previamente declarada (dois inteiros em hora, min):
    /*
    public void reagir(int x, int y)
    {
        
    }
    */
    
    //Esta é possível, por sua vez:
    /*
    public void reagir(float x, int y)
    {
        
    }
    */
}
