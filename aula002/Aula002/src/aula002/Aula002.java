package aula002;

public class Aula002 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.modelo = "Bic";
        c1.rabiscar();
        c1.tampada = true;
        c1.rabiscar();
        c1.status();
    }
    
}
