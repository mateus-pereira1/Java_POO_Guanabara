package ex001;

public class Ex001 {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Mateus", 27, "masculino");
        p[1] = new Pessoa("Maria", 30, "feminino");
        
        l[0] = new Livro("Aprendendo Java", "José", 300, p[0]);
        l[0] = new Livro("POO", "Balde", 300, p[1]);
        
        System.out.println(l[0].detalhes());
        
        
    
        
        
        
    }
    
}
