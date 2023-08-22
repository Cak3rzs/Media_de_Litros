package br.com.controle;

public class Controle {
    private double km_inicial;
    private double km_final;
    private double quantidade_de_Gasolina;
    private double Consumo_Medio;

    public double getKm_inicial() {
        return km_inicial;
    }

    public void setKm_inicial(double km_inicial) {
        this.km_inicial = km_inicial;
    }

    public double getKm_final() {
        return km_final;
    }

    public void setKm_final(double km_final) {
        this.km_final = km_final;
    }

    public double getQuantidade_de_Gasolina() {
        return quantidade_de_Gasolina;
    }

    public void setQuantidade_de_Gasolina(double quantidade_de_Gasolina) {
        this.quantidade_de_Gasolina = quantidade_de_Gasolina;
    }

    public double getConsumo_Medio() {
        return Consumo_Medio;
    }

    public void setConsumo_Medio(double Consumo_Medio) {
        this.Consumo_Medio = Consumo_Medio;
    }

    public Controle(double km_inicial, double km_final, double quantidade_de_Gasolina){
        this.km_inicial = km_inicial;
        this.km_final = km_final;
        this.quantidade_de_Gasolina = quantidade_de_Gasolina;
    }

    public double calcularConsumoMedio(){
        double distancia_percorrida = km_final - km_inicial;
        return distancia_percorrida / quantidade_de_Gasolina;
    }
}