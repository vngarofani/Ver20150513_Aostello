package Aostello;

import java.util.*;
import java.time.*;

public class Stanza {
	private String numero;
	private Vector<Prenotazione> prenotazioni;

	public Stanza(String numero) {
		super();
		if (numero != null)
			this.numero = numero;
		else
			throw new IllegalArgumentException("numero non può essere vuoto");
		
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public Vector<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}
	
	public void addPrenotazione(Prenotazione p) throws Exception {
		if( p != null) {
			if (this.Disponibilità(p.getArrivo(), p.getPartenza())) {
				p.setStanza(this);
				prenotazioni.add(p);
			}
			else
				throw new Exception("camera not disponibile");
		}
		else
			throw new IllegalArgumentException("prenotazione cannot be null");
	}

	private boolean Disponibilità(LocalDateTime arrivo, LocalDateTime partenza) {
		boolean v = true;
		for(Prenotazione p : prenotazioni) {
 
			if ( !arrivo.isAfter(p.getPartenza()) && !partenza.isBefore(p.getArrivo()))
			{
				v = false;
			
			}
		}
		return v;
	}

	@Override
	public String toString() {
		return "Camera [numero=" + numero + prenotazioni.size() +"]";
	}

}
