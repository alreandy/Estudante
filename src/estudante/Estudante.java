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
public class Estudante {

    private String nome;
    private int idade;
    private char sexo;
    private double Nota;
    private String Matricula;

    Estudante() {
        //contrutor vazio sem parametro
    }

    Estudante(String nome, char sexo) {
        //contrutor que inicia o nome e o sexo.

        this.nome = nome;
        this.sexo = sexo;
    }

    Estudante(String nome, char sexo, String matricula) {
        //contrutor que inicia o nome e o sexo, matricula.

        this.nome = nome;
        this.sexo = sexo;
        this.Matricula = matricula;
    }
    
    
    void criarEstudante(){
        
    }
    
    public void ArtibuirNota() {

    }

    public void ArtibuirNota(int indice) { // crie aiii nao sei se esta certo
        
        
        
    }

    public void exibir() {

        System.out.println("A nota do aluno é: " + Nota);
    }

    public void exibir(String titulo) {

        System.out.println("A nota do aluno é: " + Nota + "e o parametro "
                + "passado é:" + titulo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getNota() {
        return Nota;
    }

    public void setNota(double Nota) {
        this.Nota = Nota;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

}
