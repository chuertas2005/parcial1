
package punto2.envios;


import punto2.model.DatosEnvio;

public class EnvioCasillero implements MetodoEnvioo {

    @Override
    public double calcularCosto(DatosEnvio datos) {

        if (datos.getDistancia() <= 50) {
            return 10.0;
        }

        if (datos.getDistancia() <= 100) {
            return 15.0;
        }

        return 20.0;
    }

    @Override
    public int calcularDiasEntrega(DatosEnvio datos) {
        return 5;
    }

    @Override
    public String getNombre() {
        return "envio a casillero / punto de recogida";
    }
}

