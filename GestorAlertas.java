import java.util.ArrayList;

public class GestorAlertas {
    private ArrayList <Alerta> alertas;

   public GestorAlertas()
   {
    this.alertas = new ArrayList<>();
   }

   public void agregarAlerta(Alerta alerta)
   {
    this.alertas.add(alerta);
   }

    public void resolverAlerta(Alerta alerta)
    {
        alerta.setActiva(false);
    }

    public ArrayList<Alerta> obtenerAlertasActivas()
    {
        ArrayList <Alerta> alertas_activas = new ArrayList<>();

        for(int i = 0; i < this.alertas.size(); i++)
        {
            if(this.alertas.get(i).isActiva())
            {
                alertas_activas.add(this.alertas.get(i));
            }
        }
        return alertas_activas;
    }

    void eliminarAlertasResueltas() 
    {
        for (int i = this.alertas.size() - 1; i >= 0; i--) 
        {
            if (!this.alertas.get(i).isActiva()) 
            {
                this.alertas.remove(i);
            }  
        }
    }


}
