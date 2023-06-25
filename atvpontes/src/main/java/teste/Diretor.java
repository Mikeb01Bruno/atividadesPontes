package teste;

import java.time.LocalDate;

public class Diretor extends Funcionario implements Contratacao{
    private double premio = 0.3;

    public Diretor(String rg, String cpf, Setor setor, int matricula, Bonificacao bonificacao, double salarioBase, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String id, String nome, String telefone, String email, Endereco endereco) {
        super(rg, cpf, setor, matricula, bonificacao, salarioBase, genero, estadoCivil, dataNascimento, id, nome, telefone, email, endereco);
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }
 @Override
    public double getSalarioFinal() {
     return salarioBase + (salarioBase * premio) ;
    }
    
    @Override
    public String toString() {
        return super.toString() + 
                "\n Salário final: " + getSalarioFinal();
                
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("O funcionário foi admitido" +funcionario);       
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("O funcionário foi demitido " + funcionario);
    }

   
    
    
}
