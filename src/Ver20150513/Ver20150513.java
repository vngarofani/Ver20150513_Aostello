package Ver20150513;

import java.time.LocalDateTime;

import Aostello.*;

public class Ver20150513 {

	public static void main(String[] args) throws Exception {
		
		Grande Grossa = new Grande("215", 25, 8);
		Piccolo Normale = new Piccolo("123", 10, 4);
		
		Cliente Giulio = new Cliente("Giulio", "Mommi", "3335987158");
		
		Prenotazione p = null;
		
		
		p = new Prenotazione(
				LocalDateTime.of(2015, 04, 25, 15, 00, 00),
				LocalDateTime.of(2015, 04, 27, 11, 00, 00),
				Giulio);
		

		
	}
	
}