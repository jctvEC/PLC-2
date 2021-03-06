package lista5;

public class Telefone extends Object {
	private int DDD;
	private int DDI;
	private int telefone;
	private tipo_telefonico tipo;
	
	public Telefone (int ddi, int ddd, int numero, tipo_telefonico tp) {
		this.DDD = ddd;
		this.DDI = ddi;
		this.tipo = tp;
		this.telefone = numero;
	}
	
	public Telefone (int ddd, int numero, tipo_telefonico tp) {
		this(55, ddd, numero, tp);
	}
	
	public Telefone (int numero, tipo_telefonico tp) {
		this(55, 81, numero, tp);
	}
	
	public Telefone (int numero) {
		this(55, 81, numero, tipo_telefonico.celular);
	}

	public int getDDD() {
		return DDD;
	}

	public void setDDD(int dDD) {
		DDD = dDD;
	}

	public int getDDI() {
		return DDI;
	}

	public void setDDI(int dDI) {
		DDI = dDI;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public tipo_telefonico getTipo() {
		return tipo;
	}

	public void setTipo(tipo_telefonico tipo) {
		this.tipo = tipo;
	}

	public String toString() {
		return "+" + this.DDI + " " + "(" + this.DDD + ")" + " " + this.telefone;
	}
	
	public boolean equals (Object x) {
		if (x instanceof Telefone)
			return (x.toString().equals(this.toString()));
		return false;
	}
}
