package projetoyoutube;
//Projeto Final
public class ProjetoYoutube
{
    public static void main(String[] args)
    {
        Video v[] = new Video[5];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
        
        //Pessoa p =new Pessoa("Jubileu", 22, "M"); = Classe abstrata (Não pode ser implementada);
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "Juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", "Creuzita");
        
        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
        
        //Visualizacao vis = new Visualizacao(g[0], v[2]);
        //System.out.println(vis.toString());
        
        Visualizacao vis2[] = new Visualizacao[5];
        vis2[0] = new Visualizacao(g[0], v[2]); //Jubileu assiste HTML;
        vis2[0].avaliar();
        System.out.println(vis2[0].toString());
        
        vis2[1] = new Visualizacao(g[0], v[1]); //Jubileu assiste PHP;
        vis2[0].avaliar(87.0f);
        System.out.println(vis2[0].toString());
    }
}
