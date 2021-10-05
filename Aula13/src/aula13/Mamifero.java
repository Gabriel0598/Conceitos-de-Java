package aula13;
//Base de mamífero
public class Mamifero extends Animal
{
    protected String corPelo;
    
    @Override
    public void emitirSom()
    {
        System.out.println("Som de Mamífero");
    }
}
