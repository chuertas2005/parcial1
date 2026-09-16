
package punto2.envios;

import punto2.model.DatosEnvio;

public class EnvioNeutralEnCarbono implements MetodoEnvioo {

    @Override
    public double calcularCosto(DatosEnvio datos) {

        double costoBase = 25.0;

        double costoPeso = datos.getPeso() * 3.0;

        double costoDistancia = datos.getDistancia() * 0.03;

        return costoBase + costoPeso + costoDistancia;
    }

    @Override
    public int calcularDiasEntrega(DatosEnvio datos) {
        return 8;
    }

    @Override
    public String getNombre() {
        return "envio ecologico - neutral en carbono";
    }
}

