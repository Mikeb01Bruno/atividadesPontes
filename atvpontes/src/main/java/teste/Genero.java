package teste;

public enum Genero {
    MASCULINO("Masculino"),
    FEMININO("Feminino"),
    CONSTANTE("Constante"),
    UFBA("UFBANO");
    
    private final String texto;

    private Genero(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
    
    
}
