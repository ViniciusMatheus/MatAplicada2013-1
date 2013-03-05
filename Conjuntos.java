package ...;

public class Main 
{

    public static void main(String[] args) 
    { 
        Conjunto<Integer> teste1 = new Conjunto<>();
        Conjunto<String> teste2 = new Conjunto<>();
        Conjunto<Integer> teste3 = new Conjunto<>();
 
        teste1.setElemento(1);
        teste1.setElemento(2);
        teste1.setElemento(3);
        
        teste3.setElemento(4);
        
        teste2.setElemento("teste2");
        teste2.setElemento("teste3");
        
        teste1.getElemento();
        
        teste2.getElemento();
        
        
        
        System.out.println("\n--------------------\n");
        
        
        Conjunto<Integer> A = new Conjunto<>();
        
        A.setElemento(1);
        A.setElemento(3);
        A.setElemento(5);
        A.setElemento(7);
        
        A.getElemento();
        
        A.pertinencia(3, A);
    }
}
