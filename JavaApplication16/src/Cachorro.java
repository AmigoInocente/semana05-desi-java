public class Cachorro {
    
    public Cachorro(String nome, String raca, int idade, String porte, Tutor tutor){
    
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.porte = porte;
        this.tutor = tutor;
          
    }
    
    private String nome;
    private String raca;
    private int idade;
    private String porte;
    private Tutor tutor;

    
    
    
    public String getNome(){// PORTA DE ACESSO PARA PODER CHAMAR O ATRIBUTO, ASSIM QUANDO CHAMAR ESSA FUNÇÃO IRÁ RETORNAR O ATRIBUTO
        return this.nome;
    }
    public String getRaca(){// PORTA DE ACESSO PARA PODER CHAMAR O ATRIBUTO, ASSIM QUANDO CHAMAR ESSA FUNÇÃO IRÁ RETORNAR O ATRIBUTO
        return this.raca;
    }

    public int getIdade() {
        return idade;
    }
    
    public String getPorte(){// PORTA DE ACESSO PARA PODER CHAMAR O ATRIBUTO, ASSIM QUANDO CHAMAR ESSA FUNÇÃO IRÁ RETORNAR O ATRIBUTO
        return this.porte;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        tutor = tutor;
    }
    
   
    
    public void setNome(String nome){
        this.nome = nome;
    }
}
