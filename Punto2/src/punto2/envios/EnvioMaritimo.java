
package punto2.envios;


import punto2.model.DatosEnvio;

public class EnvioMaritimo implements MetodoEnvioo {

    @Override
    public double calcularCosto(DatosEnvio datos) {

        double costoBase = 15.0;

        double costoPeso = datos.getPeso() * 2.0;

        double costoDistancia = datos.getDistancia() * 0.01;

        return costoBase + costoPeso + costoDistancia;
    }

    @Override
    public int calcularDiasEntrega(DatosEnvio datos) {
        return 25;
    }

    @Override
    public String getNombre() {
        return "envio economico maritimo";
    }
}

