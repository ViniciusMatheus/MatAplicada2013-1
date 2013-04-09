
package [sua package];

import java.util.ArrayList;
import java.util.List;

public class Conjunto<Tipo extends Comparable> 
{
    private List<Tipo> conjunto;
    
    public Conjunto()
    {
        conjunto = new ArrayList<>();
    }
    
    public void adicionar(Tipo elemento)
    {
        conjunto.add(elemento);
    }
    
    public void remover(Tipo elemento)
    {
        conjunto.remove(elemento);
    }
    
    public void limparConjunto()
    {
        this.conjunto.clear();
    }
    
    public boolean ehVazio()
    {
        if(this.conjunto.isEmpty())
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    
    public String getConjunto()
    {
        return this.conjunto.toString();
    }
    
    
//    operações com comjuntos
//---------------------------------------------------------------
//---------------------------------------------------------------
    
    public boolean igualdade(Conjunto b) //100%
    {
        if(b.conjunto.equals(this.conjunto))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
      
      public int cardinalidade() //100%
      {
          return this.conjunto.size();
      }
     
    
//    verifica se um elemento pertence ao conjunto
    public boolean pertinencia(Tipo valor) //100%
    {
        if(this.conjunto.contains(valor))
        {
            return true;
        }
        else
        {
            return false;
        }
    }   
    
// verifica se o conjunto que chama o metodo esta contido no conjunto que é passado;
    public boolean continecia(Conjunto c) //100%
    {
       for(Tipo elemento: conjunto)
        {
            if(!c.pertinencia(elemento))
            {
                return false;
            }
        }
        return true;
    }
    
//    une dois conjuntos
    public String uniao(Conjunto b) //100%
    {
        Conjunto c = new Conjunto();
                
        for (int i = 0; i < conjunto.size(); i++)
        {
                if(conjunto.contains(b.conjunto.get(i)))
                {
                    c.adicionar(conjunto.get(i));
                }
                else
                {
                    c.adicionar(conjunto.get(i));
                    c.adicionar(b.conjunto.get(i).toString());
                }
        }
        
        return c.getConjunto();
    }
    
    public String intersecao(Conjunto b) // 100%
    {
        Conjunto c = new Conjunto();
                
        for (int i = 0; i < conjunto.size(); i++)
        {
                if(conjunto.contains(b.conjunto.get(i)))
                {
                    c.adicionar(conjunto.get(i));
                }
        }
        
        return c.getConjunto();
    }
    
    public String diferenca(Conjunto b) // 100%
    {
        Conjunto c = new Conjunto();
                
        for (int i = 0; i < conjunto.size(); i++)
        {
                if(!conjunto.contains(b.conjunto.get(i)))
                {
                    c.adicionar(conjunto.get(i));
                    c.adicionar(b.conjunto.get(i).toString());
                }
        }
        
        return c.getConjunto();
    }
    
    public String produtoCartesiano(Conjunto b) // 100%
    {
        Conjunto c = new Conjunto();
                
        for (int i = 0; i<conjunto.size(); i++)
        {
            for (int j = 0; j<conjunto.size(); j++)
            {
                c.adicionar("<" + b.conjunto.get(i) + "," + conjunto.get(j) + ">");
               
            }
        }
        
        return c.getConjunto();
    }
}
