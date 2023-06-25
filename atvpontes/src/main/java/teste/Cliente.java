
package teste;

import java.time.LocalDate;

public class Cliente extends Fisica{
    private int protocoloDeAtendimento;

    public Cliente(int protocoloDeAtendimento, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String id, String nome, String telefone, String email, Endereco endereco) {
        super(genero, estadoCivil, dataNascimento, id, nome, telefone, email, endereco);
        this.protocoloDeAtendimento = protocoloDeAtendimento;
    }

    public int getProtocoloDeAtendimento() {
        return protocoloDeAtendimento;
    }

    public void setProtocoloDeAtendimento(int protocoloDeAtendimento) {
        this.protocoloDeAtendimento = protocoloDeAtendimento;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\n Protocolo de Atendimento: " + protocoloDeAtendimento;
    }
    
    
}
