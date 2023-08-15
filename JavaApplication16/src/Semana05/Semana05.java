package Semana05;

import java.util.ArrayList;



public class Semana05 {

    public static void main(String[] args) {
    ArrayList<Conta> banco = new ArrayList<>();
    
    Pessoa pUm = new Pessoa("Gustavo", "99.999.999.99");
    Pessoa pDois = new Pessoa("Maçaneiro", "99.999.999.99");
    Pessoa pTres = new Pessoa("Filipe", "99.999.999.99");
    
    

    banco.add(new Conta(pUm));
    banco.add(new Conta(pDois));
    banco.add(new Conta(pTres));
    
    
    
    banco.get(0).depositar(1000.0);
    
    
    
        for (Conta conta : banco) {
            System.out.println(conta.getTitular().getNome());
            conta.depositar(100.0);
            System.out.println("");
        }
    
    }

}