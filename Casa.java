
/**
 * Write a description of class Casa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Casa extends Inmueble
{
    private boolean tieneJardin;
    private boolean enZonaTranquila;

    /**
     * Constructor for objects of class Casa
     */
    public Casa(int distanciaAlCentro, int numeroMaximoPersonas,
                boolean tieneJardin, boolean enZonaTranquila)
    {
        super(distanciaAlCentro, numeroMaximoPersonas);
        this.tieneJardin = tieneJardin;
        this.enZonaTranquila = enZonaTranquila;
    }

}