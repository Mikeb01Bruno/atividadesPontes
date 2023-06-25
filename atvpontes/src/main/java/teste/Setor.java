package teste;

public enum Setor {
    OPERACOES("Operações"),
    FINANCEIRO("Financeiro"),
    JURIDICO("Juridico");
    
    private final String texto;

    private Setor(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
    
}
