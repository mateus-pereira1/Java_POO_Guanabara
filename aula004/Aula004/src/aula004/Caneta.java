package aula004;

public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampar;
    private boolean destampar;

    
    public void Caneta(){
        this.tampar();
        this.modelo = "BIC";
        this.ponta = 0.8f;
        this.cor = "Azul";
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public void tampar(){
        this.tampar = true;
    }
    
    public void destampar(){
        this.destampar = false;
    }
    
    public void status(){
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ponta: "+this.ponta);
    }
}
