
/**
 * Write a description of class Alquiler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alquiler
{
    private static int idActual = 1;
    
    private int id;
    private int dni;
    private int diaInicio;
    private int diaFin;
    private int numeroPersonas;
    private int idInmueble;
    private int precio;

    /**
     * Constructor for objects of class Alquiler
     */
    public Alquiler(int idInmueble, int diaInicio, int diaFin, int numeroPersonas, int dni, int precio)
    {
        id = idActual;
        idActual++;
        this.idInmueble = idInmueble;
        this.diaInicio = diaInicio;
        this.diaFin = diaFin;
        this.numeroPersonas = numeroPersonas;
        this.dni = dni;
        this.precio = precio;
        System.out.println("Nueva reserva para el inmueble " + idInmueble + " realizada con éxito. Identificador de la reserva: " + id);
    }
    
    public int getDiaInicio()
    {
        return diaInicio;
    }
    
    public int getDiaFin()
    {
        return diaFin;
    }
    
    public String toString()
    {
        return "- ID: " + id + " Inicio: " + String.format("%2d", diaInicio) + " Fin: " + String.format("%2d", diaFin) + " Precio total: " + precio;
    }


}
