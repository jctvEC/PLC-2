import java.lang.String;

public class Texto {
	private int numero;
	private String texto;
	
	public Texto(String txt) {
		this.texto = "";
		this.texto = texto + txt;
		this.numero = this.getNumero();
	}
	
	public int getNumero() {
		String[] palavras = texto.split(" ");
		this.numero = palavras.length + 1;
		return numero;
	}
	
	public int imprime_texto() {
		System.out.println(texto);
		return numero;
	}
	
	public static void main (){
		Texto meu_texto = new Texto("meu texto.");
		meu_texto.imprime_texto();
	}
}
