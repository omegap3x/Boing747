package core;

import java.util.ArrayList;

public class Avion {
    private String nombreAvion;
    final private double capacidadAvion = 18000;
    ArrayList<Bulto> bultos = new ArrayList<Bulto>();

    public Avion(String nombreAvion) {
        this.nombreAvion = nombreAvion;
    }


    public void agregarBulto(Bulto bultoParaAgregar) {

        double capacidadDisponible = capacidadAvion;

        if (bultoParaAgregar.getPeso() > getCapacidadAvion() || bultoParaAgregar.getPeso() > 500) {
            System.out.println("Bulto no permitido, Excede la capacidad del avión o pesa mas de 500Kg");
        } else {
            bultos.add(bultoParaAgregar);
            System.out.println("Bulto agregado con exito!!");
        }

    }

    public void informacionDelVuelo() {
        System.out.println("la cantidad de bultos ingresados para el vuelo: " + getNombreAvion() + "  Son: " + cantidadDeBultos());
        System.out.println("El bulto con más peso es de: " + bultoMasPesado() + " y el bulto mas liviano en el vuelo es de: " + bultoMasliviano() + " Kg");
        System.out.println("El Peso promedio de todos los bultos del Vuelo es: " + pesoPromedio() + " Kg");
        System.out.println("El ingreso del Vuelo en Pesos es de: " + ingresoEnPesos());
        System.out.println("El ingreso del Vuelo en Dolares es de: " + ingresoEnDolares());
    }

    public double cantidadDeBultos() {
        return bultos.size();
    }

    public double pesoPromedio() {

        double pesoTotal = 0;
        double pesoPromedio = 0;
        for (int i = 0; i < bultos.size(); i++) {

            pesoTotal = bultos.get(i).getPeso() + pesoTotal;
            pesoPromedio = pesoTotal / bultos.size();
        }
        return pesoPromedio;
    }

    public double bultoMasPesado() {
        double masPesado = 0;
        for (int i = 0; i < bultos.size(); i++) {
            if (bultos.get(i).getPeso() > masPesado) {
                masPesado = bultos.get(i).getPeso();
            }
        }
        return masPesado;
    }

    public double bultoMasliviano() {
        double masLiviano = 500;
        for (int i = 0; i < bultos.size(); i++) {
            if (bultos.get(i).getPeso() < masLiviano) {
                masLiviano = bultos.get(i).getPeso();
            }
        }
        return masLiviano;
    }


    public double ingresoEnPesos() {
        double sum = 0;

        for (int i = 0; i < bultos.size(); i++) {

            sum = bultos.get(i).getValor() + sum;

        }
        return sum;
    }


public double ingresoEnDolares() {
    double sum = 0;

    for (int i = 0; i < bultos.size(); i++) {

        sum=bultos.get(i).getValor()+sum;

    }
    return sum/3000;
}




    public String getNombreAvion() {
        return nombreAvion;
    }

    public  double getCapacidadAvion() {
        return capacidadAvion;
    }

}
