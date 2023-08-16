package Banco;

import View.Sistema;
import java.util.ArrayList;



public class Semana05 {
    
    //DB FAKE
    public static ArrayList<Conta> banco = new ArrayList<>();
    
    public static void main(String[] args){
        new Sistema().setVisible(true);
    
    }
    
}

/*
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
            conta.depositar(100.0);
        }
        
        banco.get(0).sacar(500.0);
        banco.get(2).sacar(80.0);
        
        banco.get(0).transferir(banco.get(2), 100.0);
    }
    */