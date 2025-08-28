package projetopessoa;

public class Aluno extends Pessoa{
    //Atributos
    private int matr;
    private String curso;

    
    //Métodos
    public void cancelarMatr(){
        System.out.println("Matrícula será cancelada");
    }
    
    
    //Métodos Especiais

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
