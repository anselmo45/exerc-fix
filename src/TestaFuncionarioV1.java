/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anselmo Rocha
 */
public class TestaFuncionarioV1 {
    public static void main(String[]args){
        FuncionarioV1 f1 = new FuncionarioV1();
       
       
        f1.nome = "Artur";
        f1.departamento = "jurídico";
        f1.salario = 8000;
        f1.rg = "123456";
        f1.dataDeEntrada = "01/04/2019";
        f1.ativo = true;
        f1. bonifica(5);
       
        System.out.println(f1.salario);
        
        f1.demite();
        System.out.println(f1.ativo);
        
                 
    }
    
}
