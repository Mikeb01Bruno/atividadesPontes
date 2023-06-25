/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import java.time.LocalDate;

/**
 *
 * @author Bruno
 */
public class Repositor extends Funcionario

{

    public Repositor(String rg, String cpf, Setor setor, int matricula, Bonificacao bonificacao, double salarioBase, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String id, String nome, String telefone, String email, Endereco endereco) {
        super(rg, cpf, setor, matricula, bonificacao, salarioBase, genero, estadoCivil, dataNascimento, id, nome, telefone, email, endereco);
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
    public double getSalarioFinal() {
      return salarioBase + (salarioBase * Bonificacao.REPOSITOR.getValor());
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\n Salário Final: " +getSalarioFinal() ;
    }
    
}
