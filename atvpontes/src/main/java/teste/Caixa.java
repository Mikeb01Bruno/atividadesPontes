package teste;

import java.time.LocalDate;

public class Caixa extends Funcionario{

    //Construtor
    
    public Caixa(String rg, String cpf, Setor setor, int matricula, Bonificacao bonificacao, double salarioBase, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String id, String nome, String telefone, String email, Endereco endereco) {
        super(rg, cpf, setor, matricula, bonificacao, salarioBase, genero, estadoCivil, dataNascimento, id, nome, telefone, email, endereco);
    }
    
    //Getter & Setter

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

    //Salário Final
    
    @Override
    public double getSalarioFinal() {
        return salarioBase + (salarioBase * Bonificacao.CAIXA.getValor());
    }
    
    //toString
    @Override
    public String toString() {
        return super.toString() +
                "\n Salário Final: " +getSalarioFinal();
    }

    
}
