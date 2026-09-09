/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.projeto_escolaa;

/**
 *
 * @author daniele62947876
 */
public class Projeto_escolaa {

    public static void main(String[] args) {
        
        
        Alunos alunos1 = new Alunos ("Ana", "Clara", "Branca", "Verspertino", 2010, "Rua Caçarolas casa 5");
        
        Alunos alunos2 = new Alunos ("Caio", "Rodriguez", "Pardo", "Verspertino", 2009, "Rua Caçarolas casa 23");
        
        Alunos alunos3 = new Alunos ("Julia", "Bonfim", "Negra", "Matutino", 2011, "Rua Pitanga casa 54");

        Alunos alunos4 = new Alunos ("David", "Santiago", "Pardo", "Verspertino", 2009, "Rua Rio de Janeiro casa 107");

        alunos1.idade();
        alunos2.idade();
        alunos3.idade();
        alunos4.idade();
        
        System.out.println("Nome: " + alunos1.nome );
        System.out.println("Nome: " + alunos1.sobrenome );
        System.out.println("Nome: " + alunos1.cor );
        System.out.println("Nome: " + alunos1.turno );
        System.out.println("Nome: " + alunos1.anonacimento );
        System.out.println("Nome: " + alunos1.endereço );
        System.out.println("Nome: " + alunos1.idade );
        
        
        System.out.println("Nome: " + alunos2.nome );
        System.out.println("Nome: " + alunos2.sobrenome );
        System.out.println("Nome: " + alunos2.cor );
        System.out.println("Nome: " + alunos2.turno );
        System.out.println("Nome: " + alunos2.anonacimento );
        System.out.println("Nome: " + alunos2.endereço );
        System.out.println("Nome: " + alunos2.idade );
        System.out.println(" "  );

        
        System.out.println("Nome: " + alunos2.nome );
        System.out.println("Nome: " + alunos2.sobrenome );
        System.out.println("Nome: " + alunos2.cor );
        System.out.println("Nome: " + alunos2.turno );
        System.out.println("Nome: " + alunos2.anonacimento );
        System.out.println("Nome: " + alunos2.endereço );
        System.out.println("Nome: " + alunos2.idade );
        System.out.println(" "  );

        
        System.out.println("Nome: " + alunos3.nome );
        System.out.println("Nome: " + alunos3.sobrenome );
        System.out.println("Nome: " + alunos3.cor );
        System.out.println("Nome: " + alunos3.turno );
        System.out.println("Nome: " + alunos3.anonacimento );
        System.out.println("Nome: " + alunos3.endereço );
        System.out.println("Nome: " + alunos3.idade );
        System.out.println(" "  );
        
        System.out.println("Nome: " + alunos4.nome );
        System.out.println("Nome: " + alunos4.sobrenome );
        System.out.println("Nome: " + alunos4.cor );
        System.out.println("Nome: " + alunos4.turno );
        System.out.println("Nome: " + alunos4.anonacimento );
        System.out.println("Nome: " + alunos4.endereço );
        System.out.println("Nome: " + alunos4.idade );
        System.out.println(" "  );

    }
}
