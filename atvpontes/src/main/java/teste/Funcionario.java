package teste;

import java.time.LocalDate;

public abstract class Funcionario extends Fisica implements SalarioFinal{
    protected String rg;
    protected String cpf;
    protected Setor setor;
    protected int matricula;
    protected Bonificacao bonificacao;
    protected double salarioBase;

    public Funcionario(String rg, String cpf, Setor setor, int matricula, Bonificacao bonificacao, double salarioBase, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String id, String nome, String telefone, String email, Endereco endereco) {
        super(genero, estadoCivil, dataNascimento, id, nome, telefone, email, endereco);
        this.rg = rg;
        this.cpf = cpf;
        this.setor = setor;
        this.matricula = matricula;
        this.bonificacao = bonificacao;
        this.salarioBase = salarioBase;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
           
    @Override
    public String toString() {
        return super.toString() + 
                "\n RG: " + rg + 
                "\n CPF: " + cpf + 
                "\n Setor: " + setor.getTexto() + 
                "\n Matrícula: " + matricula + 
                "\n Bonificacão: " + bonificacao.getValor() + 
                "\n Salário Base: " + salarioBase;
    }
}
