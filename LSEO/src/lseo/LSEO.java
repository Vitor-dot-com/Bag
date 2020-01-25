/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lseo;

import static lseo.MainLista.teclado;

/**
 *
 * @author vihbr
 */
public class LSEO <E> {
    
  public static void removeFim (Lista lista){
        Elemento auxiliar = lista.primeiro;
        Elemento anterior = lista.primeiro;
        if (lista.qtd == 0){
            System.out.println("Lista vazia bro");
        }else{
        while (auxiliar.proximo != null){
            anterior = auxiliar;
            auxiliar = auxiliar.proximo;
        }
        
        anterior.proximo = null;
        lista.ultimo = anterior;
        lista.qtd--; 
        }
    }
  public static void removeInicio (Lista lista){
        if (lista.qtd == 0){
            System.out.println("Lista vazia bro");
        }else{
            lista.primeiro = lista.primeiro.proximo;
            lista.qtd--; 
        }
        
    }
     public static void pesquisar (Lista lista){
        System.out.println("Qual elemento encontrar ?");
        int numero = teclado.nextInt();
        Elemento auxiliar = lista.primeiro;
      
        while(auxiliar != null & auxiliar.num != numero){
            auxiliar = auxiliar.proximo;
        }
        if (auxiliar == null){
            System.out.println("Elemento nao existe! :'/");
        }else {
            System.out.println(auxiliar.num);
        }
        
    }
     public static void listar(Lista lista){
       Elemento auxiliar = lista.primeiro;
       if (auxiliar == null) {
           System.out.println("Lista vazia!");
       } else{
            while (auxiliar != null){
           System.out.println(auxiliar.num);
           auxiliar = auxiliar.proximo;
        }
       }
        
        
    }
    public static void addObj(Lista lista){
       Elemento novoObj = new Elemento();
       Elemento objAux = new Elemento();
       if(lista.qtd == 0){
           System.out.println("Informe o numero desejado");
           novoObj.num = teclado.nextInt();
           novoObj.proximo = null;
          
           lista.primeiro = novoObj;
           lista.ultimo = novoObj;
           lista.qtd++;
         } 
       else {
           
           while (objAux.proximo != null)
               objAux = objAux.proximo;
           }
       
       System.out.println("Informe o numero desejado");
           novoObj.num = teclado.nextInt();
           novoObj.proximo = null;
           
           objAux.proximo = novoObj;
    
           lista.ultimo = novoObj;
           lista.qtd++;
           
    }
    
}
