package ex001;

//Classe
public class Celular {
    //Atributos
    String marca;
    String modelo;
    int volume;
    int bateria;
    int brilho;
    boolean ligaDesliga;
    
    //Métodos
    void ligar(){
    this.ligaDesliga = true;
    }
    
    void desligar(){
    this.ligaDesliga = false;
    }
    
    void aumentaBrilho(){
        this.brilho++;
    }
    
    void diminuiBrilho(){
        this.brilho--;
    }
    
    void aumentaVolume(){
        this.volume++;
    }
    
    void diminuiVolume(){
        this.volume--;
    }
    
    void status(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Bateria: "+this.bateria+"%");
        System.out.println("Brilho: "+this.brilho);
        System.out.println("Celular Ligado:: "+this.marca);
    }
}


