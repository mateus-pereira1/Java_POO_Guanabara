package ex001;

public class Livro implements Publicacao{
    
    //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.setTotPaginas(totPaginas);
        this.aberto = false;
        this.setPagAtual(pagAtual);
        this.leitor = leitor;
    }
    

    
    
    //Métodos
    public String detalhes() {
        return "Livro{" + 
                "titulo=" + titulo + 
                ", autor=" + autor + ", "
                + "totPaginas=" + totPaginas + 
                ", pagAtual=" + pagAtual +
                ", aberto=" + aberto +
                ", leitor=" + leitor.getNome() + '}';
    }
    
    
    //Métodos Especiais

    

    

    
    
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    private void setTotPaginas(int totPaginas) {
        if(this.totPaginas < 0){
            System.out.println("Seu livro precisa de um total de páginas!");
        } else{
            this.totPaginas = totPaginas;
        }
    }

    public int getPagAtual() {
        return pagAtual;
    }

    private void setPagAtual(int pagAtual) {
        if(this.pagAtual > this.totPaginas){
            System.out.println("Você já finalizou o livro!");
        } else{
            this.pagAtual = pagAtual;
        }
    }


    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    //Métodos abstratos 
    @Override
    public void arbrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    public void folhear(int p) {
        this.pagAtual = p;
    }

    @Override
    public void avancarPagina() {
        this.setPagAtual(getPagAtual()+1);
    }

    @Override
    public void voltarPagina() {
        this.setPagAtual(getPagAtual()-1);
    }

    @Override
    public void folhear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
