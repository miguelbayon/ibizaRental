
/**
 * Write a description of class CasaDeLujo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CasaDeLujo extends Casa
{
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
}
