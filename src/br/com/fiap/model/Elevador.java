package br.com.fiap.model;

public class Elevador {

    private Integer id;

    private Double cargaMaxima = 200.0;
    private Double cargaAtual = 0.0;
    private boolean sinalAlerta = false;

    Calculadora calcule = new Calculadora();

    public Double entrarElevador(Double peso){
        cargaAtual = calcule.sum(cargaAtual, peso);
        return cargaAtual;
    }

    public Double sairElevador(Double peso){
        cargaAtual = calcule.subtraction(cargaAtual,peso);
        return cargaAtual;
    }

      public boolean avaliarPeso(Double peso){
        if(peso > cargaMaxima){
            sinalAlerta = true;
            return sinalAlerta;
        }
        return sinalAlerta;
      }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(Double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public Double getCargaAtual() {
        return cargaAtual;
    }

    public void setCargaAtual(Double cargaAtual) {
        this.cargaAtual = cargaAtual;
    }

    public boolean isSinalAlerta() {
        return sinalAlerta;
    }

    public void setSinalAlerta(boolean sinalAlerta) {
        this.sinalAlerta = sinalAlerta;
    }


    //    public boolean isSinalAlerta(){
//        if(avaliarPeso(cargaAtual)){
//            sinalAlerta = true;
//        }
//        return sinalAlerta;
//    }



}
