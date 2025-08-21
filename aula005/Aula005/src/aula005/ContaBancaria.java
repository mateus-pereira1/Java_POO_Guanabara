package aula005;

public class ContaBancaria {
    //Atributos
    public int numConta;
    protected String tipo; //apenas cc ou cp
    private String dono;
    private double saldo;
    private boolean status;
    
    //Construtor
    public ContaBancaria(){
        this.status = false;
        this.saldo = 0;
    }

    //Métodos
    
    //Abrir Conta
    public void abrirConta(String tipo){
      this.status = true;
      this.tipo = tipo;
      if("cc".equals(tipo)){
          this.saldo += 50;
      } else if("cp".equals(tipo)){
          this.saldo += 150;
      }
    }
    
    //Fechar conta
    public void fecharConta(){
       if(saldo != 0){
           System.out.println("[ERROR] Você possuí débito ou valor em conta. Entrar em contato com banco!");
       } else{
           this.status = false;
       }
    }
    
    //Depositar
    public void depositar(double valor){
        if(this.status != true){
            System.out.println("[ERROR] Sua conta precisa ser criada para realizar depósitos!");
        } else{
            this.saldo += valor;
        }
    }
    
    //Sacar
    public void sacar(double valor){
        if(this.status != true){
            System.out.println("[ERROR] Sua conta precisa ser criada para realizar saques!");
        } else if(this.saldo < valor){
            System.out.println("[ERROR] Valor em conta insuficiente para saque!");
        } else{
            this.saldo -= valor;
        }
    }
    
    //Pagamento mensal
    public void pagarMensal(){
        if(this.status != true){
            System.out.println("[Error] Cobrança impossibilitada! Conta Cancelada");
        } else if("cc".equals(this.tipo)){
            this.saldo -= 12;
        } else{
            this.saldo -= 20;
        }
    }
    
    //Getter e setters
     // Getters e Setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }
    
        
    
    
}
