import java.util.Random;
import java.util.ArrayList;
    
/**
 * Write a description of class Inmueble here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inmueble
{
    private static int idActual = 1;
    private int id;
    private int distanciaAlCentro;
    private int numeroMaximoPersonas;
    private ArrayList<Alquiler> alquileres;

    /**
     * Constructor for objects of class Inmueble
     */
    public Inmueble(int distanciaAlCentro, int numeroMaximoPersonas)
    {
        this.id = idActual;
        idActual++;
        this.distanciaAlCentro = distanciaAlCentro;
        this.numeroMaximoPersonas = numeroMaximoPersonas;
        alquileres = new ArrayList<>();
    }

 
    public String toString()
    {
        return "ID: " + String.format("%2d", id) + " Distancia: " + String.format("%2d", id) + " km. MaxPers: " + String.format("%2d", id);
    }
    
    protected String aTexto(boolean valor)
    {
        String valorADevolver = "no";
        if (valor)
            valorADevolver = "si";
        return valorADevolver;
    }
}
