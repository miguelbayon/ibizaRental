
/**
 * Write a description of class Alquiler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alquiler
{
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
        this.idInmueble = idInmueble;
        this.diaInicio = diaInicio;
        this.diaFin = diaFin;
        this.dni = dni;
        this.precio = precio;
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
