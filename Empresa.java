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
        System.out.println("Inmuebles disponibles:");
        for(Inmueble inmueble : inmuebles) {
            System.out.println(inmueble);
        }
        System.out.println();
    }
    
    public void consultarDisponibilidad(int diaInicio, int diaFin, int numeroPersonas)
    {
        System.out.println("Inmuebles disponibles:");        
        for(Inmueble inmueble : inmuebles) {
            if (inmueble.estaDisponible(diaInicio, diaFin, numeroPersonas)) {
                System.out.println(inmueble + " Alquiler/noche: " + inmueble.precioAlquilerPorNoche() + " Alquiler total: " + inmueble.precioAlquilerPorNoche() * (diaFin - diaInicio));
            }
        }
        System.out.println();
    }
    
    public void reservar(int idInmueble, int diaInicio, int diaFin, int numeroPersonas, int dni)
    {
        boolean buscando = true;
        int contador = 0;
        Inmueble inmuebleBuscado = null;
        
        while (buscando && contador < inmuebles.size()) {
            if (inmuebles.get(contador).getId() == idInmueble) {
                inmuebleBuscado = inmuebles.get(contador);
                if (inmuebleBuscado.estaDisponible(diaInicio, diaFin, numeroPersonas)) {
                    inmuebleBuscado.reservar(diaInicio, diaFin, numeroPersonas, dni);
                }
                else {
                    System.out.println("El inmueble no está disponible");
                }                
                buscando = false;
            }
            contador++;
        }
        

        
    }
    
    public void mostrarListadoOrdenadoNumeroAlquileres()
    {
        ArrayList<Inmueble> inmueblesOrdenados = new ArrayList<>();
        ArrayList<Inmueble> inmueblesCopia = (ArrayList<Inmueble>)inmuebles.clone(); 
        
        for (int i = 0; i < inmuebles.size(); i++) {
            
            Inmueble inmuebleMasAlquileres = inmueblesCopia.get(0);
            for (Inmueble inmueble : inmueblesCopia) {
                if (inmueble.getNumeroAlquileres() > inmuebleMasAlquileres.getNumeroAlquileres()) {
                    inmuebleMasAlquileres = inmueble;
                }
            }
            inmueblesOrdenados.add(inmuebleMasAlquileres);
            inmueblesCopia.remove(inmuebleMasAlquileres);
            
            
        }
        
        for (Inmueble inmueble : inmueblesOrdenados) {
            System.out.println(inmueble);
            System.out.println(inmueble.getListadoAlquileres());
        }
 
    }

    
}










































