
import estudante.Aluno;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kedson dos Anjos
 */
public class Estudade_Munitor extends Aluno{
     private double Bolsa;
     private String Disciplina;
     
     
     public void axiliar_professor(){
         System.out.println("estudante "+this.getNome()+"" +"axiliar professor na descina de "+ this.getDisciplina());
     }
     public void Tira_duvida(){
         
     }

    public double getBolsa() {
        return Bolsa;
    }

    public void setBolsa(double Bolsa) {
        this.Bolsa = Bolsa;
    }

    public String getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(String Disciplina) {
        this.Disciplina = Disciplina;
    }
}
