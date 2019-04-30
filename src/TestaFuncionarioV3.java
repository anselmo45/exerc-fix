/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anselmo Rocha
 */
public class TestaFuncionarioV3 {
    public static void main(String[]args){
        FuncionarioV3 f3 = new FuncionarioV3();
        f3.ativo = true;
        f3.departamento = "escritorio";
        f3.nome = "Luiz";
        f3.rg  = "13253";
        f3.salario = 2000;
        f3.mostrar();
        
        Data d3 = new Data();
        d3.dia = 31;
        d3.mes = 05;
        d3.ano = 2007;
        
    }
}
