package teste;

public abstract class Juridica extends Pessoa{
  protected String cnpj;
  protected String inscricaoEstadual;

  //Construtor
  
    public Juridica(String cnpj, String inscricaoEstadual, String id, String nome, String telefone, String email, Endereco endereco) {
        super(id, nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

  //Getter & Setter
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    //toString
    
    @Override
    public String toString() {
        return super.toString()+
               "\n CNPJ: " + cnpj + 
               "\n Inscricão Estadual: " + inscricaoEstadual;
    }
  
  
}
