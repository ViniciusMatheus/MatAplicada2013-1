
package ...;

import java.util.ArrayList;
import java.util.List;

public class Conjunto<Tipo> 
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
    
    public String getCOnjunto()
    {
        return this.conjunto.toString();
    }
    
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
}
