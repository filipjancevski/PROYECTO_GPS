public class ZonaSegura {
    private String nombre;
    private Ubicacion centro;
    private double radioMaximo;

    public ZonaSegura(String nombre, Ubicacion centro, double radioMaximo)
    {
        this.nombre = nombre;
        this.centro = centro;
        if(radioMaximo < 0)
        {
            throw new RuntimeException("Radio invalido");
        }
         this.radioMaximo = radioMaximo;
    }

    public Ubicacion getCentro() 
    {
        return centro;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public double getRadioMaximo() 
    {
        return radioMaximo;
    }

    public void setCentro(Ubicacion centro) 
    {
        this.centro = centro;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public void setRadioMaximo(double radioMaximo) 
    {
        this.radioMaximo = radioMaximo;
    }


    public boolean contiene(Ubicacion unknwon)
    {
        
        double dif_long = Math.abs(this.centro.getLongitud() - unknwon.getLongitud());     
        double dif_latt = Math.abs(this.centro.getLatitud() - unknwon.getLatitud());
        
        return (dif_long < this.radioMaximo && dif_latt < radioMaximo);
    }
@Override
    public String toString()
    {
        return "ZonaSegura: " + this.nombre +
               ", centro: " + this.centro +
               ", radio: " + this.radioMaximo;
    }
}
