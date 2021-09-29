package com.gabriel0598.ultraemojicombat;
//Escopo de lutador;

public class Lutador
{
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;
    //Métodos Públicos
    public void apresentar()
    {
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome() + ".");
        System.out.print("Diretamente de " + this.getNacionalidade());
        System.out.print(", com " + this.getIdade() + " anos e " + this.getAltura());
        System.out.print(", pesando " + this.getPeso() + " KG.");
        System.out.print(this.getVitorias() + " vitórias, ");
        System.out.print(this.getDerrotas() + " derrotas e ");
        System.out.print(this.getEmpates() +  " empates!");
    }
    public void status()
    {
        System.out.println(this.getNome() + " é um peso " + this.getCategoria() + ",");
        System.out.println("Ganhou " + this.getVitorias() + " vez(es), ");
        System.out.println("Perdeu " + this.getDerrotas() + " vez(es) e ");
        System.out.println("Empatou " + this.getEmpates() + " vez(es).");
    }
    public void ganharLuta()
    {
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta()
    {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta()
    {
        this.setEmpates(this.getEmpates() + 1);
    }
    //Métodos Especiais

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates)
    {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNacionalidade()
    {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade)
    {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public float getAltura()
    {
        return altura;
    }

    public void setAltura(float altura)
    {
        this.altura = altura;
    }

    public float getPeso()
    {
        return peso;
    }

    public void setPeso(float peso)
    {
        this.peso = peso;
        this.setCategoria();
        //Peso determina a categoria do lutador;
    }

    public String getCategoria()
    {
        return categoria;
    }
    //Categoria é motodo interno neste caso;
    private void setCategoria()
    {
        //Estrutura condicional aninhada (Uma composta dentro da outra);
        if(this.peso < 52.2)
        {
            this.categoria = "Inválido";
        }
        else if(this.peso <= 70.3)
        {
            this.categoria = "Leve";
        }
        else if(this.peso <= 83.9)
        {
            this.categoria = "Médio";
        }
        else if(this.peso <= 120.2)
        {
            this.categoria = "Pesado";
        }
        else
        {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias()
    {
        return vitorias;
    }

    public void setVitorias(int vitorias)
    {
        this.vitorias = vitorias;
    }

    public int getDerrotas()
    {
        return derrotas;
    }

    public void setDerrotas(int derrotas)
    {
        this.derrotas = derrotas;
    }

    public int getEmpates()
    {
        return empates;
    }

    public void setEmpates(int empates)
    {
        this.empates = empates;
    }
        
}
