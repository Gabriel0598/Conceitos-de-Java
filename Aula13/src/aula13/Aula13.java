package aula13;
//Polimorfismo de sobrecarga
public class Aula13
{
    public static void main(String[] args)
    {
        //Programa principal;
        //Animal x = new Animal(); = Abstrato não pode ser instanciado;
        Lobo x = new Lobo();
        x.emitirSom();
        Cachorro c = new Cachorro();
        c.emitirSom();
        
        c.reagir("Olá");
        c.reagir("Vai apanhar!");
        c.reagir(11, 45);
        c.reagir(19, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
    }
}
