package aula005;

public class Aula005 {

    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        c1.setNumConta(123);
        c1.setDono("Mateus");
        
        c1.abrirConta("cc"); // abre como conta corrente
        c1.depositar(200);
        c1.sacar(50);
        c1.pagarMensal();
        
        System.out.println("Dono: " + c1.getDono());
        System.out.println("Saldo: " + c1.getSaldo());
        System.out.println("Status: " + (c1.isStatus() ? "Ativa" : "Inativa"));
        
        c1.depositar(500);
    }
    
}
