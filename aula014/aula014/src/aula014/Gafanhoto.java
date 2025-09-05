package aula014;

public class Gafanhoto extends Pessoa{
    
    //Atributos
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }


    


    //Métodos
    public void viuMaisUm(){
        setTotAssistido(getTotAssistido()+1);
    }
    
    
    
    //Métodos Especiais
    public String isLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    
    
}
