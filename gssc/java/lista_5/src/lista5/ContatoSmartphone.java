package lista5;

public class ContatoSmartphone implements Contato{
	private String nome;
	private String email;
	private Telefone[] tel; // limite 4 com tipos distintos

	public ContatoSmartphone (String nome, String email, Telefone[] telefone) {

		boolean is_cel = false;
		
		if (telefone.length > 4)
			throw new IllegalArgumentException ("Do not save more than 4 numbers to the same contact");
		
		for (int i=0; i < telefone.length; ++i) {
			if (telefone[i].getTipo() == tipo_telefonico.celular) {
				is_cel = true;
			}
		}
		if (is_cel == false)
			throw new IllegalArgumentException ("Must have a number type 'celular'");
		
		for (int i=0; i < telefone.length; ++i)
			for (int j=0; j < telefone.length; ++j)
				if (telefone[i].getTipo() == telefone[j].getTipo() && i != j)
					throw new IllegalArgumentException ("Must not have more than one number with the same type");
		
		this.nome = nome;
		this.email = email;
		this.tel = telefone;
		
	}	
	
	public Telefone obterTelefone(){
		
		for (int i=0; i<this.tel.length; ++i) {
			if (this.tel[i].getTipo() == tipo_telefonico.celular)
				return this.tel[i];
		}
		return this.tel[0];
	}
	public String obterNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Telefone[] getTel() {
		return tel;
	}

	public void setTel(Telefone[] tel) {
		this.tel = tel;
	}
	
	
}
