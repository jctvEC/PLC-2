package lista5;

public class ContatoCelular implements Contato{
	
	private String nome;
	private Telefone telefone;
	
	public ContatoCelular (String name, Telefone tel) {
		this.nome = name;
		this.telefone = tel;
	}

	public String obterNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Telefone obterTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
}
