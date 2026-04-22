public class TestGPS
{
    public static void main(String[] args)
    {

        Dispositivo d1 = new Dispositivo("D1", "Collar Luna", 87, u1);

        System.out.println(d1);

        d1.setBateria(75);
        System.out.println(d1);

     
        d1.setUbicacion(u2);

        System.out.println(d1);
    }
} 

