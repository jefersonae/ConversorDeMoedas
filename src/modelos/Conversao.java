package src.modelos;

public class Conversao {
    private String moedaBase;
    private String moedaBuscada;
    private float valorMoedaBase;
    private float valorMoedaBuscada;

    public Conversao(String moedaBase, String moedaBuscada, float valorMoedaBase) {
        this.moedaBase = moedaBase;
        this.moedaBuscada = moedaBuscada;
        this.valorMoedaBase = valorMoedaBase;
    }

    public String getMoedaBase() {
        return moedaBase;
    }

    public String getMoedaBuscada() {
        return moedaBuscada;
    }

    public float getValorMoedaBase() {
        return valorMoedaBase;
    }

    public float getValorMoedaBuscada() {
        return valorMoedaBuscada;
    }

    public void setValorMoedaBuscada(float valorMoedaBuscada) {
        this.valorMoedaBuscada = valorMoedaBuscada;
    }

    @Override
    public String toString() {
        return "\n************************************************\n" +
                moedaBase + " == > " + moedaBuscada + "\n"
                +valorMoedaBase + " == > " + valorMoedaBuscada +
                "\n************************************************\n";
    }
}
