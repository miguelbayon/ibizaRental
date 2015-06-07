import java.util.ArrayList;
import java.util.Random;

/**
 * Write a description of class Empresa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Empresa
{
    private static final int MAX_DISTANCIA_CENTRO = 10;
    private static final int MAX_PERSONAS_MAXIMO = 10;    
    private static final int MAX_NUMERO_PISCINAS = 5;
    private static final int MAX_NUMERO_HABITACIONES = 5;
    
    private ArrayList<Inmueble> inmuebles;
    
    /**
     * Constructor for objects of class Empresa
     */
    public Empresa()
    {   
        inmuebles = new ArrayList<>();
        
        Random aleatorio = new Random();
        
        for (int i = 0; i < 5; i++) {
            int distanciaAlCentro = aleatorio.nextInt(MAX_DISTANCIA_CENTRO) + 1;
            int numeroMaximoPersonas = aleatorio.nextInt(MAX_PERSONAS_MAXIMO) + 1;
            boolean conTerraza = aleatorio.nextBoolean();
            boolean conAscensor = aleatorio.nextBoolean();
            Piso piso = new Piso(distanciaAlCentro, 
                                 numeroMaximoPersonas,
                                 conTerraza,
                                 conAscensor);
            inmuebles.add(piso);
        }
        
        for (int i = 0; i < 5; i++) {
            int distanciaAlCentro = aleatorio.nextInt(MAX_DISTANCIA_CENTRO) + 1;
            int numeroMaximoPersonas = aleatorio.nextInt(MAX_PERSONAS_MAXIMO) + 1;
            boolean conJardin = aleatorio.nextBoolean();
            boolean enZonaTranquila = aleatorio.nextBoolean();
            Casa casa = new Casa(distanciaAlCentro, 
                                 numeroMaximoPersonas,
                                 conJardin,
                                 enZonaTranquila);
            inmuebles.add(casa);
        }
        
        for (int i = 0; i < 5; i++) {
            int distanciaAlCentro = aleatorio.nextInt(MAX_DISTANCIA_CENTRO) + 1;
            int numeroMaximoPersonas = aleatorio.nextInt(MAX_PERSONAS_MAXIMO) + 1;
            boolean conJardin = aleatorio.nextBoolean();
            boolean enZonaTranquila = aleatorio.nextBoolean();
            int numeroPiscinas = aleatorio.nextInt(MAX_NUMERO_PISCINAS) + 1;
            int numeroHabitaciones = aleatorio.nextInt(MAX_NUMERO_HABITACIONES) + 1;            
            CasaDeLujo casaDeLujo = new CasaDeLujo(distanciaAlCentro, 
                                                   numeroMaximoPersonas,
                                                   conJardin,
                                                   enZonaTranquila,
                                                   numeroPiscinas,
                                                   numeroHabitaciones);
            inmuebles.add(casaDeLujo);
        }        
    }
    
    public void mostrarListadoInmuebles()
    {
        for(Inmueble inmueble : inmuebles)
            System.out.println(inmueble);
    }

}
