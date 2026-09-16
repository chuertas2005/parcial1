
package punto.pkg1.profesionales;

import punto.pkg1.model.EventoMonitoreo;
import punto.pkg1.observer.Observer;

public class MartaGomez implements Observer {

    private String nombre;

    public MartaGomez() {
        this.nombre = "Marta Gomez";
    }

    @Override
    public void actualizar(EventoMonitoreo evento) {

        if (evento.getTipo().equals("laboratorio ")) {

            System.out.println(
                    "[alerta para la doctora Gomez]"
            );

            System.out.println(
                    "se requiere examen urgente."
            );

            System.out.println(
                    "paciente: " + evento.getPaciente()
            );

            System.out.println(
                    "examen: " + evento.getDescripcion()
            );
        }
    }

    public String getNombre() {
        return nombre;
    }
}

