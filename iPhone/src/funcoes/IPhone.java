package funcoes;


import iPhone.aparelhoTelefonico.*;
import iPhone.reprodutorMusical.*;
import iPhone.navegadorNaInternet.*;
import iPhone.device.*;


public class IPhone {
	public static void main(String[] args) {
		 
		//Pode utilizar as opções: Pausar, SelecionarMusica, Pausar e Device.
		  ReprodutorMusical reprodutorMusical = new Device();
		  
		//Pode utilizar as opções de classe: Atender, IniciarCorreioDeVoz, Ligar e Device. 
		  AparelhoTelefonico aparelhoTelefonico = new Device();
		  
		//Pode utilizar as opções de classe: ExibirPagina, AdicionarNovaAba, AdicionarNovaPagina e Device.   
		  NavegadorNaInternet navegadorNaInternet = new Device();
		  
		  
		  reprodutorMusical.reproduzir();
		  aparelhoTelefonico.telefonar();
		  navegadorNaInternet.navegar();
		  
		  
		  
		  		  
	
		
		}

}
