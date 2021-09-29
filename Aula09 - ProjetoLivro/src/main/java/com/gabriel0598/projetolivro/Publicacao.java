package com.gabriel0598.projetolivro;
//Geração de interface que acessa as outras classes para ser montada:
public interface Publicacao
{
    public void abrir();
    public void fechar();
    public void folhear(int p);
    public void avancarPag();
    public void voltarPag();
}
