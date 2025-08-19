package aula002;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    void status(){
    System.out.println("Modelo: "+this.modelo);
    System.out.println("Uma caneta " + this.cor);
    System.out.println("Caneta ponta "+this.ponta);
    System.out.println("Caneta carga "+this.carga);
    System.out.println("Uma caneta está tampada ? " + this.tampada);
    }
    
    
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO. CANETA TAMPADA");
        } else{
            System.out.println("Rasbicado");
        }
    }
    
    protected void tampar(){
        this.tampada = true;
    }
    
    protected void destampar(){
        this.tampada = false;
    }
}
