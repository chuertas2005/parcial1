
package punto.pkg1.subject;

import punto.pkg1.model.EventoMonitoreo;
import punto.pkg1.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class CentralMonitoreo {

    private List<Observer> observadores;

    public CentralMonitoreo() {
        observadores = new ArrayList<>();
    }
    
    public void suscribir(Observer observador) {
        observadores.add(observador);

        System.out.println(
                "nuevo profesional suscrito: "
                        + observador.getClass().getSimpleName()
        );
    }

    public void desuscribir(Observer observador) {
        observadores.remove(observador);

        System.out.println(
                "profesional desuscrito: "
                        + observador.getClass().getSimpleName()
        );
    }
    
    public void notificar(EventoMonitoreo evento) {

        System.out.println("nuevo evento");
        System.out.println(evento);

        for (Observer observador : observadores) {
            observador.actualizar(evento);
        }
    }

    public void registrarEvento(EventoMonitoreo evento) {

        System.out.println("\nregistrando evento");
        notificar(evento);
    }
}

