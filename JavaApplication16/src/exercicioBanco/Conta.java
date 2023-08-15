package exercicioBanco;

import java.util.Random;

class Conta {

    public Conta(Pessoa titular) { 
        this.saldo = 0.0;
        this.titular = titular;
        this.numero = this.gerarNumeroConta();
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Pessoa getTitular() {
        return titular;
    }
    
    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.printf("Saldo após deposito: R$%.2f%", this.saldo);
        }else{
            System.out.println("Não é possivel depositar este valor na conta.");
        }
    }
    
    public  void sacar(double valor) {
        if(valor <= this.saldo && valor > 0){
            this.saldo -= valor;
            System.out.printf("Saldo após saque: R$%.2f%", this.saldo);
            System.out.println("");
        }else{
            System.out.println("Não é possivel sacar este valor da conta.");
        }
    }
    
    
    private int numero;
    private double saldo;
    private Pessoa titular;

    private int gerarNumeroConta() {
        Random random = new Random();
        
        //math.random(); METODO ABSTRATO
        
        return random.nextInt(90000) + 10000;
    }
}
