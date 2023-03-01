import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
//10 nombres de los objetos
public abstract class Personas {
    private static final String[] nombres = { "mamá lucha", "Donatello", "Leonardo", "Michelangelo", "Raphael", "Naruto", "Helen Chufe", "Alba Sura", "Goku", "Hinata" };
    private static final List<String> nombresAleatorios = new ArrayList<String>();
    
    static {
        // los nombres a la lista aleatoria sin repeticiones
        for (String nombre : nombres) {
            nombresAleatorios.add(nombre);
        }
        // Mezclar la lista aleatoria para que no sean iguales
        Collections.shuffle(nombresAleatorios, new Random());
    }
    
    private String nombre;
    private boolean tieneEspada;
    private boolean esMillonario;
    private boolean estaMamado;
    private boolean miedoCucarachas;
    
    public Personas() {
        // Obtener el siguiente nombre aleatorio de la lista
        this.nombre = nombresAleatorios.remove(0);
        this.tieneEspada = new Random().nextBoolean();
        this.esMillonario = new Random().nextBoolean();
        this.estaMamado = new Random().nextBoolean();
        this.miedoCucarachas = new Random().nextBoolean();
    }
    //encapsulamientos 
    public String getNombre() {
        return nombre;
    }
    
    public boolean getTieneEspada() {
        return tieneEspada;
    }
    
    public boolean getEsMillonario() {
        return esMillonario;
    }
    
    public boolean getEstaMamado() {
        return estaMamado;
    }
    
    public boolean getMiedoCucarachas() {
        return miedoCucarachas;
    }

	
}
