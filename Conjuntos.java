
package ...;

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
    
    public boolean igualdade(Conjunto b)
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
      
      public int cardinalidade()
      {
          return this.conjunto.size();
      }
     
    
//    verifica se um elemento pertence ao conjunto
    public boolean pertinencia(Tipo valor)
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
    public boolean continecia(Conjunto c)
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
    public String uniao(Conjunto b)
    {
        Conjunto c = new Conjunto();
        
        for(Tipo elemento: conjunto)
        {
            int i = 0;
            if(!b.conjunto.contains(this.conjunto))
            {
                c.adicionar(this.conjunto.get(i));
            }
            i++;
        }
        
        return c.getConjunto();
    }
    
    public String intersecao(Conjunto b)
    {
        Conjunto c = new Conjunto();
        
        for(Tipo elemento: conjunto)
        {
            int i = 0;
            if(b.conjunto.contains(this.conjunto))
            {
                c.adicionar(this.conjunto.get(i));
            }
            i++;
        }
        
        return c.getConjunto();
    }
    
    public String diferenca(Conjunto b)
    {
        Conjunto c = new Conjunto();
        
        for(Tipo elemento: conjunto)
        {
            int i = 0;
            if(!b.conjunto.contains(this.conjunto))
            {
                c.adicionar(this.conjunto.get(i));
            }
            i++;
        }
        
        return c.getConjunto();
    }
    
    public String produtoCartesiano(Conjunto b)
    {
        Conjunto c = new Conjunto();
        
        for (Tipo elemento: conjunto)
        {
            c.adicionar("<" + b.conjunto + "," + this.conjunto + ">");
        }
        
        return c.getConjunto();
    }
}
