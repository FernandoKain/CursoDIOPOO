

public class Carro {
    int portas;
    String cor;
    String modelo;
    int capacidadeTanque;

    Carro(){

    }

    Carro(int portas, String cor, String modelo, int capacidadeTanque){
        this.portas = portas;
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    // Getter e Setter Portas
    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    // Getter e Setter Cor
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // Getter e Setter Modelo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Getter e Setter CapacidadeTanque
    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }




}
