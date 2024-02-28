package br.com.fiap.model;

public class Calculadora {

    private Double result;

    public Calculadora() {}
    public Calculadora(Double result) {
        this.result = result;
    }

    public Double subtraction(Double firstValue, Double secondValue){
        result = firstValue - secondValue;
        return result;
    };
    public Double sum(Double firstValue, Double secondValue){
        result = firstValue + secondValue;
        return result;
    };

    public double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }
}
