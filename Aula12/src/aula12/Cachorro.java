package aula12;
//Sobreposição de locomover e emitir som;
public class Cachorro extends Mamifero
{
    @Override
    public void locomover()
    {
        //Outro polimorfismo de sobreposição:
        System.out.println("Andando");
    }
    
    @Override
    public void emitirSom()
    {
        System.out.println("Au! Au! Au!");
    }
}
