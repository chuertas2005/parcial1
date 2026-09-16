
package punto2.envios;

import punto2.model.DatosEnvio;

public interface MetodoEnvioo {

    double calcularCosto(DatosEnvio datos);

    int calcularDiasEntrega(DatosEnvio datos);

    String getNombre();
}
