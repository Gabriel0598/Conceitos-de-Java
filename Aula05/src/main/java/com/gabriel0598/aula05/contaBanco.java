package com.gabriel0598.aula05;
//Programa para criação e manipulação de conta bancária;
//Classe com atributos e métodos previamente modelada através da UML;

public class contaBanco
{
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    //Métodos Personalizados:
    
    //Estado atual da conta após as operações:
    public void estadoAtual()
    {
        System.out.println("------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    //t = tipo da conta já declarado como parâmetro deste método abrirConta:
    public void abrirConta(String t)
    {
        //Seta se é conta corrente ou poupança:
        this.setTipo(t);
        this.setStatus(true);
        //setStatus trata - se de modificador em vez de mexer direto no atributo;
        if (t == "CC")
        {
            this.setSaldo(50);
            //Se a conta for corrente, recebe saldo inicial de R$ 50,00;
        }
        //Compilador gera aviso indicando que é recomendável utilizar equals ao invés de ==
        else if ("CP".equals(t))
        {
            this.setSaldo(150);
            //Se a conta for poupança, recebe saldo inicial de R$ 150,00;
        }
    }
    public void fecharConta()
    {
        if(this.getSaldo() > 0)
        {
            System.out.println("Conta não pode ser fechada porque ainda tem dinheiro");
        }
        else if(this.getSaldo() < 0)
        {
            System.out.println("Conta não pode ser fechada pois tem débito");
        }
        else
        {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
            
        }
    }
    //v = valor da conta;
    public void depositar(double v)
    {
        if(this.getStatus())
        {
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        }
        else
        {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }
    //sacar também recebe v como valor de parâmetro;
    public void sacar(double v)
    {
        //Verifica se a conta está aberta, sendo afirmativo prossegue:
        if(this.getStatus())
        {
            //Se o saldo for maior ou igual ao valor, então é possível sacar:
            if(this.getSaldo() >= v)
            {
                //Recebe o saldo e depois substrai ele de v:
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
                //getDono retorna o nome do dono desta conta;
            }
            else
            {
                System.out.println("Saldo insuficiente para saque");
            }
        }
        //Retorna esta mensagem se verifica que a conta está fechada:
        else
        {
            System.out.println("Impossível sacar de uma conta fechada");
        }
    }
    //Mensalidade (taxa de manutenção da conta):
    public void pagarMensalidade(float v)
    {
        //int v;
        if(this.getTipo() == "CC")
        {
            v = 12;
        }
        else if(this.getTipo() == "CP")
        {
            v = 20;
        }
        if(this.getStatus())
        {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        }
        else
        {
            System.out.println("Impossível pagar uma conta fechada");
        }
    }
    //Método Construtor:
    public contaBanco()
    {
        this.saldo = 0;
        this.status = false;
    }
    
    //Métodos Especiais:
    public int getNumConta()
    {
        return this.numConta;
    }
    public void setNumConta(int numConta)
    {
        this.numConta = numConta;
    }

    public String getTipo()
    {
        return tipo;
    }

    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    
    public String getDono()
    {
        return this.dono;
    }
    public void setDono(String dono)
    {
        this.dono = dono;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    //Métodos que retornam boolean usa por padrão is, alterei manualmente para get;
    public boolean getStatus()
    {
        return status;
    }
    public void setStatus(boolean status)
    {
        this.status = status;
    }
    
}
