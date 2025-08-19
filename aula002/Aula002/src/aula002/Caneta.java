package aula002;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
    System.out.println("Modelo: "+this.modelo);
    System.out.println("Uma caneta " + this.cor);
    System.out.println("Caneta ponta "+this.ponta);
    System.out.println("Uma caneta está tampada ? " + this.tampada);
    }
    
    
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO. CANETA TAMPADA");
        } else{
            System.out.println("Rasbicado");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}
