
package punto.pkg1.profesionales;

import punto.pkg1.model.EventoMonitoreo;
import punto.pkg1.observer.Observer;

public class AndresSuarez implements Observer {

    private String nombre;

    public AndresSuarez() {
        this.nombre = "Andres Suarez";
    }

    @Override
    public void actualizar(EventoMonitoreo evento) {

        if (evento.getTipo().equals("prioridad ")) {

            System.out.println(
                    "[alerta para el doctor Suarez]"
            );

            System.out.println(
                    "cambio de prioridad detectado."
            );

            System.out.println(
                    "paciente: " + evento.getPaciente()
            );

            System.out.println(
                    "nueva prioridad: " + evento.getDescripcion()
            );
        }
    }

    public String getNombre() {
        return nombre;
    }
}

