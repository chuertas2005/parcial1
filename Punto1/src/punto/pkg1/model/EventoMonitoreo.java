
package punto.pkg1.model;

public class EventoMonitoreo {

    private String paciente;
    private String tipo;
    private String descripcion;

    public EventoMonitoreo(String paciente, String tipo, String descripcion) {
        this.paciente = paciente;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getPaciente() {
        return paciente;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "paciente: " + paciente +
                "tipo: " + tipo +
                "descripcion: " + descripcion;
    }
}
