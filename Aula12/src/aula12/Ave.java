package aula12;
//Escopo de ave;
public class Ave extends Animal
{
    public String corPena;

    @Override
    public void locomover()
    {
        System.out.println("Voando");
    }

    @Override
    public void alimentar()
    {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom()
    {
        System.out.println("Som de ave");
    }
    
    public void fazerNinho()
    {
        System.out.println("Construindo Ninho");
    }

    public String getCorPena()
    {
        return corPena;
    }

    public void setCorPena(String corPena)
    {
        this.corPena = corPena;
    }

    public float getPeso()
    {
        return peso;
    }

    public void setPeso(float peso)
    {
        this.peso = peso;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public int getMembros()
    {
        return membros;
    }

    public void setMembros(int membros)
    {
        this.membros = membros;
    }
    
}
