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

        Estudade_Monitor al = new Estudade_Monitor();
        al.setNome("kedson");
        al.setDisciplina("programacao");
        al.axiliar_professor();

    }

}
