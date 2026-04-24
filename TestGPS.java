
import java.time.*;
import java.util.ArrayList;


public class TestGPS {
    public static void main(String[] args) {
        // Crear dispositivo y zona segura
        Ubicacion u1 = new Ubicacion(40.4168, -3.7038, "2026-04-21 18:30");
        Dispositivo d1 = new Dispositivo("D1", "Collar Luna", 87, u1);

        // Verificar alertas
        d1.verificarAlertas();
        d1.mostrarAlertas();  // Mostrar alertas activas

        // Simular otra ubicación fuera de zona
        Ubicacion u2 = new Ubicacion(40.5000, -3.9000, "2026-04-21 19:00");
        d1.setUbicacion(u2);
        d1.verificarAlertas();  // Verificar alertas nuevamente

        // Mostrar alertas nuevamente
        System.out.println("\nAlertas después de actualizar ubicación:");
        d1.mostrarAlertas();

        // Resolver alerta de batería baja
        ArrayList<Alerta> alertas = d1.getGestorAlertas().obtenerAlertasActivas();
        d1.getGestorAlertas().resolverAlerta(alertas.get(0));  // Resolver la primera alerta

        // Eliminar alertas resueltas
        d1.getGestorAlertas().eliminarAlertasResueltas();  // Eliminar alertas resueltas

        // Mostrar las alertas restantes
        System.out.println("\nAlertas después de eliminar las resueltas:");
        d1.mostrarAlertas();
    }
}