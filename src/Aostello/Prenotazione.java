package Aostello;

import java.time.*;

public class Prenotazione {
	private LocalDateTime Arrivo;
	private LocalDateTime Partenza;
	private Stanza Stanza;
	private Cliente cliente;
	
	public Prenotazione(LocalDateTime arrivo, LocalDateTime partenza, Cliente cliente) {
		if ((arrivo != null) && (partenza != null)) {
			if (arrivo.isBefore(partenza)) {
				this.Arrivo = arrivo;
				this.Partenza = partenza;
			}
			else
				throw new IllegalArgumentException("");
		}
		else
			throw new IllegalArgumentException("");
		
		if (cliente != null)
			this.cliente = cliente;
		else
			throw new IllegalArgumentException("cliente non può essere vuoto");
	}

	public Stanza getStanza() {
		return Stanza;
	}

	public void setStanza(Stanza Stanza) {
		if (Stanza != null)
			this.Stanza = Stanza;
		else
			throw new IllegalArgumentException("stanza non può essere vuoto");
	}

	public LocalDateTime getArrivo() {
		return Arrivo;
	}

	public LocalDateTime getPartenza() {
		return Partenza;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public int getTempo() {
		return Period.between(Arrivo.toLocalDate(), Partenza.toLocalDate()).getDays();
	}

	
}

