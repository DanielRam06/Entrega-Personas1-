
public class Mian1 {
	

	    public static void main(String[] args) {
	        Personas[] persona = new Personas[10];
	        for (int i = 0; i < 10; i++) {
	            persona[i] = new Personas() {};
	        }
	      //contadores de los atributos  
	        int espada = 0;
	        int millonario = 0;
	        int mamado = 0;
	        int miedoCucarachas = 0;
	         
	        for (Personas personas : persona) {
	            if (personas.getTieneEspada()) {
	                espada++;    
	            }
	            if (personas.getEsMillonario()) {
	                millonario++;    
	            }
	            if (personas.getEstaMamado()) {
	                mamado++;    
	            }
	            if (personas.getMiedoCucarachas()) {
	                miedoCucarachas++;    
	            }
	            System.out.println(personas.getNombre() + ": " + personas.getTieneEspada() + "," + personas.getEsMillonario() + "," + personas.getEstaMamado() + "," + personas.getMiedoCucarachas());
	        }
	        System.out.println("El Atributo Tiene Espada se repite: " + espada);
	        System.out.println("El Atributo es Millonario se repite: " + millonario);
	        System.out.println("El Atributo esta Mamado se repite: " + mamado);
	        System.out.println("El Atributo Miedo a cucarachas se repite: " + miedoCucarachas);
	    }
	}

