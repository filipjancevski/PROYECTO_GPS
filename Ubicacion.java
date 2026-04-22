


public class Ubicacion
{
    private static final java.util.Locale COORDINATE_LOCALE = java.util.Locale.US;

    private double longitud;
    private double lattitude;
    private String timestamp;


public Ubicacion(double lattitude, double longitud, String timestamp)   
    {
        this.longitud = longitud;
        this.lattitude = lattitude;
        this.timestamp = timestamp;
    }

    double getLatitud()
    {
        return this.lattitude;
    }
    double getLongitud()
    {
        return this.longitud;
    }
    String getTimestamp()
    {
        return this.timestamp;
    }

    @Override
    public String toString()
    {
         return "Ubicacion: (" + this.lattitude + ", " + this.longitud + "), hora: " + this.timestamp;
    }

    

}