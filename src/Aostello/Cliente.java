package Aostello;

public class Cliente {
	private String nome;
	private String cognome;
	private String telefono;
	
	
	public Cliente(String nome, String cognome, String telefono) {
		if(nome != null)
			this.nome = nome;
		else
			throw new IllegalArgumentException("nome non può esere vuoto");
		
		if(cognome != null)
			this.cognome = cognome;
		else
			throw new IllegalArgumentException("cognome non può essere vuoto");
		
		if (telefono != null)
			this.telefono = telefono;
		else
			throw new IllegalArgumentException("telefono non può essere vuoto");
	}
	


	

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getTelefono() {
		return telefono;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome
				+ ", telefono=" + telefono +  "]";
	}
	
	
}