package ex001;

public class Pessoa {
    
    //Atributos
    private String nome;
    private int idade;
    private String sexo;
    
    
    //Métodos
    public void fazerAniversario(){
        this.setIdade(getIdade()+1);
    }
    
    
    //Métodos especiais
    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.setIdade(idade);
        this.setSexo(sexo);
        
        if(this.getIdade()<0){
            System.out.println("Por favor, Digite uma idade válida!");
        } else if(this.getSexo().equals("feminino") && this.getSexo().equals("masculino")){
            System.out.println("Por favor, coloque um sexo válido!");
        }
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        if(this.idade < 0){
            System.out.println("Por favor, coloque uma idade válida!");
        } else{
            this.idade = idade;
        }
        
    }

    private String getSexo() {
        return sexo;
    }

    private void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    public void status(){
        System.out.println("Me chamo "+this.getNome());
        System.out.println("Tenho: "+this.getIdade()+" anos");
        System.out.println("E sou do gênero "+this.getSexo());
        
    }
    
    
}
