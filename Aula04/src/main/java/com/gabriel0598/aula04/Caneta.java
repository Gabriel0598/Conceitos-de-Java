package com.gabriel0598.aula04;
//Exemplos de métodos acessores, modificadores e construtores;

//Criação de forma base de caneta (classe);
public class Caneta
{
    private String modelo;
    //Modelo (Ex = "BIC")
    private float ponta;
    //Ponta (Espessura da ponta, ex = 0.5)
    private String cor;
    private boolean tampada;
    
    // Ctrl + i = Cria código de construtor, getter e setter;
    
    //Criação de método construtor (método que tem o mesmo nome da classe):
    
    public Caneta(String m, String c, float p)
    {
        this.modelo = m;
        this.cor = "Azul";
        this.setPonta (p);
        this.tampar();
        //Este método deixa pré - montado atributos e métodos, e quando chamado retorna toda sua estrutura;
    }
    
    //Método acessor get, ou seja, este método recebe a característica da String modelo:
    public String getModelo()
    {
        //Ao utilizar this.modelo este getModelo() recebe as caracaterísticas da string modelo;
        //this refererencia o próprio objeto:
        return this.modelo;
    }
    
    /*modelo é do tipo String, portanto ao realizar setModelo e no parâmetro passar String m,
    estou criando com this um objeto m que é atribuído a modelo;
    */
    public void setModelo(String m)
    {
        this.modelo = m;
    }
    public float getPonta()
    {
        return this.ponta;
    }
    
    /*modelo é do tipo float, portanto ao realizar setPonta e no parâmetro passar float p,
    estou criando com this (dentro do escopo) um objeto p que é atribuído a ponta;
    */
    public void setPonta(float p)
    {
        //Esse this referencia a própria variável ponta que é parte deste escopo, e a ela atribui o objeto p;
        this.ponta = p;
    }
    
    public void tampar()
    {
        this.tampada = true;
    }
    
    public void destampar()
    {
        this.tampada = false;
    }
    
    //Status retorna o que for setado na outra classe (Aula04) através do setObjeto;
    public void status()
    {
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        //Foi acessado utilizando modificador em vez de acessar direto pelo objeto:
        //System.out.println("Ponta: " + this.getPonta());
        System.out.println("Tampada: " + this.tampada);
    }
}
