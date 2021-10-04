package aula011;
//Sendo pagar mensalidade como uma classe final, isso indica que ela não pode ser herdada;
public class Aluno extends Pessoa
{
    private int matricula;
    private String curso;
    //Sendo pagar mensalidade como um método final, isso indica que ele não pode ser sobreposto;
    public void pagarMensalidade()
    {
        System.out.println("Pagando mensalidade do aluno " + this.nome);
    }

    public int getMatricula()
    {
        return matricula;
    }

    public void setMatricula(int matricula)
    {
        this.matricula = matricula;
    }

    public String getCurso()
    {
        return curso;
    }

    public void setCurso(String curso)
    {
        this.curso = curso;
    }
    
}
