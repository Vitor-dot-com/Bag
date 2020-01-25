/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lseo;

import java.util.Scanner;

/**
 *
 * @author vihbr
 */
public class MainLista {

public static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
       
       Lista lista = new Lista();
       lista.qtd = 0; 
       addObj(lista); 
    }
   
}
