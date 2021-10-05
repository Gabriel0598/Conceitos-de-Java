package aula12;
//Polimorfismo de Sobreposição;
public class Aula12
{
    public static void main(String[] args)
    {
        //Abstrato não pode ser instanciado = Animal n = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();
        
        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        
        a.locomover();
        p.locomover();
        r.locomover();
        
        c.locomover();
        k.locomover();
        c.emitirSom();
        k.emitirSom();
    }
}
