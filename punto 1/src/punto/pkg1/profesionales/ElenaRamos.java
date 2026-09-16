
package punto.pkg1.profesionales;

import punto.pkg1.model.EventoMonitoreo;
import punto.pkg1.observer.Observer;

public class ElenaRamos implements Observer {

    private String nombre;

    public ElenaRamos() {
        this.nombre = "Elena Ramos";
    }

    @Override
    public void actualizar(EventoMonitoreo evento) {

        if (evento.getTipo().equals("signos_vitales ")) {

            System.out.println(
                    "[alerta para la doctora Ramos]"
            );

            System.out.println(
                    "se requiere intervencion medica inmediata."
            );

            System.out.println(
                    "paciente: " + evento.getPaciente()
            );

            System.out.println(
                    "situacion: " + evento.getDescripcion()
            );
        }
    }

    public String getNombre() {
        return nombre;
    }
}
