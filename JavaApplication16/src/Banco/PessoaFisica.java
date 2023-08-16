package Banco;


public class PessoaFisica extends Pessoa{
    
    private String cpf;
    
    public PessoaFisica(String nome) {
        super(nome);
        this.cpf = cpf;
    }

    public PessoaFisica(String nome, String cpfOuCnpj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public boolean validaDocumento(String documento){
        return true;
    }
    
}
