import java.util.ArrayList;

public class Dispositivo {
    private String id;
    private String nombre;
    private int bateria;
    private Ubicacion ubicacionActual;
    private ArrayList <Ubicacion> ubicacionesAnteriores;
    private GestorAlertas gestorAlertas;

    public Dispositivo(String id, String nombre, int bateria, Ubicacion ubicacion) {
    
        this.id = id;
        this.nombre = nombre;
        this.bateria = bateria;
        this.ubicacionActual = ubicacion;
        this.ubicacionesAnteriores = new ArrayList<>();
        this.gestorAlertas = new GestorAlertas();
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

    public GestorAlertas getGestorAlertas()
    {
        return this.gestorAlertas;
    }

   @Override
    public String toString() 
    {
       return "Dispositivo: " + this.id +
               ", nombre: " + this.nombre +
               ", bateria: " + this.bateria +
               ", " + this.ubicacionActual;
    }

    public boolean estaEnZonaSegura(ZonaSegura zona)
    {
        return zona.contiene(this.ubicacionActual);
    }

    boolean bateriaBaja()
    {
        return (this.bateria < 20);
    }

    boolean tieneUbicacion()
    {
        if(ubicacionActual != null)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }

    void cargarBateria(int cantidad)
    {
        if(cantidad + this.bateria > 100)
        {
            throw new RuntimeException();
        }
        this.bateria += cantidad;
    }

    void descargarBateria(int cantidad)
    {
        if(cantidad + this.bateria < 100)
        {
            throw new RuntimeException();
        }
        this.bateria -= cantidad;
    }

    void nuevaUbicacion(Ubicacion nueva_ubicacion)
    {
        if(nueva_ubicacion == null)
        throw new RuntimeException();

        if(this.ubicacionActual != null)
        {
            this.ubicacionesAnteriores.add(this.ubicacionActual);
        }

        this.ubicacionActual = nueva_ubicacion;
        this.ubicacionesAnteriores.add(nueva_ubicacion);
    }

    int totalUbicaciones()
    {
        int num_ubicaciones;
        num_ubicaciones = ubicacionesAnteriores.size();
        return num_ubicaciones;
    }

    Ubicacion devolverUbicacion(int index)
    {
        if(index < 0 || index >= this.ubicacionesAnteriores.size())
        {
            throw new RuntimeException();
        }

        return ubicacionesAnteriores.get(index);
    }


     public void verificarAlertas() 
     {
        // Alerta por batería baja
        if (this.bateria < 20) 
            {
                Alerta alertaBateriaBaja = new Alerta("Batería baja", "La batería del dispositivo está por debajo del 20%");
                this.gestorAlertas.agregarAlerta(alertaBateriaBaja);
            }

        // Alerta por salir de la zona segura
        ZonaSegura zona = new ZonaSegura("Casa", new Ubicacion(40.4168, -3.7038, "centro"), 0.01);
        if (!zona.contiene(this.ubicacionActual)) 
            {
                Alerta alertaFueraZona = new Alerta("Fuera de zona segura", "El dispositivo ha salido de la zona segura.");
                this.gestorAlertas.agregarAlerta(alertaFueraZona);
            }
    }

    public void mostrarAlertas()
    {
        ArrayList<Alerta> alertasActivas = this.gestorAlertas.obtenerAlertasActivas();
        for (Alerta alerta : alertasActivas)
        {
            System.out.println(alerta);
        }
    }
}
