/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anselmo Rocha
 */
public class Porta {
    
    boolean aberta;
    String cor;
    String da, db, dc;
    
    
    
    void  abre () {
        aberta = true;
    }
    void  fechado () {
        aberta = false ;
    } 
    void  pinta ( String ncor ) {
        cor = ncor;
        System.out.println(cor);
        
    } 
    boolean  estaAberta () {
        if(aberta == true);
        System.out.println("A porta está aberta");
        return false;
    }
}
    

