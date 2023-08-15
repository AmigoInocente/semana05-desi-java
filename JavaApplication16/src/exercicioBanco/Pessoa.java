package exercicioBanco;


class Pessoa {

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        if(this.validaCPF(cpf)){
            this.cpf = cpf;
        }
        
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    
    private boolean validaCPF(String cpf){
        //VERIFICAR SE O CPF É VALIDO
        return true;
    }
    
    private String nome;
    private String cpf;
    
}
