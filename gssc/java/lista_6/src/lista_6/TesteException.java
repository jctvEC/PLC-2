package lista_6;

public class TesteException {
	public static void main (String[] args) {
		System.out.println("Inicio da main");
		metodo1();
		System.out.println("fim do main");
	}
  
	static void metodo1() {
	  	System.out.println("Inicio do metodo1");
	    metodo2();
	    System.out.println("fim do metodo1");
	}
  
	static void metodo2() throws NullPointerException, ArrayIndexOutOfBoundsException {
		System.out.println("Inicio da main");
	
		int[] array = new int[10];
		
		try {
			for (int i=0; i<15; i++) {
				array[i] = i;
				System.out.println(i);
			}
		}
		catch  (NullPointerException npe) {
			System.out.println("***");
		}
		catch (ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("...");
			aiobe.printStackTrace();
		}
		
		System.out.println("Inicio da main");
	}
}