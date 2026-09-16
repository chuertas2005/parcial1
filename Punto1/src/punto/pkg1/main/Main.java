
package punto.pkg1.main;

import punto.pkg1.model.EventoMonitoreo;
import punto.pkg1.profesionales.AndresSuarez;
import punto.pkg1.profesionales.ElenaRamos;
import punto.pkg1.profesionales.MartaGomez;
import punto.pkg1.subject.CentralMonitoreo;

public class Main {

    public static void main(String[] args) {

        CentralMonitoreo central = new CentralMonitoreo();
        ElenaRamos elena = new ElenaRamos();
        AndresSuarez andres = new AndresSuarez();
        MartaGomez marta = new MartaGomez();

        central.suscribir(elena);
        central.suscribir(andres);
        central.suscribir(marta);

        EventoMonitoreo evento1 =
                new EventoMonitoreo(
                        "Pepito Perez ",
                        "signos_vitales ",
                        "Saturacion de oxigeno critica: 78%"
                );

        central.registrarEvento(evento1);

        EventoMonitoreo evento2 =
                new EventoMonitoreo(
                        "Maria Rodriguez ",
                        "prioridad ",
                        "Codigo azul"
                );

        central.registrarEvento(evento2);

        EventoMonitoreo evento3 =
                new EventoMonitoreo(
                        "Carlos Gomez ",
                        "laboratorio ",
                        "Hemograma urgente"
                );

        central.registrarEvento(evento3);

        System.out.println("\n Marta se desuscribe ");

        central.desuscribir(marta);

        EventoMonitoreo evento4 =
                new EventoMonitoreo(
                        "Pedro Martinez ",
                        "laboratorio ",
                        "Cultivo de sangre urgente"
                );

        central.registrarEvento(evento4);
    }
}