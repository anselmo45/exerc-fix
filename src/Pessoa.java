/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anselmo Rocha
 */
public class Pessoa {
  
    String nome;
    int idadeAtual;
    
    void  fazAniversario (int aniversario) {
        
        idadeAtual = idadeAtual + aniversario;
        System.out.println("nome : " + nome);
        System.out.println("idade atual:" + idadeAtual);
    }
    
}
