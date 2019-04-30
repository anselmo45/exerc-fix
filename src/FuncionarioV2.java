/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anselmo Rocha
 */
public class FuncionarioV2 {
    String nome;
    String departamento;
    double salario;
    String dataEntrada;
    String rg;
    Boolean ativo = true;
    
    void bonifica(double aumento){
        double res;
        res = (salario + aumento) / 100;
        salario  = salario + res;
    }
        void demite() {
        ativo = false;
        }
        
        void mostrar(){
            
            System.out.println(nome + "\n" + 
                    salario + "\n" +
                    departamento + "\n" +
                    rg + "\n" +
                    ativo + "\n" +
                   dataEntrada);
    }
    
}
