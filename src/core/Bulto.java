package core;

public class Bulto {
    private  double peso;
    private double valor;


    public Bulto(double peso) {
        this.peso = peso;

    }


    public  double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getValor() {

        if(getPeso()>=0 && getPeso()<=25){
        setValor(0);
        }

        if(getPeso()>=26 && getPeso()<=300){
            setValor(getPeso()*1500);
        }
        if(getPeso()>=301 && getPeso()<=500){
            setValor(getPeso()*2500);
        }
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
