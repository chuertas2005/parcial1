
package punto2.main;

import punto2.model.DatosEnvio;
import punto2.model.Pedido;

import punto2.envios.EnvioMaritimo;
import punto2.envios.EnvioAereo;
import punto2.envios.EnvioNeutralEnCarbono;
import punto2.envios.EnvioCasillero;

public class Main {

    public static void main(String[] args) {

        DatosEnvio datos = new DatosEnvio(
                10.0,      // peso
                800.0,     // distancia
                500.0,     // valor del pedido
                false      // es urgente
        );

        Pedido pedido = new Pedido(
                "pedido numero 1",
                "Pepito Perez",
                datos,
                new EnvioMaritimo()
        );

        pedido.mostrarInformacionEnvio();

        pedido.cambiarMetodoEnvio(
                new EnvioAereo()
        );

        pedido.mostrarInformacionEnvio();

        pedido.cambiarMetodoEnvio(
                new EnvioNeutralEnCarbono()
        );

        pedido.mostrarInformacionEnvio();

        pedido.cambiarMetodoEnvio(
                new EnvioCasillero()
        );

        pedido.mostrarInformacionEnvio();
    }
}
