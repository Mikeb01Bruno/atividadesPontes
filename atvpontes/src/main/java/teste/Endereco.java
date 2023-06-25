package teste;

public class Endereco {
    protected String logradouro;
    protected String numero;
    protected String cep;
    protected String cidade;
    protected UnidadeFederativa uf;

    //Construtor 
    
    public Endereco(String logradouro, String numero, String cep, String cidade, UnidadeFederativa uf) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }

    //Getter & Setter
    
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UnidadeFederativa getUf() {
        return uf;
    }

    public void setUf(UnidadeFederativa uf) {
        this.uf = uf;
    }
    
    //toString

    @Override
    public String toString() {
        return super.toString() +
                "\n Logradouro: " + logradouro + 
                "\n Número: " + numero + 
                "\n CEP: " + cep + 
                "\n Cidade: " + cidade + 
                "\n UF: " + uf.getSigla();
    }
    
    
    
}
