package Aostello;

public class Piccolo extends Stanza{
	private int costo;
	private int posti;
	
	public Piccolo(String numero, int costo, int posti) {
		super(numero);
		this.costo = costo;
		this.posti = posti;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public int getPosti() {
		return posti;
	}

	public void setPosti(int posti) {
		this.posti = posti;
	}

	

}


