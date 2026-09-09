/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.projeto_escolaa;

/**
 *
 * @author daniele62947876
 */
public class Alunos {
    String nome;
    String sobrenome;
    String cor; 
    String turno;
    int anonacimento;
    String endereço;
    int idade;
    int esseano = 2026;
    
    
    public Alunos (String nomeInformado, String sobrenomeInformado, String corInformado, String turnoInformado, int anonacimentoInformado, String endereçoInformado){
        nome = nomeInformado;
        sobrenome = sobrenomeInformado;
        cor = corInformado;
        turno = turnoInformado;
        anonacimento = anonacimentoInformado;
        endereço = endereçoInformado;      
}
    
public void idade (){
       idade = esseano - anonacimento;
                    
      
    }


}