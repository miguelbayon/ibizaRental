
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

    public String toString()
    {
        return super.toString() + " Jardin: " + aTexto(tieneJardin) + " ZonaTranquila: " + aTexto(enZonaTranquila);
    }

    
    public int precioAlquilerPorNoche() 
    {
        int precioNoche = super.precioAlquilerPorNoche();
        
        if (tieneJardin || enZonaTranquila) {
            precioNoche = precioNoche * 2;
        }
        
        return precioNoche;
    }
    
    public boolean estaEnZonaTranquila()
    {
        return enZonaTranquila;
    }
}
