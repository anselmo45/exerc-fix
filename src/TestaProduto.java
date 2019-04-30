/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anselmo Rocha
 */
public class TestaProduto {
    public static void main(String[]args){
        
        Produto p = new Produto();
        p.nome = "Telefone";
        p.preco = 10;
        
        p.baixar10();
        p.aumenta25();
    }
}
