package aula12;
//Sobreposição de locomover;
public class Canguru extends Mamifero
{
    @Override
    public void locomover()
    {
        //Esta é a mesma assinatura do locomover na classe mãe mamífero;
        //Porém é uma sobrescrita do método (Override), sendo assim um polimorfismo de sobreposição;
        //A mesma coisa age de uma forma diferente criando assim um polimorfismo;
        
        System.out.println("Saltando");
    }
    public void usarBolsa()
    {
        System.out.println("Usando bolsa");
    }
}
