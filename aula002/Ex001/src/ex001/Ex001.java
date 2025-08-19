package ex001;

public class Ex001 {

    public static void main(String[] args) {
       Celular meuCelular = new Celular();
       
       meuCelular.bateria = 37;
       meuCelular.brilho = 8;
       meuCelular.ligaDesliga = true;
       meuCelular.marca = "Samsung";
       meuCelular.modelo = "S20 FE";
       
       meuCelular.status();
       
       System.out.println("MODIFICAÇÕES DO CELULAR");
       meuCelular.aumentaBrilho();
       meuCelular.aumentaBrilho();
       meuCelular.aumentaBrilho();
       meuCelular.status();
       
       System.out.println("MODIFICAÇÕES DO CELULAR");
       meuCelular.diminuiBrilho();
       meuCelular.diminuiBrilho();
       meuCelular.status();
    }
    
}
