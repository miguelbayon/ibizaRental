
/**
 * Write a description of class CasaDeLujo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CasaDeLujo extends Casa
{
    private static final int PRECIO_ALQUILER_FIJO = 100;
    
    private int numeroPiscinas;
    private int numeroHabitaciones;

    /**
     * Constructor for objects of class CasaDeLujo
     */
    public CasaDeLujo(int distanciaAlCentro, int numeroMaximoPersonas, 
                      boolean tieneJardin, boolean enZonaTranquila,
                      int numeroPiscinas, int numeroHabitaciones)
    {
        super(distanciaAlCentro, numeroMaximoPersonas, tieneJardin, enZonaTranquila);
        this.numeroPiscinas = numeroPiscinas;
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public String toString()
    {
        return super.toString() + " NºPisc: " + numeroPiscinas + " NºHab: " + numeroHabitaciones;
    }
    
    public boolean estaDisponible(int diaInicio, int diaFin, int numeroPersonas)
    {
        boolean valorDevuelto = super.estaDisponible(diaInicio, diaFin, numeroPersonas);
        
        if ((diaInicio <= 10) && (diaFin >= 11) ||
            (diaInicio <= 20) && (diaFin >= 21) ||
            (diaInicio <= 25) && (diaFin >= 25)) {
        
                valorDevuelto = false;
        }
        
        
        return valorDevuelto;
    }    
    
    public int precioAlquilerPorNoche() 
    {
        int factorZonaTranquila = 1;
        if (estaEnZonaTranquila()) {
            factorZonaTranquila = 2;
        }
        return super.precioAlquilerPorNoche() + (numeroPiscinas * numeroHabitaciones * PRECIO_ALQUILER_FIJO * factorZonaTranquila);
    }    
}
