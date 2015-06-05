
/**
 * Write a description of class Piso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Piso extends Inmueble
{
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

}
