package aula12;
//Escopo de peixe;
public class Peixe extends Animal
{
    private String corEscama;

    @Override
    public void locomover()
    {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar()
    {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom()
    {
        System.out.println("Peixe não faz som");
    }
    
    public void soltarBolha()
    {
        System.out.println("Soltando Bolha");
    }

    public String getCorEscama()
    {
        return corEscama;
    }

    public void setCorEscama(String corEscama)
    {
        this.corEscama = corEscama;
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
