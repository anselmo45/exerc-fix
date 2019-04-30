/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anselmo Rocha
 */
public class TestaTemperatura {
    public static void main(String[]args){
        Temperatura t = new Temperatura();
        
        double resultado;
        resultado = t.converterParaFahrenheit(23.5);
        System.out.println(resultado);
        
        resultado = t.converterParaCelsius(102.0);
        System.out.println(resultado);
    }
    
}
