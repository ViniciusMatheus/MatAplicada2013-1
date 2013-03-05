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
    
    public void setElemento(Tipo elemento)
    {
        conjunto.add(elemento);
    }
    
    public void getElemento()
    {
        System.out.println(conjunto.toString());
    }
    
    public void pertinencia(Tipo valor, Conjunto conjunto)
    {
        if(this.conjunto.contains(valor))
        {
            System.out.println("Elemento " + valor + " pertence ao conjunto " + conjunto);
        }
        else
        {
            System.out.println("Elemento " + valor + " não pertence ao conjunto " + conjunto);
        }
    }
}

