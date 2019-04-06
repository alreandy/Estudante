/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudante;

/**
 *
 * @author kedson dos Anjos
 */
public class EstudanteServico extends Estudante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //crie 3 estudante. criar 3 instancias de estudantes
        
        Estudante es1 = new Estudante();
        es1.setNome("a");
        es1.setNota(7);
        es1.ArtibuirNota(1);
        
        
        Estudante es2 = new Estudante("Chris",'m' );
               
        
        
         Estudante es3 = new  Estudante("Feliz", 'm', "ISP01547");
        
        
        
        
        
        
        
        
        
        
        
        
//        Estudade_Monitor al = new Estudade_Monitor();
//        al.setNome("kedson");
//        al.setDisciplina("programacao");
//        al.axiliar_professor();

    }

}
