
/**
 * Write a description of class Piso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Piso extends Inmueble
{
    private static final int MAXIMO_DIAS_ALQUILER = 7;
    
    private boolean tieneTerraza;
    private boolean tieneAscensor;

    /**
     * Constructor for objects of class Piso
     */
    public Piso(int distanciaAlCentro, int numeroMaximoPersonas,
                boolean tieneTerraza, boolean tieneAscensor)
    {
        super(distanciaAlCentro, numeroMaximoPersonas);
        this.tieneTerraza = tieneTerraza;
        this.tieneAscensor = tieneAscensor;
    }
    
    public String toString()
    {
        return super.toString() + " Terraza: " + aTexto(tieneTerraza) + " Ascensor: " + aTexto(tieneAscensor);
    }
    
    public boolean estaDisponible(int diaInicio, int diaFin, int numeroPersonas)
    {
        boolean valorDevuelto = super.estaDisponible(diaInicio, diaFin, numeroPersonas);
        
        if (diaFin - diaInicio > MAXIMO_DIAS_ALQUILER) {
            valorDevuelto = false;
        }
        
        return valorDevuelto;
    }
    
    public int precioAlquilerPorNoche() 
    {
        int precioNoche = super.precioAlquilerPorNoche();
        
        if (tieneTerraza || tieneAscensor) {
            precioNoche = precioNoche * 2;
        }
        
        return precioNoche;
    }

}
