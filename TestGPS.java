public class TestGPS
{
    public static void main(String[] args)
    {
        Ubicacion u1 = new Ubicacion(40.4168, -3.7038, "2026-04-21 18:30");
        Dispositivo d1 = new Dispositivo("D1", "Collar Luna", 87, u1);

        ZonaSegura z1 = new ZonaSegura("Casa", new Ubicacion(40.4168, -3.7038, "centro"), 0.01);

        System.out.println(d1);
        System.out.println(z1);
        System.out.println("¿Esta dentro de la zona? " + z1.contiene(d1.getUbicacion()));

        Ubicacion u2 = new Ubicacion(40.5000, -3.9000, "2026-04-21 19:00");
        d1.setUbicacion(u2);

        System.out.println(d1);
        System.out.println("¿Esta dentro de la zona? " + z1.contiene(d1.getUbicacion()));
    }
}