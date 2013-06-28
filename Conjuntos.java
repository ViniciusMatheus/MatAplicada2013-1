
package [sua-package];

import java.util.ArrayList;
import java.util.List;

public class Conjunto<Tipo extends Comparable> 
{
    private List<Tipo> conjunto;
//    int [] item;
    
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
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
    
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
                c.adicionar((Comparable) b.conjunto.get(i));
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
    
    // radix sort
    
    public void radixSort(int[] a, int tamanho)  // 100%
    {
        int[] b = new int[a.length];
        int[] bOrig = b;

        int rshift = 0;
        for (int mascara = ~(-1 << tamanho); mascara != 0; mascara <<= tamanho, rshift += tamanho) 
        {
            int[] contador = new int[1 << tamanho];
            
            for (int p = 0; p < a.length; ++p) {
                int chave = (a[p] & mascara) >> rshift;
                ++contador[chave];
            }

            for (int i = 1; i < contador.length; ++i) 
            {
                contador[i] += contador[i - 1];
            }

            for (int p = a.length - 1; p >= 0; --p) 
            {
                int chave = (a[p] & mascara) >> rshift;
                --contador[chave];
                b[contador[chave]] = a[p];
            }

            int[] temp = b;
            b = a;
            a = temp;
        }

        if (a == bOrig) 
        {
            System.arraycopy(a, 0, b, 0, a.length);
        }
    }
    // =========================================================================
    // endorelaçõoes
    // =========================================================================
    
    //reflexividade
    public void reflexiva(int[][] matriz) 
    {
        for (int i = 0; i < matriz.length; i++) 
        {
            for (int e = 0; e < matriz.length; e++) 
            {
                if (matriz[i][e] == 0) 
                {
                    System.out.println("reflexiva: " + matriz[i][e]);
                }
            }
        }
        System.out.println("não reflexiva");
    }

    //transitividade
    public void transitiva(int[][] matriz) 
    {
        for (int i = 0; i >= matriz.length; i++) 
        {
            for (int e = 0; e >= matriz.length; e++) 
            {
                if (matriz[i][e] == 1) 
                {
                    System.out.println("transitiva: " + matriz[i][e]);
                }
            }
        }
        System.out.println("não transitiva");
    }

    //simetria
    public void simetrica(int[][] matriz) 
    {
        for (int i = 0; i >= matriz.length; i++) 
        {
            for (int e = 0; e >= matriz.length; e++) 
            {
                if (matriz[i][e] == matriz[e][i]) 
                {
                    System.out.println("simetrica: " + matriz[i][e]);
                }
            }
        }
        System.out.println("não simetrica");
    }
}
