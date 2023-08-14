
import java.util.ArrayList;


public class Semana05 {

    
    public static void main(String[] args) {
        
        ArrayList<Cachorro> listaDeCachorros = new ArrayList<>();
        
        
        Tutor tutorUm = new Tutor("Eu", "9999-9999", "Rua abobrinha nº24");
        Tutor tutorDois = new Tutor("Francisco", "9999-9999", "Rua abobrinha nº32");
       
        listaDeCachorros.add(new Cachorro("Marley", "Pincher", 3, "Pequeno", tutorUm));
        listaDeCachorros.add(new Cachorro("Pitel", "Chítzu", 6, "Medio", tutorUm));
        
        
        //System.out.println(cachorroUm.getNome() + " & " + cachorroUm.getTutor());// USANDO A FUNÇÃO GET
        
        //cachorroUm.setNome("Bob 123");// USANDO A FUNÇÃO SET
        
        //System.out.println(cachorroUm.getNome() + " & " + cachorroUm.getTutor());// USANDO A FUNÇÃO GET
        //System.out.println(cachorroDois.getNome());
        
        for (Cachorro listaDeCachorro : listaDeCachorros) {
            System.out.println(listaDeCachorro.getNome() + " - " + listaDeCachorro.getTutor().getNome());
            
        }
        
        for (int i = 0; i < listaDeCachorros.size(); i++) {
            System.out.println(listaDeCachorros.get(i).getNome());
        }
    }
    
}
