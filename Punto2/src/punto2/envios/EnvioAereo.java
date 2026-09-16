
package punto2.envios;

import punto2.model.DatosEnvio;

public class EnvioAereo implements MetodoEnvioo {

    @Override
    public double calcularCosto(DatosEnvio datos) {

        double costoBase = 50.0;

        double costoPeso = datos.getPeso() * 8.0;

        double costoDistancia = datos.getDistancia() * 0.08;

        return costoBase + costoPeso + costoDistancia;
    }

    @Override
    public int calcularDiasEntrega(DatosEnvio datos) {
        return 2;
    }

    @Override
    public String getNombre() {
        return "envio express aereo";
    }
}

