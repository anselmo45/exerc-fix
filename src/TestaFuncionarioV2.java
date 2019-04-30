/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anselmo Rocha
 */
public class TestaFuncionarioV2 {
   public static void main(String[]args){
        
        FuncionarioV2 f2 = new FuncionarioV2();
        f2.ativo = true;
        f2.dataEntrada = "20/01/2018";
        f2.departamento = "escritorio";
        f2.nome = "Luiz";
        f2.rg  = "13253";
        f2.salario = 2000;
        f2.mostrar();
        
    }
} 

