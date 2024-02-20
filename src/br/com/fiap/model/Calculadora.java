package br.com.fiap.model;

public class Calculadora {

    private Integer result;

    public Calculadora() {}
    public Calculadora(Integer result) {
        this.result = result;
    }

    public double division(Integer firstValue, Integer secondValue){
        result = firstValue / secondValue;
        return result;
    };
    public Integer multiply(Integer firstValue, Integer secondValue){
        result = firstValue * secondValue;
        return result;
    };
    public Integer subtraction(Integer firstValue, Integer secondValue){
        result = firstValue - secondValue;
        return result;
    };
    public Integer sum(Integer firstValue, Integer secondValue){
        result = firstValue + secondValue;
        return result;
    };

    public double getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
