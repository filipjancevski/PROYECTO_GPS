import java.time.*;


public class Alerta{
private String tipo;  // Tipo de alerta (e.g. Batería baja)
    private LocalDateTime fechaHora;  // Fecha y hora en que ocurrió la alerta
    private boolean activa;  // ¿Está activa o ya se resolvió?
    private String mensaje;  // Descripción breve de la alerta

    // Constructor
    public Alerta(String tipo, String mensaje)
    {
        this.tipo = tipo;
        this.mensaje = mensaje;
        this.fechaHora = LocalDateTime.now();  // Fecha y hora actuales
        this.activa = true;  // Por defecto, la alerta está activa
    }

    // Getters
    public String getTipo() { return tipo; }
    public LocalDateTime getFechaHora() { return fechaHora; }
    public boolean isActiva() { return activa; }
    public String getMensaje() { return mensaje; }

    // Setters
    public void setActiva(boolean activa) { this.activa = activa; }

    // toString para imprimir de manera legible
    @Override
    public String toString()
    {
        return "Alerta{" +
               "tipo='" + tipo + '\'' +
               ", fechaHora=" + fechaHora +
               ", activa=" + activa +
               ", mensaje='" + mensaje + '\'' +
               '}';
    }





}