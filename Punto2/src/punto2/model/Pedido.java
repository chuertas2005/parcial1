
package punto2.model;

import punto2.envios.MetodoEnvioo;

public class Pedido {

    private String numeroPedido;
    private String cliente;
    private DatosEnvio datosEnvio;
    private MetodoEnvioo MetodoEnvio;

    public Pedido(String numeroPedido,
                  String cliente,
                  DatosEnvio datosEnvio,
                  MetodoEnvioo estrategiaEnvio) {

        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.datosEnvio = datosEnvio;
        this.MetodoEnvio = estrategiaEnvio;
    }

    public void cambiarMetodoEnvio(MetodoEnvioo nuevoMetodo) {

        this.MetodoEnvio = nuevoMetodo;

        System.out.println(
            "\nmetodo de envio cambiado a: "
            + nuevoMetodo.getNombre()
        );
    }

    public double calcularCostoEnvio() {

        return MetodoEnvio.calcularCosto(datosEnvio);
    }

    public int calcularDiasEntrega() {

        return MetodoEnvio.calcularDiasEntrega(datosEnvio);
    }

    public void mostrarInformacionEnvio() {

        System.out.println("pedido: " + numeroPedido);
        System.out.println("cliente: " + cliente);
        System.out.println("estrategia: "
                + MetodoEnvio.getNombre());

        System.out.println(
            "costo de envio: "
            + calcularCostoEnvio()
        );

        System.out.println(
            "tiempo estimado: "
            + calcularDiasEntrega()
            + " dias"
        );
    }
}

