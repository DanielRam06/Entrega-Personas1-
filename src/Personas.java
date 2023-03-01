import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class Personas {
    private static final String[] nombres = { "mamá lucha", "Donatello", "Leonardo", "Michelangelo", "Raphael", "Naruto", "Helen Chufe", "Alba Sura", "Goku", "Hinata" };
    private static final List<String> nombresAleatorios = new ArrayList<String>();
    
    static {
        // Agregar los nombres a la lista aleatoria
        for (String nombre : nombres) {
            nombresAleatorios.add(nombre);
        }
        // Mezclar la lista aleatoria
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

/*import java.util.Random;

public abstract class Personas {
	private String[] nombres = { "mamá lucha" , "Donatello" , "Leonardo" , "Michelangelo" , "Raphael" , "Naruto" , "Helen Chufe" , "Alba Sura" , "Goku" , "Hinata"};
	private String nombre;
	 private boolean tieneEspada;
	    private boolean esMillonario;
	    private boolean estaMamado;
	    private boolean miedoCucarachas;

	    Random random = new Random();
	    int randomNumber = random.nextInt(10);
	    Boolean randomBoolean = random.nextBoolean();
	    Boolean randomBoolean0 = random.nextBoolean();
	    Boolean randomBoolean1 = random.nextBoolean();
	    Boolean randomBoolean2 = random.nextBoolean();
	    
	    public Personas() {
	    	this.nombre = nombres[randomNumber];
	    	this.tieneEspada = randomBoolean;
	    	this.esMillonario = randomBoolean0;
	    	this.estaMamado = randomBoolean1;
	    	this.miedoCucarachas = randomBoolean2;
	    }
	    public String getNombre() {
	    	return nombre;
	    }
	    public boolean gettieneEspada() {
	    	return tieneEspada;
	    }
	    public boolean getesMillonario() {
	    	return esMillonario;
	    }
	    public boolean getestaMamado() {
	    	return estaMamado;
	    }
	    public boolean getmiedoCucarachas() {
	    	return miedoCucarachas;
	    }	
	    	
	    }
	    
   */


