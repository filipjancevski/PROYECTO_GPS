public class Dispositivo {
    private String id;
    private String nombre;
    private int bateria;
    private Ubicacion ubicacionActual;

    public Dispositivo(String id, String nombre, int bateria, Ubicacion ubicacion) {
    
        this.id = id;
        this.nombre = nombre;
        this.bateria = bateria;
        this.ubicacionActual = ubicacion;
    }


    public void setId(String id) 
    {
        this.id = id;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setBateria(int bateria)
    {
        this.bateria = bateria;
    }

    public void setUbicacion(Ubicacion ubicacion)
    {
        this.ubicacionActual = ubicacion;
    }

     public String getId() 
     {
        return this.id;
    }

     public String getNombre()
    {
        return this.nombre;
     }

     public int getBateria()
    {
       return this.bateria;
    }

     public Ubicacion getUbicacion()
    {
       return this.ubicacionActual;
    }

   @Override
    public String toString() 
    {
       return "Dispositivo: " + this.id +
               ", nombre: " + this.nombre +
               ", bateria: " + this.bateria +
               ", " + this.ubicacionActual;
    }



}
