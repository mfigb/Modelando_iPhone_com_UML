package iPhone.device;

import iPhone.aparelhoTelefonico.AparelhoTelefonico;
import iPhone.navegadorNaInternet.NavegadorNaInternet;
import iPhone.reprodutorMusical.ReprodutorMusical;

public class Device implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {
	
	public void telefonar() {
	System.out.println("Telefonando pelo iPhone.");
	
	}


	public void navegar() {
		System.out.println("Navegando na Internet pelo iPhone.");
		
	}

	
	public void reproduzir() {
		System.out.println("Reproduzindo Música no iPhone.");
		
	}

}
