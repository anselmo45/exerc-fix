/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anselmo Rocha
 */
public class Casa {
    String cor;
    Porta porta1, porta2, porta3;
    
    void pinta(String s){
        this.cor = s;
    }
    int quantasPortasEstaoAbertas(){
        int val = 0;
        if(porta1.aberta){
            val++;
        }
        if(porta2.aberta){
            val++;
        }
        if(porta3.aberta){
            val++;
        }
        
        return val;
    }
}
