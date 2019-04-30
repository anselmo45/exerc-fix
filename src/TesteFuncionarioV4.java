/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anselmo Rocha
 */
public class TesteFuncionarioV4 {
    public static void main (String[]args){
        FuncionarioV4 f4 = new FuncionarioV4();
        f4.nome ="Anselmo";
        f4.rg = "534616";
        
        FuncionarioV4 f5 = new FuncionarioV4();
        f4.nome ="Anselmo";
        f4.rg = "534616";
        
        f4.equals(f5);
        
    }
}
