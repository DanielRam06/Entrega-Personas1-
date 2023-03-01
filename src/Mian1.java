



public class Mian1 {
	

	    public static void main(String[] args) {
	        Personas[] persona = new Personas[10];
	        for (int i = 0; i < 10; i++) {
	            persona[i] = new Personas() {};
	        }
	        
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

/*
	public static void main(String[] args) {
	Personas[] persona = new Personas[10];
	persona[0] = new Personas() {};
	persona[1] = new Personas() {};
	persona[2] = new Personas() {};
	persona[3] = new Personas() {};
	persona[4] = new Personas() {};
	persona[5] = new Personas() {};
	persona[6] = new Personas() {};
	persona[7] = new Personas() {};
	persona[8] = new Personas() {};
	persona[9] = new Personas() {};
	
	int espada = 0;
    int millonario = 0;
    int mamado = 0;
    int miedoCucarachas = 0;
     
    for (Personas personas : persona) {
    	if (personas.gettieneEspada()) {
    		espada++;	
    	}
    	if (personas.getesMillonario()) {
    		millonario++;	
    	}
    	if (personas.getestaMamado()) {
    		mamado++;	
    	}
    	if (personas.getmiedoCucarachas()) {
    		miedoCucarachas++;	
    	}
    	System.out.println(personas.getNombre() + ": " + personas.gettieneEspada() + "," + personas.getesMillonario() + "," + personas.getestaMamado() + "," + personas.getmiedoCucarachas());
    }
    System.out.println("El Atributo Tiene Espada se repite: " + espada);
    System.out.println("El Atributi es Millonario se repite: " + millonario);
    System.out.println("El Atributo esta Mamado se repite: " + mamado);
    System.out.println("El Atributo Miedo a cucarachas se repite: " + miedoCucarachas);

	}
}
*/