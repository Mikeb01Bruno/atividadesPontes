package teste;

public abstract class Pessoa {
    protected String id;
    protected String nome;
    protected String telefone;
    protected String email;
    protected Endereco endereco;

    //Construtor
    
    public Pessoa(String id, String nome, String telefone, String email, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }
    
    //Getter & Setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    //toString
    
    @Override
    public String toString() {
        return super.toString() +
               "\n ID: " + id + 
               "\n Nome: " + nome + 
               "\n Telefone: " + telefone + 
               "\n Email: " + email + 
               "\n Endereco: " + endereco;
    }
    
    
  }
