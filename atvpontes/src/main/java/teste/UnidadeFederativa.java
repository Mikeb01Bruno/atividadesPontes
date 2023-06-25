package teste;

public enum UnidadeFederativa {
    BAHIA("Bahia", "BA"),
    VISTA_ALEGRE("Vista Alegre", "VA"),
    CAJACITY("Cajacity", "CJ");
    
    private final String nome;
    private final String sigla;

    private UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
    
    
}
