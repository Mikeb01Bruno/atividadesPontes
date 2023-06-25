package teste;

public enum Bonificacao {
    CAIXA(0.2),
    MOTOBOY(0.1),
    REPOSITOR(0.15);
    
   private final double valor;

    private Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
   
   
}
