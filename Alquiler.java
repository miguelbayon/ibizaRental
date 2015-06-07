
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
    private int idInmueble;
    private double precio;

    /**
     * Constructor for objects of class Alquiler
     */
    public Alquiler(int idInmueble, int diaInicio, int diaFin, int dni, double precio)
    {
        id = idActual;
        idActual++;
        this.idInmueble = idInmueble;
        this.diaInicio = diaInicio;
        this.diaFin = diaFin;
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


}
