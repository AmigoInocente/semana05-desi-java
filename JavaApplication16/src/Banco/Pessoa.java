package Banco;


class Pessoa {

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
    }
    
    private String nome;

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
    public boolean validaDocumento(String documento){
        return true;
    }
    
    
}
