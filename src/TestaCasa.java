/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anselmo Rocha
 */
public class TestaCasa {
    public static void main(String[] args){
        Porta p1 = new Porta();
        p1.aberta = false;
        p1.cor = "azul";
        p1.da = "2";
        p1.db = "3";
        p1.dc = "4";
        
        Porta p2 = new Porta();
        p2.aberta = true;
        p2.cor = "amarelo";
        p2.da = "2";
        p2.db = "2";
        p2.dc = "2";
        
        Porta p3 = new Porta();
        p3.aberta = true;
        p3.cor = "amarelo";
        p3.da = "4";
        p3.db = "2";
        p3.dc = "3";
        
       Casa c = new Casa();
       c.cor = "preto";
       c.porta1 = p1;
       c.porta2 = p2;
       c.porta3 = p3;
       
System.out.println(c.quantasPortasEstaoAbertas());
    }
}
