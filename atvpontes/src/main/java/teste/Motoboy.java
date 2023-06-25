package teste;

import java.time.LocalDate;

public class Motoboy extends Funcionario{
    private String placaDaMoto;

    //Consturtor
    public Motoboy(String placaDaMoto, String rg, String cpf, Setor setor, int matricula, Bonificacao bonificacao, double salarioBase, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String id, String nome, String telefone, String email, Endereco endereco) {
        super(rg, cpf, setor, matricula, bonificacao, salarioBase, genero, estadoCivil, dataNascimento, id, nome, telefone, email, endereco);
        this.placaDaMoto = placaDaMoto;
    }

    //Getter & Setter    
    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }
     
    @Override
    public double getSalarioFinal() {
       return salarioBase + (salarioBase * Bonificacao.MOTOBOY.getValor()); 
    }
    
     //toString
      @Override
    public String toString() {
        return super.toString() + 
                "\n Placa da Moto: " + placaDaMoto + 
                "\n Salário Final: " + getSalarioFinal();
    }

    
}
