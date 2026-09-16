
package punto2.model;

public class DatosEnvio {

    private double peso;
    private double distancia;
    private double valorPedido;
    private boolean entregaUrgente;

    public DatosEnvio(double peso, double distancia,
                      double valorPedido, boolean entregaUrgente) {

        this.peso = peso;
        this.distancia = distancia;
        this.valorPedido = valorPedido;
        this.entregaUrgente = entregaUrgente;
    }

    public double getPeso() {
        return peso;
    }

    public double getDistancia() {
        return distancia;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public boolean isEntregaUrgente() {
        return entregaUrgente;
    }
}

