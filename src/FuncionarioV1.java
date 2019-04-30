/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anselmo Rocha
 */
public class FuncionarioV1 {
    
    String nome;
    String departamento;
    double salario;
    String dataDeEntrada;
    String rg;
    boolean ativo;
    
    void bonifica(double aumento){
       double res;
        res = (salario * aumento) / 100;
        salario = salario + res;
         
    }
        void demite(){
            ativo = false;
    }
    
}
